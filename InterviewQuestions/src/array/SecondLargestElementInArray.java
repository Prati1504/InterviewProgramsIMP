package array;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		int ar[]= {24,77,435,99,556,33,5,66};
		
		TreeSet tr=new TreeSet();
		
		for(int num:ar)
			tr.add(num);
		
		ArrayList al=new ArrayList(tr);
		int secondlarge=al.size()-2;
		System.out.println((al.get(secondlarge )+ " :is 2nd largest number"));
	}

}

