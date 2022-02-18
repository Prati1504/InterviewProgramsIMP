package string;

public class ReverseStringInArray {
	
	public static String Reverse(String input)
	{
		String reverse="";
		for(int j=input.length()-1;j>=0;j--)
		{
		reverse=reverse+input.charAt(j);
		}
		return reverse;
	}

	public static void main(String[] args) {
		
		String str= "pratibha shivaji ghadge ";
		String ar[]=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
		String s1=ar[i];
		System.out.print((Reverse(s1))+ " ");	
	    }
	}

}
