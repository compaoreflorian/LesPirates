package test_pirates;

import java.util.Scanner;

public class JournalOnePiece implements IAffichage {
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void afficherposition(int position) {
		System.out.println("vous vous deplacer à la position: " + position + ".");

	}

	@Override
	public void afficherVictoire(String nom) {
		System.out.println("Felicitations " + nom + " tu viens de trouvé le one piece tu as gagné ");
		System.out.println("===========================================================");

	}

	@Override
	public void afficherAvis() {
		System.out.println("===========================================================");
		System.out.println("             vouler vous continuer y/n");
		System.out.println("===========================================================");

	}

	@Override
	public void initialiserNom(String numero) {
		System.out.println();
		System.out.println("==================================================================");
		System.out.println("                     NOUVELLE AVENTURE                            ");
		System.out.println("==================================================================");
		System.out.print("Capitaine " + numero + " , Entrez votre nom :         ");

	}

	@Override
	public void afficherTirage(int tirage) {
		if (tirage < 3) {
			System.out.println("========================================================================");
			System.out.println("oups vous avez tirez " + tirage + ", vous venez de perdre 1 point de vie");
			System.out.println("oups vous venez de perdre 1 point de vie");
		} else {
			System.out.println("hourra vous avez tirez " + tirage + ", vous venez de gagnez un point de vie");
		}

	}

	@Override
	public void afficherPointDeVie(int NombreDeCoeur) {
		if (NombreDeCoeur < 3) {
			System.out.println("attention il ne vous reste plus que " + NombreDeCoeur + " points de vie");
		} else {
			System.out.println("vous avez " + NombreDeCoeur + " points de vie");

		}

	}

	@Override
	public void afficherMenu() {
		System.out.println("====================================================");
		System.out.println("          A la recherche du one piece               ");
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("   1 - Nouvelle partie");
		System.out.println("   2 - Règles du jeu");
		System.out.println("   3 - Quitter");
		System.out.println("====================================================");
		System.out.print("👉 Choisissez une option : ");
	}

	@Override
	public void afficherEncouragement(int positionPion) {
		System.out.println("Continue comme ça moussaillon plus que " + (30 - positionPion) + " cases a parcourir");
		System.out.println("=====================================================================================");
		System.out.println();
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
		System.out.println("==================================================================================");
		System.out.println("                        PRÊTS À LEVER L’ANCRE                                     ");
		System.out.println("==================================================================================");
		System.out.println();
		System.out.println("                  Capitaines, êtes-vous prêts à partir ?     ");
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println("         1 - Oui, à l’abordage !                                                  ");
		System.out.println("         2 - Pas encore                                                           ");
		System.out.println();
		System.out.println("==================================================================================");
		System.out.print("👉 Votre choix : ");
	}

	@Override
	public void afficherContinuer() {
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println("                           ⚓ FIN DU TOUR ⚓                                      ");
		System.out.println("==================================================================================");
		System.out.println("                       Souhaitez-vous poursuivre le voyage ?                      ");
		System.out.println("==================================================================================");
		System.out.println("                         1 ▸ Continuer l’aventure                                 ");
		System.out.println("                         2 ▸ Retourner au menu                                    ");
		System.out.println("==================================================================================");

		System.out.print("👉 Votre décision : ");

	}

	@Override
	public void afficherRetour(int retour) {
		System.out.println();
		System.out.println("oups tu es tombé dans un piège, tu retournes à la position: " + retour + ".");
	}

	@Override
	public void afficherDeplacement(String nom, int deplacement) {
		System.out.println();
		System.out.println(nom + " vous avez tirer : " + deplacement + ".");
	}

	@Override
	public void afficherPlusOuMoins() {
		System.out.println();
		System.out.println(
				"vous venez de tomber sur la case plus ou moins votre sort sera déteminer à l'issue d'un tirage de dé.");
		System.out.println("Lancement du dé.");
		long debut = System.currentTimeMillis();
		while (System.currentTimeMillis() - debut < 2000) {
		}
		System.out.println();
	}

