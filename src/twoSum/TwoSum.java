/**
 * 
 */
package twoSum;

import java.util.HashMap;
//import java.util.Scanner;

//import romantoint.romanTint;

/**
 * @author fiona
 *
 */
public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
		 //hashMap has ArrayValue, Index
	        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	        int a [] = new int[2]; //Save index to new array
	       // map.put
	        int n =nums.length;
	        int diff= 0;
	        for (int i =0; i<n; i++){
        		diff = target - nums[i];    //we sub target n old array[i}    	
	            if(map.containsKey(diff)) { //if already exist in map then must be sum
			            	
	            	a[0]= map.get(diff); //output index of value similar to diff in map
	            	a[1] = i; //output current index
	            }else 
	            	 map.put(nums[i], i); //if not in map, add to map
	        
	    }
			return a;
			
	        
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum two = new TwoSum();
		int [] nums = {3,2,3};
		int t = 6;
	    int[] a = two.twoSum(nums, t);
	    for (int i=0; i<a.length; i++) {
	    	System.out.print(a[i]+ " ");
	    }
				
		
		//sc.close();

	}

}
