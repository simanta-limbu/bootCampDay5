package forLoopExp;
import java.util.Scanner;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number upto which product tables you want: ");
		Scanner scan = new Scanner(System.in);
		int productBound = scan.nextInt();
		
		
		for(int x = 1; x<=productBound; x++) {
			
			System.out.println("---------------------------");
			
			for(int y = 1; y<= 10; y++) {
				
			
			System.out.println(x + "x" + y + " = " + (x*y));
			
			}
			
			
		}

	}

}
