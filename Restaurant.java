class Restaurant
{
	String ownername;
	String[] splitems;
	
	Restaurant(String ownername)
	{
		this.ownername=ownername;
		System.out.println("Const with String args");
	}
	
	void setsplitems(String[] splitems)
	{
		this.splitems=splitems;
	}
	void showInfo()
	{
		System.out.println("Start Show info in resturant");
		System.out.println("owner name:"+this.ownername);
		System.out.println("spl item"+this.splitems);
		if(this.splitems!=null)
		{
			for(int seq=0;seq<splitems.length;seq++)
			{
				String ref=this.splitems[seq];
				System.out.println("spl items are:"+this.splitems[seq]+ "at seq"+seq);
			}
		}
		System.out.println("End Show info in resturant");

	}
	
}