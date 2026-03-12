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
	public void appliquerEffet(Joueur joueur, Pion pion) {
		int retour = pion.getPositionPrecedente();
		int difference = pion.getPositionPrecedente() - pion.getPosition();
		pion.changerPosition(difference);
		journal.afficherRetour(retour);
	}

}
