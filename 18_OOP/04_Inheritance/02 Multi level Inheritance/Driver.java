class Human
{
	String name;
	Human(String name)
	{
		this.name = name;
	}
	public void eat()
	{
		System.out.println("Human can Eat");
	}
	public void talk()
	{
		System.out.println("Human can talk");
	}
	public void walk()
	{
		System.out.println("Human can WAlk");
	}
	public void humanName()
	{
		System.out.println("name of Human : "+this.name);
	}
}

class UnderGradution extends Human
{
	String company;
	String branch;
	UnderGradution(String name,String company,String branch)
	{
		super(name);
		this.company =company;
		this.branch = branch;

	}
	void branch()
	{
		System.out.println("Branch of Engineering : "+this.branch);

	}
	void work()
	{
		System.out.println("Engineer Work in : "+this.company);

	}
}
class PostGradution extends UnderGradution
{
	String sub;
	PostGradution(String name ,String sub,String company,String branch)
	{
		super(name,company,branch);
		this.sub =sub;

	}
	void stream()
	{
		System.out.println("PostGradution Subj : "+this.sub);
	}
}

class Driver
{
	public static void main(String[] args) {
		PostGradution pg = new PostGradution("Ramesh","Thermodyanamics","Infosys","Mechanical");
		pg.stream();
		pg.eat();
		pg.walk();
		pg.talk();
		pg.branch();
		pg.work();
		pg.humanName();
	}
}