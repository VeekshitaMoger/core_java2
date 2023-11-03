class WalletEnter
{

           public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("Starting of the main");
			
		
			
		 Wallet clock=new Wallet();
			System.out.println("The brand of the Wallet:"+clock.Brand);
			System.out.println("The cost for the Wallet:"+clock.cost);
	        System.out.println("The Warranty for the Wallet:"+clock.warranty);
			System.out.println("The shape of a Wallet:"+clock.shape);
			
			Wallet wallet1=new Wallet("Titan",600);
			System.out.println("The brand of the Wallet is:"+wallet1.Brand);
			System.out.println("The cost for the Wallet:"+wallet1.cost);
	        System.out.println("The Warranty for the Wallet:"+wallet1.warranty);
			System.out.println("The shape of a Wallet:"+wallet1.shape);
			
			Wallet wallet2=new Wallet(550,3);
			System.out.println("The brand of the Wallet is:"+wallet2.Brand);
			System.out.println("The cost for the Wallet is:"+wallet2.cost);
	        System.out.println("The Warranty for the Wallet is:"+wallet2.warranty);
			System.out.println("The shape of a Wallet is :"+wallet2.shape);
			
			Wallet wallet3=new Wallet(3,"oval");
			System.out.println("The brand of the Wallet is:"+wallet3.Brand);
			System.out.println("The cost for the Wallet is:"+wallet3.cost);
	        System.out.println("The Warranty for the Wallet is:"+wallet3.warranty);
			System.out.println("The shape of a Wallet is:"+wallet3.shape);
			
			Wallet wallet4=new Wallet("Rectangle");
			System.out.println("The brand of the Wallet is:"+wallet4.Brand);
			System.out.println("The cost for the Wallet is:"+wallet4.cost);
	        System.out.println("The Warranty for the Wallet is:"+wallet4.warranty);
			System.out.println("The shape of a Wallet is:"+wallet4.shape);
			
		  
	}

}
