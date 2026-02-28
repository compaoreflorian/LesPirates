package TestPirates;

public interface IAffichage {
	void afficherVictoire();

	boolean afficheravis();

	void afficherposition(String nom, int position);

	void initialiserNom(String numero);

	void afficherTirage(int tirage);

	void afficherPointDeVie(int nombreDeCoeur);

	void afficherMenu();

	void afficherEncouragement(int positionPion);

	void afficherBienvenue(String nom);

	void afficherDepart();

	void afficherIntro();

	void afficherTour(String nom);

	void afficherContinuer();
}
