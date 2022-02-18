package string;

import java.util.HashMap;

public class OccuranceOfEachCharInNameIMPortant {

	public static void main(String[] args) {
	
		String str="pratibha";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
		}
		System.out.println(map);
	}

}
