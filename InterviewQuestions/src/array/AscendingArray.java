package array;

public class AscendingArray {
	public static void main(String[] args) {
		
		int[] a= {0,1,6,0,0,6,4};
		int temp=0;
		
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("ascending array");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " ");
	}
}