package string;

public class ReverseStringByRemovingSpaces {

	public static void main(String[] args) {
		
		String s="pratibha ghadge";
		s=s.replace(" ", "");
		
		String reverse=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+ s.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
