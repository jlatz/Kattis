import java.util.Scanner;
public class nastyhacks{
	public static void main(String[] args){
		System.err.print("please enter a number:");
		Scanner kb = new Scanner(System.in);
		int trials = kb.nextInt();
		int base = 1;
		while (base <= trials){
			int noAdvertise = kb.nextInt();
			int doAdvertise = kb.nextInt();
			int costAdvertise = kb.nextInt();
			int revenue = doAdvertise - costAdvertise;
			if (revenue > noAdvertise){
				System.out.println("advertise");
			}else if (revenue < noAdvertise){
				System.out.println("do not advertise");
			}else
				System.out.println("does not matter");
			base++;
		}	
	}
}
