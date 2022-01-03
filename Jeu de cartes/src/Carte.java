
public class Carte {
	
	 private String nom;
	 private String type; 
	 private int value ;
	
	 

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Carte(String nom , String type , int value) {
		
		this.type = type; 
		this.value = value;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	 
	 
}
