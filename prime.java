import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
	
		int primecount = 0;
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		for(int counter = 1; counter < (int)(Math.sqrt(num) + 1); counter += 1) {
			if(num % counter == 0) {
				primecount += 1;
				break;
			}
		}
		
		if(primecount == 0) {
			System.out.println((int)num + " is prime");
		} else {
			System.out.println((int)num + " is not prime");
		}
	}
}