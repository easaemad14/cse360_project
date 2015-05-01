package phaseIII;
import java.util.ArrayList;
import java.util.Collections;

public class Doctor {
	String userID;
	String password;
	ArrayList<Patient> patientList = new ArrayList<Patient>(); // Will hold patients
	
	// Default constructor
	public Doctor(){
		userID = "0";
		password = "password";
		// patientList = null;
	}
	
	//  Constructor based on input
	public Doctor(String id, String pass){
		userID = id;
		password = pass;
		// patientList = null;
	}
	
	public int findPatient(String x) {
		int i;
		for(i = 0; i < patientList.size(); i++) {
			if(patientList.get(i).getUserID().compareTo(x) == 0)
				return i;
		}
		return -1;
	}
	
	public void addPatient(Patient x) {
		patientList.add(x);
	}
	
	public Patient getPatient(int x) {
		return patientList.get(x);
	}
	//
	void orderPatientReport(){
		Collections.sort(patientList, Patient.urgNum);
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String id) {
		userID = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		password = pass;	
	}
	
	
}

