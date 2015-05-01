package phaseIII;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
//import java.nio.file.*;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JRadioButton;
//import javax.swing.JToggleButton;


public class PatientPulse {

	private JFrame frame;
	private JLabel nameLabel, passwordLabel, PH_label;
	private JLabel Pnum_label, Denum_label, Nnum_label, Anum_label, Drnum_label;
	private JTextArea username, passwordField;
	//private JPasswordField passwordField;
	private JButton QButton, LogButton, NextButton, SubmitButton; //,BackButton, DLButton, 
	private JButton minus, plus, pat1, pat2;
	private JTextArea comments, commDisplay, DRcommDisplay, DisplayRate, DrDisplayRate, commD;
	private JScrollPane ComScroll;
	static int num = 5;
	static int Pain, Depression, Nausea, Anxiety, Drowsiness;
	static String name, password, comm, symptoms, SymptomsRate, ratesum;
	//private JTable msgTable; //,RosterTable;
	private ButtonGroup type = new ButtonGroup();
	static int uType = 0;
	
	static Doctor d1 = new Doctor("Mike Te", "m");
	static Patient p1 = new Patient("Mason Denney", "m");
	static Patient p2 = new Patient("Matt Weser", "m");
	
	Patient currPatient = p1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		d1.addPatient(p1);
		d1.addPatient(p2);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientPulse window = new PatientPulse();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientPulse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		d1.addPatient(p1);
		d1.addPatient(p2);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel LogIn = new JPanel();
		LogIn.setBackground(Color.GRAY);
		frame.getContentPane().add(LogIn, "n");
		LogIn.setLayout(null);
		LogIn.setVisible(true);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Patient
		//---------------------------------------------------------------------------------------------------------------------------
		
