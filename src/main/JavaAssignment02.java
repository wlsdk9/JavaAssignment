package main;

import java.util.Scanner;

public class JavaAssignment02 {

	public static void main(String[] args) {
		
Scanner cin = new Scanner(System.in);
		
		int a = cin.nextInt();
		int b = cin.nextInt();
		
		System.out.printf("%d\n", a+b);
		System.out.printf("%d\n", a-b);
		System.out.printf("%d\n", a*b);
		System.out.printf("%.2f", (double)a/b);
	}

}
