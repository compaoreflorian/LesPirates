package TestPirates;

public class AnnuleCase extends CaseSpeciale {
	private int numero;

	public AnnuleCase(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void appliquerEffet(Joueur joueur1, Joueur joueur2) {
		Pion pion1 = joueur1.getPion();
		int retour = pion1.getPositionPrecedente();
		int difference = pion1.getPositionPrecedente() - pion1.getPositionActuelle();
		pion1.changerPosition(difference);
		journal.afficherRetour(retour);
	}

}
