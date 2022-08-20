package week3.day1;

public class Students {
       public final void getStudentInfo(int id) {
            //System.out.println(id);    	   
       }
       public static void getStudentInfo(int id,String name) {
           System.out.println(id +":"+ name );  
      }
       public void getStudentInfo(String email,long phno) {
           System.out.println(email+"\n"+phno+"\n");  
      }
       
       public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(1);
		Students.getStudentInfo(1,"Gokula");
		obj.getStudentInfo("gokulasundar96@gmail.com",9790275849l);
		obj.getStudentInfo(2);
		Students.getStudentInfo(2,"Gokz");
		obj.getStudentInfo("gokzsundar96@gmail.com",9790767779l);
	}
}
