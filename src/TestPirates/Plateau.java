package TestPirates;

public class Plateau {
	private final int taille =30 ;
	private CaseSpeciale[] cases =new CaseSpeciale[5];
	for(int i =1 ; i<5; i++) {
		private PlusOuMoins case1 = new PlusOuMoins(5*i);
		cases[i]=case1;
		
	}
	
	public int getTaille() {
		return taille;
	}

}
