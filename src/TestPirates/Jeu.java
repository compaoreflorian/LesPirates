package TestPirates;

public class Jeu {
	private IAffichage journal;
	private Pion pion1 = new Pion(Couleur.ROUGE);
	private Pion pion2 = new Pion(Couleur.BLEU);
	private Plateau plateau1 = new Plateau(pion1, pion2);

	public Jeu(IAffichage journal) {
		this.journal = journal;
	}

	public void lancerJeu() {
		String nom1 = journal.initialiserNom();
		Joueur joueur1 = new Joueur(nom1, pion2, plateau1);
		journal.afficherJoueur(joueur1);
		String nom2 = journal.initialiserNom();
		Joueur joueur2 = new Joueur(nom2, pion1, plateau1);
		journal.afficherJoueur(joueur2);
		boolean test2 = true;
		while (test2 == true) {

			joueur1.deplacerJoueur();
			boolean victoire1 = joueur1.verifierVictoire();
			if (victoire1 == true) {
				return;
			}

			joueur2.deplacerJoueur();
			boolean victoire2 = joueur2.verifierVictoire();
			if (victoire2 == true) {
				return;
			}

			boolean avis = journal.afficheravis();
			if (avis == true) {
				test2 = true;
			} else {
				test2 = false;
			}
		}
	}
};
