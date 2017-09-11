package stupid.model;

public class PayDohSnek
{
	//Declaration Section
	//Data member section
	private int power;
	
	public PayDohSnek()
	{
		this.power = 500;
	}
	
	public PayDohSnek(int size)
	{
		this.power = size;
	}
	
	public String toString()
	{
		String description = "I am Snek, BEWARE for my power level is " + power + "%!!!!!";
		return description;
	}
}
