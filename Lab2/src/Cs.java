public class Cs {
	class Cons{
		int p,q; 
		public Cons() {} 
		public Cons(int x, int y) { 
		 p=x; 
		 q=y; 
		 } 
		public int add(int i, int j) { 
		return (i+j); 
		} 
		public int add(int i, int j, int k) { 
		return (i+j+k); 
		 } 
		public float add(float f1, float f2) { 
		return (f1+f2);
		
		}
		public void printData() { 
			 System.out.print("p = "+p); 
			 System.out.println(" q = "+q); 
			} 
			}
			public static void main(String args[]) { 
			 int x=2, y=3, z=4;
			 float m=7.2F, n=5.2F; 
			 Cons c1=new Cons(x,z); 
			 Cons c=new Cons();
			 c1.printData(); 
			 int k=c.add(x,y); 
			 int t=c.add(x,y,z); 
			 float ft=c.add(m, n); 
			 System.out.println("k = "+k); 
			 System.out.println("t = "+t); 
			 System.out.println("ft = "+ft); 
			 }
}
