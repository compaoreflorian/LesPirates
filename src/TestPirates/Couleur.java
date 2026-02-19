package TestPirates;

public enum Couleur {
	BLEU("Bill Jambe de Bois"), ROUGE("Jack Le Borne ");

	private String chaine;

	private Couleur(String chaine) {
		this.chaine = chaine;
	}

	public String getCouleur() {
		return chaine;
	}

}
