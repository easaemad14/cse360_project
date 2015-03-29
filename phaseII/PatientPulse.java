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


public class PatientPulse {

	private JFrame frame;
	//private JPanel LogIn, PatientHome, RSpanel;
	private JLabel nameLabel, passwordLabel, num_label;
	private JPasswordField passwordField;
	private JButton QButton, LogButton, NextButton;
	JTextArea comments;
	JScrollPane ComScroll;
	static int num = 5;
	

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
		
		final JPanel Emergency = new JPanel();
		Emergency.setBackground(Color.GRAY);
		frame.getContentPane().add(Emergency, "name_361695070446785");
		Emergency.setLayout(null);
		Emergency.setVisible(false);
		
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
		
		nameLabel = new JLabel("Full Name:");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLabel.setBounds(10, 12, 90, 14);
		Logpanel_2.add(nameLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 25, 199, 22);
		Logpanel_2.add(textArea);
		
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
				JOptionPane.showMessageDialog(null, "Welcome to Patient Pulse" );
				LogIn.setVisible(false);
				PatientHome.setVisible(true);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		LogButton.setBackground(new Color(102, 0, 255));
		LogButton.setBounds(180, 373, 89, 23);
		LogIn.add(LogButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Patient Home
		
		JPanel PHpanel = new JPanel();
		PHpanel.setBackground(new Color(102, 0, 255));
		PHpanel.setBounds(10, 11, 297, 52);
		PatientHome.add(PHpanel);
		PHpanel.setLayout(null);
		
		JLabel PH_label = new JLabel("Patient's Name Home"); //Change this to display the Patient's name
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
				JOptionPane.showMessageDialog(null, "Initializing blank form...");
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(true);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
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
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(true);
				Emergency.setVisible(false);
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
				RateSymptoms.setVisible(true);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(true);
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
				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
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
		
		JLabel symptoms_label = new JLabel("Symptoms"); //Change to name of symptoms
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
				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		RateSymptoms.add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Next..." );
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(true);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(180, 373, 89, 23);
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
		
		//Learn Document Listener for patient summary
		//Document ComDoc = comments.getDocument();
		
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
				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		PatientComments.add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Next..." );
				LogIn.setVisible(false);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(true);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(180, 373, 89, 23);
		PatientComments.add(NextButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Patient Summary
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Message History
		
		//---------------------------------------------------------------------------------------------------------------------------
		// Emergency
		
		JPanel Emerpanel = new JPanel();
		Emerpanel.setBackground(new Color(102, 0, 255));
		Emerpanel.setBounds(10, 11, 297, 52);
		Emergency.add(Emerpanel);
		Emerpanel.setLayout(null);
		
		header_label = new JLabel("EMERGENCY");
		header_label.setForeground(new Color(255, 255, 255));
		header_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		header_label.setHorizontalAlignment(SwingConstants.CENTER);
		header_label.setBounds(10, 11, 277, 30);
		Emerpanel.add(header_label);
		
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
				JOptionPane.showMessageDialog(null, "Quit without submitting your report?");
				LogIn.setVisible(true);
				PatientHome.setVisible(false);
				RateSymptoms.setVisible(false);
				PatientComments.setVisible(false);
				//PatientSummary.setVisible(false);
				//MsgHistory.setVisible(false);
				Emergency.setVisible(false);
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		Emergency.add(QButton);
		
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
