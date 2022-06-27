/**
 * 
 */
package reverseString;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author fiona
 *
 */
public class rString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this o(n) o(1) space
		char [] chararray= {'h','e','l','l','o'};
		int l=0, r=chararray.length-1, j=0;
		while (l<r)
		{
			char temp=chararray[l];
			chararray[l]=chararray[r];
			chararray[r]= temp;
			l++;
			r--;
		}
		System.out.println("This is using pointers "+Arrays.toString(chararray));
		//this is o(n)o(n) space because we need a stack
		Stack<Character> stack = new Stack<>();
		for (Character i: chararray) 
		{
			stack.add(i);
		}
		while(!stack.empty()) 
		{
			chararray[j]=stack.pop();
			j++;
		}
		System.out.println("This is using stacks "+Arrays.toString(chararray));
		System.out.println(stack);
		

	}

}
