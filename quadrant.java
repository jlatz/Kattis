import java.util.Scanner;
public class quadrant {
	public static void main(String[] args){
		System.err.println("Please Enter two integers");
		Scanner kb = new Scanner(System.in);
		int xvalue = kb.nextInt();
		int yvalue = kb.nextInt();
		if (xvalue > 0 && yvalue > 0)
			System.out.println(1);
		else if (xvalue > 0 && yvalue < 0)
			System.out.println(4);
		else if (xvalue < 0 && yvalue > 0)
			System.out.println(2);
		else
			System.out.println(3);
		

	}
}
	
