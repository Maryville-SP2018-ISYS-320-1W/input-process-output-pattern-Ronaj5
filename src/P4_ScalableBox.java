/*
	ISYS 320
	Name(s): Rona Davis
	Date: April 4, 2018
*/

public class P4_ScalableBox {

	public static final 
	int Height = 10;
	static int Width = 20;
	
		public static void main(String[] args) {
			drawBoxCap();
			drawBoxInsides();
			drawBoxCap();
	}
	
		public static void drawBoxCap() {
			System.out.print("+");
		
			for( int capDashIndex = 1; capDashIndex <= Width; capDashIndex++ ) {
				System.out.print("-");
		}
		
			System.out.println("+");
	}
	
		public static void drawBoxInsides() {
			for( int insideRowIndex = 1; insideRowIndex <= Height; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
		public static void drawBoxInsideLine() {
			System.out.print("|");
		
			for( int insideRowIndex = 1; insideRowIndex <= Width; insideRowIndex++ ) {
				System.out.print(".");
		}
		
		System.out.println("|");
	}
	
}
