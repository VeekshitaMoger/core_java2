class RocketEnter
{
	public static void main(String [] args)
	{
		System.out.println("Starting of the main");
		
		Rocket rocket=new Rocket();
		System.out.println("name of the rocket:"+rocket.name);
		System.out.println("number of the company:"+rocket.noofcompany);
		System.out.println("rocket size is:"+rocket.size);
		System.out.println("cost of the rocket:"+rocket.cost);
		
		Rocket rocket1=new Rocket("AS-1");
		System.out.println("name of the rocket1 is:"+rocket1.name);
		System.out.println("number of the company:"+rocket1.noofcompany);
		System.out.println("rocket size is:"+rocket1.size);
		System.out.println("cost of the rocket1 is:"+rocket1.cost);

		
		Rocket rocket2=new Rocket(9);
		System.out.println("name of the rocket2 is :"+rocket2.name);
		System.out.println("number of the company:"+rocket2.noofcompany);
		System.out.println("rocket size is:"+rocket2.size);
		System.out.println("cost of the rocket2 is:"+rocket2.cost);

		
		Rocket rocket3=new Rocket('L');
		System.out.println("name of the rocket3 is :"+rocket3.name);
		System.out.println("number of the company is:"+rocket3.noofcompany);
		System.out.println("rocket size is:"+rocket3.size);
		System.out.println("cost of the rocket3 is:"+rocket3.cost);

		
		Rocket rocket4=new Rocket(20000);
		System.out.println("name of the rocket4 is :"+rocket4.name);
		System.out.println("number of the company :"+rocket4.noofcompany);
		System.out.println("rocket size is:"+rocket4.size);
		System.out.println("cost of the rocket4 is :"+rocket4.cost);

		System.out.println("Ending of the main");

		
		
	}
}