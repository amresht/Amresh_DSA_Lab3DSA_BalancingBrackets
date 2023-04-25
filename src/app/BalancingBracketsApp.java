/**
 * @class          BalancingBrackets App Driver Class 
 * @author         Amresh Tripathi 
 * @date           25-Apr-2023
 * @version        1.0
 */

package app;

import java.util.Scanner;
import lib.BalancingBrackets;

public class BalancingBracketsApp {

		public static void main(String[] args) {
			
			//
			Scanner sc=new Scanner(System.in);
			// initiate the class for checking the balancing brackets API
			BalancingBrackets bb = new BalancingBrackets();
			
			// read and store the algrbraic expression
			System.out.println("Enter the Expression");
			String input=sc.next();
			
			if(bb.checkExpression(input)) {
				System.out.println("The entered String has Balanced Brackets");
			}
			else {
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
			
			sc.close();			// close the scanner object
			
		}

		
}