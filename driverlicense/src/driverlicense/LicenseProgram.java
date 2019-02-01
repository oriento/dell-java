package driverlicense;

public class LicenseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriversLicense dl1 = new DriversLicense();
		DriversLicense dl2 = new DriversLicense();
		DriversLicense dl3 = new DriversLicense();
		
		dl1.setFirstName("John");
		dl1.setLastName("Doe");
		dl1.setDobYYY(1950);
		dl1.setDobMMM(10);
		dl1.setDobDDD(1);
		
		dl2.setFirstName("Jane");
		dl2.setLastName("Doe");
		dl2.setDobYYY(1991);
		dl2.setDobMMM(1);
		dl2.setDobDDD(12);
		
		dl3.setFirstName("Michael");
		dl3.setLastName("Scott");
		dl3.setDobYYY(1960);
		dl3.setDobMMM(4);
		dl3.setDobDDD(13);
		
		System.out.println("Name: "+dl1.getFullName());
		System.out.println("Age: "+ dl1.getAge());
		System.out.println("Name: "+dl2.getFullName());
		System.out.println("Age: "+ dl2.getAge());
		System.out.println("Name: "+dl3.getFullName());
		System.out.println("Age: "+ dl3.getAge());
		

	}

}
