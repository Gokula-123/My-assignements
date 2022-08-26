package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Madam";
         Set <Character> c = new HashSet <Character>();
         for (char i = 0; i < s.length(); i++) {
			c.add(s.charAt(i));
			}
         System.out.println(c);
         }
}
