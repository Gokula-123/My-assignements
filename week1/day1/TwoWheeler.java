package week1.day1;

public class TwoWheeler {
	public int noOfWheels = 4;
	public short noOfMirrors = 5;
	public long chassisNumber = 789;
	public boolean isPunctured = false;
	public String bikeName = "RoyalEnfield";
	public double runningKM = 62.71;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TwoWheeler two = new TwoWheeler();
        int noOfWheels2 = two.noOfWheels;
        System.out.println(noOfWheels2);
        System.out.println(two.noOfMirrors);
        System.out.println(two.chassisNumber);
        System.out.println(two.isPunctured);
        System.out.println(two.bikeName);
        System.out.println(two.runningKM);   
	}

}
