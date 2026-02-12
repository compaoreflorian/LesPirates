package TestPirates;

public class Pion {
	private Couleur couleur;
	private String nom;
	private int position;

	public Pion(Couleur couleur) {
		this.couleur = couleur;
		nom = couleur.getCouleur();
		this.position = 1;
	}

	public int getPosition() {
		return position;

	}

	public void changerPosition(int deplacement) {
		if ((position + deplacement) > 30) {
			int retour = position + deplacement - 30;
			position = 30 - retour;
		} else {

			position = position + deplacement;
		}

	}

	public String getNom() {
		return nom;
	}
}
