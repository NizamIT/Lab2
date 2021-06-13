import java.util.Scanner;
public class ArraySwapping {
	public static void main(String[] args) 
	{
		int Size,i;
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Number of elements: ");
		Size=scan.nextInt();	
		int [] a=new int[Size];
		int [] b=new int[Size];
		System.out.println("Enter elements of First Array: ");
		for (i=0;i<Size;i++)
		{
			a[i]=scan.nextInt();
	    System.out.println("Enter elements of Second Array: ");
		for (i = 0; i < Size; i++)
		{
			b[i] = scan.nextInt();
		}
		for(i = 0; i < Size; i++)
		{
		    a[i] = a[i] + b[i];
		    b[i] = a[i] - b[i]; 
		    a[i] = a[i] - b[i];
		}
		System.out.print("\n First  Array Elements (a[]) After Swapping :  ");
		printArray(a,Size);
		System.out.print("\n Second Array Elements (b[]) After Swapping :  ");
		printArray(b,Size);
		}}
	public static void printArray(int[] Array, int Size)
	{
		for (int Number:Array) 
		{
			System.out.print(Number + " ");
}}}
