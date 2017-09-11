package stupid.model;

public class PayDohCircle
{
	//Declaation Section
	//Data member Section
	private int size;
	
		public PayDohCircle()
		{
			this.size = 5;
		}
		
		public PayDohCircle(int size)
		{
			this.size = size;
		}
		
		public String toString()
		{
			String description = "I am a circle, my size is " + size;
			return description;
		}
}
