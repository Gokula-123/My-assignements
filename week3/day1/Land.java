package week3.day1;

public class Land implements Plan{
	public void buildBalcony() {
		   System.out.println("Villa");
	   }
	   public void buildBedroom(int i) {
		   System.out.println(i);
	   }
	   public void buildKitchen(char c) {
		   System.out.println(c);
	   }

	   public void buildCorridor(char c) {
		   System.out.println(c);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Plan land = new Land();
        land.buildBalcony();
        land.buildBedroom(6);
        land.buildKitchen('G');
       }

}
