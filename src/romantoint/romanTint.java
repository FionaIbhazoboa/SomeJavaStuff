/**
 * 
 */
package romantoint;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author fiona
 * Converts string roman to int. 
 * ToDo: Char array with the roman numberals. Limit the length of string 
 *
 */
public class romanTint {
	
	
	 public int romanToInt(String s) {
		 Map<String, Integer> map = new HashMap<>();
		 map.put("I", 1);
	     map.put("V", 5);
	     map.put("X", 10);
	     map.put("L", 50);
	     map.put("C", 100);
	     map.put("D", 500);      
	     map.put("M", 1000);
	        
	     int n = s.length();
	     
	     int sum = 0;
	     //System.out.println(n);
	     
	     for (int i = 0; i<n; i++) 
	     {
	    	 String curr = String.valueOf(s.charAt(i)); //get the first value
	    	 
	    	 //System.out.println("Curr: "+curr);
	    	 if(i+1<  n) //if next value is still in range
	    	 {
	    		 String next = String.valueOf(s.charAt(i+1));  //store the value of the next character
	    		 //System.out.println("Next: "+next);
	    		 if(map.get(curr)< map.get(next)) { // this is for the case of IV and IX
	    			 sum += - map.get(curr);
	    		 }
	    		 else 
	    			 sum+= map.get(curr);// then add to sum
		    			     		 
	    	 } else
	    		 sum += map.get(curr); //add the last value 	    	 
	     } 
	     
	     return sum;     
	 }
	    

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		String str = sc.nextLine();
		if (str.length()>= 1 && str.length() <= 15) {
			//char [] b = {'I', 'V','X', 'L','C', 'D', 'M'};
			romanTint two = new romanTint();
			int a = two.romanToInt(str.toUpperCase());
			System.out.println(a);
		}
		else 
			System.out.println("Invalid Length");
		
		
		sc.close();
		
		

	}

}
