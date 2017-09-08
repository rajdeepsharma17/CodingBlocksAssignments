package assignment2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int row,column,counter=0;
		for(row=1;row<=N;row++){
			for(column=1;column<=row;column++){
				counter++;
				System.out.print(counter);
			}
			System.out.println();
		}
		scn.close();
		
	}

}
