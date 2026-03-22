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
	public void appliquerEffet(Joueur joueur1, Joueur joueur2) {
		int nombreDeCoeur = joueur1.getNombreDeCoeur();
		journal.afficherPlusOuMoins();
		int tirage = de.lancer(1);
		if (tirage < 3) {
			joueur1.setNombreDeCoeur(nombreDeCoeur - 1);
			journal.afficherTirage(tirage);
		} else {
			int vie = joueur1.getNombreDeCoeur();
			if (vie < 5) {
				joueur1.setNombreDeCoeur(nombreDeCoeur + 1);
				journal.afficherTirage(tirage);
			} else {
				journal.afficherVieMax();
			}
		}
		journal.afficherPointDeVie(joueur1.getNombreDeCoeur());

	}

}