		final JPanel PatientHome = new JPanel();
		PatientHome.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientHome, "6");
		PatientHome.setLayout(null);
		PatientHome.setVisible(false);
		
		final JPanel PainSymptoms = new JPanel();
		PainSymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(PainSymptoms, "na2");
		PainSymptoms.setLayout(null);
		PainSymptoms.setVisible(false);
		
		final JPanel DepressionSymptoms = new JPanel();
		DepressionSymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(DepressionSymptoms, "n02");
		DepressionSymptoms.setLayout(null);
		DepressionSymptoms.setVisible(false);
		
		final JPanel NauseaSymptoms = new JPanel();
		NauseaSymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(NauseaSymptoms, "n2");
		NauseaSymptoms.setLayout(null);
		NauseaSymptoms.setVisible(false);
		
		final JPanel AnxietySymptoms = new JPanel();
		AnxietySymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(AnxietySymptoms, "name002");
		AnxietySymptoms.setLayout(null);
		AnxietySymptoms.setVisible(false);
		
		final JPanel DrowsinessSymptoms = new JPanel();
		DrowsinessSymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(DrowsinessSymptoms, "name_290");
		DrowsinessSymptoms.setLayout(null);
		DrowsinessSymptoms.setVisible(false);
		
		final JPanel PatientComments = new JPanel();
		PatientComments.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientComments, "name_360");
		PatientComments.setLayout(null);
		PatientComments.setVisible(false);
		
		final JPanel PatientSummary = new JPanel();
		PatientSummary.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientSummary, "name_36");
		PatientSummary.setLayout(null);
		PatientSummary.setVisible(false);
		
		final JPanel MsgHistory = new JPanel();
		MsgHistory.setBackground(Color.GRAY);
		frame.getContentPane().add(MsgHistory, "name_32");
		MsgHistory.setLayout(null);
		MsgHistory.setVisible(false);
		
		final JPanel Emergency = new JPanel();
		Emergency.setBackground(Color.GRAY);
		frame.getContentPane().add(Emergency, "nme_3");
		Emergency.setLayout(null);
		Emergency.setVisible(false);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Doctor
		//---------------------------------------------------------------------------------------------------------------------------
		
		final JPanel DoctorHome = new JPanel();
		DoctorHome.setBackground(Color.GRAY);
		frame.getContentPane().add(DoctorHome, "n7");
		DoctorHome.setLayout(null);
		DoctorHome.setVisible(false);
		
		final JPanel DocViewPR = new JPanel();
		DocViewPR.setBackground(Color.GRAY);
		frame.getContentPane().add(DocViewPR, "nam2");
		DocViewPR.setLayout(null);
		DocViewPR.setVisible(false);
		
		final JPanel DocMsgHistory = new JPanel();
		DocMsgHistory.setBackground(Color.GRAY);
		frame.getContentPane().add(DocMsgHistory, "name50");
		DocMsgHistory.setLayout(null);
		DocMsgHistory.setVisible(false);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Log In
		
		JPanel titlepanel = new JPanel();
		titlepanel.setBackground(new Color(102, 0, 255));
		titlepanel.setBounds(47, 24, 222, 89);
		LogIn.add(titlepanel);
		titlepanel.setLayout(null);
		
		JPanel Logpanel_1 = new JPanel();
		Logpanel_1.setBackground(new Color(204, 204, 204));
		Logpanel_1.setBounds(31, 11, 160, 67);
		titlepanel.add(Logpanel_1);
		Logpanel_1.setLayout(null);
		
		JLabel titleLabel = new JLabel("Patient Pulse");
		titleLabel.setForeground(new Color(102, 0, 255));
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(10, 11, 140, 45);
		Logpanel_1.add(titleLabel);
		
		JPanel Logpanel_2 = new JPanel();
		Logpanel_2.setBackground(new Color(102, 0, 255));
		Logpanel_2.setBounds(47, 124, 222, 180);
		LogIn.add(Logpanel_2);
		Logpanel_2.setLayout(null);
		
		JLabel Loglabel_1 = new JLabel("");
		Loglabel_1.setBounds(134, 12, 0, 0);
		Logpanel_2.add(Loglabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(139, 12, 0, 0);
		Logpanel_2.add(label);
		
		nameLabel = new JLabel("Full Name:");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLabel.setBounds(10, 12, 90, 14);
		Logpanel_2.add(nameLabel);
		
		username = new JTextArea();
		username.setBounds(10, 25, 199, 22);
		Logpanel_2.add(username);
		
		passwordLabel = new JLabel("Patient Pulse Password:");
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		passwordLabel.setBounds(10, 58, 150, 14);
		Logpanel_2.add(passwordLabel);
		
		//passwordField = new JPasswordField();
		//passwordField.setBounds(10, 71, 199, 20);
		//Logpanel_2.add(passwordField);
		
		passwordField = new JTextArea();
		passwordField.setBounds(10, 71, 199, 20);
		Logpanel_2.add(passwordField);
		
		JLabel lblUserType = new JLabel("User type:");
		lblUserType.setForeground(Color.WHITE);
		lblUserType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUserType.setBounds(10, 102, 150, 14);
		Logpanel_2.add(lblUserType);
		
		JRadioButton PatientRD = new JRadioButton("Patient");
		PatientRD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				uType = 0;
			}
		});
		PatientRD.setForeground(new Color(255, 255, 255));
		PatientRD.setBackground(new Color(102, 0, 255));
		PatientRD.setBounds(10, 120, 109, 23);
		Logpanel_2.add(PatientRD);
		
		JRadioButton DoctorRD = new JRadioButton("Doctor");
		DoctorRD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				uType = 1;
			}
		});
		DoctorRD.setForeground(new Color(255, 255, 255));
		DoctorRD.setBackground(new Color(102, 0, 255));
		DoctorRD.setBounds(10, 146, 109, 23);
		Logpanel_2.add(DoctorRD);
		
		type.add(PatientRD);
		type.add(DoctorRD);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please do not close the application.\n Log in or minimize the window.");
				username.setText("");
				passwordField.setText("");
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		LogIn.add(QButton);
		
		LogButton = new JButton("LOGIN");
		LogButton.setForeground(new Color(255, 255, 255));
		LogButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		LogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				name = username.getText();
				PH_label.setText(name + "'s Home");
				password = passwordField.getText();
				
				// VERIFY USER AUTHENTICATION HERE!!
				LogIn.setVisible(false);
				if(uType == 0)
				{
					int index = d1.findPatient(name);
					
					if(index == -1)
						JOptionPane.showMessageDialog(null, "Incorrect user name!!" );
					else
						if(password.compareTo(d1.getPatient(index).getPassword()) == 0) {
							currPatient = d1.getPatient(index);
							PatientHome.setVisible(true);
							DoctorHome.setVisible(false);
						}
						else
							JOptionPane.showMessageDialog(null, "Incorrect password!!" );
				}
				
				else
				{
					DoctorHome.setVisible(true);
					PatientHome.setVisible(false);
				}
				
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		LogButton.setBackground(new Color(102, 0, 255));
		LogButton.setBounds(180, 373, 89, 23);
		LogIn.add(LogButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Patient's Home
		
		JPanel PHpanel = new JPanel();
		PHpanel.setBackground(new Color(102, 0, 255));
		PHpanel.setBounds(10, 11, 297, 52);
		PatientHome.add(PHpanel);
		PHpanel.setLayout(null);
		
		PH_label = new JLabel();
		PH_label.setForeground(new Color(255, 255, 255));
		PH_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		PH_label.setHorizontalAlignment(SwingConstants.CENTER);
		PH_label.setBounds(10, 11, 277, 30);
		PHpanel.add(PH_label);
		
		JPanel newRepPanel = new JPanel();
		newRepPanel.setBackground(new Color(102, 0, 255));
		newRepPanel.setBounds(36, 74, 246, 75);
		PatientHome.add(newRepPanel);
		newRepPanel.setLayout(null);
		
		JButton newRepButton = new JButton("<html><center>Send New<br>Pulse Report</html>");
		newRepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				///////////////////////////////////////// RESET ///////////////////////////////////////////////////
				num=5;
				Pain=5; Depression=5; Nausea=5; Anxiety=5; Drowsiness=5;
				Pnum_label.setText("5"); Denum_label.setText("5"); Nnum_label.setText("5"); 
				Anum_label.setText("5");Drnum_label.setText("5");
				
				username.setText("");
				passwordField.setText("");
				
				comments.setText("");
				comm="";
				///////////////////////////////////////// RESET //////////////////////////////////////////////////
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(true);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		newRepButton.setForeground(new Color(102, 0, 255));
		newRepButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		newRepButton.setBounds(30, 11, 180, 53);
		newRepPanel.add(newRepButton);
		
		JPanel historyPanel = new JPanel();
		historyPanel.setBackground(new Color(102, 0, 255));
		historyPanel.setBounds(36, 174, 246, 75);
		PatientHome.add(historyPanel);
		historyPanel.setLayout(null);
		
		JButton historyButton = new JButton("<html>Most Recent<br><center>Report</html>");
		historyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				String old;
				int yy=0;
				StringBuilder temp = new StringBuilder();
				
				int recentPain=currPatient.getRecentReport().getPainLevel();
				int recentDep=currPatient.getRecentReport().getDepressionLevel();
				int recentNausea=currPatient.getRecentReport().getNauseaLevel();
				int recentAnx=currPatient.getRecentReport().getAnxietyLevel();
				int recentDrow=currPatient.getRecentReport().getDrowsinessLevel();
//				String reccent = "Pain: "+recentPain+"\nDepression: "+recentDep+"\nNausea: "+recentNausea+"\nAnxiety: "
//						+recentAnx+"\nDrowsiness: "+recentDrow+"\n\nComments:\n"+currPatient.getRecentReport().getComment();
				
				for(yy=0; yy<currPatient.getNumReports(); yy++){
					recentPain=currPatient.getReport(yy).getPainLevel();
					recentDep=currPatient.getReport(yy).getDepressionLevel();
					recentNausea=currPatient.getReport(yy).getNauseaLevel();
					recentAnx=currPatient.getReport(yy).getAnxietyLevel();
					recentDrow=currPatient.getReport(yy).getDrowsinessLevel();
					old = "ReportNum: "+(yy+1) +"\nPain: "+recentPain+"\nDepression: "+recentDep+"\nNausea: "+recentNausea+"\nAnxiety: "
							+recentAnx+"\nDrowsiness: "+recentDrow+"\n\nComments:\n"+currPatient.getReport(yy).getComment();
					temp.append(old + "\n\n");
				}
				commD.setText(temp.toString() );
				
				
				//commD.setText("FIRST REPORT:\n"+old+"\n\n\n\nRECENT REPORT:\n"+reccent);
				
				

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(true);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		historyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		historyButton.setForeground(new Color(102, 0, 255));
		historyButton.setBounds(30, 11, 180, 53);
		historyPanel.add(historyButton);
		
		JPanel EmergencyPanel = new JPanel();
		EmergencyPanel.setBackground(new Color(102, 0, 255));
		EmergencyPanel.setBounds(36, 274, 246, 75);
		PatientHome.add(EmergencyPanel);
		EmergencyPanel.setLayout(null);
		
		JButton EmergencyButton = new JButton("EMERGENCY");
		EmergencyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(true);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		EmergencyButton.setForeground(new Color(102, 0, 255));
		EmergencyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		EmergencyButton.setBounds(30, 11, 180, 53);
		EmergencyPanel.add(EmergencyButton);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(46, 393, 89, 23);
		PatientHome.add(QButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Pain Symptoms
		
		JPanel Painpanel = new JPanel();
		Painpanel.setBackground(new Color(102, 0, 255));
		Painpanel.setBounds(10, 11, 297, 52);
		PainSymptoms.add(Painpanel);
		Painpanel.setLayout(null);
		
		JLabel PRS_label = new JLabel("New Pulse Report");
		PRS_label.setForeground(new Color(255, 255, 255));
		PRS_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		PRS_label.setHorizontalAlignment(SwingConstants.CENTER);
		PRS_label.setBounds(10, 11, 277, 30);
		Painpanel.add(PRS_label);
		
		JPanel Pmid_panel = new JPanel();
		Pmid_panel.setBackground(new Color(102, 0, 255));
		Pmid_panel.setBounds(47, 74, 223, 290);
		PainSymptoms.add(Pmid_panel);
		Pmid_panel.setLayout(null);
		
		JPanel Psymptoms_panel = new JPanel();
		Psymptoms_panel.setBounds(10, 11, 203, 40);
		Pmid_panel.add(Psymptoms_panel);
		Psymptoms_panel.setLayout(null);
		
		JLabel Psymptoms_label = new JLabel("Pain");
		Psymptoms_label.setForeground(new Color(102, 0, 255));
		Psymptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		Psymptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		Psymptoms_label.setBounds(0, 0, 203, 40);
		Psymptoms_panel.add(Psymptoms_label);
		
		JPanel Prate_panel = new JPanel();
		Prate_panel.setBounds(30, 62, 163, 163);
		Pmid_panel.add(Prate_panel);
		Prate_panel.setLayout(null);
		
		Pnum_label = new JLabel("5");
		Pnum_label.setForeground(new Color(102, 0, 255));
		Pnum_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Pnum_label.setHorizontalAlignment(SwingConstants.CENTER);
		Pnum_label.setBounds(0, 0, 163, 163);
		Prate_panel.add(Pnum_label);
		
		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num > 0) {
					num--;
					Pnum_label.setText("" + num);
				};
				Pain = num;
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		minus.setForeground(new Color(102, 0, 255));
		minus.setBounds(30, 236, 65, 43);
		Pmid_panel.add(minus);
		
		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num < 10) {
					num++;
					Pnum_label.setText("" + num);
				};
				Pain = num;
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		plus.setForeground(new Color(102, 0, 255));
		plus.setBounds(128, 236, 65, 43);
		Pmid_panel.add(plus);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num = 5;
				Pnum_label.setText("5");
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 393, 89, 23);
		PainSymptoms.add(QButton);
			
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Pain = num;
			
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(true);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				num = 5;
				Pnum_label.setText("5");
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(181, 393, 89, 23);
		PainSymptoms.add(NextButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Depression Symptoms
				
		JPanel Depressionpanel = new JPanel();
		Depressionpanel.setBackground(new Color(102, 0, 255));
		Depressionpanel.setBounds(10, 11, 297, 52);
		DepressionSymptoms.add(Depressionpanel);
		Depressionpanel.setLayout(null);
				
		JLabel DeRS_label = new JLabel("New Pulse Report");
		DeRS_label.setForeground(new Color(255, 255, 255));
		DeRS_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		DeRS_label.setHorizontalAlignment(SwingConstants.CENTER);
		DeRS_label.setBounds(10, 11, 277, 30);
		Depressionpanel.add(DeRS_label);
				
		JPanel Demid_panel = new JPanel();
		Demid_panel.setBackground(new Color(102, 0, 255));
		Demid_panel.setBounds(47, 74, 223, 290);
		DepressionSymptoms.add(Demid_panel);
		Demid_panel.setLayout(null);
				
		JPanel Desymptoms_panel = new JPanel();
		Desymptoms_panel.setBounds(10, 11, 203, 40);
		Demid_panel.add(Desymptoms_panel);
		Desymptoms_panel.setLayout(null);
				
		//Modify this to display name of symptoms!!!!!!!!!!!!!!!!!!!!!!
		
		JLabel Desymptoms_label = new JLabel("Depression");
		Desymptoms_label.setForeground(new Color(102, 0, 255));
		Desymptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		Desymptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		Desymptoms_label.setBounds(0, 0, 203, 40);
		Desymptoms_panel.add(Desymptoms_label);
				
		JPanel Derate_panel = new JPanel();
		Derate_panel.setBounds(30, 62, 163, 163);
		Demid_panel.add(Derate_panel);
		Derate_panel.setLayout(null);
				
		Denum_label = new JLabel("5");
		Denum_label.setForeground(new Color(102, 0, 255));
		Denum_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Denum_label.setHorizontalAlignment(SwingConstants.CENTER);
		Denum_label.setBounds(0, 0, 163, 163);
		Derate_panel.add(Denum_label);
				
		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num > 0) {
					num--;
					Denum_label.setText("" + num);
				};
				Depression = num;
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		minus.setForeground(new Color(102, 0, 255));
		minus.setBounds(30, 236, 65, 43);
		Demid_panel.add(minus);
				
		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num < 10) {
					num++;
					Denum_label.setText("" + num);
				};
				Depression = num;
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		plus.setForeground(new Color(102, 0, 255));
		plus.setBounds(128, 236, 65, 43);
		Demid_panel.add(plus);
				
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num = 5;
				Denum_label.setText("5");
						
				username.setText("");
				passwordField.setText("");
						
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
						
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 393, 89, 23);
		DepressionSymptoms.add(QButton);
				
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				Depression = num;
			
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(true);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				num = 5;
				Pnum_label.setText("5");
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(181, 393, 89, 23);
		DepressionSymptoms.add(NextButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Nausea Symptoms
		
		JPanel Nauseapanel = new JPanel();
		Nauseapanel.setBackground(new Color(102, 0, 255));
		Nauseapanel.setBounds(10, 11, 297, 52);
		NauseaSymptoms.add(Nauseapanel);
		Nauseapanel.setLayout(null);
		
		JLabel NRS_label = new JLabel("New Pulse Report");
		NRS_label.setForeground(new Color(255, 255, 255));
		NRS_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		NRS_label.setHorizontalAlignment(SwingConstants.CENTER);
		NRS_label.setBounds(10, 11, 277, 30);
		Nauseapanel.add(NRS_label);
		
		JPanel Nmid_panel = new JPanel();
		Nmid_panel.setBackground(new Color(102, 0, 255));
		Nmid_panel.setBounds(47, 74, 223, 290);
		NauseaSymptoms.add(Nmid_panel);
		Nmid_panel.setLayout(null);
		
		JPanel Nsymptoms_panel = new JPanel();
		Nsymptoms_panel.setBounds(10, 11, 203, 40);
		Nmid_panel.add(Nsymptoms_panel);
		Nsymptoms_panel.setLayout(null);
		
		JLabel Nsymptoms_label = new JLabel("Nausea");
		Nsymptoms_label.setForeground(new Color(102, 0, 255));
		Nsymptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		Nsymptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		Nsymptoms_label.setBounds(0, 0, 203, 40);
		Nsymptoms_panel.add(Nsymptoms_label);
		
		JPanel Nrate_panel = new JPanel();
		Nrate_panel.setBounds(30, 62, 163, 163);
		Nmid_panel.add(Nrate_panel);
		Nrate_panel.setLayout(null);
		
		Nnum_label = new JLabel("5");
		Nnum_label.setForeground(new Color(102, 0, 255));
		Nnum_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Nnum_label.setHorizontalAlignment(SwingConstants.CENTER);
		Nnum_label.setBounds(0, 0, 163, 163);
		Nrate_panel.add(Nnum_label);
		
		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num > 0) {
					num--;
					Nnum_label.setText("" + num);
				};
				Nausea = num;
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		minus.setForeground(new Color(102, 0, 255));
		minus.setBounds(30, 236, 65, 43);
		Nmid_panel.add(minus);
		
		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num < 10) {
					num++;
					Nnum_label.setText("" + num);
				};
				Nausea = num;
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		plus.setForeground(new Color(102, 0, 255));
		plus.setBounds(128, 236, 65, 43);
		Nmid_panel.add(plus);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num = 5;
				Nnum_label.setText("5");
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 393, 89, 23);
		NauseaSymptoms.add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				Nausea = num;
				
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(true);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				num = 5;
				Pnum_label.setText("5");
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(181, 393, 89, 23);
		NauseaSymptoms.add(NextButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Anxiety Symptoms
		
		JPanel Anxietypanel = new JPanel();
		Anxietypanel.setBackground(new Color(102, 0, 255));
		Anxietypanel.setBounds(10, 11, 297, 52);
		AnxietySymptoms.add(Anxietypanel);
		Anxietypanel.setLayout(null);
		
		JLabel ARS_label = new JLabel("New Pulse Report");
		ARS_label.setForeground(new Color(255, 255, 255));
		ARS_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		ARS_label.setHorizontalAlignment(SwingConstants.CENTER);
		ARS_label.setBounds(10, 11, 277, 30);
		Anxietypanel.add(ARS_label);
		
		JPanel Amid_panel = new JPanel();
		Amid_panel.setBackground(new Color(102, 0, 255));
		Amid_panel.setBounds(47, 74, 223, 290);
		AnxietySymptoms.add(Amid_panel);
		Amid_panel.setLayout(null);
		
		JPanel Asymptoms_panel = new JPanel();
		Asymptoms_panel.setBounds(10, 11, 203, 40);
		Amid_panel.add(Asymptoms_panel);
		Asymptoms_panel.setLayout(null);
		
		JLabel Asymptoms_label = new JLabel("Anxiety");
		Asymptoms_label.setForeground(new Color(102, 0, 255));
		Asymptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		Asymptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		Asymptoms_label.setBounds(0, 0, 203, 40);
		Asymptoms_panel.add(Asymptoms_label);
		
		JPanel Arate_panel = new JPanel();
		Arate_panel.setBounds(30, 62, 163, 163);
		Amid_panel.add(Arate_panel);
		Arate_panel.setLayout(null);
		
		Anum_label = new JLabel("5");
		Anum_label.setForeground(new Color(102, 0, 255));
		Anum_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Anum_label.setHorizontalAlignment(SwingConstants.CENTER);
		Anum_label.setBounds(0, 0, 163, 163);
		Arate_panel.add(Anum_label);
		
		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num > 0) {
					num--;
					Anum_label.setText("" + num);
				};
				Anxiety = num;
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		minus.setForeground(new Color(102, 0, 255));
		minus.setBounds(30, 236, 65, 43);
		Amid_panel.add(minus);
		
		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num < 10) {
					num++;
					Anum_label.setText("" + num);
				};
				Anxiety = num;
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		plus.setForeground(new Color(102, 0, 255));
		plus.setBounds(128, 236, 65, 43);
		Amid_panel.add(plus);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num = 5;
				Anum_label.setText("5");
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 393, 89, 23);
		AnxietySymptoms.add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Anxiety = num;
					
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(true);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				num = 5;
				Pnum_label.setText("5");
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(181, 393, 89, 23);
		AnxietySymptoms.add(NextButton);
				
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Drowsiness Symptoms
		
		JPanel Drowsinesspanel = new JPanel();
		Drowsinesspanel.setBackground(new Color(102, 0, 255));
		Drowsinesspanel.setBounds(10, 11, 297, 52);
		DrowsinessSymptoms.add(Drowsinesspanel);
		Drowsinesspanel.setLayout(null);
		
		JLabel DrRS_label = new JLabel("New Pulse Report");
		DrRS_label.setForeground(new Color(255, 255, 255));
		DrRS_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		DrRS_label.setHorizontalAlignment(SwingConstants.CENTER);
		DrRS_label.setBounds(10, 11, 277, 30);
		Drowsinesspanel.add(DrRS_label);
		
		JPanel Drmid_panel = new JPanel();
		Drmid_panel.setBackground(new Color(102, 0, 255));
		Drmid_panel.setBounds(47, 74, 223, 290);
		DrowsinessSymptoms.add(Drmid_panel);
		Drmid_panel.setLayout(null);
		
		JPanel Drsymptoms_panel = new JPanel();
		Drsymptoms_panel.setBounds(10, 11, 203, 40);
		Drmid_panel.add(Drsymptoms_panel);
		Drsymptoms_panel.setLayout(null);
		
		JLabel Drsymptoms_label = new JLabel("Drowsiness");
		Drsymptoms_label.setForeground(new Color(102, 0, 255));
		Drsymptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		Drsymptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		Drsymptoms_label.setBounds(0, 0, 203, 40);
		Drsymptoms_panel.add(Drsymptoms_label);
		
		JPanel Drrate_panel = new JPanel();
		Drrate_panel.setBounds(30, 62, 163, 163);
		Drmid_panel.add(Drrate_panel);
		Drrate_panel.setLayout(null);
		
		Drnum_label = new JLabel("5");
		Drnum_label.setForeground(new Color(102, 0, 255));
		Drnum_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		Drnum_label.setHorizontalAlignment(SwingConstants.CENTER);
		Drnum_label.setBounds(0, 0, 163, 163);
		Drrate_panel.add(Drnum_label);
		
		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num > 0) {
					num--;
					Drnum_label.setText("" + num);
				};
				Drowsiness = num;
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		minus.setForeground(new Color(102, 0, 255));
		minus.setBounds(30, 236, 65, 43);
		Drmid_panel.add(minus);
		
		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num < 10) {
					num++;
					Drnum_label.setText("" + num);
				};
				Drowsiness = num;
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		plus.setForeground(new Color(102, 0, 255));
		plus.setBounds(128, 236, 65, 43);
		Drmid_panel.add(plus);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num = 5;
				Drnum_label.setText("5");
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 393, 89, 23);
		DrowsinessSymptoms.add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Drowsiness = num;
					
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(true);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				num = 5;
				Pnum_label.setText("5");
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(181, 393, 89, 23);
		DrowsinessSymptoms.add(NextButton);
		
