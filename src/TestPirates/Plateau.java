package TestPirates;

public class Plateau {
	private static final int taille = 30;
	CaseSpeciale[] caseSpeciales = new CaseSpeciale[5];
	private int nbCases = 5;

	public Plateau() {
		for (int i = 1; i < 5; i++) {
			PlusOuMoins casePOM = new PlusOuMoins(5 * i);
			caseSpeciales[i] = casePOM;
		}

	}

	public CaseSpeciale[] getCases() {
		return caseSpeciales;
	}

	public int getNbCases() {
		return nbCases;
	}

	public int getTaille() {
		return taille;
	}

}
