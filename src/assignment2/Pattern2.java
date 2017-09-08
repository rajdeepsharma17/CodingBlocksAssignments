package assignment2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int row;
		int column;
		System.out.println(1);
		for(row = 2;row<=N;row++){
			System.out.print(row);
			 for(column=1;column<=row-2;column++){
				 System.out.print(0);
			 }
			 System.out.print(row);
			 System.out.println();
		}
		
		scn.close();

	}

}
