//The Player checks for No Play,Ladder or Snake condition
public class PlayOption {
	public static void main (String[] args) 
	{
		int position = 0;
		int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
	    System.out.println("DiceNumber is : " + dice);
	    
	    int playoption = (int) Math.floor(Math.random() * 10) % 3;
	    System.out.print("Player Option is : " ) ;
	    switch (playoption)
	    {
	    case 1:
	        position += dice;
	        System.out.println("Ladder");
	        System.out.println("Player Position after the ladder is : " + position);
	        break;

	    case 2:
	        position -=  dice;
	        System.out.println("Snake");
	        System.out.println("Player Position  after the Snake is : " + position);
	        break;

	    case 3:
	        System.out.println("No play");
	        System.out.println("Player Position remains same");
	        break;	
	}
	}
	}

