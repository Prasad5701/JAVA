import java.util.Scanner;
class Bank
{
	static Scanner sc = new Scanner(System.in);
	static AccountHolder obj;
	static
	{
		System.out.println("**** Welcome to LAXMI-CHIT Fund ****");
	}

	public static void main(String[] args) {
		for (; ; ) {
			
			System.out.println("1.Create Account 2.Existing Account-Holder");
			System.out.print("Enter a Number ");
			int option = sc.nextInt();

			switch(option)
			{
			    case 1:
			    	{
			    		Scanner scanner = new Scanner(System.in);
			    		Scanner scanner2 = new Scanner(System.in);
			    		System.out.println("*** Account Creation ***");
			    		System.out.println("Please your Details");
			    		System.out.print("Enter your Name : ");
			    		String name = scanner.nextLine();
			    		System.out.print("Enter your Address : ");
			    		String address = scanner.nextLine();
			    		System.out.print("Enter your Contact Number : ");
			    		long contactNumber = scanner.nextLong();
			    		System.out.print("Enter your adhar Number : ");
			    		long adharNumber = scanner.nextLong();
			    		System.out.print("Enter your Pancard Number : ");
			    		String pancardNumber = scanner2.nextLine();
			    		scanner.reset();
			    		System.out.print("Opening Deposite Balance : ");
			    		double amount = scanner2.nextDouble();
			    		scanner.reset();
			    		System.out.print("Enter your Pin : ");
			    		int pin = scanner.nextInt();
			    		obj = new AccountHolder(name,address,contactNumber,adharNumber,pancardNumber,amount,pin);
			    		break;


			    	}
			    case 2:
			    	{
			    		for (; ; ) {
			    			Scanner sc1 = new Scanner(System.in);
			    			System.out.println("***  Features  ***");
			    			System.out.println("1.Deposite 2.Withdraw 3.Account-Balance 4.Account-Details 5.Exit");
			    			System.out.print("Enter a Option : ");
			    			int option2 = sc1.nextInt();

			    			switch(option2)
			    			{
			    				case 1:
			    					{
			    						System.out.println("Account Deposite Features ");
			    						System.out.print("Enter your deposite amount: ");
			    						double depositeAmount = sc1.nextDouble();
			    						double newBalance = obj.getBalance() + depositeAmount;
			    						obj.setBalance(newBalance);
			    						System.out.println(" Amount Deposited ");
			    					break;
			    					}
			    				case 2 :
			    					{
			    						System.out.println("Account Amount-Withdraw");
			    						System.out.print("Enter the amount ");
			    						double withdrawAmount = sc1.nextDouble();
			    						int pin1 = sc1.nextInt();
			    						if (pin1==obj.getPin()) {
			    							if (withdrawAmount<obj.getBalance()) {
			    								double newBalance = obj.getBalance() - withdrawAmount;
			    								System.out.println("Amount Withdraw");
			    								obj.setBalance(newBalance);
			    							}
			    							else 
			    							{
			    								System.out.println("Insufficient Fund");
			    							}
			    							
			    						}
			    						else 
			    						{
			    							System.out.println("Incorrect Pin Try Again");
			    						}
			    					break;
			    						
			    					}
			    				case 3:
			    					{
			    						System.out.println("Account-Balance");
			    						System.out.println("Enter your Pin : ");
			    						int pin1 = sc1.nextInt();
			    						if(obj.getPin()==pin1)
			    						{
			    							System.out.println("Account Balance is : "+ obj.getBalance());
			    						}
			    						else 
			    						{
			    							System.out.println("Incorrect Pin and Try Again");
			    						}
			    					break;
			    					}

			    				case 4 :
			    					{
			    						System.out.println("Account Details");
			    						System.out.println("Account Holder : "+ obj.getName());
			    						System.out.println("Address : "+ obj.getAddress());
			    						System.out.println("Phone Number : " + obj.getContact());
			    						System.out.println("Account Number : "+ obj.accountNumber);
			    						break;
			    					}
			    				case 5:
			    					{
			    						System.exit(0);
			    					}
			    				default:
			    					{
			    						System.out.println("Enter an Correct Option");
			    						break;
			    					}
			    			}
			    			
			    		}
			    	  
			    	}

			    default:
			    	{
			    		System.out.println("Enter a Wrong Number");
			    		break;
			    	}
			}


		}
	}
}