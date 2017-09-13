package stupid.controller;

import java.util.Scanner;
import stupid.model.PayDohCircle;
import stupid.model.PayDohSnek;
/**
 * 
 * @author cber6181
 *
 */
public class StupidController
{

		public void start()
		{
			System.out.println("Somebody once told me the world was gonna roll me, I ain't the sharpest tool in the shed. She was looking kind of dumb with her finger and her thumb in the shape of an L on her forehead");
			
			PayDohCircle firstCircle = new PayDohCircle();
			PayDohCircle secondCircle;
			secondCircle = new PayDohCircle();
			
			System.out.println("Look I made a circle!");
			System.out.println(firstCircle);
			System.out.println(secondCircle);
			
			Scanner myScanner = new Scanner(System.in);
			System.out.println("How big of a circle do you want??");
			int circleSize = myScanner.nextInt();
			
			PayDohCircle thirdCircle = new PayDohCircle(circleSize);
			System.out.println(thirdCircle);
			
			System.out.println("What size should we change the size to?");
			int updated = myScanner.nextInt();
			thirdCircle.setSize(updated);
			System.out.println("The circle is now.....");
			System.out.println(thirdCircle);
			
			PayDohSnek firstSnek = new PayDohSnek();
			System.out.println(firstSnek);
			
			testScanner();
		}
		
		private void testScanner()
		{
			Scanner firstScanner; 
			firstScanner = new Scanner(System.in);
			System.out.println("What's your least favorite thing?");
			String answer = firstScanner.next();
			System.out.println("Oh, you don't like " + answer + "? Well Snek HATES " + answer + " as well!!!! SNEK WILL DESTROY " + answer + "!!!!! " + answer + " WILL FEAR SNEK!!!!!");
		}
}
