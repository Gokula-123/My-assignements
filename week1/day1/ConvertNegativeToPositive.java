package week1.day1;

public class ConvertNegativeToPositive {
	public static void main(String[] args) {
		double giveNumber = -354.979878;
		if (giveNumber < 0) {
			giveNumber = - giveNumber;
			System.out.println("Given number converted to positive value    "+giveNumber);
         }
		else {
			System.out.println("The number is positive");
		}
		}
}
