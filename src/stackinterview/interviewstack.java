/**
 * 
 */
package stackinterview;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author fiona
 *
 */
public class interviewstack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		int n = str.length();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i<n; i++) {
			char cha = str.charAt(i);
	        //System.out.println(cha);
	        //stack.push(cha);
			//System.out.println(stack.peek());
			//if (stack.peek() != str.charAt(i+1)) {
			//	stack.pop();
			//}
			
			//if stack is not empty and check curr against item in the stack
			//if equal skip to push.
			if(!stack.empty()&& stack.peek()!= str.charAt(i)) {
				stack.pop();
			}else
				stack.push(cha);
				
			
			
		}
		// Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
        
        sc.close();
		
		
		

	}

}
