package string;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		String str="aabbccddeeff";
		String dct=" ";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(dct.indexOf(ch)==-1)   
			{
				dct=dct+ ch++;
			} 
		}
		System.out.println(dct);

	}

}
/// indexOf method returns -1 when element is not present in given string
///so when string doesnt contains that character, it will add that char to the empty string
