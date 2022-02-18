package interviewProgramIMPORTANT;

public class Fibonacii {

	public static void main(String[] args) {
	
		int num=10;
		
		int a=0,b=1,c;
		
		for(int i=2;i<=num;i++)
		{
			System.out.print(a + " ");
			c=a+b;        //c=1 //c=2 //c=3 //c=5 //c=8 //c=13 //c=21 
			a=b;          //a=1 //a=1 //a=2 //a=3 //a=5 //a=8  //a=13
			b=c;          //b=1 //b=2 //b=3 //b=5 //b=8 //b=13 //b=21
		}
	}

}


