package TestPirates;

public class Jeu {

	private IAffichage journal;
	private De de = new De();
	private Plateau plateau = new Plateau();
	private CaseSpeciale[] caseSpeciales = plateau.getCases();
	private Pion pion1 = new Pion(Couleur.BLEU, plateau);
	private Pion pion2 = new Pion(Couleur.ROUGE, plateau);

	public Jeu(IAffichage journal) {
		this.journal = journal;
	}

	public boolean verifierVictoire(Joueur joueur1, Joueur joueur2, Plateau plateauActuel) {
		Pion pion = joueur1.getPion();
		int positionPion = pion.getPositionActuelle();

		if (positionPion == plateauActuel.getTaille()) {
			journal.afficherVictoire(joueur1.getNom());
			return true;
		}

		if (joueur1.getNombreDeCoeur() == 0) {
			journal.afficherMort(joueur1.getNom());
			journal.afficherVictoire(joueur2.getNom());
			return true;
		}

		journal.afficherEncouragement(positionPion);
		return false;
	}

	public void verifierEffet(Joueur joueur1, Joueur joueur2) {
		Pion pion = joueur1.getPion();

		for (CaseSpeciale c : caseSpeciales) {
			if (c != null && pion.getPositionActuelle() == c.getNumero()) {
				c.appliquerEffet(joueur1, joueur2);
			}
		}
	}

	public boolean verifierContinuer() {
		while (true) {

			journal.afficherAvis();
			String avis = journal.recupererAvis();

			if (avis.equals("y")) {
				return true;
			}

			else if (avis.equals("n")) {
				journal.afficherDecisionQuitter();
				return false;
			}

			else {
				journal.afficherChoixInvalide();
				journal.recupererAvis();
			}
		}
	}

	public Joueur[] initialiserJeu() {
		Joueur[] joueurs = new Joueur[2];

		while (true) {

			journal.afficherMenu();
			String choix = journal.recupererAvis();

			if (choix.equals("1")) {
				initialiserJoueurs(joueurs);
				return joueurs;
			}

			if (choix.equals("2")) {
				journal.regleDuJeu();
				journal.recupererAvis();
			}

			else if (choix.equals("3")) {
				journal.afficherDecisionQuitter();
				return joueurs;
			}

			else {
				journal.afficherChoixInvalide();
				journal.recupererAvis();
			}
		}
	}

	private void initialiserJoueurs(Joueur[] joueurs) {
		journal.initialiserNom("1");
		String nom1 = journal.recupererAvis();
		journal.afficherBienvenue(nom1);
		joueurs[0] = new Joueur(nom1, pion1, de);

		journal.initialiserNom("2");
		String nom2 = journal.recupererAvis();
		journal.afficherBienvenue(nom2);
		joueurs[1] = new Joueur(nom2, pion2, de);
	}

	public void lancerJeu() {
		while (true) {

			Joueur[] joueurs = initialiserJeu();

			Joueur joueur1 = joueurs[0];
			Joueur joueur2 = joueurs[1];

			if (joueur1 == null || joueur2 == null) {
				return;
			}

			if (gererChoixDepart(joueur1, joueur2)) {
				return;
			}
		}
	}

	private boolean gererChoixDepart(Joueur joueur1, Joueur joueur2) {
		String commencer = "";

		while (!commencer.equals("1") && !commencer.equals("2")) {
			journal.afficherDepart();

			commencer = journal.recupererAvis();

			if (commencer.equals("1")) {
				jouerPartie(joueur1, joueur2);
				return true;
			}

			else if (commencer.equals("2")) {
				journal.afficherRetournerAuMenu();
				journal.recupererAvis();
				return false;
			}

			else {
				journal.afficherChoixInvalide();
				journal.recupererAvis();
			}
		}

		return false;
	}

	private void jouerPartie(Joueur joueur1, Joueur joueur2) {
		while (true) {

			if (jouerTour(joueur1, joueur2)) {
				return;
			}

			if (jouerTour(joueur2, joueur1)) {
				return;
			}

			if (!verifierContinuer()) {
				return;
			}
		}
	}

	private boolean jouerTour(Joueur joueurCourant, Joueur autreJoueur) {
		journal.afficherEtesVousPret(joueurCourant.getNom());
		journal.recupererAvis();

		joueurCourant.deplacerJoueur();

		verifierEffet(joueurCourant, autreJoueur);

		if (verifierVictoire(joueurCourant, autreJoueur, plateau)) {
			return true;
		}

		return false;
	}

}