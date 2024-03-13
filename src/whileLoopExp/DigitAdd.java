package whileLoopExp;

import java.util.Scanner;

public class DigitAdd {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int digitSum = 0;
		int digit = 0;
		
		while(num != 0) {
			digit = num%10;
			digitSum += digit;	
			num = num/10;
		}
		
		System.out.println("Sum of Digits = " +digitSum);

	}

}
