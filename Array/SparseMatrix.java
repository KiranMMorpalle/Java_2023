package Day24;

import java.util.Scanner;

public class SparseMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		int count=0;
		
		int arr[][]=new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=sc.nextInt();	
				if(arr[i][j]==0)	
					count++;
			}
		}
		
		
		
//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++) {
//				if(arr[i][j]==0)	
//					count++;			
//			}
//		}
//		
		if(count>(row*col)/2)
			System.out.println("Saprse matrix");
		else
			System.out.println("NOT Saprse matrix");

	}

}








         