package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {10,2,1,2,9,4,3,7,8,6};
		 
		 Set <Integer> s = new TreeSet <Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		
		List <Integer> l = new ArrayList<>(s);
		System.out.println(l);

		int count = l.size();
        //System.out.println(count);

        int sum = (count+1) * (count+2) / 2;
        for (int i=0;i<count;i++) {
        	sum = sum - l.get(i);
        }
        System.out.println(sum);
    }

}

