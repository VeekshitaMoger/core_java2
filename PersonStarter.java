class PersonStarter
{
	public static void main(String []args)
	{
		System.out.println("Starting of the main method");
		Email[] emailArray=new Email[3];
		emailArray[0]=new Email("gmail.com",121,"niti","mgr");
		emailArray[1]=new Email("gmail.com",110,"shmbu","MS");
		emailArray[2]=new Email("yahoo.com",114,"Vishu","mgr");
		Person person=new Person("Veekshita moger",emailArray);
		person.showInfo();
        System.out.println("Ending of the main method");

	}
}