package string;

public class ReplaceCharNumberSpecialCharInString {

	public static void main(String[] args) {
		
		//to remove special char only in string
		String s="hgg26@^%^bd#*^663dfhhf@#@!!hdd567";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		/////to print only numbers in string
		s=s.replaceAll("[^0-9]", "");             
		System.out.println(s);
	
		////to print only special char in string
		String p="hgg26@^%^bd#*^663dfhhf@#@!!hdd567";
		p=p.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(p);
		
		
	}

}
