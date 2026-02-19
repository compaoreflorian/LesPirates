package TestPirates;

public class Main {
	public static void main(String[] args) {
		IAffichage journal = new JournalOnePiece();
		Jeu jeu = new Jeu(journal);
		jeu.lancerJeu();
	}
}
