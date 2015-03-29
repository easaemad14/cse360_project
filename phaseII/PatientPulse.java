import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextArea;
//import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;


public class PatientPulse {

	private JFrame frame;
	private JPanel LogIn, PatientHome;
	private JLabel nameLabel, passwordLabel;
	private JPasswordField passwordField;
	private JButton QButton, LogButton;
	

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
		
		JPanel RateSymptoms = new JPanel();
		RateSymptoms.setBackground(Color.GRAY);
		frame.getContentPane().add(RateSymptoms, "name_290501465782002");
		RateSymptoms.setLayout(null);
		RateSymptoms.setVisible(false);
		
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
				JOptionPane.showMessageDialog(null, "BYE!");
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
				PatientHome.setVisible(true);
				LogIn.setVisible(false);
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
				JOptionPane.showMessageDialog(null, "BYE!");
			}
		});
		
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		frame.getContentPane().add(QButton);
		
		//---------------------------------------------------------------------------------------------------------------------------
		// New Pulse Report: Rate Symptoms
		
		
		
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
