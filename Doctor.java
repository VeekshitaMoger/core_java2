class Doctor
{
	String name;
	int exp;
	boolean fake;
	double fees;
	Clinic clinic;
	
   Doctor(String name,int exp,boolean fake,double fees,Clinic clinic)
	
	{
		this.name=name;
		this.exp=exp;
		this.fake=fake;
		this.fees=fees;
		this.clinic=clinic;
		
	}
	
	void showInfo()
	{
		System.out.println("Starting of the show info");
		System.out.println("Nmae of the doctors:"+this.name);
		System.out.println("Experience of the doctors:"+this.exp);
	    System.out.println("doctor is fake or not:"+this.fake);
		System.out.println("Experience of the doctors:"+this.exp);
        System.out.println("clinic"+this.clinic);
       
	   if(clinic!=null)
		System.out.println("Specialization:"+this.clinic.Specialization);
		System.out.println("Total beds:"+this.clinic.totalbeds);
		System.out.println("Total beds:"+this.clinic.totalpatients);

	    System.out.println("Starting of the show info");
	}
	
}