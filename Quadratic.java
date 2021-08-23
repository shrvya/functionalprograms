package functionalprograms;

import java.util.Scanner;

public class Quadratic {
static int a=0,b=0,c=0;
static Scanner sc=new Scanner(System.in);

/*
 * after a,b,c value is input 
 * this method will calculate the root value
 */
	public static void roots()
	{
		
		int delta=b*b-4*a*c;
	
		double root1=(-b+Math.sqrt(delta))/(2*a);
		System.out.println("root1 value is :"+root1);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("root2 value is : "+root2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter the value of a,b,c");
		a=sc.nextInt();  //get input from console
		b=sc.nextInt();
		c=sc.nextInt();
		roots();  // call the function root
	}

}
