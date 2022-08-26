package week3.day2;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class MapTestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "testleaf";
       Map <Character,Integer> m =  new LinkedHashMap<Character,Integer>();
      
       for (char i = 0; i < n.length(); i++) {
    	   if (m.containsKey(n.charAt(i))) {
			m.put(n.charAt(i), m.get(n.charAt(i))+1);
		}
    	   else {
    		   m.put(n.charAt(i), 1);
    	   }
	}
       System.out.println(m);
       }
	
	}

