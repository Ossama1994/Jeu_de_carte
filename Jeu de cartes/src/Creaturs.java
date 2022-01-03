
public class Creaturs extends Carte{
     
	private int nbDegat ; 
	private int nbVie;
	
     
	
	public Creaturs(String nom ,String type , int value) {
		
		super(nom ,type ,value);
		
	}

	public Creaturs(String nom, int nbDegat, int nbVie ,String type , int value) {
		super(nom ,type ,value);
		this.nbDegat = nbDegat;
		this.nbVie = nbVie;
	}


	public int getNbDegat() {
		return nbDegat;
	}

	public void setNbDegat(int nbDegat) {
		this.nbDegat = nbDegat;
	}

	public int getNbVie() {
		return nbVie;
	}

	public void setNbVie(int nbVie) {
		this.nbVie = nbVie;
	}
	
	public void display() {
		
		System.out.println("Creaturs [nbDegat=" + nbDegat + ", nbVie=" + nbVie + ", getNom()=" + getNom() + "]");
	}

	@Override
	public String toString() {
		return " [Creaturs nbDegat=" + nbDegat + ", nbVie=" + nbVie + ", getNom()=" + getNom() + "]";
	}
	
	

}
