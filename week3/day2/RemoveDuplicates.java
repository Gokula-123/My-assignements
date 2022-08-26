package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "PayPal India";
        //char[] c= p.toCharArray();    
		Set <Character> charSet = new LinkedHashSet <Character>();
        
        char i,j;
        for (i = 0; i < p.length(); i++) 
        	charSet.add(p.charAt(i));
        for(Character o : charSet) 
        	System.out.print(o);
        
        List <Character> dupCharSet = new ArrayList <Character>(charSet);
		for (j = 0; j < charSet.size(); j++) 
				if(dupCharSet.get(p.charAt(j))==dupCharSet.get(p.charAt(j))) {
					dupCharSet.add(j);
				}
		System.out.println();

		for(Character r : dupCharSet) 
        	System.out.print(r);
        
}
}
