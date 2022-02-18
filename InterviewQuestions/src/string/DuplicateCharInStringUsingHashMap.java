package string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInStringUsingHashMap {

	public static void main(String[] args) {
		
		String St="pratiejfelbhaghadgaewrgesghhivshrearaaji";
		
		char[] ar=St.toCharArray();
		
	    HashMap<Character,Integer> map =new HashMap<Character,Integer>();
	    
	    for(char ch:ar)
	    	if(map.containsKey(ch))
	    		map.put(ch, map.get(ch)+1);
	    	else
	    		map.put(ch, 1);                //check array for total iteration
	                                                   //   return set of keys 
	     Set<Character> keys= map.keySet();//to check each key
	     for(char key:keys)
		   if(map.get(key)>1)
			   System.out.print(key + ":" + map.get(key)+  " ");
	}

}
