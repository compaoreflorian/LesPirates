package TestPirates;

public class Joueur {
	private IAffichage journal = new JournalOnePiece();
	private String nom;
	private int nombreDeCoeur;
	private Pion pion;
	private De de;

	public Joueur(String nom, Pion pion, De de) {
		this.nom = nom;
		this.pion = pion;
		this.de = de;

	}

	public void deplacerJoueur() {
		int deplacement = de.lancer();
		pion.changerPosition(deplacement);
		journal.afficherposition(nom, pion.getPosition());
	}

	public String getNom() {
		return nom;
	}

	public boolean verifierVictoire() {
		int positionPion = pion.getPosition();
		return journal.afficherVictoire(positionPion);
	}
}
