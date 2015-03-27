import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class LogIn {

	private JFrame frame;
	private JPasswordField passwordField;
	private JButton QButton, LogButton;
	private JLabel titleLabel, nameLabel, passwordLabel; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
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
	public LogIn() {
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
		panel.setBounds(47, 24, 222, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(31, 11, 160, 67);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		titleLabel = new JLabel("Patient Pulse");
		titleLabel.setForeground(new Color(102, 0, 255));
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(10, 11, 140, 45);
		panel_1.add(titleLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 0, 255));
		panel_2.setBounds(47, 124, 222, 120);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(134, 12, 0, 0);
		panel_2.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(139, 12, 0, 0);
		panel_2.add(label);
		
		nameLabel = new JLabel("Full Name:");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLabel.setBounds(10, 12, 90, 14);
		panel_2.add(nameLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 25, 199, 22);
		panel_2.add(textArea);
		
		passwordLabel = new JLabel("Patient Pulse Password:");
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		passwordLabel.setBounds(10, 58, 150, 14);
		panel_2.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 71, 199, 20);
		panel_2.add(passwordField);
		
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
		
		LogButton = new JButton("LOGIN");
		LogButton.setForeground(new Color(255, 255, 255));
		LogButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		LogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Welcome to Patient Pulse" );
			}
		});
		LogButton.setBackground(new Color(102, 0, 255));
		LogButton.setBounds(180, 373, 89, 23);
		frame.getContentPane().add(LogButton);
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
