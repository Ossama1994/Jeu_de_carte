
import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
     
	 private String nomJoueur;
	 private ArrayList<Carte> Mescartes;
	 private int point ;

	 
	public Joueur(String newJoueur ,ArrayList<Carte> mescartes ,int point) {
//		super();
		this.nomJoueur = newJoueur;
		this.point = point;
		this.Mescartes = mescartes;
		
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nom) {
		this.nomJoueur = nom;
	}


	public ArrayList<Carte> getMescartes() {
		return Mescartes;
	}

	public void setMescartes(ArrayList<Carte> mescartes) {
		this.Mescartes = mescartes;
	}
    public void myShuffle() {
    	
        Collections.shuffle(this.Mescartes);
    }
    
    public Carte getCarte(int index, ArrayList<Carte> mescartes) {
    	Carte cart;
    	cart = mescartes.get(index);
    	return cart;
    }

	@Override
	public String toString() {
		return "Joueur [nom=" + nomJoueur + ", Mescartes=" + Mescartes + "]";
	}
	
	
	 
	 
}
