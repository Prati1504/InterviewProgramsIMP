package string;

public class CountOfCapitalSmallLettersNumbersSpeChar {

	public static void main(String[] args) {
		String s="*1pratibha@2GHADGE#3shivaJI*4";
		int uppercase=0;
		int lowercase=0;
		int numbers=0;
		int specialChar=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')     //if(Character.isUpperCase(ch)
			{
				uppercase++;
			}
			else
				if(ch>='a' && ch<='z')   //if(Character.isLowerCase(ch)
				{
					lowercase++;
				}
				else 
					if(ch>='0' && ch<='9')  //if(Character.isDigit(ch)
					{
						numbers++;
					}
					else
					{
						specialChar++;
			}
		}
		System.out.println("lowercase letters :" + lowercase);
		System.out.println("uppercase letters :" +uppercase);
		System.out.println("total numbers :" + numbers);
		System.out.println("special characters :" + specialChar);
	}

}
