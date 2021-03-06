package yusuf.com;

import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		
		int number, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		number = sc.nextInt();
		
		for(i=0; i<10; i++) {
			System.out.println(number+"x"+i+" = "+number*i);
		}
	}

}
