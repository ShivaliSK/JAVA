import java.util.Scanner;

public class TimeConverter {
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int minutes=scan.nextInt();
		System.out.println(convertToHours(minutes));
		scan.close();

	}

}
