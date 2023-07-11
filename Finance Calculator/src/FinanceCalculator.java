import java.util.Scanner;

public class FinanceCalculator {
	public double calculateSimpleInterest(double principal, double rate, double time)
	{
		return principal*rate*time;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		
		// TODO Auto-generated method stub
		FinanceCalculator fincal=new FinanceCalculator();
		System.out.printf("%.2f",fincal.calculateSimpleInterest(principal,rate,time));
		scan.close();

	}

}
