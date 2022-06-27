/**
 * 
 */
package noselfProduct;

import java.util.Arrays;

/**
 * @author fiona
 * Reference from Neetcode.io
 */
public class noSProduct {
	
	 public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];

	        // Perform Prefix product operation by traversing Left -> Right
	        int prefix = 1;
	        for (int i = 0; i < nums.length; i++) {
	            result[i] = prefix;
	            prefix *= nums[i];
	            //System.out.println("  "+prefix);
	        }

	        // Perform Postfix product operation by traversing Right -> Left
	        int postfix = 1;
	        for (int i = nums.length - 1; i >= 0; i--) {
	            result[i] *= postfix;
	            postfix *= nums[i];
	            //System.out.println(" "+result[i]);
	        }
	        return result;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,3,4};
		//noSProduct product=new noSProduct(); //uncomment if method is static
		int [] productA=noSProduct.productExceptSelf(nums); //if static no need for line above
		System.out.println("Product is "+ Arrays.toString(productA));
		

	}

}
