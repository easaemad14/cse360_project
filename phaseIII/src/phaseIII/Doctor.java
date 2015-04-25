package phaseIII;

public class Doctor {
	String userID;
	String password;
	String name;
	String officePhoneNumber;
	String personalPhoneNumber;
	String hospital;
	String department;
	//ArrayList<patient> patientList
	
	public Doctor(){
		userID="0";
		password="password";
		officePhoneNumber = "555-555-5555";
		personalPhoneNumber = "555-555-5555";
		hospital = "Generic Hospital";
		department = "Generic Department";
		//patientList = NULL;
	}
	
	void printPatientReport(){
		System.out.println("THIS IS THE REPORT");
	}
	
	//getSymptom
	
	//void patientUrgencySort(ArrayList<patient>){}
	
}

