package TestPirates;

import java.util.Random;

public class De {
	private int valeur;
	private Random random = new Random();

	public int lancer(int nombre) {
		valeur = random.nextInt(1 * nombre, 6 * nombre);
		return valeur;
	}

	public int getValeur() {
		return valeur;

	}
}