	@Override
	public void regleDuJeu() {
		System.out.println("===== REGLES DU JEU DES PIRATES =====");
		System.out.println();

		System.out.println("Histoire :");
		System.out.println("Jack Le Borgne et Bill Jambe de Bois veulent devenir le roi des pirates .");
		System.out
				.println("Pour devenir roi des pirates il faudra trouvé le plus grand trésor au monde : le One Piece.");
		System.out.println("Le premier pirate qui trouvera ce trésor deviendra alors le 'ROI DES PIRATES'.");
		System.out.println();

		System.out.println("Principe du jeu :");
		System.out.println("- Le jeu se joue a 2 joueurs.");
		System.out.println("- Chaque joueur controle un pirate.");
		System.out.println("- Jack Le Borgne : pion rouge.");
		System.out.println("- Bill Jambe de Bois : pion bleu.");
		System.out.println();

		System.out.println("Deplacement :");
		System.out.println("- Les joueurs jouent chacun leur tour.");
		System.out.println("- Ils lancent deux des a 6 faces.");
		System.out.println("- Le pirate avance selon le resultat des des.");
		System.out.println();

		System.out.println("Plateau :");
		System.out.println("- Le plateau contient des cases numerotees de 1 a 30.");
		System.out.println("- Les cases sont disposees en spirale.");
		System.out.println();

		System.out.println("Points de vie :");
		System.out.println("- Chaque pirate possede 5 coeurs (points de vie).");
		System.out.println("- Si un pirate perd tous ses coeurs, il perd la partie.");
		System.out.println();

		System.out.println("Objectif :");
		System.out.println("- Atteindre la derniere case (30) en premier ce qui revient a trouver le One Piece.");
		System.out.println("OU");
		System.out.println("- Survivre lorsque l'adversaire n'a plus de points de vie.");
		System.out.println();

		System.out.println("=====================================================================================");
		System.out.println("Appuyer sur entrée pour retourner au menu principale ");
		System.out.println("=====================================================================================");
		System.out.println();

	}

	@Override
	public void afficherDecisionQuitter() {
		System.out.println("=====================================================================================");
		System.out.println("Vous avez décidez de quitter le jeu");
		System.out.println("=====================================================================================");
		System.out.println();
	}

	@Override
	public void afficherChoixInvalide() {
		System.out.println(
				"      votre choix est invalide, veuillez choisir parmis les options proposé                 ");
		System.out.println("=====================================================================================");
		System.out.println("                       Appuyer sur entrée ");
		System.out.println("=====================================================================================");
		System.out.println();
	}

	@Override
	public void afficherEtesVousPret(String nom) {
		System.out.println();
		System.out.println("==================================================================================");
		System.out.println("                  Capitaine  " + nom + ", à toi de jouer                          ");
		System.out.println("==================================================================================");
		System.out.println("                  Appuyez sur Entrée pour lancer le dé  ");
		System.out.println("");

	}

	@Override
	public void afficherVieMax() {
		System.out.println("vous avez déja 5 points de vie vous ne pouvez pas en gagnez plus ");
		System.out.println("=================================================================");

	}

	@Override
	public void afficherinversion(String nom, int position) {
		System.out.println("vous etes tombé dans la case inversion vous inverser votre case avec " + nom);
		System.out.println("votre nouvelle position est: " + position + ".");
		System.out.println("=================================================================================");
	}

	@Override
	public void afficherRetournerAuMenu() {
		System.out.println("=================================================================================");
		System.out.println("vous avez decidez de ne pas commencé appuyer sur entrez pour retounez au menu pricipal");

	}

	@Override
	public String recupererAvis() {
		return scanner.nextLine();
	}

	@Override
	public void afficherMort(String nom) {
		System.out.println(
				"==================================================================================================");
		System.out.println(
				"Capitaine " + nom + " vous n'avez malheureusement plus de point de vie vous venez donc de mourir");

	}
}