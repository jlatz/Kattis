import java.util.Scanner;
import java.lang.Math;
public class pot{
	public static void main(String[] args){
		System.err.print("Please enter an integer: ");
		Scanner kb = new Scanner(System.in);
		int numInt = kb.nextInt();
		int base = 1;
		int answer = 0;
		while (base <= numInt){
			int num = kb.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append("");
			sb.append(num);
			String numStr = sb.toString(); //converts the integer into a string
			String strInteger = numStr.substring(0, numStr.length()-1); //will take off the last digit of the number 1234 --> 123
			String strExponet = numStr.substring(numStr.length()-1, numStr.length()); //will take just the last digit of the number 1234 --> 4
			int intInteger = Integer.parseInt(strInteger); //convert a string into an integer
			int intExponet = Integer.parseInt(strExponet);
			answer += Math.pow(intInteger, intExponet);	
			base++;			
		}
		System.out.println(answer);
	}
}
