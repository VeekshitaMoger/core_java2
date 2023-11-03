class KeyChain
{
	String color;
	char size;
	String type;
	double cost;
	String shape;
	
	KeyChain()
	{
		this("Blue",'M',"metal",50,"rectangle");
		System.out.println("const with args");
	}
	KeyChain(String color)
	{
		this.color=color;
		System.out.println("\n Const with args:"+color);
	}
	KeyChain(String color,char size)
	{
		this(color);
		this.size=size;
		System.out.println("\n Const with args:"+color+","+size);

	}
	KeyChain(String color,char size,String type)
	{
		this(color,size);
		this.type=type;
		System.out.println("\n Const with args:"+color+","+size+","+type);

	}
	KeyChain(String color,char size,String type,double cost)
	{
		this(color,size,type);
		this.cost=cost;
		System.out.println("\n Const with args:"+color+","+size+","+type+","+cost);
	}
	KeyChain(String color,char size,String type,double cost,String shape)
	{
		this(color,size,type,cost);
		this.shape=shape;
		System.out.println("\n Const with args:"+color+","+size+","+type+","+cost+","+shape);
	}

}