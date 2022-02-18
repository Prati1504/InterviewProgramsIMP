package string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringInArray {
public static void main(String[] args) {
		
		String[] St={"pratibha","shivaji","ghadge","sharad","shivaji","ghadge"};
		
		
	    HashMap<String,Integer> map =new HashMap<String,Integer>();
	    
	    for(String str:St)
	    	if(map.containsKey(str))
	    		map.put(str, map.get(str)+1);
	    	else
	    		map.put(str, 1);                //check array for total iteration
	                                                   //   return set of keys 
	    
	   Set<String> keys= map.keySet();//to check each key
	   for(String key:keys)
		   if(map.get(key)>1)
			   System.out.print(key + ":" + map.get(key)+  " ");
	   
	   
	   
	    		
	}


}
