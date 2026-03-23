package test_pirates;

public class Plateau {
	private static final int taille = 30;
	private CaseSpeciale[] caseSpeciales = new CaseSpeciale[12];
	private int nbCaseSpeciales = 12;

	public Plateau() {
		PlusOuMoins case1 = new PlusOuMoins(2);
		AnnuleCase case2 = new AnnuleCase(5);
		Inversion case3 = new Inversion(7);
		PlusOuMoins case4 = new PlusOuMoins(10);
		AnnuleCase case5 = new AnnuleCase(13);
		Inversion case6 = new Inversion(15);
		PlusOuMoins case7 = new PlusOuMoins(17);
		AnnuleCase case8 = new AnnuleCase(19);
		Inversion case9 = new Inversion(21);
		PlusOuMoins case10 = new PlusOuMoins(23);
		AnnuleCase case11 = new AnnuleCase(25);
		Inversion case12 = new Inversion(28);

		caseSpeciales[0] = case1;
		caseSpeciales[1] = case2;
		caseSpeciales[2] = case3;
		caseSpeciales[3] = case4;
		caseSpeciales[4] = case5;
		caseSpeciales[5] = case6;
		caseSpeciales[6] = case7;
		caseSpeciales[7] = case8;
		caseSpeciales[8] = case9;
		caseSpeciales[9] = case10;
		caseSpeciales[10] = case11;
		caseSpeciales[11] = case12;
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
