class Technology
{
	String technology;
	String centername;
	long salary;
	String location;
	long pincode;
	String post;
	char available;
	int nooftrainees;
	String officername;
	int noofstudents;
	String coursename;
	int centerestablishyear;
	
	
	
	Technology(String technology,String centername,long salary,String location,long pincode,String post,char available,int nooftrainees,String officername,int noofstudents,String coursename,int centerestablishyear)
	{
		this.technology=technology;
		this.centername=centername;
		this.salary=salary;
		this.location=location;
		this.pincode=pincode;
		this.post=post;
		this.available=available;
		this.nooftrainees=nooftrainees;
		this.officername=officername;
		this.noofstudents=noofstudents;
		this.coursename=coursename;
		this.centerestablishyear=centerestablishyear;
		System.out.println("Const with args:"+technology+","+centername+","+salary+","+location+","+pincode+","+post+","+available+","+nooftrainees+","+officername+","+noofstudents+","+centername+","+centerestablishyear);
	}
	void display()
	{
		
		System.out.println("Starting of display function");
		System.out.println("Technology:"+technology);
		System.out.println("Center name:"+centername);
		System.out.println("salary:"+salary);
		System.out.println("location:"+location);
		System.out.println("pincode:"+pincode);
		System.out.println("post:"+post);
		System.out.println("placement is avialable or not:"+available);
		System.out.println("No of trainees:"+nooftrainees);
		System.out.println("placement oficer name:"+officername);
        System.out.println("no of students:"+noofstudents);
		System.out.println("course name:"+coursename);
		System.out.println("Center establish year:"+centerestablishyear);
		
		
		System.out.println("ending of display function");
	}
}