//////////////// THIS IS THE END OF ALL THE SYMPTOMS PANELS!  //////////////////////////
				
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Comments
		
		JPanel CHpanel = new JPanel();
		CHpanel.setBackground(new Color(102, 0, 255));
		CHpanel.setBounds(10, 11, 297, 52);
		PatientComments.add(CHpanel);
		CHpanel.setLayout(null);
		
		JLabel header_label = new JLabel("New Pulse Report");
		header_label.setForeground(new Color(255, 255, 255));
		header_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		header_label.setHorizontalAlignment(SwingConstants.CENTER);
		header_label.setBounds(10, 11, 277, 30);
		CHpanel.add(header_label);
		
		JPanel Companel = new JPanel();
		Companel.setBackground(new Color(102, 0, 255));
		Companel.setBounds(40, 74, 235, 290);
		PatientComments.add(Companel);
		Companel.setLayout(null);
		
		comments = new JTextArea();
		comments.setBounds(10, 40, 215, 225);
		Companel.add(comments);
		
		JLabel comments_label = new JLabel("Comments:");
		comments_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		comments_label.setForeground(new Color(255, 255, 255));
		comments_label.setBounds(10, 11, 80, 14);
		Companel.add(comments_label);
		
		// Modify this to record users' comments!!!!!!!!!!!!!!!!!!!!!!!		
		ComScroll = new JScrollPane(comments);
		ComScroll.setBounds(20, 36, 195, 230);
		Companel.add(ComScroll);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				//comm = "";
				//commDisplay.setText(comm);
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(49, 393, 89, 23);
		PatientComments.add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				comm = comments.getText();
				commDisplay.setText(comm);
				DRcommDisplay.setText(comm);
				
				ratesum = "Pain\t\t" + Pain + "\n" + "Depression\t\t" + Depression + "\n" + "Nausea\t\t" + Nausea + "\n" + "Anxiety\t\t" + Anxiety + "\n" + "Drowsiness\t\t" + Drowsiness;
				DisplayRate.setText(ratesum);
				DrDisplayRate.setText(ratesum);
				
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(true);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				
				//comm = "";
				//commDisplay.setText(comm);
							
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(180, 393, 89, 23);
		PatientComments.add(NextButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Patient Summary
		
		JPanel PSpanel = new JPanel();
		PSpanel.setBackground(new Color(102, 0, 255));
		PSpanel.setBounds(10, 11, 297, 52);
		PatientSummary.add(PSpanel);
		PSpanel.setLayout(null);
		header_label = new JLabel("New Pulse Report");
		header_label.setForeground(new Color(255, 255, 255));
		header_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		header_label.setHorizontalAlignment(SwingConstants.CENTER);
		header_label.setBounds(10, 11, 277, 30);
		PSpanel.add(header_label);
		
		JPanel SeverityPanel = new JPanel();
		SeverityPanel.setBackground(new Color(102, 0, 255));
		SeverityPanel.setBounds(40, 74, 235, 159);
		PatientSummary.add(SeverityPanel);
		SeverityPanel.setLayout(null);
		
		JPanel THSymPanel = new JPanel();
		THSymPanel.setBounds(10, 11, 120, 27);
		SeverityPanel.add(THSymPanel);
		THSymPanel.setLayout(null);
		JLabel sympLabel = new JLabel("Symptom");
		sympLabel.setForeground(new Color(102, 0, 255));
		sympLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sympLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sympLabel.setBounds(0, 0, 120, 27);
		THSymPanel.add(sympLabel);
		
		JPanel THSevPanel = new JPanel();
		THSevPanel.setBounds(135, 11, 90, 27);
		SeverityPanel.add(THSevPanel);
		THSevPanel.setLayout(null);
		JLabel SevLabel = new JLabel("Severity");
		SevLabel.setForeground(new Color(102, 0, 255));
		SevLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SevLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SevLabel.setBounds(0, 0, 90, 27);
		THSevPanel.add(SevLabel);
		
		DisplayRate = new JTextArea();
		DisplayRate.setBounds(10, 51, 215, 97);
		DisplayRate.setEditable(false);
		SeverityPanel.add(DisplayRate);
		
		JScrollPane RatescrollPane = new JScrollPane(DisplayRate);
		RatescrollPane.setBounds(10, 49, 215, 99);
		SeverityPanel.add(RatescrollPane);
		
		//
		JPanel CommentsPanel = new JPanel();
		CommentsPanel.setBackground(new Color(102, 0, 255));
		CommentsPanel.setBounds(40, 244, 235, 138);
		PatientSummary.add(CommentsPanel);
		CommentsPanel.setLayout(null);
		
		comments_label = new JLabel("Comments:");
		comments_label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comments_label.setForeground(new Color(255, 255, 255));
		comments_label.setBounds(10, 11, 80, 17);
		CommentsPanel.add(comments_label);
		
		commDisplay = new JTextArea();
		commDisplay.setBounds(20, 26, 195, 90);
		commDisplay.setEditable(false);
		CommentsPanel.add(commDisplay);
		
		JScrollPane CommDispScroll = new JScrollPane(commDisplay);
		CommDispScroll.setBounds(20, 26, 195, 90);
		CommentsPanel.add(CommDispScroll);

		SubmitButton = new JButton("SUBMIT");
		SubmitButton.setForeground(new Color(255, 255, 255));
		SubmitButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Report Submitted!" );
				
//REPORT SUBMISSION
				PatientReport px = new PatientReport(Pain,Depression,Nausea,Anxiety,Drowsiness);
				px.setCommentString(commDisplay.getText());
				px.calculateUrgency();
				currPatient.addReport(px);
//REPORT SUBMISSION
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				
				
			}
		});
		SubmitButton.setBackground(new Color(102, 0, 255));
		SubmitButton.setBounds(187, 393, 89, 23);
		PatientSummary.add(SubmitButton);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(49, 393, 89, 23);
		PatientSummary.add(QButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Message History
		
		JPanel MHpanel = new JPanel();
		MHpanel.setBackground(new Color(102, 0, 255));
		MHpanel.setBounds(10, 11, 297, 52);
		MsgHistory.add(MHpanel);
		MHpanel.setLayout(null);
		
		JLabel MH_label = new JLabel("Report History");
		MH_label.setForeground(new Color(255, 255, 255));
		MH_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		MH_label.setHorizontalAlignment(SwingConstants.CENTER);
		MH_label.setBounds(10, 11, 277, 30);
		MHpanel.add(MH_label);
		
		JPanel msgListPanel = new JPanel();
		msgListPanel.setBackground(new Color(102, 0, 255));
		msgListPanel.setBounds(43, 74, 233, 300);
		MsgHistory.add(msgListPanel);
		msgListPanel.setLayout(null);
		
		JPanel AuthPanel = new JPanel();
		AuthPanel.setBounds(10, 11, 128, 29);
		msgListPanel.add(AuthPanel);
		AuthPanel.setLayout(null);
		
		JLabel Author_label = new JLabel("Symptom");
		Author_label.setForeground(new Color(102, 0, 255));
		Author_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		Author_label.setHorizontalAlignment(SwingConstants.CENTER);
		Author_label.setBounds(0, 0, 128, 29);
		AuthPanel.add(Author_label);
		
		JPanel DPanel = new JPanel();
		DPanel.setBounds(140, 11, 83, 29);
		msgListPanel.add(DPanel);
		DPanel.setLayout(null);
		
		JLabel Date_label = new JLabel("Level");
		Date_label.setForeground(new Color(102, 0, 255));
		Date_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		Date_label.setHorizontalAlignment(SwingConstants.CENTER);
		Date_label.setBounds(0, 0, 83, 29);
		DPanel.add(Date_label);
		
		JPanel viewPanel = new JPanel();
		viewPanel.setBounds(10, 51, 213, 35);
		msgListPanel.add(viewPanel);
		viewPanel.setLayout(null);
		
		JLabel viewLabel = new JLabel("Below is the most recent report");
		viewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		viewLabel.setForeground(new Color(102, 0, 255));
		viewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		viewLabel.setBounds(0, 0, 213, 35);
		viewPanel.add(viewLabel);
		
		//
		JPanel CMMTPanel = new JPanel();
		CMMTPanel.setBounds(10, 97, 213, 192);
		msgListPanel.add(CMMTPanel);
		CMMTPanel.setLayout(null);
		
		commD = new JTextArea();
		commD.setBounds(10, 10, 150, 100);
		commD.setEditable(false);
		CMMTPanel.add(commD);
		
		JScrollPane CommDScroll = new JScrollPane(commD);
		CommDScroll.setBounds(10, 10, 180,170);
		CMMTPanel.add(CommDScroll);
		//
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(45, 393, 89, 23);
		MsgHistory.add(QButton);
		/*	
		DLButton = new JButton("Download All");
		DLButton.setForeground(new Color(255, 255, 255));
		DLButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Downloading..." );
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				
			}
		});
		DLButton.setBackground(new Color(102, 0, 255));
		DLButton.setBounds(171, 393, 105, 23);
		MsgHistory.add(DLButton);
		 */	
		
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Emergency
		
		JPanel Emerpanel = new JPanel();
		Emerpanel.setBackground(new Color(102, 0, 255));
		Emerpanel.setBounds(10, 11, 297, 52);
		Emergency.add(Emerpanel);
		Emerpanel.setLayout(null);
		
		JLabel Elabel = new JLabel("EMERGENCY");
		Elabel.setForeground(new Color(255, 255, 255));
		Elabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		Elabel.setHorizontalAlignment(SwingConstants.CENTER);
		Elabel.setBounds(10, 11, 277, 30);
		Emerpanel.add(Elabel);
		
		JPanel call911 = new JPanel();
		call911.setBackground(new Color(102, 0, 255));
		call911.setBounds(36, 74, 246, 75);
		Emergency.add(call911);
		call911.setLayout(null);
		
		JButton call911_button = new JButton("CALL 911");
		call911_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Calling 911...");
			}
		});
		call911_button.setForeground(new Color(102, 0, 255));
		call911_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		call911_button.setBounds(30, 11, 180, 53);
		call911.add(call911_button);
		
		JPanel calldoc = new JPanel();
		calldoc.setBackground(new Color(102, 0, 255));
		calldoc.setBounds(36, 174, 246, 75);
		Emergency.add(calldoc);
		calldoc.setLayout(null);
		
		JButton calldoc_button = new JButton("<html>CALL YOUR<br><center>DOCTOR</html>");
		calldoc_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Calling your doctor...");
			}
		});
		calldoc_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		calldoc_button.setForeground(new Color(102, 0, 255));
		calldoc_button.setBounds(30, 11, 180, 53);
		calldoc.add(calldoc_button);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		Emergency.add(QButton);

		
		//---------------------------------------------------------------------------------------------------------------------------
		// Doctor's Home
		
		JPanel DHpanel = new JPanel();
		DHpanel.setBackground(new Color(102, 0, 255));
		DHpanel.setBounds(10, 11, 297, 52);
		DoctorHome.add(DHpanel);
		DHpanel.setLayout(null);
		
		JLabel DH_label = new JLabel("Patient Roster");
		DH_label.setForeground(new Color(255, 255, 255));
		DH_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		DH_label.setHorizontalAlignment(SwingConstants.CENTER);
		DH_label.setBounds(10, 11, 277, 30);
		DHpanel.add(DH_label);
		
		JPanel RosterPanel = new JPanel();
		RosterPanel.setBackground(new Color(102, 0, 255));
		RosterPanel.setBounds(43, 74, 233, 300);
		DoctorHome.add(RosterPanel);
		RosterPanel.setLayout(null);
		
		JPanel PNamePanel = new JPanel();
		PNamePanel.setBounds(10, 11, 126, 29);
		RosterPanel.add(PNamePanel);
		PNamePanel.setLayout(null);
		
		JLabel PName_label = new JLabel("Name");
		PName_label.setForeground(new Color(102, 0, 255));
		PName_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		PName_label.setHorizontalAlignment(SwingConstants.CENTER);
		PName_label.setBounds(0, 0, 126, 29);
		PNamePanel.add(PName_label);
		
		JPanel UrgencyPanel = new JPanel();
		UrgencyPanel.setBounds(140, 11, 83, 29);
		RosterPanel.add(UrgencyPanel);
		UrgencyPanel.setLayout(null);
		
		JLabel Urg_label = new JLabel("Urgency");
		Urg_label.setForeground(new Color(102, 0, 255));
		Urg_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		Urg_label.setHorizontalAlignment(SwingConstants.CENTER);
		Urg_label.setBounds(0, 0, 83, 29);
		UrgencyPanel.add(Urg_label);
		
		JPanel InsPanel = new JPanel();
		InsPanel.setBounds(10, 51, 213, 35);
		RosterPanel.add(InsPanel);
		InsPanel.setLayout(null);
		
		JLabel InsLabel = new JLabel("<html>Click on a patient name to see their<br><center>details and messages.</html>");
		InsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		InsLabel.setForeground(new Color(102, 0, 255));
		InsLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		InsLabel.setBounds(0, 0, 213, 35);
		InsPanel.add(InsLabel);
		
		////////////////////New Stuff/////////////////////////		
		JPanel patlistpanel = new JPanel();
		patlistpanel.setBounds(10, 97, 213, 192);
		RosterPanel.add(patlistpanel);
		patlistpanel.setLayout(null);
		
		pat1 = new JButton("P1: "+p1.getUserID()+"  "+p1.getRecentUrgency());
		pat1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Accessing Patient1 record...");
				currPatient = p1;
				
				String old;
				int yy=0;
				StringBuilder temp = new StringBuilder();
				
				int recentPain=currPatient.getRecentReport().getPainLevel();
				int recentDep=currPatient.getRecentReport().getDepressionLevel();
				int recentNausea=currPatient.getRecentReport().getNauseaLevel();
				int recentAnx=currPatient.getRecentReport().getAnxietyLevel();
				int recentDrow=currPatient.getRecentReport().getDrowsinessLevel();
