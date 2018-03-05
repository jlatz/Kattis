import java.util.Scanner;
public class cold{
	public static void main(String[] args){
		System.err.print("Please enter a number: ");
		Scanner kb = new Scanner(System.in);
		int numTemp = kb.nextInt();
		int counter = 0;
		int base = 1;
		while (base <= numTemp){
			int temp = kb.nextInt();
			if (temp < 0)
				counter++;
			base++;
		}
		System.out.println(counter);
	}
}
