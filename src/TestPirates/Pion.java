package TestPirates;

public class Pion {
	private Couleur couleur;
	private String nom;
	private int position;
	private Plateau plateau;

	public Pion(Couleur couleur, Plateau plateau) {
		this.couleur = couleur;
		this.plateau=plateau;
		nom = couleur.getCouleur();
		this.position = 1;
	}

	public int getPosition() {
		return position;

	}

	public void changerPosition(int deplacement) {
		if ((position + deplacement) > plateau.getTaille()) {
			int retour = position + deplacement - plateau.getTaille();
			position = plateau.getTaille() - retour;
		} else {

			position = position + deplacement;
		}

	}

	public String getNom() {
		return nom;
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
}
