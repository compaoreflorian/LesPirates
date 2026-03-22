package TestPirates;

public class Inversion extends CaseSpeciale {
	private int numero;
	private IAffichage journal = new JournalOnePiece();

	public Inversion(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void appliquerEffet(Joueur joueur1,Joueur joueur2) {
		Pion pion1=joueur1.getPion();
		Pion pion2 = joueur2.getPion();
		int position1 = pion1.getPosition();
		int position2 = pion2.getPosition();
		pion2.teleporter(position1);
		pion1.teleporter(position2);
		journal.afficherinversion(joueur2.getNom(),position2);
	}
}
