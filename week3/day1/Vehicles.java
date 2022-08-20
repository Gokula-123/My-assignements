package week3.day1;

public class Vehicles {
      
	public static void main(String[] args) {
		BMW b = new BMW();
		b.brakes(1); //CAR
        b.mirror(6); //BMW
        
        Audi a = new Audi();
        a.brakes(11); //CAR
        a.gear(5); //AUDI
        
        Bajaj j = new Bajaj();
        j.horn(2); //AUTO
        j.horn(6); //BAJAJ
        
		}
}
