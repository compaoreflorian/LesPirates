package TestPirates;

public class AnnuleCase extends CaseSpeciale {
	private int numero;
	private IAffichage journal = new JournalOnePiece();
	private De de = new De();

	public AnnuleCase(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void appliquerEffet(Joueur joueur, Pion pion1, Pion pion2) {
		int retour = pion1.getPositionPrecedente();
		int difference = pion1.getPositionPrecedente() - pion1.getPosition();
		pion1.changerPosition(difference);
		journal.afficherRetour(retour);
	}

}
