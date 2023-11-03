class BraceletStart
{
	public static void main(String [] args)
	{
		System.out.println("Starting of the main method");
		
		Bracelet bracelet=new Bracelet();
		System.out.println("Color of the bracelet:"+bracelet.color);
		System.out.println("Size of the bracelet:"+bracelet.size);
		System.out.println("type forthe bracelet:"+bracelet.type);
		System.out.println("cost of the bracelet:"+bracelet.cost);
	    System.out.println("shape of the bracelet:"+bracelet.shape);
		
		Bracelet bracelet1=new Bracelet("Yellow");
		System.out.println("Color of the bracelet1:"+bracelet1.color);
		System.out.println("Size of the bracelet1:"+bracelet1.size);
		System.out.println("type forthe bracelet1:"+bracelet1.type);
		System.out.println("cost of the bracelet1:"+bracelet1.cost);
	    System.out.println("shape of the bracelet1:"+bracelet1.shape);

		
		Bracelet bracelet2=new Bracelet("blue",'M');
		System.out.println("Color of the bracelet2:"+bracelet2.color);
		System.out.println("Size of the bracelet2:"+bracelet2.size);
		System.out.println("type forthe bracelet2:"+bracelet2.type);
		System.out.println("cost of the bracelet2:"+bracelet2.cost);
	    System.out.println("shape of the bracelet2:"+bracelet2.shape);

		
		Bracelet bracelet3=new Bracelet("green",'L',"oval");
		System.out.println("Color of the bracelet3:"+bracelet3.color);
		System.out.println("Size of the bracelet3:"+bracelet3.size);
		System.out.println("type forthe bracelet3:"+bracelet3.type);
		System.out.println("cost of the bracelet3:"+bracelet3.cost);
	    System.out.println("shape of the bracelet3:"+bracelet3.shape);
		
		Bracelet bracelet4=new Bracelet("grey",'S',"metal",70);
		System.out.println("Color of the bracelet4:"+bracelet4.color);
		System.out.println("Size of the bracelet4:"+bracelet4.size);
		System.out.println("type forthe bracelet4:"+bracelet4.type);
		System.out.println("cost of the bracelet4:"+bracelet4.cost);
	    System.out.println("shape of the bracelet4:"+bracelet4.shape);
		
		Bracelet bracelet5=new Bracelet("black",'M',"gold",80,"circle");
		System.out.println("Color of the bracelet5:"+bracelet5.color);
		System.out.println("Size of the bracelet5:"+bracelet5.size);
		System.out.println("type forthe bracelet5:"+bracelet5.type);
		System.out.println("cost of the bracelet5:"+bracelet5.cost);
	    System.out.println("shape of the bracelet5:"+bracelet5.shape);

        System.out.println("Ending of the main method");


	}
	
}