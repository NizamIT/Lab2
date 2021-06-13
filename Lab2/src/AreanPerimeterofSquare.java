import java.util.Scanner;
   public class AreanPerimeterofSquare
	{
	  public static void main(String args[])
	    {
	        int side,perimeter,area;
	        @SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter Side Length of Square : ");
	        side=scan.nextInt();
			area=side*side;
	        perimeter=4*side;
			System.out.print("Area = " +area);
			System.out.print("\nPerimeter = " +perimeter);
	    }
}
