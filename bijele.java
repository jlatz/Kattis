import java.util.Scanner;
public class bijele{
	public static void main(String[] args){
		System.err.print("Please enter a six digit number: ");
		Scanner kb = new Scanner(System.in);
		int king = kb.nextInt();	
		int queen = kb.nextInt();	
		int rook = kb.nextInt();	
		int bishop = kb.nextInt();	
		int knight = kb.nextInt();	
		int pawn = kb.nextInt();

		int numKing = 1 - king;	
		int numQueen = 1 - queen;	
		int numRook = 2 - rook;	
		int numBishop = 2 - bishop;	
		int numKnight = 2 - knight;	
		int numPawn = 8 - pawn;

		System.out.printf("%d %d %d %d %d %d", numKing, numQueen, numRook, numBishop, numKnight, numPawn); //using a formated string to ouptput the answer	
	}
}
