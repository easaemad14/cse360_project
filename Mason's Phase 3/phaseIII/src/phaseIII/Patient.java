package phaseIII;
import java.util.ArrayList;

public class Patient {
	String userID,password,name,address,primaryPhoneNumber,secondaryPhoneNumber,hospital,ailment;
	Doctor currentDoctor;
	ArrayList<PatientReport> myReports = new ArrayList<PatientReport>();
	int UrgencyLevel,NauseaLevel,DrowsinessLevel,AnxietyLevel,PainLevel,DepressionLevel;
	
	public Patient(){
		userID="";
		password="";
		name="";
		address="";
		primaryPhoneNumber="";
		secondaryPhoneNumber="";
		hospital="";
		ailment="";
		currentDoctor=null;
		myReports= null;
		UrgencyLevel = 0;
		NauseaLevel = 0;
		DrowsinessLevel=0;
		AnxietyLevel=0;
		PainLevel=0;
		DepressionLevel=0;
	}
	
	PatientReport gatherNewReport(){
		//
		return;
	}
	
	String getCommentHistory(){
		//
	}
	
	int updateLatestSymptom(){
		//
	}
	
	
	void makeEmergencyCall(){
		System.out.print("Calling 911...");
	}
	
}
