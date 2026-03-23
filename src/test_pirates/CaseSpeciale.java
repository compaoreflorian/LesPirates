package test_pirates;

public abstract class CaseSpeciale {
	protected IAffichage journal = new JournalOnePiece();

	protected abstract void appliquerEffet(Joueur joueur1, Joueur joueur2);

	protected abstract int getNumero();

}
