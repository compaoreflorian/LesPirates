package TestPirates;

import java.security.SecureRandom;
import java.util.Random;

public class Joueur extends JournalOnePiece {
	private String nom;
	private int nombreDeCoeur;
	private Pion pion ;
	private Plateau plateau;
	private Random random;
	public Joueur(String nom, Pion pion, Plateau plateau) {
		this.nom = nom;
		this.pion=pion;
		this.plateau = plateau;
		try {
			random = SecureRandom.getInstanceStrong();
			} catch (Exception e) {
			e.printStackTrace();}
		
	}
	
	
  public void deplacerJoueur() {
	  int deplacement = random.nextInt(2,13);
	  plateau.occuperPosition(pion , deplacement);
	  afficherposition( nom , pion.getPosition());
}
  
 public String getNom() {
	 return nom;
 }

 public void verifierVictoire() {
	 afficherVictoire(pion.getPosition());
 }
}
