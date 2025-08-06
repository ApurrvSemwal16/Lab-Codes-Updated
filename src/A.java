import java.util.Scanner;

public class A {
	public void inpadd() {
		
		Scanner scc = new Scanner(System.in);
		
		System.out.println("Enter value of first integer: ");
		int c = scc.nextInt();
		
		System.out.println("Enter value of second integer: ");
		int d = scc.nextInt();
		
		System.out.println("Enter value of third integer: ");
		int e = scc.nextInt();
		
		A obj=new A();
		obj.ad(c, d, e);
		
	}
	public void ad(int c, int d) {
		System.out.println(c+d);
	}
	public void ad(int c, int d, int e) {
		
		System.out.println(c+d+e);
		c = 20;
		
		System.out.println("Overrided value:");
		System.out.println(c+d+e);
	}
}