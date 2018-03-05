import java.util.Scanner;
import java.util.regex.*;
public class hissingmicrophone{
	public static void main(String[] args){
		System.err.print("Please enter a word: ");
		Scanner kb = new Scanner(System.in);
		String testWord = kb.next();	
		Pattern p = Pattern.compile("ss"); //using regex to match on the double ss
		Matcher m = p.matcher(testWord); //will return true if word has double ss
		if (m.find() == true)
			System.out.println("hiss");
		else
			System.out.println("no hiss");
	}
}
