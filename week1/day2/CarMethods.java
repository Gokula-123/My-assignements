package week1.day2;

public class CarMethods {
	
	public void printCarName() {
		System.out.println("Mahindra thar");
	}
	public String getCarColor() {
		return "black";
	}
	public int getEngineNumber() {
		return 23789;
	}
	public int getSubraction(int a,int b) {
		int c=a-b;
		return c;
		}
	public int getMultiply(int a,int b) {
		int c=a*b;
		return c;
	}
	public int getDivision(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		CarMethods carObj = new CarMethods();
		carObj.printCarName();
		String carColor = carObj.getCarColor();
		System.out.println(carColor);
		int engineNumber = carObj.getEngineNumber();
		System.out.println(engineNumber);
		int subraction = carObj.getSubraction(23,6);
		System.out.println("subraction "+subraction);
		int multiply = carObj.getMultiply(4,9);
		System.out.println("Multiplication "+multiply);
		int division = carObj.getDivision(16,4);
		System.out.println("Division "+division);
		
	}

}
