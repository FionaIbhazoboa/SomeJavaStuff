/**
 * 
 */
package duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fiona
 *
 */
public class dups {
	public static boolean isdups(int []nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i:nums) 
		{
			//if items added is not unique i.e is already in the set,
			if(!set.add(nums[i]))
				return true;
		}
		
		return false;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,1,1,3,3,4,3,2,4,2};
		if(isdups(nums)) {
			System.out.println("Contain duplicate");
			
		}
		else 
			System.out.println("Does contain duplicate");
		

	}

}
