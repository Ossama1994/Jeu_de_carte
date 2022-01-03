
public enum Couleurs {
   
	blanche("B"),
	bleu("b"),
	noir("n"),
	vert("v"),
	rouge("r");
	
	private String Couleur;
	
	//Constructor
	private Couleurs(String Couleur) {
		this.Couleur = Couleur ; 
	}

	public String getCouleur() {
		return Couleur;
	}

	
}
