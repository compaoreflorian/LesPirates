package TestPirates;

import java.util.Random;

public class De {
	private int valeur;
	private Random random = new Random();

	public int lancer(int nombreDeDe) {
		valeur = random.nextInt(1 * nombreDeDe, 6 * nombreDeDe);
		return valeur;
	}

	public int getValeur() {
		return valeur;

	}
}
