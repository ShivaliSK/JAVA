import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		double res=journeyCalculator.calculateDistance(speed,time);
		System.out.printf("%.2f",res);
		scan.close();
	}

}
