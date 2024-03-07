class Student implements Cloneable
{
	String name;
	String nativePlaace;
	long phNo;
	String branch;

	Student(String name,String nativePlaace,long phNo,String branch)
	{
		this.name = name;
		this.nativePlaace = nativePlaace;
		this.phNo =phNo;
		this.branch = branch;
	}

//clone() method Override from Object Class

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();  
	}/
}

class CloneExample
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student obj1 = new Student("Prasad","Pune",23425343635l,"Computer");
		Student obj2 = (Student)obj1.clone();  //Clone Object obj2


//changing in original object will NOT change in clonable object 
//if we use Clone() MEthod


		System.out.println(obj1.name);
		System.out.println(obj2.name);
		obj1.name = "Suresh";
		obj1.phNo = 2342522424l;
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj1.phNo);
		System.out.println(obj2.phNo);

	}
}





//using New Keyword

//changing in original object will change in clonable object 
//if we use the new keyword

// Student obj2 =obj1;
// 		System.out.println(obj1.name);
// 		System.out.println(obj2.name);
// 		obj1.name = "Suresh";
// 		System.out.println(obj1.name);
// 		System.out.println(obj2.name);