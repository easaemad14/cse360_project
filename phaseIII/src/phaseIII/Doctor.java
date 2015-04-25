package phaseIII;
import java.util.ArrayList;

public class Doctor {
	String userID;
	String password;
	String name;
	String officePhoneNumber;
	String personalPhoneNumber;
	String hospital;
	String department;
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
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

