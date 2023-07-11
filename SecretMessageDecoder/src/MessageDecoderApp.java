import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		MessageDecoder msd=new MessageDecoder();
		System.out.println(msd.decodeCharacter(ch));
	}

}
