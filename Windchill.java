package functionalprograms;

public class Windchill {

	static double temp;
	static double windspeed;
	/*
	 * Method to calculate the windchill using the formula
	 */
	public static void windChillcompute()  
	{
		double windchill=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(windspeed, 0.16);  
		System.out.println("Windchill is :"+windchill);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		temp=Double.parseDouble(args[0]);	// the temperature obtained from command line
		windspeed=Double.parseDouble(args[1]);	// wind speed(in miles per hour) obtained from command line
		windChillcompute(); 
	}
}
