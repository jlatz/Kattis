import java.util.Scanner;
public class filip{
	public static void main(String[] args){
		System.err.print("Please enter two 3 digit numbers: ");
		Scanner kb = new Scanner(System.in);
		String num1 = kb.next();
		String num2 = kb.next();
		String reverseNum1 = new StringBuilder(num1).reverse().toString();
		String reverseNum2 = new StringBuilder(num2).reverse().toString(); //reverse the contents of a string 321 --> 123
		int finalNum1 = Integer.parseInt(reverseNum1);	
		int finalNum2 = Integer.parseInt(reverseNum2); //convert a string to an integer
		if (finalNum1 > finalNum2)
			System.out.println(finalNum1);
		else
			System.out.println(finalNum2);	
	}
}
