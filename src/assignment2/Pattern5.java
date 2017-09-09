package assignment2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int orow = 1;
		int row = orow;
		while(orow<= 2*n - 1){
			int col =1;
			while(col <= n-row){
				System.out.print(" ");
				col = col + 1;
			}
			
			col = 1;
			int counter = row;
			while(col <= row){
				System.out.print(counter);
				counter = counter + 1;
				col = col + 1;
			}
			
			col = 1;
			counter = counter - 2;
			while(col <= row-1){
				System.out.print(counter);
				counter = counter - 1;
				col  = col +1;
			}
			if(orow<n){
				row = row +1;
			}
			else{
				row = row - 1;
			}
			orow = orow +1;
			System.out.println();
		}
		scn.close();

	}

}
