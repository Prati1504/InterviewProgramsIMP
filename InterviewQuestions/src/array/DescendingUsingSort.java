package array;

import java.util.Arrays;

public class DescendingUsingSort {

	public static void main(String[] args) {
		int a[]= {42,42,65,757,7554,355,525,213};
		
		Arrays.sort(a);
		
		System.out.println("descending array");
		for(int i=a.length-1;i>0;i--)
			System.out.print(a[i]+ " ");
	}

}
