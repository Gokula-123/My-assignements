package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List <Integer> l1 = new ArrayList <Integer>();
		for (int i = 0; i < a.length; i++) {
			l1.add(a[i]);
		}
		List <Integer> l2 = new ArrayList <Integer>();
		for (int j = 0; j < b.length; j++) {
			l2.add(b[j]);
		}
        
		for (int k : l1) {
			for(int l : l2) {
				if(k==l) {
					System.out.println(l);
				}
			}
			
		}
	}

}
