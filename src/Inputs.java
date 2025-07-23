import java.util.Scanner;

public class Inputs {
	public void Add() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of first integer: ");
		int a = scn.nextInt();
		System.out.println("Enter value of second integer: ");
		int b = scn.nextInt();
		int c;
		c = a+b;
		System.out.println("Answer: ");
		System.out.println(c);
		
	}
	public void Sub() {
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter value of first integer: ");
		int d = snc.nextInt();
		System.out.println("Enter value of second integer: ");
		int e = snc.nextInt();
		int f;
		f = d-e;
		System.out.println("Answer: ");
		System.out.println(f);
	}
	public void Mul() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of first integer: ");
		int g = scan.nextInt();
		System.out.println("Enter value of second integer: ");
		int h = scan.nextInt();
		int i;
		i = g*h;
		System.out.println("Answer: ");
		System.out.println(i);
	}
	public void Div() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter value of first integer: ");
		int j = sca.nextInt();
		System.out.println("Enter value of second integer: ");
		int k = sca.nextInt();
		int l;
		l = j/k;
		System.out.println("Answer: ");
		System.out.println(l);
	}
}
