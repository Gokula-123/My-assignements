package week3.day1;

public class AxisBank extends BankInfo {
	public int Deposit(int d) {
  	  System.out.println(d);
  	  return d;
    }
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.Savings();
		obj.Fixed(1200090);
		obj.Deposit(78000);
		obj.Deposit(62000);
	}
}
