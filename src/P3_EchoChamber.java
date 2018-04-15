import java.util.Scanner;
/*
	ISYS 320
	Name(s):Rona Davis
	Date: April 4, 2018
*/

public class P3_EchoChamber {

	public static void main(String[] args) {
		String inData;
		Scanner in = new Scanner(System.in);
		System.out.println("I'm Mr. Meeseeks, look at me!");
		System.out.println("How many times should I repeat it?");
		inData = in.nextLine();
		System.out.println("I'm Mr. Meeseeks, look at me!" + inData);
		System.out.println("I'm Mr. Meeseeks, look at me!" + inData);
		System.out.println("I'm Mr. Meeseeks, look at me!" + inData);

	}

}
