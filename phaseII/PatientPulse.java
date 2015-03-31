import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.JTable;


public class PatientPulse {

	private JFrame frame;
	private JLabel nameLabel, passwordLabel, num_label, PH_label;
	private JTextArea username;
	private JPasswordField passwordField;
	private JButton QButton, LogButton, NextButton, SubmitButton, BackButton, DLButton;
	JTextArea comments, commDisplay;
	JScrollPane ComScroll;
	static int num = 5;
	static String name, password, comm;
	private JTable SummaryTable;
	private JTable msgTable, RosterTable, DocMsgTable;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		final JPanel LogIn = new JPanel();
		LogIn.setBackground(Color.GRAY);
		frame.getContentPane().add(LogIn, "name_288188695791748");
		LogIn.setLayout(null);
		LogIn.setVisible(true);

		//---------------------------------------------------------------------------------------------------------------------------
		// Patient Panels
		//---------------------------------------------------------------------------------------------------------------------------

		final JPanel PatientHome = new JPanel();
		PatientHome.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientHome, "name_288191811961256");
		PatientHome.setLayout(null);
		PatientHome.setVisible(false);

		final JPanel RateSymptoms = new JPanel();
		RateSymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(RateSymptoms, "name_290501465782002");
		RateSymptoms.setLayout(null);
		RateSymptoms.setVisible(false);

		final JPanel PatientComments = new JPanel();
		PatientComments.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientComments, "name_360343956653381");
		PatientComments.setLayout(null);
		PatientComments.setVisible(false);

		final JPanel PatientSummary = new JPanel();
		PatientSummary.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientSummary, "name_367953651207343");
		PatientSummary.setLayout(null);
		PatientSummary.setVisible(false);

		final JPanel MsgHistory = new JPanel();
		MsgHistory.setBackground(Color.GRAY);
		frame.getContentPane().add(MsgHistory, "name_384148098599182");
		MsgHistory.setLayout(null);
		MsgHistory.setVisible(false);

		final JPanel Emergency = new JPanel();
		Emergency.setBackground(Color.GRAY);
		frame.getContentPane().add(Emergency, "name_361695070446785");
		Emergency.setLayout(null);
		Emergency.setVisible(false);

		//---------------------------------------------------------------------------------------------------------------------------
		// Doctor Panels
		//---------------------------------------------------------------------------------------------------------------------------

		final JPanel DoctorHome = new JPanel();
		DoctorHome.setBackground(Color.GRAY);
		frame.getContentPane().add(DoctorHome, "name_388462474512077");
		DoctorHome.setLayout(null);
		DoctorHome.setVisible(false);

		final JPanel PatientReport = new JPanel();
		PatientReport.setBackground(Color.GRAY);
		frame.getContentPane().add(PatientReport, "name_391281299215622");
		PatientReport.setLayout(null);
		PatientReport.setVisible(false);

		final JPanel DocMsgHistory = new JPanel();
		DocMsgHistory.setBackground(Color.GRAY);
		frame.getContentPane().add(DocMsgHistory, "name_394677836518050");
		DocMsgHistory.setLayout(null);
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
		Logpanel_2.setBounds(47, 124, 222, 120);
		LogIn.add(Logpanel_2);
		Logpanel_2.setLayout(null);

		JLabel Loglabel_1 = new JLabel("");
		Loglabel_1.setBounds(134, 12, 0, 0);
		Logpanel_2.add(Loglabel_1);

		JLabel label = new JLabel("");
		label.setBounds(139, 12, 0, 0);
		Logpanel_2.add(label);

		// Modify this to Check and Access specific user account based on name and password input!!!!!!!!

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

		passwordField = new JPasswordField();
		passwordField.setBounds(10, 71, 199, 20);
		Logpanel_2.add(passwordField);

		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Quit without submitting your report?");
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
				JOptionPane.showMessageDialog(null, "Welcome to Patient Pulse!!" );

				name = username.getText();
				PH_label.setText(name + "'s Home");
				password = passwordLabel.getText();

				LogIn.setVisible(false);
				// If user is a patient
				PatientHome.setVisible(true);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);

				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
				// If user is a doctor
				//DoctorHome.setVisible(true);
				//PatientHome.setVisible(false);
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
				JOptionPane.showMessageDialog(null, "Starting New Report...");
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(true);
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

		JButton historyButton = new JButton("<html>Report/Message<br><center>History</html>");
		historyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Displaying History...");
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
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
				JOptionPane.showMessageDialog(null, "Accessing Emergency...");
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
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
				JOptionPane.showMessageDialog(null, "Quit without submitting your report?");

				username.setText("");
				passwordField.setText("");

				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
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
		// New Pulse Report: Rate Symptoms

		JPanel RSpanel = new JPanel();
		RSpanel.setBackground(new Color(102, 0, 255));
		RSpanel.setBounds(10, 11, 297, 52);
		RateSymptoms.add(RSpanel);
		RSpanel.setLayout(null);

		JLabel RS_label = new JLabel("New Pulse Report");
		RS_label.setForeground(new Color(255, 255, 255));
		RS_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		RS_label.setHorizontalAlignment(SwingConstants.CENTER);
		RS_label.setBounds(10, 11, 277, 30);
		RSpanel.add(RS_label);

		JPanel mid_panel = new JPanel();
		mid_panel.setBackground(new Color(102, 0, 255));
		mid_panel.setBounds(47, 74, 223, 290);
		RateSymptoms.add(mid_panel);
		mid_panel.setLayout(null);

		JPanel symptoms_panel = new JPanel();
		symptoms_panel.setBounds(10, 11, 203, 40);
		mid_panel.add(symptoms_panel);
		symptoms_panel.setLayout(null);

		//Modify this to display name of symptoms!!!!!!!!!!!!!!!!!!!!!!

		JLabel symptoms_label = new JLabel("Symptoms");
		symptoms_label.setForeground(new Color(102, 0, 255));
		symptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		symptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		symptoms_label.setBounds(0, 0, 203, 40);
		symptoms_panel.add(symptoms_label);

		JPanel rate_panel = new JPanel();
		rate_panel.setBounds(30, 62, 163, 163);
		mid_panel.add(rate_panel);
		rate_panel.setLayout(null);

		num_label = new JLabel("5");
		num_label.setForeground(new Color(102, 0, 255));
		num_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		num_label.setHorizontalAlignment(SwingConstants.CENTER);
		num_label.setBounds(0, 0, 163, 163);
		rate_panel.add(num_label);

		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num > 0) {
					num--;
					num_label.setText("" + num);
				};
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 30));
		minus.setForeground(new Color(102, 0, 255));
		minus.setBounds(30, 236, 65, 43);
		mid_panel.add(minus);

		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(num < 10) {
					num++;
					num_label.setText("" + num);
				};
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 30));
		plus.setForeground(new Color(102, 0, 255));
		plus.setBounds(128, 236, 65, 43);
		mid_panel.add(plus);

		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Quit without submitting your report?");

				num = 5;
				num_label.setText("5");

				username.setText("");
				passwordField.setText("");

				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				RateSymptoms.setVisible(false);
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
		RateSymptoms.add(QButton);

		//Modify this to record values set for each symptoms!!!!!!!!!!!!!

		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(true);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(181, 393, 89, 23);
		RateSymptoms.add(NextButton);

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

		// Modify this to record users' comments!!!!!!!!!!!!!!!!!!!!!!!

		JLabel comments_label = new JLabel("Comments:");
		comments_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		comments_label.setForeground(new Color(255, 255, 255));
		comments_label.setBounds(10, 11, 80, 14);
		Companel.add(comments_label);

		ComScroll = new JScrollPane(comments);
		ComScroll.setBounds(20, 36, 195, 230);
		Companel.add(ComScroll);

		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Quit without submitting your report?");

				username.setText("");
				passwordField.setText("");

				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				RateSymptoms.setVisible(false);
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

				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				PatientSummary.setVisible(true);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);

				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
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

		JScrollPane SummScroll = new JScrollPane();
		SummScroll.setBounds(10, 51, 215, 97);
		SeverityPanel.add(SummScroll);

		// Populate with data from data base!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		SummaryTable = new JTable();
		SummScroll.setViewportView(SummaryTable);

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

		BackButton = new JButton("BACK");
		BackButton.setForeground(new Color(255, 255, 255));
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(true);
				PatientSummary.setVisible(false);
				MsgHistory.setVisible(false);
				Emergency.setVisible(false);

				DoctorHome.setVisible(false);
				DocMsgHistory.setVisible(false);
			}
		});
		BackButton.setBackground(new Color(102, 0, 255));
		BackButton.setBounds(40, 393, 89, 23);
		PatientSummary.add(BackButton);

		SubmitButton = new JButton("SUBMIT");
		SubmitButton.setForeground(new Color(255, 255, 255));
		SubmitButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Report Submitted!" );

				username.setText("");
				passwordField.setText("");

				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
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

		//---------------------------------------------------------------------------------------------------------------------------
		// Message History

		JPanel MHpanel = new JPanel();
		MHpanel.setBackground(new Color(102, 0, 255));
		MHpanel.setBounds(10, 11, 297, 52);
		MsgHistory.add(MHpanel);
		MHpanel.setLayout(null);

		JLabel MH_label = new JLabel("Message History");
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

		JLabel Author_label = new JLabel("AUTHOR");
		Author_label.setForeground(new Color(102, 0, 255));
		Author_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		Author_label.setHorizontalAlignment(SwingConstants.CENTER);
		Author_label.setBounds(0, 0, 128, 29);
		AuthPanel.add(Author_label);

		JPanel DPanel = new JPanel();
		DPanel.setBounds(140, 11, 83, 29);
		msgListPanel.add(DPanel);
		DPanel.setLayout(null);

		JLabel Date_label = new JLabel("DATE");
		Date_label.setForeground(new Color(102, 0, 255));
		Date_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		Date_label.setHorizontalAlignment(SwingConstants.CENTER);
		Date_label.setBounds(0, 0, 83, 29);
		DPanel.add(Date_label);

		JPanel viewPanel = new JPanel();
		viewPanel.setBounds(10, 51, 213, 35);
		msgListPanel.add(viewPanel);
		viewPanel.setLayout(null);

		JLabel viewLabel = new JLabel("<html>Click on a PulseReport or a Doctor<br><center>Message to continue.</html>");
		viewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		viewLabel.setForeground(new Color(102, 0, 255));
		viewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		viewLabel.setBounds(0, 0, 213, 35);
		viewPanel.add(viewLabel);

		JScrollPane msgScroll = new JScrollPane();
		msgScroll.setBounds(10, 97, 213, 192);
		msgListPanel.add(msgScroll);

		// Populate with data from data base!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		msgTable = new JTable();
		msgScroll.setViewportView(msgTable);

		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				username.setText("");
				passwordField.setText("");

				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				RateSymptoms.setVisible(false);
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

		DLButton = new JButton("Download All");
		DLButton.setForeground(new Color(255, 255, 255));
		DLButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Downloading..." );

				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				RateSymptoms.setVisible(false);
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

				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
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

		JScrollPane RosterScroll = new JScrollPane();
		RosterScroll.setBounds(10, 97, 213, 192);
		RosterPanel.add(RosterScroll);

		// Populate with data

		RosterTable = new JTable();
		RosterScroll.setViewportView(RosterTable);

		QButton = new JButton("QUIT");
		QButton.setForeground(new Color(255, 255, 255));
		QButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		QButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				username.setText("");
				passwordField.setText("");

				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
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
		DoctorHome.add(QButton);

		//---------------------------------------------------------------------------------------------------------------------------
		// Patient Report


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

		// Populate with data from data base!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

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
				RateSymptoms.setVisible(false);
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
				RateSymptoms.setVisible(false);
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

		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
