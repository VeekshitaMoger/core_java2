class Course
{
	String name;
	long fees;
	String location;
	long pincode;
	String sirname;
	char teaching;
	String technology;
	
	Course(String name,long fees,String location,long pincode,String sirname,char teaching,String technology)
	{
		this.name=name;
		this.fees=fees;
		this.location=location;
		this.pincode=pincode;
		this.sirname=sirname;
		this.teaching=teaching;
		this.technology=technology;
		System.out.println("Const with args:"+name+","+fees+","+location+","+pincode+","+sirname+","+teaching+","+technology);
	}
	void display()
	{
		
		System.out.println("Starting of display function");
		System.out.println("Course name:"+name);
		System.out.println("Course fees:"+fees);
		System.out.println("location:"+location);
		System.out.println("pincode:"+pincode);
		System.out.println("Sir name:"+sirname);
		System.out.println("Teaching is good or bad:"+teaching);
		System.out.println("Technology:"+technology);
		
		System.out.println("ending of display function");
	}
}