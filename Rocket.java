class Rocket
{
String name;
	int noofcompany;
	char size;
	double cost;
	
	Rocket()
	{
		super();
		System.out.println("\nConstructor with no args");
	}
	Rocket(String name)
	{
		super();
		this.name=name;
		System.out.println("\nConstructor with no args:"+name);

	}
	Rocket( int noofcompany)
	{
		super();
		this.noofcompany=noofcompany;
		System.out.println("\n Constructor with no args:"+noofcompany);
	}
	Rocket(char size)
	{
		super();
		this.size=size;
		System.out.println("\n Constructor with  args:"+size);
	}
	Rocket(double cost)
	{
		super();
		this.cost=cost;
		System.out.println("\nConstructor with args:"+cost);
	}
}
	