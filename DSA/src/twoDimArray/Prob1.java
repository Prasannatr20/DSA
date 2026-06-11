package twoDimArray;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) 
	{
		//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]nums= new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				nums[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter x");
		int x=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(x==nums[i][j])
					System.out.println(i+" "+j);
			}
		}
		
	}

}
