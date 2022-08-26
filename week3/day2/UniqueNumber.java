package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,22,3,54,65,22,43,67,98,1};	
	       Set <Integer> d = new LinkedHashSet<Integer>();
	       for (int i = 0; i < a.length; i++) {
			d.add(a[i]);
		}
	       System.out.println(d);
	  }
	}


