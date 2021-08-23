package functionalprograms;

public class Eucliddistance {
	
	static int x,y;
	/*
	 * method to calculate distance of(x,y) from origin using formula
	 */
 public static void distance()
 {
	 double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));	
		System.out.println("The eulidean distance of ("+x+","+y+") from origin (0,0) is "+distance);	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=Integer.parseInt(args[0]);	//input x obtained from parameters given in command line
	    y=Integer.parseInt(args[1]);	//input y obtained from parameters given in command line
		double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));	//to calculate distance
		System.out.println("The eulidean distance of ("+x+","+y+") from origin (0,0) is "+distance);	//distance between point and origin
	}
}
