package interviewProgramIMPORTANT;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Scanner scan=new Scanner(System.in);
		//System.out.println("enter number:");
		//int number=scan.nextInt();
		
		int number=371;
		int temp=number;
		int reminder=0;                  
		int result=0;
		
		while(temp>0)                ///temp!=0
		{
			reminder= temp%10;          //371%10=1  //37%10=7       //3%10=3
			result=result+(reminder*reminder*reminder);        //1+343+27==371
			temp=temp/10;         //371/10=37///      37/10=3    //3/10=0 condition falls
		}
		if(result==number)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
	}

}
