package main;

import java.util.Scanner;

public class CharBoolDemo {

	public static void main(String[] args) {
		

		char gal = '가';
		char gal2 = '\uac00';
		
		boolean cham =true;
		boolean geojit = false;
		
		System.out.println(gal);
		System.out.println((int)gal);
		System.out.println(++gal);
		System.out.println(cham +"가 아니면" + geojit + "입니다.");
	}

}
