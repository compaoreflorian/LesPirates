package TestPirates;

public class Plateau {
	private int[] cases = new int[30];
	private Pion pion1;
	private Pion pion2;

	public Plateau(Pion pion1, Pion pion2) {
		this.pion1 = pion1;
		this.pion2 = pion2;
	}

	public void quitterPosition(Pion pion) {
		cases[pion.getPosition() - 1] = (cases[pion.getPosition() - 1] - 1);

	}

	public void occuperPosition(Pion pion, int deplacement) {
		quitterPosition(pion);
		pion.changerPosition(deplacement);
		cases[pion.getPosition() - 1] = (cases[pion.getPosition() - 1] + 1);
	}
	
	

}
