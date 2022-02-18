package interviewProgramIMPORTANT;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter input :");
		int input=scan.nextInt();
		
		if(input%2==0)
			System.out.println("a is even");
		else
			System.out.println("a is odd");
	}

}
