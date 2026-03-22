package TestPirates;

public class Joueur {
	private IAffichage journal = new JournalOnePiece();
	private String nom;
	private int nombreDeCoeur = 5;
	private Pion pion;
	private De de;

	public Joueur(String nom, Pion pion, De de) {
		this.nom = nom;
		this.pion = pion;
		this.de = de;

	}

	public void deplacerJoueur() {
		int deplacement = de.lancer(2);
		journal.afficherDeplacement(nom, deplacement);
		pion.changerPosition(deplacement);
		journal.afficherposition(pion.getPositionActuelle());

	}

	public Pion getPion() {
		return pion;
	}

	public String getNom() {
		return nom;
	}

	public int getNombreDeCoeur() {
		return nombreDeCoeur;
	}

	public void setNombreDeCoeur(int nombre) {
		this.nombreDeCoeur = nombre;
	}
}
