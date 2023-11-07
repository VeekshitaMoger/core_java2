class Email
{
	String domain;
	int id;
	String fname;
	String lastname;
	
	Email(String domain,int id,String fname,String lastname)
	{
		this.domain=domain;
		this.id=id;
		this.fname=fname;
		this.lastname=lastname;
	}
	void showInfo()
	{
		System.out.println("Starting of showinfo in email");
		System.out.println("Email domain is:"+this.domain);
		System.out.println("Email id is:"+this.id);
		System.out.println("Email fanme is:"+this.fname);
		System.out.println("Email lst name is:"+this.lastname);

	    System.out.println("Ending of showinfo in email");

	}
}