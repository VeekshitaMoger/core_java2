class ATMStarter
{
	public static void main(String []args)
	{
		System.out.println("Starting main");
		String[] branch=new String[5];
		branch[0]="BTM";
		branch[1]="Bhannegatta";
		branch[2]="EC";
		branch[3]="Chickete";
		branch[4]="Kormangla";
		
		String[] acs=new String[3];
		acs[0]="FD";
		acs[1]="DD";
		acs[2]="saving";
		
		String[] cctvbrands=new String[5];
		cctvbrands[0]="Philips";
		cctvbrands[1]="LG";
		cctvbrands[0]="bluestar";
		cctvbrands[0]="5G";
		cctvbrands[0]="p";
		
		ATM atm=new ATM();
		atm.setBranch(branch);
		atm.setacs(acs);
		atm.setcctvbrands(cctvbrands);
		atm.showInfo();
		System.out.println("Ending main");

	}
}