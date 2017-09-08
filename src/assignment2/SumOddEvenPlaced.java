package assignment2;

import java.util.Scanner;

public class SumOddEvenPlaced {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int even = 0,odd = 0;
		while(N!=0){
			int rem = N%10;
			odd = odd + rem;
			N=N/10;
			rem  = N%10;
			even = even + rem;
			N=N/10;
		}
		System.out.println(odd);
		System.out.println(even);
		scn.close();

	}

}
