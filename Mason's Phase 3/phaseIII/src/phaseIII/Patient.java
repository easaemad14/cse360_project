package phaseIII;
import java.util.ArrayList;
import java.util.Comparator;

public class Patient {
	String userID, password;
	ArrayList<PatientReport> myReports = new ArrayList<PatientReport>(); // Holds all reports
	int UrgencyLevel;
	
	// Default constructor
	public Patient(){
		userID="";
		password="";
		// myReports= null;
		UrgencyLevel = 0;
	}
	
	// Constructor based on inputs
	public Patient(String id, String pass){
		userID = id;
		password = pass;
		// myReports= null;
		UrgencyLevel = 0;
	}
	
	public static Comparator<Patient> urgNum = new Comparator<Patient>(){
		public int compare(Patient p1, Patient p2){
			int u1 = p1.getRecentUrgency();
			int u2 = p2.getRecentUrgency();
			
			return u2 - u1;
			
		}
	};
	

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
	
	public void addReport(PatientReport r) {
		myReports.add(r);
	}
	
	public int getRecentUrgency() {
		PatientReport a = new PatientReport();
		a = myReports.get(myReports.size() - 1);
		return a.getUrgencyLevel();
	}
	
	
}
