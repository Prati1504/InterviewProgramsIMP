package interviewProgramIMPORTANT;

public class PrimeOrNot {

	public static void main(String [] args) {
	int num=100;
	int count=0;

	for(int i=2;i<num;i++)
	{
	if(num%i==0)
			count++;    
	}
	if(count==0)
		System.out.println("prime number");
	else
		System.out.println("not prime number");
}
}