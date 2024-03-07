class Student 
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

//overriding Eqauls method from Object class

	public boolean equals(Object obj)
	{
		Student s1 = (Student)obj;
		if((this.name==s1.name)&&(this.nativePlaace ==s1.nativePlaace)&&(this.phNo==s1.phNo)&&(this.branch==s1.branch))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
class EqualMethod
{
	public static void main(String[] args) {
		Student obj1 = new Student("Prasad","Pune",1234567896l,"Computer");
		System.out.println(obj1);
		Student obj2 = new Student("Prasad","Pune",1234567896l,"Computer");
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
