import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long result=galacticAddition(num1,num2);
		System.out.println(result);
		scan.close();
	}
	
	
	
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
//125678
//9876543210