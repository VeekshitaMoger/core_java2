class Clock
{
	String clockBrand;
	double cost;
	int warranty;
	String shape;
	
	Clock()
	{
		super();
		System.out.println("\n Constructors without args");
		
	}
	Clock(String clockBrand,double cost)
	{
		super();
		this.clockBrand=clockBrand;
		this.cost=cost;
		System.out.println("\n Constructor args is:"+clockBrand+","+cost);
	}
	Clock(double cost,int warranty)
	{
		super();
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("\n Constructor args is:"+cost+","+warranty);
	}
	Clock(int warranty,String shape)
	{
		super();
		this.warranty=warranty;
		this.shape=shape;
		System.out.println("\n Constructor args is:"+warranty+","+shape);
	}
	Clock(String shape)
	{
		super();
		this.shape=shape;
		System.out.println("\n Constructor args is:"+shape);
	}
	
}