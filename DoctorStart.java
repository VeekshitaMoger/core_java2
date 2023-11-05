class DoctorStart
{
	public static void main(String []args)
	{
		Clinic clinic=new Clinic();
		Doctor doctor=new Doctor("varun",2,true,200,clinic);
         clinic.Specialization="EYE";
		clinic.totalbeds=10;
		clinic.totalpatients=10;
		doctor.showInfo();
	}
}