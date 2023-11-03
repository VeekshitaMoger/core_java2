class KeyChainStart
{
	public static void main(String [] args)
	{
		System.out.println("Starting of the main method");
		
		KeyChain keychain=new KeyChain();
		System.out.println("Color of the keychain:"+keychain.color);
		System.out.println("Size of the keychain:"+keychain.size);
		System.out.println("type forthe keychain:"+keychain.type);
		System.out.println("cost of the keychain:"+keychain.cost);
	    System.out.println("shape of the keychain:"+keychain.shape);
		
		KeyChain keychain1=new KeyChain("Yellow");
		System.out.println("Color of the keychain:"+keychain1.color);
		System.out.println("Size of the keychain:"+keychain1.size);
		System.out.println("type forthe keychain:"+keychain1.type);
		System.out.println("cost of the keychain:"+keychain1.cost);
	    System.out.println("shape of the keychain:"+keychain1.shape);

		
		KeyChain keychain2=new KeyChain("blue",'M');
		System.out.println("Color of the keychain:"+keychain2.color);
		System.out.println("Size of the keychain:"+keychain2.size);
		System.out.println("type forthe keychain:"+keychain2.type);
		System.out.println("cost of the keychain:"+keychain2.cost);
	    System.out.println("shape of the keychain:"+keychain2.shape);

		
		KeyChain keychain3=new KeyChain("green",'L',"oval");
		System.out.println("Color of the keychain:"+keychain3.color);
		System.out.println("Size of the keychain:"+keychain3.size);
		System.out.println("type forthe keychain:"+keychain3.type);
		System.out.println("cost of the keychain:"+keychain3.cost);
	    System.out.println("shape of the keychain:"+keychain3.shape);
		
		KeyChain keychain4=new KeyChain("grey",'S',"metal",70);
		System.out.println("Color of the keychain:"+keychain4.color);
		System.out.println("Size of the keychain:"+keychain4.size);
		System.out.println("type forthe keychain:"+keychain4.type);
		System.out.println("cost of the keychain:"+keychain4.cost);
	    System.out.println("shape of the keychain:"+keychain4.shape);
		
		KeyChain keychain5=new KeyChain("black",'M',"gold",80,"circle");
		System.out.println("Color of the keychain:"+keychain5.color);
		System.out.println("Size of the keychain:"+keychain5.size);
		System.out.println("type forthe keychain:"+keychain5.type);
		System.out.println("cost of the keychain:"+keychain5.cost);
	    System.out.println("shape of the keychain:"+keychain5.shape);




		
		System.out.println("Ending of the main method");


	}
	
}