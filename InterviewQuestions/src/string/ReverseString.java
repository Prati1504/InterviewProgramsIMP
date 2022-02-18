package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" enetr a string");
		String s=scan.nextLine();
		
		//String s="pratibha";
		String result=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		System.out.println(result);
	}

}
