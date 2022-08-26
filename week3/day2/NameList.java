package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class NameList {
public static void main(String[] args) {
	
	List <String> s = new ArrayList<String>();
	
	s.add("Karthik");
	s.add("Arun");
	s.add("Dev");
	s.add("Selva");
	s.add("Anbu");
	s.add("Sekar");
	
	System.out.println(s);
	
	int count=0;
	for(String i : s) {
		if(i.startsWith("S")) {
			count++;
		}
	}
	System.out.println("S names : " + count);
}
}
