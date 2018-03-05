import java.util.Scanner;
public class grassseed{
	public static void main(String[] args){
		System.err.print("Please enter the cost of the seed: ");
		Scanner kb = new Scanner(System.in);
		double cost = kb.nextDouble();
		int numLawns= kb.nextInt();
		int base = 1;
		double totalCost = 0;
		while (base <= numLawns){
			double width = kb.nextDouble();
			double length = kb.nextDouble();
			totalCost += width * length * cost;
			base++;
		}	
		System.out.println(totalCost);
	}
}
