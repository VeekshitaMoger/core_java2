class OrnamentEnter
{
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Starting of the main");
		
        Ornaments ornaments=new Ornaments();
		System.out.println("name of the Ornaments:"+ornaments.type);
		System.out.println("number of the company:"+ornaments.noofcompany);
		System.out.println("Ornaments size is:"+ornaments.size);
		System.out.println("cost of the Ornaments:"+ornaments.cost);
		
		Ornaments ornaments1=new Ornaments("gold");
		System.out.println("name of the ornaments1 is:"+ornaments1.type);
		System.out.println("number of the company:"+ornaments1.noofcompany);
		System.out.println("ornaments1 size is:"+ornaments1.size);
		System.out.println("cost of the ornaments1 is:"+ornaments1.cost);

		
		Ornaments ornaments2=new Ornaments(9);
		System.out.println("name of the ornaments2 is :"+ornaments2.type);
		System.out.println("number of the company:"+ornaments2.noofcompany);
		System.out.println("ornaments2 size is:"+ornaments2.size);
		System.out.println("cost of the ornaments2 is:"+ornaments2.cost);

		
		Ornaments ornaments3=new Ornaments('L');
		System.out.println("name of the rocket3 is :"+ornaments3.type);
		System.out.println("number of the company is:"+ornaments3.noofcompany);
		System.out.println("rocket size is:"+ornaments3.size);
		System.out.println("cost of the rocket3 is:"+ornaments3.cost);

		
		Ornaments ornaments4=new Ornaments(20000);
		System.out.println("name of the rocket4 is :"+ornaments4.type);
		System.out.println("number of the company :"+ornaments4.noofcompany);
		System.out.println("rocket size is:"+ornaments4.size);
		System.out.println("cost of the rocket4 is :"+ornaments4.cost);

		System.out.println("Ending of the main");

		

	}

}
