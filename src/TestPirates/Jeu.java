package TestPirates;

public class Jeu {
	private IAffichage journal;
	
	
	private De de = new De();
	private Plateau plateau1 = new Plateau();
	private Pion pion1= new Pion(Couleur.BLEU,plateau1);
	private Pion pion2 = new Pion(Couleur.ROUGE,plateau1);

	public Jeu(IAffichage journal) {
		this.journal = journal;
	}

	public void lancerJeu() {
		String nom1 = journal.initialiserNom();
		Joueur joueur1 = new Joueur(nom1, pion1,de);
		journal.afficherJoueur(joueur1);
		String nom2 = journal.initialiserNom();
		Joueur joueur2 = new Joueur(nom2, pion2, de);
		journal.afficherJoueur(joueur2);
		boolean test2 = true;
		while (test2) {

			joueur1.deplacerJoueur();
			boolean victoire1 = joueur1.verifierVictoire();
			if (victoire1) {
				return;
			}

			joueur2.deplacerJoueur();
			boolean victoire2 = joueur2.verifierVictoire();
			if (victoire2) {
				return;
			}

			boolean avis = journal.afficheravis();
			if (avis) {
				test2 = true;
			} else {
				test2 = false;
			}
		}
	}
};
