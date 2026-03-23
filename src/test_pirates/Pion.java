package test_pirates;

public class Pion {
	private String nom;
	private int positionActuelle;
	private int positionPrecedente;
	private Plateau plateau;

	public Pion(Couleur couleur, Plateau plateau) {
		this.plateau = plateau;
		nom = couleur.getCouleur();
		this.positionActuelle = 0;
	}

	public int getPositionPrecedente() {
		return positionPrecedente;
	}

	public int getPositionActuelle() {
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

	public void teleporter(int numeroDeCase) {
		positionActuelle = numeroDeCase;
	}

	public String getNom() {
		return nom;
	}

}
