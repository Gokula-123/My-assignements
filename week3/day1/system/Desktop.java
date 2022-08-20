package org.system;

public class Desktop extends Computer{
      public float desktopSize(float d) {
    	  System.out.println(d);
    	  return d;
      }
      
      public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel(546907902);
		obj.desktopSize(15.7f);
	}
}
