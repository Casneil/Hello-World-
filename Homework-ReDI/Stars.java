package stars;
import java.util.Scanner;


public class Stars {
	
	public static void I() {
		System.out.print("I");
	}

	public static void M() {
		System.out.println("\nM");
	}
	
	public static String Pattern() {
		String pattern = "YX"; 
		StringBuilder sb = new StringBuilder();
		int count = (int) (Math.random() * pattern.length());
		sb.append(pattern.charAt(count));
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please give me number of rows: ");
		
		int rows = scan.nextInt();
		
		System.out.print("Please give me number of columns: ");
		
		int columns = scan.nextInt();

		for(int i = 1; i < rows; i++) {
			System.out.println();
			for(int j = rows; j >=columns; j--) {
				
				if (i == 1) {
					I();
				}else 
//				System.out.print("#");	
				System.out.print(Pattern());
			}
			
			columns--;
		}
		M();
		
	}
}
