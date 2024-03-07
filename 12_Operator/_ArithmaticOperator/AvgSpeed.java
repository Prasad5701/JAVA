import java.util.Scanner;

class AvgSpeed
{
	public static void main(String[] args) {
	   
	     int distance = 14;                       			//In kilometer
	     int time1 = 45;    					  			//in Minute
	     int time2 = 30;    					  			//in Sec
	     int totalTimeInSec= time1*60 + time2;   			 //Total time In sec
	     int distanceInMeter = distance*1000;                //Distance in Meter
	     double avgSpeedInMeter = distanceInMeter/totalTimeInSec;   // AvgSpeed In meter/sec

	     System.out.println("Average Speed In Meter/Sec : " + avgSpeedInMeter); 
	     System.out.println("");


	     double avgSpeedInKm = avgSpeedInMeter*3.6;            // 1 m/s = 3.6 km/hr

	     System.out.println("Averge Speed in Kilometer/hr : "+ avgSpeedInKm);
	     System.out.println("");

	     double avgSpeedInMile =  avgSpeedInKm/1.6;    // 1km = 1/1.6 mile 

	     System.out.println("Average Speed In Mile/hr : " + avgSpeedInMile);






	}
}