package whileLoopExp;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter the lower bound: ");
		Scanner scan = new Scanner(System.in);
		int lowerBound = scan.nextInt();
		
		System.out.println("Enter the upper bound: ");
		int upperBound = scan.nextInt();
		
		System.out.println("Even Numbers between" + lowerBound + " and " + upperBound);
		for( int x = lowerBound; x <= upperBound; x++) {
			
			if(x%2 == 0) {
				
				System.out.println(x);
			}
		
		}
			
			System.out.println("Odd Numbers between" + lowerBound + " and " + upperBound);
			for( int y = lowerBound; y <= upperBound; y++) {
				
				if(y%2 != 0) {
					
					System.out.println(y);
				}	
		}
		
		
		}	

	}


