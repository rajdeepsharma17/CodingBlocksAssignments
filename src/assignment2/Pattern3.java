package assignment2;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int row;
		System.out.println(1);
		for(row = 2;row<=N;row++){
			System.out.print(1);
			if(row>=2){
				System.out.print(row);
			}
			
			
			System.out.println();
		}
		scn.close();

	}

}
