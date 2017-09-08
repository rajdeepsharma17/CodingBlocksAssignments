package assignment2;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int rem = 0;
		int rev = 0;
		while(N!=0){
			rem = N%10;
			rev = rev*10 + rem; 
			N=N/10;
		}
		System.out.println(rev);
		scn.close();
		
	}

}
