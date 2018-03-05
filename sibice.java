import java.util.Scanner;
import java.lang.Math;
public class sibice{
	public static void main(String[] args){
		System.err.print("Please enter three numbers: ");
		Scanner kb = new Scanner(System.in);
		int numMatches = kb.nextInt();
		int boxHeight = kb.nextInt();
		int boxWidth = kb.nextInt();
		double range = Math.sqrt(boxHeight*boxHeight + boxWidth*boxWidth);
		int base = 1;
		while (base <= numMatches){
			int matchLength = kb.nextInt();
			if (matchLength <= range)
				System.out.println("DA");
			else
				System.out.println("NE");
			base++;
		}
	}
}
