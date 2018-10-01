
public class DiceTest
{

	public static void main(String[] args) 
	{
		Dice dice = new Dice();
		
		System.out.print(dice.roll());
		System.out.print(dice.numRoll());
		System.out.print(dice.roll());
		System.out.print(dice.roll());
		dice.reset();
		System.out.print(dice.numRoll());
		

	}

}
