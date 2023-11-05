class Job
{
	String role;
	double salary;
	String type;
	Company company;
	
	Job(String role,double salary,String type,Company company)
	{
		this.role=role;
		this.salary=salary;
		this.type=type;
		this.company=company;
	}
	
	void ShowInfo()
	{
		System.out.println("Starting of the showinfo");	
		
        System.out.println("Role:"+this.role);
		System.out.println("salary for that  role:"+this.salary);
	    System.out.println("type of the company:"+this.type);
        System.out.println("company"+this.company);
       
	   if(company!=null)
		System.out.println("Name:"+this.company.name);
		System.out.println("GST no:"+this.company.gstno);
		System.out.println("location:"+this.company.location);	
		
	    System.out.println("Ending of the showinfo");

	}
}
	
