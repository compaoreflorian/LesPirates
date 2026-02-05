package TestPirates;

public enum Couleur {
	BLEU("Couleur bleu"), ROUGE("Couleur rouge");

	private String chaine;

	private Couleur(String chaine) {
		this.chaine = chaine;
	}

	public String getCouleur() {
		return chaine;
	}
}
