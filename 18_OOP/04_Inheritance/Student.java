class Student
{
	static int uniqueId =1;
	String name;
	int id;
	String gender;
	long contact;
	String address;
	String department;

	Student(String name,String gender,long contact,String address,String department)
	{
		this.name = name;
		this.id=uniqueId++;
		this.gender =gender;
		this.contact=contact;
		this.address=address;
		this.department=department;
	}

	public void displayStudent()
	{
		System.out.println("****Student Details****");
		System.out.println("Name of Student : "+this.name);
		System.out.println("Id : "+this.id);
		System.out.println("Gender : "+this.gender);
		System.out.println("Contact : "+this.contact);
		System.out.println("Address : "+this.address);
		System.out.println("department of Student : "+this.department);
		System.out.println();
	}
}