package pattern;



public class Pattern9 {

	public static void main(String[] args) {
	
		pattern();
	}

	private static void pattern() {
		int lastNumber=6;
	/*	for(int row=1; row<lastNumber; row++) {
			for(int column=1; column<row+1; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		*/
		
	/*
	 * for(int row=1; row<lastNumber; row++) { for(int column=1;
	 * column<=lastNumber-row; column++) { System.out.print(column+" "); }
	 * 
	 * 
	 * 
	 * System.out.println(); }
	 */
	
		for(int row=1; row<lastNumber; row++) {
			for(int column=1; column<=lastNumber-row; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
			
		}
		
	}

}
