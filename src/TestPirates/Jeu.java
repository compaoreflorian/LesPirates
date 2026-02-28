package TestPirates;

import java.util.Scanner;

public class Jeu {
	private IAffichage journal;

	private De de = new De();
	private Plateau plateau1 = new Plateau();
	private CaseSpeciale[] caseSpeciales = plateau1.getCases();
	private Pion pion1 = new Pion(Couleur.BLEU, plateau1);
	private Pion pion2 = new Pion(Couleur.ROUGE, plateau1);

	public Jeu(IAffichage journal) {
		this.journal = journal;
	}

	public String recupererAvis() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();

	}

	public void verifierEffet(Joueur joueur, Pion pion) {
		for (int i = 0; i < caseSpeciales.length; i++) {
			if (pion.getPosition() == caseSpeciales[i].getNumero()) {
				caseSpeciales[i].appliquerEffet(joueur, pion);
			}
		}

	}

	public Joueur[] initialiserJeu() {
		journal.afficherMenu();
		String choix = recupererAvis();
		Joueur[] joueurs = new Joueur[2];

		if (choix.equals("1")) {

			journal.initialiserNom("1");
			String nom1 = recupererAvis();
			journal.afficherBienvenue(nom1);
			Joueur joueur1 = new Joueur(nom1, pion1, de);
			joueurs[0] = joueur1;

			journal.initialiserNom("2");
			String nom2 = recupererAvis();
			journal.afficherBienvenue(nom2);
			Joueur joueur2 = new Joueur(nom2, pion2, de);
			joueurs[1] = joueur2;
			journal.afficherDepart();

		}
		return joueurs;
	}

	public void lancerJeu() {
		Joueur joueur[] = initialiserJeu();
		Joueur joueur1 = joueur[0];
		Joueur joueur2 = joueur[0];
		String choix = recupererAvis();
		if (choix.equals("1")) {
			boolean test2 = true;
			while (test2) {

				joueur1.deplacerJoueur();
				verifierEffet(joueur1, pion1);
				boolean victoire1 = joueur1.verifierVictoire();
				if (victoire1) {
					return;
				}

				joueur2.deplacerJoueur();
				verifierEffet(joueur2, pion2);
				boolean victoire2 = joueur2.verifierVictoire();
				if (victoire2) {
					return;
				}

				boolean avis = journal.afficheravis();
				if (avis) {
					test2 = true;
				} else {
					test2 = false;
				}
			}
		} else if (choix.equals("2")) {
			lancerJeu();
		}

	}
}
