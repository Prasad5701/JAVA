import java.util.Scanner;
class YearBranch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year of Engineering College : ");
		int year = sc.nextInt();
		System.out.print("Enter Branch : ");
		char ch = sc.next().charAt(0);

		switch(year)
		{
		case 1 : 
			System.out.println("M1,Physics,Chemistry");
		break;

		case 2 :

			switch(ch)
			{
			case 'C' : 
				System.out.println("Operating System,C++,Data Structure");
			break;

		    case 'E' :
		    	System.out.println("Basic Electronic,OOP,Circuit");
		    break;

		     case 'M':
		     	System.out.println("M2,mechanics,Engines");

			}
		break;

		case 3:  
            switch(ch)   
            {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }      
        break; 

        case 4:  
            switch(ch)   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                    break;  
                } 
        break;


        default : 
        {
        	System.out.println("Entered Year Between 1 to 4");
        }     









		}
	}
}