package test_pirates;

public interface IAffichage {
	void afficherPlusOuMoins();

	void afficherVictoire(String nom);

	void afficherAvis();

	void afficherposition(int position);

	void initialiserNom(String numero);

	void afficherTirage(int tirage);

	void afficherPointDeVie(int nombreDeCoeur);

	void afficherMenu();

	void afficherEncouragement(int positionPion);

	void afficherBienvenue(String nom);

	void afficherDepart();

	void afficherContinuer();

	void afficherRetour(int retour);

	void afficherDeplacement(String nom, int deplacement);

	void regleDuJeu();

	void afficherDecisionQuitter();

	void afficherChoixInvalide();

	void afficherEtesVousPret(String nom);

	void afficherVieMax();

	void afficherinversion(String nom2, int position2);

	void afficherRetournerAuMenu();

	String recupererAvis();

	void afficherMort(String nom);


}