//				String reccent = "Pain: "+recentPain+"\nDepression: "+recentDep+"\nNausea: "+recentNausea+"\nAnxiety: "
//						+recentAnx+"\nDrowsiness: "+recentDrow+"\n\nComments:\n"+currPatient.getRecentReport().getComment();
				
				for(yy=0; yy<currPatient.getNumReports(); yy++){
					recentPain=currPatient.getReport(yy).getPainLevel();
					recentDep=currPatient.getReport(yy).getDepressionLevel();
					recentNausea=currPatient.getReport(yy).getNauseaLevel();
					recentAnx=currPatient.getReport(yy).getAnxietyLevel();
					recentDrow=currPatient.getReport(yy).getDrowsinessLevel();
					old = "ReportNum: "+(yy+1) +"\nPain: "+recentPain+"\nDepression: "+recentDep+"\nNausea: "+recentNausea+"\nAnxiety: "
							+recentAnx+"\nDrowsiness: "+recentDrow+"\n\nComments:\n"+currPatient.getReport(yy).getComment();
					temp.append(old + "\n\n");
				}
				DRcommDisplay.setText(temp.toString() );		/////////////////////
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				DocViewPR.setVisible(true);
			}
		});
		//pat1.setBounds(10, 11, 193, 35);
		patlistpanel.add(pat1);
		
		pat2 = new JButton("P2: "+p2.getUserID()+"  "+p2.getRecentUrgency());
		pat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Accessing Patient2 record...");
				currPatient = p2;
				
				String old;
				int yy=0;
				StringBuilder temp = new StringBuilder();
				
				int recentPain=currPatient.getRecentReport().getPainLevel();
				int recentDep=currPatient.getRecentReport().getDepressionLevel();
				int recentNausea=currPatient.getRecentReport().getNauseaLevel();
				int recentAnx=currPatient.getRecentReport().getAnxietyLevel();
				int recentDrow=currPatient.getRecentReport().getDrowsinessLevel();
