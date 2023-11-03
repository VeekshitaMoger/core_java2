class MakeupKit
{
	String name;
	String size;
	int cost;
	int date;
	
	MakeupKit()
	{

		System.out.println("constructor with no args:");
	}
	MakeupKit(String name)
	{
	
		this.name=name;
		System.out.println("constructor with  args:"+name);
	}
	
	MakeupKit(String size)
	{
		
		this.size=size;
		System.out.println("constructor with args:"+size);
	}
	
	MakeupKit(int cost)
	{
		
		this.cost=cost;
		System.out.println("constructor with no args:"+cost);
	}
	
	MakeupKit(int date)
	{
	
		this.date=date;
		System.out.println("constructor with no args:"+date);
	}
	
	
}