
public class Terrains extends Carte{
	
	private Couleurs couleur;

	public Terrains(String nom ,String type , int value) {
		super(nom ,type ,value);
		// TODO Auto-generated constructor stub
	}

	public Terrains(String nom, Couleurs couleur ,String type , int value) {
		
		super(nom ,type ,value);
		this.couleur = couleur;
	}

	public Couleurs getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleurs couleur) {
		this.couleur = couleur;
	}
	
	public void display() {
		
		System.out.println("Terrains [couleur=" + couleur + "]");
	}


	@Override
	public String toString() {
		return " [Terrains couleur=" + couleur + "]";
	}
	
	
	

      
}
