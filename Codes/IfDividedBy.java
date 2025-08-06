import java.util.Scanner;

public class IfDividedBy {
	public static void main(String[] args) {
			
	Scanner scc = new Scanner(System.in);

	System.out.println("Enter value of an integer: ");
	int a = scc.nextInt();
	
	int c=0;
	for(a=20;a<=40;a++) {
		
		if (a%3==0) {
			c++;
		}
	}
	
	System.out.println("Divisible by 3 = "+c+" times");
	c=0;
	
	for(a=20;a<=40;a++) {

		if(a%4==0) {
			c++;
		}	
	}
	
	System.out.println("Divisible by 4 = "+c+" times");
	c=0;
	
	for(a=20;a<=40;a++) {

		if(a%5==0) {
			c++;
		}
	}
	
	System.out.println("Divisible by 5 = "+c+" times");
	c=0;
	
	}
}

