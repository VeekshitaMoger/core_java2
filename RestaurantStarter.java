class RestaurantStarter
{
	public static void main(String []args)
	{
		String[] splitems=new String[5];
		splitems[0]="Pulav";
		splitems[1]="Puliyogare";
		splitems[2]="Biriyani";
		splitems[3]="kabab";
		splitems[4]="pizza";
		
		Restaurant restaurant=new Restaurant("Manju");
		restaurant.setsplitems(splitems);
		restaurant.showInfo();
		
	}
}