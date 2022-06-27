/**
 * 
 */
package series;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author fiona
 *
 */
public class geoSeries {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double sum = 0.0;
		
		for(int i = 0; i<=3; i++)
		{
			//System.out.print(sum+ "\n");
			sum += a/Math.pow(2, i);
			System.out.print(sum+ "\n");
			//sum += a;
			
		}
		System.out.print(sum);
		sc.close();
	}

}
