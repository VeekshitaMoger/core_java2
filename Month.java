class Month
{
	String name;
	int noofdays;
	int noofweekends;
	int noofholidays;
	
	Month(String name,int noofdays,int noofweekends,int noofholidays)
	{
		this.name=name;
		this.noofdays=noofdays;
		this.noofweekends=noofweekends;
		this.noofholidays=noofholidays;
		System.out.println("Constructorwith args:"+name+","+noofdays+","+noofweekends+","+noofholidays);
	}
	void display()
	{
		System.out.println("Starting of display function");
		System.out.println("name of the month:"+name);
		System.out.println("no of days:"+noofdays);
		System.out.println("no of weekends:"+noofweekends);
		System.out.println("no of holidays:"+noofholidays);
		System.out.println("ending of display function");
	}
}