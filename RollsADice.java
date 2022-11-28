
public class RollsADice {
	void rollsADice()
	{
		 int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		 System.out.println("Value of Dice is " + dice);
	}

	public static void main (String[] args)
	{
		RollsADice Dice = new RollsADice();
	    Dice.rollsADice();
	}

}