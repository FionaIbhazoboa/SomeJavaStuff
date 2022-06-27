/**
 * 
 */
package permutate;
import java.util.*;

/**
 * @author fiona
 *
 */
public class personal {

	/**
	 * @param args
	 */
	public static String Swap(String str, int i, int j) {
		char temp;
		char[] tempArray = str.toCharArray();
		temp = tempArray[i];
		tempArray[i] = tempArray[j];
		tempArray[j] = temp;
		
		return String.valueOf(tempArray);
		
	}
	private static void permutate(String str, int i, int j) {
		if(i == j) { //without this it it wouldnt print. 
			System.out.println(str);
		}else {
			for (int s = i; s<= j; s++)
			{
				str= Swap(str, i, s);
				permutate(str, i+1, j);
				str = Swap(str, i, s);
				//System.out.println(str);
			}	
		}
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A String:");
			String str = sc.nextLine();
			int n = str.length();
			permutate(str, 0, n-1);
		}

	}

}
