package TestPirates;

public class Plateau {
	private static final int taille =30 ;
	public Plateau() {
		CaseSpeciale[] caseSpeciales = new CaseSpeciale[5];
		for (int i = 1; i < 5; i++) {
		    caseSpeciales[i] = new PlusOuMoins(5*i);
		}
	
	public int getTaille() {
		return taille;
	}

}
