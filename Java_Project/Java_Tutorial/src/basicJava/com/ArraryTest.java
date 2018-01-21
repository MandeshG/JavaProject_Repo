package basicJava.com;

public class ArraryTest {
	public static void main(String[] args) {
		int []lotteryNumber= new int[49];
	
		for (int i = 0; i < lotteryNumber.length; i++) {
			lotteryNumber[i]=i+1;
			
		}
		
		System.out.println(lotteryNumber.length);
	}

}
