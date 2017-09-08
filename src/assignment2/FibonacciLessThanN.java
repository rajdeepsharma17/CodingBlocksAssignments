package assignment2;

import java.util.Scanner;

public class FibonacciLessThanN {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int N = scn.nextInt();
		
		int n1=0,n2=1,n3=0;
		while(n3<=N){
			n1 = n2;
			n2 = n3;
			System.out.println(n3);	
			n3 = n1 + n2;
		}
		scn.close();

	}

}
