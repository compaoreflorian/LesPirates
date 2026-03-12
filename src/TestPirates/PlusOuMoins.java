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
	public void appliquerEffet(Joueur joueur, Pion pion1, Pion pion2) {
		int nombreDeCoeur = joueur.getNombreDeCoeur();
		journal.afficherPlusOuMoins();
		int tirage = de.lancer(1);
		if (tirage < 3) {
			joueur.setNombreDeCoeur(nombreDeCoeur - 1);
			journal.afficherTirage(tirage);
		} else {
			int vie = joueur.getNombreDeCoeur();
			if(vie<5) {
			joueur.setNombreDeCoeur(nombreDeCoeur + 1);
			journal.afficherTirage(tirage);
		}
			else {
				journal.afficherVieMax();
			}
		}
		journal.afficherPointDeVie(joueur.getNombreDeCoeur());

	}

}
