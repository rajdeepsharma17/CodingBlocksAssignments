package assignment2;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int N = scn .nextInt();
		int counter = 0;
		int n1=0,n2=1,n3;
		if(N==0){
			System.out.println(0);
		}
		else{
			while(counter<N){
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.println(n3);
				counter++;
			}
		}
		
		
		scn.close();

	}

}
