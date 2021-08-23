package functionalprograms;

import java.util.*;



public class Twodarray {
	
		public static Scanner sc=new Scanner(System.in);  
		public static int[][] array=new int[10][10];//declaring a 2-D array
		public static int m,n;
   /*
    * method to input values to 2-D array
    */
		public static void input()			
		{
			System.out.println("Enter the row size :");
			 m=sc.nextInt();
			 System.out.println("Enter the column size :");
			 n=sc.nextInt();
			System.out.println("Enter the array elements:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					array[i][j]=sc.nextInt();
		}
     /*
      * method to print the content in array
      */
		public static void output()					
		{
			System.out.println("Array elements are :");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.println(+array[i][j]);
				}
			}

		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			input();//calling methods
			output();


		}
	} 