class WrongInputExecption extends ExceptionInInitializerError{

	WrongInputExecption(String desc)
	{
		super(desc);
	}
}
class Ramesh
{
    public static void evenOdd(int num) throws WrongInputExecption
    {

    	if(num!=0)
    	{
    		if(num%2==0)
    		{
    			System.out.println("The Number is Even");
    		}
    		else 
    		{
    			System.out.println("The Number is odd ");
    		}
    	}
    	else 
    	{
    		throw new WrongInputExecption("Zero Input not possible");
    	}
    }

}
class Suresh
{
	public static void checkNumber()throws WrongInputExecption
   	{
    		Ramesh.evenOdd(10);
   	}
}

class Driver
{
	public static void main(String[] args) {
		System.out.println("Execution Start");
		Suresh.checkNumber();
		System.out.println("Execution End");
	}
}