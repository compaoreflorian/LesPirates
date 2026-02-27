package TestPirates;

public class PlusOuMoins extends CaseSpeciale {
	private int numero;
	private De de = new De();

	public PlusOuMoins(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void appliquerEffet(Joueur joueur) {
		// TODO document why this method is empty
		int NombreDeCoeur = joueur.getNombreDeCoeur();
		int tirage = de.lancer(1);
		if (tirage < 3) {
			joueur.setNombreDeCoeur(NombreDeCoeur - 1);
		} else {
			joueur.setNombreDeCoeur(NombreDeCoeur + 1);
		}
	}

}
