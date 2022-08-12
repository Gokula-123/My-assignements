package week1.day2;

import java.util.Arrays;
public class SecondLargest {
	
	public static void main(String[] args) {
		int a[]= {22,67,98,1,34,58,99};
        int size = a.length;
        Arrays.sort(a);
		System.out.println("second largest "+a[size-2]);		
		
	}

}
