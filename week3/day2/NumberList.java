package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class NumberList {

	public static void main(String[] args) {
		
	       List <Integer> n = new ArrayList<Integer>();
	       
	       n.add(1);
	       n.add(22);
	       n.add(3);
	       n.add(54);
	       n.add(65);
	       n.add(22);
	       n.add(43);
	       
	       System.out.println(n);
	       
	       int count=0;
	       for(int size : n) {
			if(size==22) {
	    		   count++;
	    	   }
	       }
	       System.out.println("22 : " + count);
		}

	}

