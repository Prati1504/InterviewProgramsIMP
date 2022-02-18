package string;

public class PalindromeString {

	public static void main(String[] args) {

		String s="level";
		String result="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		if(s.equals(result)) {
			System.out.println("palindrome string");
			}
		else
			{
			System.out.println("not palindrome string");
			}
	
	}

}
