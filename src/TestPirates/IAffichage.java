package TestPirates;

public interface IAffichage {
	void afficherPlusOuMoins();

	void afficherVictoire();

	void afficheravis();

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
}
