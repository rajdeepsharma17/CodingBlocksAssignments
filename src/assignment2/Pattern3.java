package assignment2;

import java.util.Scanner;

public class Pattern3 {
//nCk = (nC(k-1)*(n-k+1))/k  
	//Pascals Triangle
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int row = 0;
		while(row<N){
			int counter = 1;
			int col = 0;
			while(col<=row){
				System.out.print(counter + " ");
				col+=1;
				counter = (counter*(row - col +1))/col;
			}
			System.out.println();
			row = row + 1;
		}
		
		
		scn.close();
		}
}

