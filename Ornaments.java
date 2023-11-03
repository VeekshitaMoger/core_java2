class Ornaments
{
	
	String type;
	int noofcompany;
	char size;
	double cost;
	
	Ornaments()
	{
		super();
		System.out.println("\nConstructor with no args");
	}
	Ornaments(String type)
	{
		super();
		this.type=type;
		System.out.println("\nConstructor with no args:"+type);

	}
	Ornaments( int noofcompany)
	{
		super();
		this.noofcompany=noofcompany;
		System.out.println("\n Constructor with no args:"+noofcompany);
	}
	Ornaments(char size)
	{
		super();
		this.size=size;
		System.out.println("\n Constructor with  args:"+size);
	}
	Ornaments(double cost)
	{
		super();
		this.cost=cost;
		System.out.println("\nConstructor with args:"+cost);
	}
}