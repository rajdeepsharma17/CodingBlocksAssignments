package assignment3;

import java.util.Scanner;

public class B2D {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter binary no.");
		int N = scn.nextInt();
		int decimal = b2d(N);
		System.out.println(decimal);
		scn.close();

	}
	
	public static int b2d(int N){
		int dec = 0;
		int counter = 1;
		while(N!=0){
			int rem = N%10;
			dec = dec + rem*counter;
			counter *= 2;
			N=N/10;	
		}
		return dec;
	}

}
