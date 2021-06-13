import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String args[]){
	    @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	int num;
	System.out.println("Enter the number: ");
	num=scan.nextInt();
	int i=1;
	do{
	System.out.println(num+"x"+i+"="+num*i);
	 i++;
	}while( i<=20);

}}
