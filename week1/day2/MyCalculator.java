package week1.day2;

/**
 * @author Gokula
 *
 */
public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 CalculatorClass Output = new CalculatorClass();
			 int add = Output.add(3, 5, 9);
			 System.out.println(add);
			 System.out.println(Output.sub(5, 0));
			 System.out.println(Output.mul(4, 4));
			 System.out.println(Output.div(5.67f, 5.13f));
}
}
