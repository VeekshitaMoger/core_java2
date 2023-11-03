class ClockEnter
{
	public static void main(String [] args)
	{
		System.out.println("Starting of the main");
		
		Clock clock=new Clock();
		System.out.println("The brand of the clock:"+clock.clockBrand);
		System.out.println("The cost for the clock:"+clock.cost);
        System.out.println("The Warranty for the clock:"+clock.warranty);
		System.out.println("The shape of a clock:"+clock.shape);
		
		Clock clock1=new Clock("EG",600);
		System.out.println("The brand of the clock is:"+clock1.clockBrand);
		System.out.println("The cost for the clock:"+clock1.cost);
        System.out.println("The Warranty for the clock:"+clock1.warranty);
		System.out.println("The shape of a clock:"+clock1.shape);
		
		Clock clock2=new Clock(550,3);
		System.out.println("The brand of the clock2 is:"+clock2.clockBrand);
		System.out.println("The cost for the clock2 is:"+clock2.cost);
        System.out.println("The Warranty for the clock2 is:"+clock2.warranty);
		System.out.println("The shape of a clock2 is :"+clock2.shape);
		
		Clock clock3=new Clock(3,"oval");
		System.out.println("The brand of the clock3 is:"+clock3.clockBrand);
		System.out.println("The cost for the clock3 is:"+clock3.cost);
        System.out.println("The Warranty for the clock3 is:"+clock3.warranty);
		System.out.println("The shape of a clock3 is:"+clock3.shape);
		
		Clock clock4=new Clock("Rectangle");
		System.out.println("The brand of the clock4 is:"+clock4.clockBrand);
		System.out.println("The cost for the clock4 is:"+clock4.cost);
        System.out.println("The Warranty for the clock4 is:"+clock4.warranty);
		System.out.println("The shape of a clock4 is:"+clock4.shape);
		
	    System.out.println("Starting of the main");

		
		
	}
}