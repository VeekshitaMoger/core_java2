class Tv
{
	boolean display=true;
	Speaker speaker;
	
	Tv()
	{
	
    }
	Tv(Speaker speaker)
	{
		this.speaker=speaker;
		System.out.println("Speaker:"+speaker);
     

	}
	
	void showInfo()
	{
		System.out.println("Starting of the display methos:");
		System.out.println("display:"+this.display);
        System.out.println("speaker:"+this.speaker);
		if(this.speaker!=null)
	    System.out.println("speaker:"+this.speaker.maxVal);
         System.out.println("ending of the display methos:");

	}
}