package test1;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int number = in.nextInt();
		
		if (number % 2 ==0)
			System.out.println("¦��!");
		else
			System.out.println("Ȧ��!");
		System.out.println("����");

	}

}
