/**
 * @class          BalancingBrackets library Class 
 * @author         Amresh Tripathi 
 * @date           25-Apr-2023
 * @version        1.0
 */
package lib;

import java.util.Stack;

public class BalancingBrackets {

	public BalancingBrackets() {
		// TODO Auto-generated constructor stub

	}

	public boolean checkExpression(String input) {
		// initiate the stack to save the starting brackets
		Stack<Character> stack=new Stack<>();
		// loop through the input string as array
		for(char k:input.toCharArray())
		{
			if(k=='{' || k=='[' || k=='(')
			{
				stack.push(k);
				continue;
			}

			if(stack.isEmpty())
				return false;

			char z;
			switch(k) {
				case '}':
					z=stack.pop();
					// mismatch with opening brace {
					if(z=='[' || z=='(')
						return false;
					break;
	
				case ']':
					z=stack.pop();
					//mismatch with opening brace [
					if(z=='{' || z=='(')
						return false;
					break;
	
				case ')':
					z=stack.pop();
					//mismatch with opening brace (
					if(z=='{' || z=='[')
						return false;
					break;
			}// end switch case

		} // end for

		return(stack.isEmpty());
	} // end method checkExpression
	
}