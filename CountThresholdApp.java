import java.util.Scanner;
import java.io.IOException;

public class CountThresholdApp {
	public static void main(String[] args)  throws IOException {
		String fileName;
		double threshold;
		Scanner scan = new Scanner( System.in );
		CountThreshold c1;

		System.out.print( "Enter File Name: ");
		fileName=scan.next();
		System.out.print( "Enter threshold: ");
		threshold=scan.nextDouble();
		c1 = new CountThreshold(fileName, threshold);
		System.out.println(c1);
		System.out.println("Above Threshold Count =    "      + c1.getCount());
		System.out.println(c1.toString()+ "\n");

		// run this multiple times on different input files and with different thresholds

	}
}
