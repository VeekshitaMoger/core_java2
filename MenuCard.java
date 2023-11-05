class MenuCard
{
	int noofitems;
	double cost;
	Hotel hotel;
	
	MenuCard()
	{
		System.out.println("no args const");
	}
	MenuCard(int noofitems,double cost,Hotel hotel)
	{
		this.noofitems=noofitems;
		this.cost=cost;
		this.hotel=hotel;
	}
	
	
	
	
	void showInfo()
	{
		System.out.println("Starting of the show info");
		System.out.println("noof items:"+this.noofitems);
		System.out.println("cost items:"+this.cost);
		System.out.println("hotel:"+this.hotel);
        if(this.hotel!=null)
		System.out.println("hotel name:"+this.hotel.name);
		System.out.println("hotel ownername:"+this.hotel.ownername);
	    System.out.println("Starting of the show info");

	}
	
}