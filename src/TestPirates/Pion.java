package TestPirates;

public class Pion {
	private Couleur couleur;
	private String nom;
	private int positionActuelle;
	private int positionPrecedente;
	private Plateau plateau;

	public Pion(Couleur couleur, Plateau plateau) {
		this.couleur = couleur;
		this.plateau = plateau;
		nom = couleur.getCouleur();
		this.positionActuelle = 1;
	}

	public int getPositionPrecedente() {
		return positionPrecedente;
	}

	public int getPosition() {
		return positionActuelle;

	}

	public void changerPosition(int deplacement) {
		positionPrecedente = positionActuelle;
		if ((positionActuelle + deplacement) > plateau.getTaille()) {
			int retour = positionActuelle + deplacement - plateau.getTaille();
			positionActuelle = plateau.getTaille() - retour;
		} else {

			positionActuelle = positionActuelle + deplacement;
		}

	}

	public String getNom() {
		return nom;
	}

}
