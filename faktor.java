import java.util.Scanner;
import java.lang.Math;
public class faktor{
	public static void main(String[] args){
		System.err.print("Please enter two numbers: ");
		Scanner kb = new Scanner(System.in);
		int numArticles = kb.nextInt();
		int impactFactor = kb.nextInt();
		double minimumIF = impactFactor - .99;
		int citations = (int)Math.ceil(minimumIF*numArticles); 
		//converts the double to an integer
		//Math.ceil takes the decimal number and rounds up no matter what 23.1 --> 24 
		System.out.println(citations);	
	}
}
