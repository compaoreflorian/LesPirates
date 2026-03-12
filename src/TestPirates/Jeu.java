package TestPirates;

import java.util.Scanner;

public class Jeu {

	private IAffichage journal;
	private De de = new De();
	private Plateau plateau = new Plateau();
	private CaseSpeciale[] caseSpeciales = plateau.getCases();
	private Pion pion1 = new Pion(Couleur.BLEU, plateau);
	private Pion pion2 = new Pion(Couleur.ROUGE, plateau);
	private Scanner scanner = new Scanner(System.in);

	public Jeu(IAffichage journal) {
		this.journal = journal;
	}

	public String recupererAvis() {
		return scanner.nextLine();
	}

	public boolean verifierVictoire(Pion pion, Plateau plateauActuel) {

		int positionPion = pion.getPosition();

		if (positionPion == plateauActuel.getTaille()) {
			journal.afficherVictoire();
			return true;
		}

		journal.afficherEncouragement(positionPion);
		return false;
	}

	public void verifierEffet(Joueur joueur, Pion pion1, Pion pion2) {

		for (CaseSpeciale c : caseSpeciales) {

			if (c != null && pion1.getPosition() == c.getNumero()) {
				c.appliquerEffet(joueur, pion1, pion2);
			}
		}
	}

	public boolean verifierContinuer() {

		while (true) {

			journal.afficheravis();
			String avis = recupererAvis();

			if (avis.equals("y")) {
				return true;
			}

			else if (avis.equals("n")) {
				journal.afficherDecisionQuitter();
				return false;
			}

			else {
				journal.afficherChoixInvalide();
				recupererAvis();
			}
		}
	}

	public Joueur[] initialiserJeu() {

		Joueur[] joueurs = new Joueur[2];

		while (true) {

			journal.afficherMenu();
			String choix = recupererAvis();

			if (choix.equals("1")) {

				journal.initialiserNom("1");
				String nom1 = recupererAvis();
				journal.afficherBienvenue(nom1);
				joueurs[0] = new Joueur(nom1, pion1, de);

				journal.initialiserNom("2");
				String nom2 = recupererAvis();
				journal.afficherBienvenue(nom2);
				joueurs[1] = new Joueur(nom2, pion2, de);

				return joueurs;
			}

			if (choix.equals("2")) {
				journal.regleDuJeu();
				recupererAvis();
			}

			else if (choix.equals("3")) {
				journal.afficherDecisionQuitter();
				return joueurs;
			}

			else {
				journal.afficherChoixInvalide();
				recupererAvis();
			}
		}
	}

	public void lancerJeu() {

		while (true) {

			String commencer = "";
			Joueur[] joueurs = initialiserJeu();

			Joueur joueur1 = joueurs[0];
			Joueur joueur2 = joueurs[1];

			if (joueur1 == null || joueur2 == null) {
				return;
			}

			while (!commencer.equals("1") && !commencer.equals("2")) {
				journal.afficherDepart();

				commencer = recupererAvis();

				if (commencer.equals("1")) {

					boolean partieEnCours = true;

					while (partieEnCours) {

						journal.afficherEtesVousPret(joueur1.getNom());
						recupererAvis();

						joueur1.deplacerJoueur();

						verifierEffet(joueur1, pion1, pion2);

						if (verifierVictoire(pion1, plateau)) {
							return;
						}

						journal.afficherEtesVousPret(joueur2.getNom());
						recupererAvis();

						joueur2.deplacerJoueur();
						verifierEffet(joueur2, pion2, pion1);

						if (verifierVictoire(pion2, plateau)) {
							return;
						}
						if (!verifierContinuer()) {
							return;
						}

					}
				}

				else if (commencer.equals("2")) {
					journal.afficherDecisionQuitter();
					break;
				}

				else {
					journal.afficherChoixInvalide();
					recupererAvis();
				}
			}
		}
	}
}
