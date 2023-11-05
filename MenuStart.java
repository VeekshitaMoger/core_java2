class MenuStart

{
	public static void main(String []args)
	{
		System.out.println("Starting main in SpeakerStart");
		Hotel hotel=new Hotel();
		hotel.setHotel("vani","madhu");
        MenuCard menucard=new MenuCard(100,500,hotel);
		menucard.showInfo();
		System.out.println("Starting main in SpeakerStart");
    
		
	}
}