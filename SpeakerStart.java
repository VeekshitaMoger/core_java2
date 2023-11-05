class SpeakerStart

{
	public static void main(String []args)
	{
		System.out.println("Starting main in SpeakerStart");
		Speaker speaker=new Speaker(10);
		Tv tv=new Tv(speaker);
		tv.showInfo();
		System.out.println("Starting main in SpeakerStart");
    
		
	}
}