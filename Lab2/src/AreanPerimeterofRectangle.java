import java.util.Scanner;
    public class AreanPerimeterofRectangle{
	    public static void main(String args[])
	    {
	        int l,b,p,a;
	        @SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			
	        System.out.println("Enter Length and Breadth of Rectangle:");
	        l=scan.nextInt();
	        b=scan.nextInt();
			a=l*b;
	        p=(2*l)+(2*b);
		    System.out.println("Area = " +a);
			System.out.println("\nPerimeter = " +p);
	    }
}
