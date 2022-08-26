package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

			//* Pseudo Code: 
				 //* a) Create a empty Set Using TreeSet
				  Set <Integer> d = new TreeSet <Integer>();
				 //* b) Declare for loop iterator from 0 to data.length and add into Set 
				 for (int i = 0; i < data.length; i++) {
					d.add(data[i]);
				}
                 System.out.println("sorted order : "+ d);

				  //* c) converted Set into List
				 List <Integer> l = new ArrayList <Integer>(d);
				 //* d) Print the second last element from List
                  System.out.println("second largest : "+ l.get(l.size() - 2));
	}

}
