package interviewProgramIMPORTANT;

public class SwapNumber1 {

	public static void main(String[] args)
	{
	
	//swapping of number using third variable
		int a=10;
		int b=20;           
		 
		int c=a;       //c=10
		a=b;           //a=20
		b=c;          //b=10
		System.out.println(a);
		System.out.println(b);
	
	// swapping of number without using third variable
		b=a+b;                 
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}

}
