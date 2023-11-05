class JobStart
{
	public static void main(String []args)
	{
		
	
		System.out.println("Starting of the main");
		Company company=new Company();
		Job job=new Job("PE",20000,"Nonit",company);

        
       
		job.ShowInfo();
	}
}