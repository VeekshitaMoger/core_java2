class KeyboardStart
{
	public static void main(String [] args)
	{
		System.out.println("\n Starting of the KeyboardStart");
		
		Keyboard keyboard=new Keyboard();
		System.out.println("The brand of the keyboard:"+keyboard.brand);
		System.out.println("The color of the keyboard:"+keyboard.color);
		System.out.println("The number of keys of the keyboard:"+keyboard.noOfKeys);
        System.out.println("The type of the keyboard:"+keyboard.type);
        System.out.println("The cost of the keyboard:"+keyboard.cost);
		
		Keyboard keyboard1=new Keyboard("Apple");
		System.out.println("The brand of the keyboard1 is :"+keyboard1.brand);
		System.out.println("The color of the keyboard1 is :"+keyboard1.color);
		System.out.println("The number of keys of the keyboard1 is :"+keyboard1.noOfKeys);
        System.out.println("The type of the keyboard1 is :"+keyboard1.type);
        System.out.println("The cost of the keyboard1 is :"+keyboard1.cost);
		
		Keyboard keyboard2=new Keyboard("Lenovo","Black");
		System.out.println("The brand of the keyboard2 is :"+keyboard2.brand);
		System.out.println("The color of the keyboard2 is :"+keyboard2.color);
		System.out.println("The number of keys of the keyboard2 is :"+keyboard2.noOfKeys);
        System.out.println("The type of the keyboard2 is :"+keyboard2.type);
        System.out.println("The cost of the keyboard2 is:"+keyboard2.cost);
		
		Keyboard keyboard3=new Keyboard(80,"White");
		System.out.println("The brand of the keyboard3 is :"+keyboard3.brand);
		System.out.println("The color of the keyboard3 is :"+keyboard3.color);
		System.out.println("The number of keys of the keyboard3 is :"+keyboard3.noOfKeys);
        System.out.println("The type of the keyboard3 is :"+keyboard3.type);
        System.out.println("The cost of the keyboard3 is :"+keyboard3.cost);
		
		Keyboard keyboard4=new Keyboard("Standard",80);
		System.out.println(" The brand of the keyboard4 is :"+keyboard4.brand);
		System.out.println("The color of the keyboard4 is :"+keyboard4.color);
		System.out.println("The number of keys of the keyboard4 is :"+keyboard4.noOfKeys);
        System.out.println("The type of the keyboard4 is :"+keyboard4.type);
        System.out.println("The cost of the keyboard4 is :"+keyboard4.cost);
		
		Keyboard keyboard5=new Keyboard(300);
		System.out.println("The brand of the keyboard5 is :"+keyboard5.brand);
		System.out.println("The color of the keyboard5 is :"+keyboard5.color);
		System.out.println("The number of keys of the keyboard5 is :"+keyboard5.noOfKeys);
        System.out.println("The type of the keyboard5 is :"+keyboard5.type);
        System.out.println("The cost of the keyboard5 is :"+keyboard5.cost);
		
		
		System.out.println("\n Ending of the KeyboardStart");
	}
}