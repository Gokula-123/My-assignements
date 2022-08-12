package week1.day2;

public class MissingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,2,3,4,7,6,8};
        int count = arr.length;
        int sum = (count+1) * (count+2) / 2;
        for (int i=0;i<count;i++) {
        	sum = sum - arr[i];
        }
        System.out.println(sum);
	}

}
