import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PatientHome {

	private JFrame frame;
	private JButton QButton, newRepButton, historyButton, EmergencyButton;
	private JPanel newRepPanel, historyPanel, EmergencyPanel;
	private JLabel header_label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientHome window = new PatientHome();
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
	public PatientHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 102, 102));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 255));
		panel.setBounds(10, 11, 297, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		header_label = new JLabel("Patient's Name Home");
		header_label.setForeground(new Color(255, 255, 255));
		header_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		header_label.setHorizontalAlignment(SwingConstants.CENTER);
		header_label.setBounds(10, 11, 277, 30);
		panel.add(header_label);
		
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
		
		newRepPanel = new JPanel();
		newRepPanel.setBackground(new Color(102, 0, 255));
		newRepPanel.setBounds(36, 74, 246, 75);
		frame.getContentPane().add(newRepPanel);
		newRepPanel.setLayout(null);
		
		newRepButton = new JButton("<html><center>Send New<br>Pulse Report</html>");
		newRepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Initializing blank form...");
			}
		});
		newRepButton.setForeground(new Color(102, 0, 255));
		newRepButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		newRepButton.setBounds(30, 11, 180, 53);
		newRepPanel.add(newRepButton);
		
		historyPanel = new JPanel();
		historyPanel.setBackground(new Color(102, 0, 255));
		historyPanel.setBounds(36, 174, 246, 75);
		frame.getContentPane().add(historyPanel);
		historyPanel.setLayout(null);
		
		historyButton = new JButton("<html>Report/Message<br><center>History</html>");
		historyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Displaying History...");
			}
		});
		historyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		historyButton.setForeground(new Color(102, 0, 255));
		historyButton.setBounds(30, 11, 180, 53);
		historyPanel.add(historyButton);
		
		EmergencyPanel = new JPanel();
		EmergencyPanel.setBackground(new Color(102, 0, 255));
		EmergencyPanel.setBounds(36, 274, 246, 75);
		frame.getContentPane().add(EmergencyPanel);
		EmergencyPanel.setLayout(null);
		
		EmergencyButton = new JButton("EMERGENCY");
		EmergencyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Accessing Emergency Page...");
			}
		});
		EmergencyButton.setForeground(new Color(102, 0, 255));
		EmergencyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		EmergencyButton.setBounds(30, 11, 180, 53);
		EmergencyPanel.add(EmergencyButton);
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
