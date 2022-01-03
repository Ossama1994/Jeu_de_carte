import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Test {

	public static void main(String[] args) 
	
	{
		 
	//List of cards 
		 
	  ArrayList<Carte> rawCards  = new ArrayList<Carte>();
	  
	  rawCards.add(new Creaturs("dribi","creatur",1));
	  rawCards.add(new Terrains("Nike","terrain",2));
	  rawCards.add(new Creaturs("Galimash","creatur",3));
	  rawCards.add(new Creaturs("Subrine","creatue",20));
	  rawCards.add(new Creaturs("Nubunsar","creatur",12));

	  rawCards.add(new Sortilege("Rip","Sortilege",32));
	  rawCards.add(new Sortilege("Cup","Sortilege",21));
	  rawCards.add(new Sortilege("lW","Sortilege",23));
	  
	  rawCards.add(new Terrains("westeros","terrain",78));
	  rawCards.add(new Terrains("mereen","terrain",2));
	  rawCards.add(new Terrains("kingslanding","terrain",38));

	  

	  
	  

		  

		  
		  //Add random list to player1
		  Joueur player1 = new Joueur("Mike",rawCards,30);
		  player1.myShuffle();
		  ArrayList<Carte> player1Cardes  = new ArrayList<Carte>();
		  player1Cardes.addAll(player1.getMescartes());
//		  System.out.println(player1Cardes);
		  
		  Joueur player2 = new Joueur("fifty",rawCards ,30);
		  player2.myShuffle();
		  ArrayList<Carte> player2Cardes  = new ArrayList<Carte>();
		  player2Cardes.addAll(player2.getMescartes());
//		  System.out.println(player2Cardes);
		  
		  
		  
		    if (player2Cardes.get(5).getType().equals("Sortilege")){
                int point = player1.getPoint();
                player1.setPoint(point-5);
		    
            } else if(player1Cardes.get(0).getType().equals("Sortilege")) {
                int point = player2.getPoint();
                player2.setPoint(point-5);
                System.out.println(player1.getPoint());
                System.out.println(player2.getNomJoueur());
                System.out.println(player2.getPoint());
            } 
		    
		    
//            else if (player_one_card.getType().equals("creatureCard") && player_two_card.getType().equals("terrainCard") ){
//                int point = player2.getPoint();
//                player2.setPoint(point-5);
//            } else if (player_two_card.getType().equals("creatureCard") && player_one_card.getType().equals("terrainCard") ){
//                int point = player1.getPoint();
//                player1.setPoint(point-5);
//            } else if (player_two_card.getType().equals("creatureCard") && player_one_card.getType().equals("creatureCard")){
//                if (player_one_card.getName().equals("lifeCard") && !player_two_card.getName().equals("lifeCard")){
//                    int point = player1.getPoint();
//                    player1.setPoint(point+5);
//                } else if (!player_one_card.getName().equals("lifeCard") && player_two_card.getName().equals("lifeCard")){
//                    int point = player2.getPoint();
//                    player2.setPoint(point+2);
//                } else{
//                    player2.setPoint(player2.getPoint()+1);
//                    player2.setPoint(player2.getPoint()+1);
//                }
//            } else if (player_two_card.getType().equals(player_one_card.getType())){
//                if (player_one_card.getValue() > player_two_card.getValue()){
//                    int point = player2.getPoint();
//                    player2.setPoint(point-5);
//                } else {
//                    int point = player1.getPoint();
//                    player1.setPoint(point-5);
//                }
//            }
 
		  
		  
//		  ArrayList<Carte> mike = new ArrayList<Carte>();
//		  mike = player1Cardes;
//		  System.out.println(mike);
		  
		  
//			  for(int i = 0 ; i < 12 ; i++)
//			  {
				  
				 // String Mike =  player1Cardes.get(i).getNom();
				 // String Yan =  player2Cardes.get(i).getNom();
			  
//				  Creaturs c = (Creaturs)rawCards.get(1);
//				  Terrains t = (Terrains)rawCards.get(1);
//				  Sortilege s = (Sortilege)rawCards.get(8);
				   
				 // System.out.println(Mike);
//				  
//				  if(Mike.equals(Yan))
//				  {
//					  
//				  System.out.println("ggggg");
//				  
//				  System.out.println(Mike);
//				  System.out.println("_______________________________");
//				  System.out.println(Yan);
//				  }
//				  if(Mike.equals(c.getNom()))
//				  {
//					  System.out.println("ttt");
//					  System.out.println(c.getNbVie());
//				  }
				
				  
				   
//			  }
			  
			   
		  

	  
		  
		  
		  
		  
	  
	  

	  
	  
       
	  

	  
       
	 
	
	 
	 
	 
	  
	// generete two list of random cards ( Sorti , terrain , creature )
		
	// list player 1  
	// list player 2
	
	// loop 12 times
	// take a random card from each player
	// compare these cards 
	// add score to the player who wons
	
	
	 
// display the winner
//	  System.out.println(cr1);
	}
	
}

