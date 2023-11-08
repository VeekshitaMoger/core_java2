class ATM
{
	String bankname="SBI";
	String[] branch;
	String[] acs;
	String[] cctvbrands;
	
	ATM()
	{
		System.out.println("Const with o args:");
	}
	
	void setBranch(String[] branch)
	{
		this.branch=branch;
	}
	void setacs(String[] acs)
	{
		this.acs=acs;
	}
	void setcctvbrands(String[] cctvbrands)
	{
		this.cctvbrands=cctvbrands;
	}
	void showInfo()
	{
		System.out.println("Starting of the Showinfo in Atm");
		System.out.println("Bank name:"+this.bankname);
		System.out.println("Bank name:"+this.branch);
		if(this.branch!=null)
		{
			for(int seq=0;seq<this.branch.length;seq++)
			{
				String ref=this.branch[seq];
				System.out.println("Branches are:"+this.branch[seq]+ " at seq " +seq);
			}
		}
		
		System.out.println("Accounts in bank:"+this.acs);
        if(this.acs!=null)
		{
			for(int seq=0;seq<this.acs.length;seq++)
			{
				String ref=this.acs[seq];
				System.out.println("Number of acs are:"+this.acs[seq]+  " at index " +seq);
			}
		}
		
	System.out.println("CCtv brands:"+this.cctvbrands);
	 if(this.cctvbrands!=null)
		{
			for(int seq=0;seq<this.cctvbrands.length;seq++)
			{
				String ref=this.cctvbrands[seq];
				System.out.println("Number of cctv are:"+this.cctvbrands[seq]+ " at index "+ seq);
			}
		}
		System.out.println("Ending of the Showinfo in Atm");

	}
}