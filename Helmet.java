class Helmet
{
	String color;
	double cost;
	int warranty ;
	String shape;
	
	
	
	Helmet()
	{
		this("red",500,1,"Oval");
		System.out.println("\n Const with no args");
	}
	Helmet(String color)
	{
		this.color=color;
		System.out.println("\nConst with args:"+color);
	}
	Helmet(String color,double cost)
	{
		this(color);
		this.cost=cost;
		System.out.println("\n Const with args:"+color+","+cost);

	}
	Helmet(String color,double cost,int warranty)
	{
		this(color,cost);
		this.warranty=warranty;
		System.out.println("\n Const with args:"+color+","+cost+","+warranty);

	}
	Helmet(	String color,double cost,int warranty,String shape)
	{
		this(color,cost,warranty);
		this.shape=shape;
		System.out.println("\nConst with args:"+color+","+cost+","+","+warranty+","+shape);
	}

}