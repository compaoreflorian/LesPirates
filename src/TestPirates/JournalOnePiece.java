package TestPirates;
import java.util.Scanner;

public class JournalOnePiece implements IAffichage {

	@Override
	public void afficherposition(String nom, int position) {
		System.out.println("rouahhhhh pirate " + nom + " tu est a la position " + position);

	}

	@Override
	public void afficherVictoire() {
		System.out.println("ça c'est du moussaillon tu a gagné ");
		System.out.println("====================================================");

	}

	@Override
	public boolean afficheravis() {
		System.out.println("vouler vous continuer y/n");
		boolean test = false;
		boolean avi = false;
		Scanner scanner = new Scanner(System.in);
		while (test == false) {
			String avis = scanner.nextLine();
			if (avis.equalsIgnoreCase("y")) {
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
	public void initialiserNom(String numero) {
		System.out.println();
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║            🏴‍☠️ NOUVELLE AVENTURE 🏴‍☠️            ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║Capitaine "+ numero + " , Entrez votre nom :         ║");
        System.out.println("╚══════════════════════════════════════════════╝");

	}

	@Override
	public void afficherTirage(int tirage) {
		if (tirage < 3) {
			System.out.println("oups vous venez de perdre 1 point de vie");
		} else {
			System.out.println("hourra vous venez de gagnez un point de vie");
		}

	}

	@Override
	public void afficherPointDeVie(int NombreDeCoeur) {
		if (NombreDeCoeur < 3) {
			System.out.println("attention il ne vous reste plus que " + NombreDeCoeur + " points de vie");
		} else {
			System.out.println("vous avez" + NombreDeCoeur + " points de vie");

		}

	}

	@Override
	public void afficherMenu() {
		System.out.println("====================================================");
		System.out.println("        ☠️  LA LÉGENDE DES SEPT MERS  ☠️");
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("   1 - Nouvelle partie");
		System.out.println("   2 - Règles du jeu");
		System.out.println("   3 - Charger la partie");
		System.out.println("   4 - Quitter");
		System.out.println("====================================================");
		System.out.print("👉 Choisissez une option : ");
	}

	@Override
	public void afficherEncouragement(int positionPion) {
		System.out.println("Continue comme ça moussaillon plus que " + (30 - positionPion) + "a parcourir");
		System.out.println("====================================================");

	}

	@Override
	public void afficherBienvenue(String nom) {
		System.out.println();
        System.out.println("⚓ Bienvenue à bord, Capitaine " + nom + " !");
        System.out.println("Que la mer vous soit favorable 🌊");		
	}

	@Override
	public void afficherDepart() {
		    System.out.println();
		    System.out.println("╔══════════════════════════════════════════════╗");
		    System.out.println("║            ⚓ PRÊTS À LEVER L’ANCRE ⚓        ║");
		    System.out.println("╠══════════════════════════════════════════════╣");
		    System.out.println("║                                              ║");
		    System.out.println("║   Capitaines, êtes-vous prêts à partir ?     ║");
		    System.out.println("║                                              ║");
		    System.out.println("║          1 - Oui, à l’abordage !             ║");
		    System.out.println("║          2 - Pas encore                      ║");
		    System.out.println("║                                              ║");
		    System.out.println("╚══════════════════════════════════════════════╝");
		    System.out.print("👉 Votre choix : ");
	}

	@Override
	public void afficherIntro() {
		    System.out.println();
		    System.out.println("╔══════════════════════════════════════════════╗");
		    System.out.println("║              🌊 L’AVENTURE COMMENCE 🌊       ║");
		    System.out.println("╠══════════════════════════════════════════════╣");
		    System.out.println("║                                              ║");
		    System.out.println("║  Les vents soufflent sur les mers oubliées…  ║");
		    System.out.println("║  Deux capitaines se disputent un trésor      ║");
		    System.out.println("║  légendaire enfoui au bout du monde.         ║");
		    System.out.println("║                                              ║");
		    System.out.println("║  Seul le plus audacieux atteindra la gloire. ║");
		    System.out.println("║                                              ║");
		    System.out.println("║        ⚓ Que la chasse au trésor débute !    ║");
		    System.out.println("║                                              ║");
		    System.out.println("╚══════════════════════════════════════════════╝");
		    System.out.print("👉 Appuyez sur Entrée pour commencer…");
			
	}

	@Override
	public void afficherTour(String nom) {
		    System.out.println();
		    System.out.println("╔══════════════════════════════════════════════╗");
		    System.out.println("║                🎲 TOUR DU JOUEUR             ║");
		    System.out.println("╠══════════════════════════════════════════════╣");
		    System.out.println("║                                              ║");
		    System.out.printf("║              🏴‍☠️ %-20s ║%n", nom);
		    System.out.println("║                                              ║");
		    System.out.println("║        Appuyez sur Entrée pour lancer le dé  ║");
		    System.out.println("║                                              ║");
		    System.out.println("╚══════════════════════════════════════════════╝");
		
	}



	@Override
	public void afficherContinuer() {
		    System.out.println();
		    System.out.println("╔══════════════════════════════════════════════╗");
		    System.out.println("║               ⚓ FIN DU TOUR ⚓               ║");
		    System.out.println("╠══════════════════════════════════════════════╣");
		    System.out.println("║                                              ║");
		    System.out.println("║      Souhaitez-vous poursuivre le voyage ?   ║");
		    System.out.println("║                                              ║");
		    System.out.println("║           1 ▸ Continuer l’aventure           ║");
		    System.out.println("║           2 ▸ Retourner au port              ║");
		    System.out.println("║                                              ║");
		    System.out.println("╚══════════════════════════════════════════════╝");
		    System.out.print("👉 Votre décision : ");
		
		
	}

}  