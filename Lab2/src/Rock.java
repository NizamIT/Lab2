import java.util.Scanner;
import java.util.Random;
public class Rock {
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) 
	{ 
	 String personPlay="P";
	 String computerPlay="S";
	 int computerInt=1;
	 @SuppressWarnings("resource")
	 Scanner scan=new Scanner(System.in);
	 Random generator = new Random();
	 switch(computerInt) 
	 { 
	 } 
	 if (personPlay.equals(computerPlay)) 
	 System.out.println("It's a tie!"); 
	 else if (personPlay.equals("R")) 
	 if (computerPlay.equals("S")) 
	 System.out.println("Rock crushes scissors. You win!!"); 
	 else { 
		 System.out.println("You Lose");
	 } 
	 }
}
