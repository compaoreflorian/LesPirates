package TestPirates;
import java.util.Random;

public class De {
	    private int valeur;
	    private Random random = new Random();

	    public int lancer() {
	        valeur = random.nextInt(2,12);
	        return valeur;
	    }

	    public int getValeur() {
	        return valeur;
	    
	}
}
