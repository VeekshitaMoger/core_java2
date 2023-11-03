class MatchboxStart
{
	public static void main(String []args)
	{
		System.out.println("\n Starting main in Matchbox starter");
		Matchbox matchbox=new Matchbox();
		System.out.println("The brand of the matchbox is:"+matchbox.brand);
		System.out.println("The number of sticks in matchbox is:"+matchbox.noOfSticks);
		System.out.println("The length of the matchbox is:"+matchbox.length);
		System.out.println("The cost of the matchbox is:"+matchbox.cost);
		System.out.println("The size of the matchbox is:"+matchbox.size);
		System.out.println("The weight of the matchbox is:"+matchbox.weight);
		System.out.println(" The type of the matchbox is:"+matchbox.type);
		
		Matchbox matchbox1=new Matchbox("Eagle");
		System.out.println("The brand of the matchbox1 is:"+matchbox1.brand);
		System.out.println("The number of sticks matchbox1 is:"+matchbox1.noOfSticks);
		System.out.println("The length of the matchbox1 is:"+matchbox1.length);
		System.out.println("The cost of the matchbox1 is:"+matchbox1.cost);
		System.out.println("The size of the matchbox1 is:"+matchbox1.size);
		System.out.println("The weight of the matchbox1 is:"+matchbox1.weight);
		System.out.println("The type of the matchbox1 is:"+matchbox1.type);
		
		Matchbox matchbox2=new Matchbox("Raj",40);
		System.out.println("The brand of the matchbox2 is:"+matchbox2.brand);
		System.out.println("The noOfSticks of the matchbox2 is:"+matchbox2.noOfSticks);
		System.out.println("The length of the matchbox2 is:"+matchbox2.length);
		System.out.println("The cost of the matchbox2 is:"+matchbox2.cost);
		System.out.println("The size of the matchbox2 is:"+matchbox2.size);
		System.out.println("The weight of the matchbox2 is:"+matchbox2.weight);
		System.out.println("The type of the matchbox2 is:"+matchbox2.type);
		
		Matchbox matchbox3=new Matchbox(11.7,10.0);
		System.out.println("The brand of the matchbox3 is:"+matchbox3.brand);
		System.out.println("The noOfSticks of the matchbox3 is:"+matchbox3.noOfSticks);
		System.out.println("The length of the matchbox3 is:"+matchbox3.length);
		System.out.println("The cost of the matchbox3 is:"+matchbox3.cost);
		System.out.println("The size of the matchbox3 is:"+matchbox3.size);
		System.out.println("The weight of the matchbox3 is:"+matchbox3.weight);
		System.out.println("The type of the matchbox3 is:"+matchbox3.type);
		
		Matchbox matchbox4=new Matchbox(15,'m');
		System.out.println("The brand of the matchbox4 is:"+matchbox4.brand);
		System.out.println("The noOfSticks of the matchbox4 is:"+matchbox4.noOfSticks);
		System.out.println("The length of the matchbox4 is:"+matchbox4.length);
		System.out.println("The cost of the matchbox4 is:"+matchbox4.cost);
		System.out.println("The size of the matchbox4 is:"+matchbox4.size);
		System.out.println("The weight of the matchbox4 is:"+matchbox4.weight);
		System.out.println("The type of the matchbox4 is:"+matchbox4.type);
		
		Matchbox matchbox5=new Matchbox('L',5.5);
		System.out.println("The brand of the matchbox5 is:"+matchbox5.brand);
		System.out.println("The noOfSticks of the matchbox5 is:"+matchbox5.noOfSticks);
		System.out.println("The length of the matchbox5 is:"+matchbox5.length);
		System.out.println("The cost of the matchbox5 is:"+matchbox5.cost);
		System.out.println("The size of the matchbox5 is:"+matchbox5.size);
		System.out.println("The weight of the matchbox5 is:"+matchbox5.weight);
		System.out.println("The type of the matchbox5 is:"+matchbox5.type);
		
		Matchbox matchbox6=new Matchbox(11,"Sticks");
		System.out.println("The brand of the matchbox6 is:"+matchbox6.brand);
		System.out.println("The noOfSticks of the matchbox6 is:"+matchbox6.noOfSticks);
		System.out.println("The length of the matchbox6 is:"+matchbox6.length);
		System.out.println("The cost of the matchbox6 is:"+matchbox6.cost);
		System.out.println("The size of the matchbox6 is:"+matchbox6.size);
		System.out.println("The weight of the matchbox6 is:"+matchbox6.weight);
		System.out.println("The type of the matchbox6 is:"+matchbox6.type);
		
		System.out.println("\n Ending main in Matchbox starter");

	}
}