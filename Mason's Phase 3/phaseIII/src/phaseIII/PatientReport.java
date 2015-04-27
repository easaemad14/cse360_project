package phaseIII;

public class PatientReport {
	int painLevel, depressionLevel, nauseaLevel, anxietyLevel, drowsinessLevel;
	int urgencyLevel;
	String commentString;
	
	// Default constructor
	public PatientReport() {
		painLevel= 0;
		depressionLevel = 0;
		nauseaLevel = 0;
		anxietyLevel = 0;
		drowsinessLevel = 0;
		urgencyLevel = 0;
		commentString = "";
	}
	
	// Constructor based on input
	public PatientReport(int pain, int dep, int naus, int anx, int drow){
		painLevel = pain;
		depressionLevel = dep;
		nauseaLevel = naus;
		anxietyLevel = anx;
		drowsinessLevel = drow;
		urgencyLevel = 0;
		commentString = "";
	}
	
	// Averages all five symptoms and returns that average
	public void calculateUrgency(){
		int x;
		x = (this.getPainLevel() + this.getDepressionLevel() + this.getNauseaLevel() +
				this.getAnxietyLevel()+ this.getDrowsinessLevel())/5;
		this.setUrgencyLevel(x);
	}
	
	public void setPainLevel(int pain){
		painLevel = pain;
	}
	
	public int getPainLevel() {
		return painLevel;
	}
	
	public void setDepressionLevel(int dep){
		depressionLevel = dep;
	}
	
	public int getDepressionLevel() {
		return depressionLevel;
	}
	
	public void setNauseaLevel(int naus){
		nauseaLevel = naus;
	}
	
	public int getNauseaLevel() {
		return nauseaLevel;
	}
	
	public void setAnxietyLevel(int anx){
		anxietyLevel = anx;
	}
	
	public int getAnxietyLevel() {
		return anxietyLevel;
	}
	
	public void setDrowsinessLevel(int drow){
		drowsinessLevel = drow;
	}
	
	public int getDrowsinessLevel() {
		return drowsinessLevel;
	}
	
	public void setUrgencyLevel(int urg){
		urgencyLevel = urg;
	}
	
	public int getUrgencyLevel() {
		return urgencyLevel;
	}
	
	public void setCommentString(String comment){
		commentString = comment;
	}
	
	public String getComment(){
		return commentString;
	}
	
}
