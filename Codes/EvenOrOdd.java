import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner scc = new Scanner(System.in);
		int count = 0;
		
		while (count<3) {
			System.out.println("Enter value of an integer: ");
			float a = scc.nextInt();
		
			if (a%2==0) {
				System.out.println(a+" is even.");
			} else {
				System.out.println(a+" is odd.");
			}
			count++;
		}
	}
}
