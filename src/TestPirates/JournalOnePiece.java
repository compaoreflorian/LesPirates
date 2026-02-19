package TestPirates;

import java.util.Scanner;

public class JournalOnePiece implements IAffichage {

	@Override
	public void afficherposition(String nom, int position) {
		System.out.println("rouahhhhh pirate " + nom + " tu est a la position " + position);

	}

	@Override
	public boolean afficherVictoire(int position) {
		boolean victoire =false;
		if (position == 30) {
			System.out.println("ça c'est du moussaillon tu a gagné ");
			victoire =true;
		} else {
			System.out.println("tu y es presque continue comme ça moussaillon ");
		}
		System.out.println("--------------------------------------------------------------");
		return victoire;

	}

	@Override
	public void afficherJoueur(Joueur joueur) {
		System.out.println(
				"ourararah jeune mousallon j'espere que t'es pret a pendre la mer ton nom sera " + joueur.getNom());
		System.out.println("--------------------------------------------------------------");

	}

	@Override
	public boolean afficheravis() {
		System.out.println("vouler vous continuer y/n");
		boolean test = false;
		boolean avi = false;
		Scanner scanner = new Scanner(System.in);
		while (test == false) {
			String avis = scanner.nextLine();
			if (avis.equalsIgnoreCase("y") ) {
				avi = true;
				test = true;

			} else if (avis.equalsIgnoreCase("n")) {
				avi = false;
				test = true;
				System.out.println("vous avez decidé de quitter le jeu");
			} else {
				System.out.println("vouler vous continuer, choisissez entre y pour oui ou n pour non");
				test = false;
			}
		}

		return avi;
	}
	
	@Override
	public String initialiserNom() {
		System.out.println("pour commencer la partie vous devez choisir un nom");
		Scanner n = new Scanner(System.in) ;
		String nom = n.nextLine();
		return nom;
		
	}

}
