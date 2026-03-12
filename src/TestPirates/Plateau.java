package TestPirates;

public class Plateau {
	private static final int taille = 30;
	private CaseSpeciale[] caseSpeciales = new CaseSpeciale[6];
	private int nbCases = 6;

	public Plateau() {
		for (int i = 0; i < 3; i++) {
			PlusOuMoins casePOM = new PlusOuMoins(5 * (i + 1));
			AnnuleCase caseA = new AnnuleCase(4 * (i + 2));
			caseSpeciales[i] = casePOM;
			caseSpeciales[i + 3] = caseA;
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
