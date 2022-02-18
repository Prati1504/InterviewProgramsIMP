package starPatterns;

public class sample2 {

	public static void main(String[] args) 
	{
		int lines=5;
		int star=1;
		int space=4;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
	}
}
