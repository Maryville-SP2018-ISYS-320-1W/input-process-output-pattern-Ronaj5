import java.util.Scanner;
/*
	ISYS 320
	Name(s):
	Date: 
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("How much money do you have? "); 
		double money = console.nextDouble();
		System.out.println("wow!");
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
