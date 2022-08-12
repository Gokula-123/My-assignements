package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int firstNum = 0,secondNum = 1,sum = 0;
        System.out.println(firstNum);
        for(int i=1;i<11;i++) {
        	sum = firstNum + secondNum;
        	firstNum = secondNum;
        	secondNum = sum;
            System.out.println(sum);
        }
	}

}
