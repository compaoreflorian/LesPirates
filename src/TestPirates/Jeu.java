package TestPirates;

public class Jeu {
	private IAffichage journal;
	private Pion pion1 = new Pion(Couleur.ROUGE);
	private Pion pion2 = new Pion(Couleur.BLEU);
	private Plateau plateau1 = new Plateau(pion1, pion2);
	private Joueur joueur1 = new Joueur("Bill Jambe de Bois", pion2, plateau1);
	private Joueur joueur2 = new Joueur("ack Le Borne", pion1, plateau1);
	
	
    
	public Jeu(IAffichage journal) {
		this.journal = journal;
	}

	public void initailiserLeJeu() {
		journal.afficherJoueur(joueur1);
		journal.afficherJoueur(joueur2);
	};

	public void jouer() {
		boolean test = true;
		while (test == true) {
			joueur1.deplacerJoueur();
			joueur1.verifierVictoire();
			joueur1.deplacerJoueur();
			joueur1.verifierVictoire();
			boolean avis = journal.afficheravis();
			if (avis == true) {
				test = true;
			} else {
				test = false;
			}
		}
	}
}
