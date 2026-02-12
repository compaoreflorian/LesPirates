package TestPirates;

import java.util.Scanner;

public class JournalOnePiece implements IAffichage {

	@Override
	public void afficherposition(String nom, int position) {
		// TODO Auto-generated method stub
		System.out.println("rouahhhhh pirate" + nom + "tu est a la position" + position);

	}

	@Override
	public void afficherVictoire(int position) {
		// TODO Auto-generated method stub
		if (position == 30) {
			System.out.println("ça c'est du moussaillon tu a gagné ");
		} else {
			System.out.println("tu y es presque continue comme ça moussaillon");
		}

	}

	@Override
	public void afficherJoueur(Joueur joueur) {
		// TODO Auto-generated method stub
		System.out.println(
				"ourararah jeune mousallon j'espere que t'es pret a pendre la mer ton nom sera " + joueur.getNom());

	}

	@Override
	public boolean afficheravis() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("vouler vous continuer y/n");
		String avis = scanner.nextLine();
		boolean test = false;
		boolean avi = false;
		while (test == false) {
			if (avis == "y") {
				test = true;
				avi = true;

			} else if (avis == "n") {
				test = false;
				avi = false;
			} else {
				System.out.print("vouler vous continuer chisissez entre y pour oui ou n pour non");
			}
		}
		return avi;
	}
}
