package assignment2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int row = 1;
		int numStar = 1+(N/2);
		int numSp = 1;
		while(row<=N){
			int col = 1;
			while(col <= numStar){
				System.out.print("*");
				col+= 1;
			}
			col =1;
			while(col <= numSp){
				System.out.print(" ");
				col+= 1;
			}
			col = 1;
			while(col <= numStar){
				System.out.print("*");
				col+= 1;
			}
			
			if(row <= N/2){
				numStar-=1;
				numSp+=2;
			}else{
				numStar+=1;
				numSp-=2;
			}
			
			row++;
			System.out.println();
		}
		scn.close();

	}

}
