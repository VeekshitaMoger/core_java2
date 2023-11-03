class Wallet
{
String Brand;
	double cost;
	int warranty;
	String shape;
	
	Wallet()
	{
		super();
		System.out.println("\n Constructors without args");
		
	}
	Wallet(String clockBrand,double cost)
	{
		super();
		this.Brand=Brand;
		this.cost=cost;
		System.out.println("\n Constructor args is:"+Brand+","+cost);
	}
	Wallet(double cost,int warranty)
	{
		super();
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("\n Constructor args is:"+cost+","+warranty);
	}
	Wallet(int warranty,String shape)
	{
		super();
		this.warranty=warranty;
		this.shape=shape;
		System.out.println("\n Constructor args is:"+warranty+","+shape);
	}
	Wallet(String shape)
	{
		super();
		this.shape=shape;
		System.out.println("\n Constructor args is:"+shape);
	}
}
