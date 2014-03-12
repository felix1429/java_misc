import java.util.Scanner;

public class computePi {
	public static void main(String[] args) {
		System.out.print("Enter the number of iterations: ");
		Scanner sc = new Scanner(System.in);
		int iterNum = sc.nextInt();
		double cntr = 1;
		double piVar = 0;
		
		for(int iterCnt = 1; iterCnt < iterNum; iterCnt++) {
			if(iterCnt == 1){
				piVar += 1;
			}else if(iterCnt % 2 == 0){
				piVar -= (1 / cntr);
			}else{
				piVar += (1/cntr);
			}
			cntr += 2;
		}
		double piValue = piVar * 4;
		System.out.println("After " + iterNum + " iterations pi was approximated to equal\n" + piValue);
	}
}