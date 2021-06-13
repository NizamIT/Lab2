import java.util.Scanner;
	public class FindSeason{
	    public static void main (String[] args) {
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the month:");
	            int month=scan.nextInt();
	            if(month>12||month<1)
	            {
	                System.out.println("Invalid month");
	            }
	            else if(month>=3&&month<=5)
	            {
	                System.out.println("Season:Spring");
	            }
	            else if(month>=6&&month<=8)
	            {
	                System.out.println("Season:Summer");
	            }
	            else if(month>=9&&month<=11)
	            {
	                System.out.println("Season:Autumn");
	            }
	            else if(month==12||month==1||month==2)
	            {
	                System.out.println("Season:Winter");
	            }
	    }
	}
