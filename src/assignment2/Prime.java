package assignment2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int counter = 0;
		for(int i=2;i<=N/2;i++){
			if(N%i==0){
				counter++;
			}
			
		}
		if(counter>0){
			System.out.println("Not Prime");
			
		}
		else
			System.out.println("Prime");
		scn.close();

	}

}
