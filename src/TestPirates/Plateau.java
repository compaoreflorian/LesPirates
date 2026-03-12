package TestPirates;

public class Plateau {
	private static final int taille = 30;
	private CaseSpeciale[] caseSpeciales = new CaseSpeciale[10];
	private int nbCaseSpeciales = 10;

	public Plateau() {
		for (int i = 0; i < 5; i++) {
			//PlusOuMoins casePOM = new PlusOuMoins(2 * (i + 1));
			//AnnuleCase caseA = new AnnuleCase(4 * (i + 2));
			//caseSpeciales[i] = casePOM;
			//caseSpeciales[i + 3] = caseA;
			Inversion caseInversion = new Inversion(2 * (i + 1));
			caseSpeciales[i] = caseInversion;
		}

	}

	public CaseSpeciale[] getCases() {
		return caseSpeciales;
	}

	public int getNbCases() {
		return nbCaseSpeciales;
	}

	public int getTaille() {
		return taille;
	}

}
