package TestPirates;

public class PlusOuMoins extends CaseSpeciale {
	private int numero;
	private IAffichage journal = new JournalOnePiece();
	private De de = new De();

	public PlusOuMoins(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void appliquerEffet(Joueur joueur, Pion pion) {
		int nombreDeCoeur = joueur.getNombreDeCoeur();
		int tirage = de.lancer(1);
		if (tirage < 3) {
			joueur.setNombreDeCoeur(nombreDeCoeur - 1);
			journal.afficherTirage(tirage);
		} else {
			joueur.setNombreDeCoeur(nombreDeCoeur + 1);
			journal.afficherTirage(tirage);
		}
		journal.afficherPointDeVie(joueur.getNombreDeCoeur());

	}

}