//				String reccent = "Pain: "+recentPain+"\nDepression: "+recentDep+"\nNausea: "+recentNausea+"\nAnxiety: "
//						+recentAnx+"\nDrowsiness: "+recentDrow+"\n\nComments:\n"+currPatient.getRecentReport().getComment();
				
				for(yy=0; yy<currPatient.getNumReports(); yy++){
					recentPain=currPatient.getReport(yy).getPainLevel();
					recentDep=currPatient.getReport(yy).getDepressionLevel();
					recentNausea=currPatient.getReport(yy).getNauseaLevel();
					recentAnx=currPatient.getReport(yy).getAnxietyLevel();
					recentDrow=currPatient.getReport(yy).getDrowsinessLevel();
					old = "ReportNum: "+(yy+1) +"\nPain: "+recentPain+"\nDepression: "+recentDep+"\nNausea: "+recentNausea+"\nAnxiety: "
							+recentAnx+"\nDrowsiness: "+recentDrow+"\n\nComments:\n"+currPatient.getReport(yy).getComment();
					temp.append(old + "\n\n");
				}
				DRcommDisplay.setText(temp.toString() );		/////////////////////
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				DocViewPR.setVisible(true);
			}
		});
		
		//pat2.setBounds(10, 50, 193, 35);
		patlistpanel.add(pat2);
		
		if(p1.getRecentUrgency() - p2.getRecentUrgency() >= 0)
		{
			pat1.setBounds(10, 11, 193, 35);
			pat2.setBounds(10, 50, 193, 35);
		}
		
		else
		{
			pat2.setBounds(10, 11, 193, 35);
			pat1.setBounds(10, 50, 193, 35);
		}
		//////////////// New Stuff ///////////////		
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				DocViewPR.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(45, 393, 89, 23);
		DoctorHome.add(QButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Doctor view Patient Report
				
		JPanel DVPRpanel = new JPanel();
		DVPRpanel.setBackground(new Color(102, 0, 255));
		DVPRpanel.setBounds(10, 11, 297, 52);
		DocViewPR.add(DVPRpanel);
		DVPRpanel.setLayout(null);
		
		header_label = new JLabel("Patient's Report");
		header_label.setForeground(new Color(255, 255, 255));
		header_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		header_label.setHorizontalAlignment(SwingConstants.CENTER);
		header_label.setBounds(10, 11, 277, 30);
		DVPRpanel.add(header_label);
		
		JPanel DrSeverityPanel = new JPanel();
		DrSeverityPanel.setBackground(new Color(102, 0, 255));
		DrSeverityPanel.setBounds(40, 74, 235, 159);
		DocViewPR.add(DrSeverityPanel);
		DrSeverityPanel.setLayout(null);
		
		JPanel DrTHSymPanel = new JPanel();
		DrTHSymPanel.setBounds(10, 11, 120, 27);
		DrSeverityPanel.add(DrTHSymPanel);
		DrTHSymPanel.setLayout(null);
		JLabel DrsympLabel = new JLabel("Symptom");
		DrsympLabel.setForeground(new Color(102, 0, 255));
		DrsympLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DrsympLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DrsympLabel.setBounds(0, 0, 120, 27);
		DrTHSymPanel.add(DrsympLabel);
		
		JPanel DrTHSevPanel = new JPanel();
		DrTHSevPanel.setBounds(135, 11, 90, 27);
		DrSeverityPanel.add(DrTHSevPanel);
		DrTHSevPanel.setLayout(null);
		JLabel DrSevLabel = new JLabel("Severity");
		DrSevLabel.setForeground(new Color(102, 0, 255));
		DrSevLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DrSevLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DrSevLabel.setBounds(0, 0, 90, 27);
		DrTHSevPanel.add(DrSevLabel);
		
		DrDisplayRate = new JTextArea();
		DrDisplayRate.setBounds(10, 51, 215, 97);
		DrDisplayRate.setEditable(false);
		SeverityPanel.add(DrDisplayRate);
		
		JScrollPane DrRatescrollPane = new JScrollPane(DrDisplayRate);
		DrRatescrollPane.setBounds(10, 49, 215, 99);
		DrSeverityPanel.add(DrRatescrollPane);
		
		
		JPanel DrCommentsPanel = new JPanel();
		DrCommentsPanel.setBackground(new Color(102, 0, 255));
		DrCommentsPanel.setBounds(40, 244, 235, 138);
		DocViewPR.add(DrCommentsPanel);
		DrCommentsPanel.setLayout(null);
		
		comments_label = new JLabel("Comments:");
		comments_label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comments_label.setForeground(new Color(255, 255, 255));
		comments_label.setBounds(10, 11, 80, 17);
		CommentsPanel.add(comments_label);
		
		DRcommDisplay = new JTextArea();
		DRcommDisplay.setBounds(20, 26, 195, 90);
		DRcommDisplay.setEditable(false);
		CommentsPanel.add(DRcommDisplay);
		
		JScrollPane DrCommDispScroll = new JScrollPane(DRcommDisplay);
		DrCommDispScroll.setBounds(20, 26, 195, 90);
		DrCommentsPanel.add(DrCommDispScroll);
		

		
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(true);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(45, 393, 89, 23);
		DocViewPR.add(QButton);
		/*		
		//---------------------------------------------------------------------------------------------------------------------------
		// Doctor's Message History
		
		JPanel DMHpanel = new JPanel();
		DMHpanel.setBackground(new Color(102, 0, 255));
		DMHpanel.setBounds(10, 11, 297, 52);
		DocMsgHistory.add(DMHpanel);
		DMHpanel.setLayout(null);
		
		JLabel DMH_label = new JLabel("Message History");
		DMH_label.setForeground(new Color(255, 255, 255));
		DMH_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		DMH_label.setHorizontalAlignment(SwingConstants.CENTER);
		DMH_label.setBounds(10, 11, 277, 30);
		DMHpanel.add(DMH_label);
		
		JPanel DocMsgPanel = new JPanel();
		DocMsgPanel.setBackground(new Color(102, 0, 255));
		DocMsgPanel.setBounds(43, 74, 233, 300);
		DocMsgHistory.add(DocMsgPanel);
		DocMsgPanel.setLayout(null);
		
		JPanel DocAuthPanel = new JPanel();
		DocAuthPanel.setBounds(10, 11, 128, 29);
		DocMsgPanel.add(DocAuthPanel);
		DocAuthPanel.setLayout(null);
		
		JLabel DocAuth_label = new JLabel("AUTHOR");
		DocAuth_label.setForeground(new Color(102, 0, 255));
		DocAuth_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		DocAuth_label.setHorizontalAlignment(SwingConstants.CENTER);
		DocAuth_label.setBounds(0, 0, 128, 29);
		DocAuthPanel.add(DocAuth_label);
		
		JPanel DocDatePanel = new JPanel();
		DocDatePanel.setBounds(140, 11, 83, 29);
		DocMsgPanel.add(DocDatePanel);
		DocDatePanel.setLayout(null);
		
		JLabel DocD_label = new JLabel("DATE");
		DocD_label.setForeground(new Color(102, 0, 255));
		DocD_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		DocD_label.setHorizontalAlignment(SwingConstants.CENTER);
		DocD_label.setBounds(0, 0, 83, 29);
		DocDatePanel.add(DocD_label);
		
		JPanel DocViewPanel = new JPanel();
		DocViewPanel.setBounds(10, 51, 213, 35);
		DocMsgPanel.add(DocViewPanel);
		DocViewPanel.setLayout(null);
		
		JLabel DocVLabel = new JLabel("<html>Click on one of your PulseReport<br><center>Message to continue.</html>");
		DocVLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DocVLabel.setForeground(new Color(102, 0, 255));
		DocVLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DocVLabel.setBounds(0, 0, 213, 35);
		DocViewPanel.add(DocVLabel);
		
		JScrollPane DocMsgScroll = new JScrollPane();
		DocMsgScroll.setBounds(10, 97, 213, 192);
		DocMsgPanel.add(DocMsgScroll);
		
		DocMsgTable = new JTable();
		DocMsgScroll.setViewportView(DocMsgTable);
		
		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				username.setText("");
				passwordField.setText("");
				
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(true);
				DocMsgHistory.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(45, 393, 89, 23);
		DocMsgHistory.add(QButton);
		
		DLButton = new JButton("Download All");
		DLButton.setForeground(new Color(255, 255, 255));
		DLButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Downloading..." );
				
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				PainSymptoms.setVisible(false);
				DepressionSymptoms.setVisible(false);
				NauseaSymptoms.setVisible(false);
				AnxietySymptoms.setVisible(false);
				DrowsinessSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
				
				DoctorHome.setVisible(true);
				DocMsgHistory.setVisible(false);
			}
		});
		DLButton.setBackground(new Color(102, 0, 255));
		DLButton.setBounds(171, 393, 105, 23);
		DocMsgHistory.add(DLButton);
		 */	
		
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
