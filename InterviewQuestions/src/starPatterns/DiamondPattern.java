package starPatterns;

public class DiamondPattern {

	public static void main(String[] args) {
		
		int lines=6;
		int star=1;
		int space=2;
		int mid=(lines+1)/2;        //3
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		if(i<mid)
		{
			space--;
			star++;
		}
		else
		{
			space++;
			star--;
		}
		}
	}

}
