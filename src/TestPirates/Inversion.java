package TestPirates;

public class Inversion extends CaseSpeciale {
	private int numero;

	public Inversion(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void appliquerEffet(Joueur joueur1, Joueur joueur2) {
		Pion pion1 = joueur1.getPion();
		Pion pion2 = joueur2.getPion();
		int position1 = pion1.getPositionActuelle();
		int position2 = pion2.getPositionActuelle();
		pion2.teleporter(position1);
		pion1.teleporter(position2);
		journal.afficherinversion(joueur2.getNom(), position2);
	}
}
