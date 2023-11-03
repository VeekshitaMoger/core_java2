class Keyboard
{
	String brand="Industry";
	String color="blue";
	int noOfKeys;
	String type;
	double cost;
	
	
Keyboard()
{
	System.out.println("\n constructor with no args ");
}

Keyboard(String brand)
{
	this.brand=brand;
	System.out.println("\n constructor with  args:"+brand);
	
}
Keyboard(String brand,String color)
{
    this.brand=brand;
	this.color=color;
   System.out.println("\n Constructor with args:"+brand+","+color);
   
}
Keyboard(int noOfKeys,String color)
{
	this.noOfKeys=noOfKeys;
	this.color=color;
	System.out.println("\n Constructors with args:"+noOfKeys+","+color);
	
}
Keyboard(String type,int noOfKeys)
{
	this.type=type;
	this.noOfKeys=noOfKeys;
	System.out.println("\n Constructor with args:"+type+","+noOfKeys);
	
}
Keyboard(double cost)
{
	this.cost=cost;
	System.out.println("\n Constructor with args"+cost);
}


}