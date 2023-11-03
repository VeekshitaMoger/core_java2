class Free 
{
	String coursename;
	long pincode;
	String location;
	String period;
	double timing;
	
	Free(String coursename,long pincode,String location,String period,double timing)
	{
		this.coursename=coursename;
		this.pincode=pincode;
		this.location=location;
		this.period=period;
		this.timing=timing;
		System.out.println("Constructor with args:"+coursename+","+pincode+","+location+","+period+","+timing);
	}
	void displayInfo()
	{
		System.out.println("Starting of display function");
		System.out.println("Free course name:"+coursename);
		System.out.println("pincode:"+pincode);
		System.out.println("location:"+location);
		System.out.println("period"+period);
		System.out.println("Course timings:"+timing);
		System.out.println("ending of display function");


}
}
