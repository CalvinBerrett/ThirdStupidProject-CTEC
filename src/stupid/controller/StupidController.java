package stupid.controller;

import java.util.Scanner;


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
			
			testScanner();
		}
		
		private void testScanner()
		{
			Scanner firstScanner; 
			firstScanner = new Scanner(System.in);
			System.out.println("What's your favorite food");
			String answer = firstScanner.next();
			System.out.println("Oh cool, you like " + answer);
		}
}
