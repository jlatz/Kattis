import java.util.Scanner;
public class tarifa{
	public static void main(String[] args){
		System.err.print("Please enter an integer: ");
		Scanner kb = new Scanner(System.in);
		int numMeg = kb.nextInt();
		int numMonths = kb.nextInt();
		int base = 0;
		int answer = numMeg;
		while (base < numMonths){
			int spendMeg = kb.nextInt();
			answer = answer + numMeg - spendMeg;
			base++; 
		
		}
		System.out.println(answer);
	}
}
