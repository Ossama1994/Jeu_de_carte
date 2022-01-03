
public class Sortilege extends Carte {
	
	private String exp;

	public Sortilege(String nom ,String type , int value) {
		super(nom , type , value);
		// TODO Auto-generated constructor stub
	}

	public Sortilege(String nom, String exp ,String type , int value) {
		super(nom ,type ,value);
		this.exp = exp;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}
	
	public void display() {
		
		System.out.println("Sortilege [exp=" + exp + "]");
		
	}


	@Override
	public String toString() {
		
		return " [Sortilege exp=" + exp + "]";
		
	}
	
	

      
}
