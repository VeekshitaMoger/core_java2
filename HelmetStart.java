class HelmetStart
{
	public static void main(String [] args)
	{
		System.out.println("Starting of the main method");
		
		Helmet helmet=new Helmet();
		System.out.println("Color of the helmet:"+helmet.color);
		System.out.println("Cost of the helmet:"+helmet.cost);
		System.out.println("Warranty forthe helmet:"+helmet.warranty);
		System.out.println("shape of the helmet:"+helmet.shape);
		
		Helmet helmet2=new Helmet("red");
		System.out.println("Color of the helmet:"+helmet2.color);
		System.out.println("Cost of the helmet:"+helmet2.cost);
		System.out.println("Warranty forthe helmet:"+helmet2.warranty);
		System.out.println("shape of the helmet:"+helmet.shape);
		
		Helmet helmet3=new Helmet("blue",800);
		System.out.println("Color of the helmet:"+helmet3.color);
		System.out.println("Cost of the helmet:"+helmet3.cost);
		System.out.println("Warranty forthe helmet:"+helmet3.warranty);
		System.out.println("shape of the helmet:"+helmet3.shape);
		
		Helmet helmet4=new Helmet("green",500,3);
		System.out.println("Color of the helmet:"+helmet4.color);
		System.out.println("Cost of the helmet:"+helmet4.cost);
		System.out.println("Warranty forthe helmet:"+helmet4.warranty);
		System.out.println("shape of the helmet:"+helmet4.shape);
		
		Helmet helmet5=new Helmet("yellow",600,4,"circle");
		System.out.println("Color of the helmet:"+helmet5.color);
		System.out.println("Cost of the helmet:"+helmet5.cost);
		System.out.println("Warranty forthe helmet:"+helmet5.warranty);
		System.out.println("shape of the helmet:"+helmet5.shape);
		
		System.out.println("Ending of the main method");


	}
	
}