	import java.util.Scanner;

	public class conditions {
		public void addition() {
			conditions ads=new conditions();
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter value of first integer: ");
			int a = scn.nextInt();
			System.out.println("Enter value of second integer: ");
			int b = scn.nextInt();
			int c;
			c = a+b;
			if (c>30) {
			System.out.println("Answer: ");
			System.out.println(c);
			} else {
				System.out.println();
				ads.addition();
			}
}
}