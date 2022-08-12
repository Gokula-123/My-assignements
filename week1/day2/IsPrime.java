package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=100;
        for(int num=2;num<=n;num++) {
        	boolean isPrime = true;
        	for(int i=2;i<=num/2;i++) {
        	if(num%i==0) {
        		isPrime = false;
        		break;
        	}
        	}
        	if(isPrime == true)
    		System.out.println(num);
        	}
        }
}



