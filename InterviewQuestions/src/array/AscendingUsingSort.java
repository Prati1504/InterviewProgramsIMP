package array;

import java.util.Arrays;

public class AscendingUsingSort {

	public static void main(String[] args) {
		
		int a[]= {553,656,232,54,77,233,465,688};
		
		Arrays.sort(a);
		System.out.println("ascending using rediamade method");
		System.out.println(Arrays.toString(a));
		
		System.out.println("ascending array");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " ");
	}

}
