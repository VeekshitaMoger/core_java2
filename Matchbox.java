class Matchbox
{
	String brand;
	int noOfSticks=36;
	double length;
	double cost;
	char size='s';
	float weight;
	String type;
	
	Matchbox()
	{
		System.out.println("\n Constructor with no args");
	}
	Matchbox(String brand)
	{
		this.brand=brand;
		System.out.println("\n Constructor with args:"+brand);
	}
	Matchbox(String brand,int noOfSticks)
	{
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		System.out.println("\n Constructors with args:"+brand+","+noOfSticks);
	}
	Matchbox(double length,double cost)
	{
		this.length=length;
		this.cost=cost;
		System.out.println("\n Constructor with args:"+length+","+cost);
	}
	Matchbox(double cost,char size)
	{
		this.cost=cost;
		this.size=size;
		System.out.println("Constructor with args:"+cost+","+size);
	}
	Matchbox(char size,float weight)
	{
		this.size=size;
		this.weight=weight;
		System.out.println("\n Constructor with args:"+size+","+weight);

	}
	Matchbox(float weight,String type)
	{
		this.weight=weight;
        this.type=type;
        System.out.println("\n Constructor with args:"+weight+","+type);
		
	}
	
}