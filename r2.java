import java.util.Scanner;
public class r2{
	public static void main(String[] args){
		System.err.print("Please enter two integers: ");
		Scanner kb = new Scanner(System.in);
		int r1 = kb.nextInt();
		int mean = kb.nextInt();
		int r2 = 2*mean - r1;
		System.out.println(r2);
	}
}
