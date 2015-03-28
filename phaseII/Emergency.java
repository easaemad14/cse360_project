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


public class Emergency {

	private JFrame frame;
	private JPanel call911, calldoc;
	private JLabel header_label;
	private JButton QButton, call911_button, calldoc_button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emergency window = new Emergency();
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
	public Emergency() {
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
		
		header_label = new JLabel("EMERGENCY");
		header_label.setForeground(new Color(255, 255, 255));
		header_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		header_label.setHorizontalAlignment(SwingConstants.CENTER);
		header_label.setBounds(10, 11, 277, 30);
		panel.add(header_label);
		
		call911 = new JPanel();
		call911.setBackground(new Color(102, 0, 255));
		call911.setBounds(36, 74, 246, 75);
		frame.getContentPane().add(call911);
		call911.setLayout(null);
		
		call911_button = new JButton("CALL 911");
		call911_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Calling 911...");
			}
		});
		call911_button.setForeground(new Color(102, 0, 255));
		call911_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		call911_button.setBounds(30, 11, 180, 53);
		call911.add(call911_button);
		
		calldoc = new JPanel();
		calldoc.setBackground(new Color(102, 0, 255));
		calldoc.setBounds(36, 174, 246, 75);
		frame.getContentPane().add(calldoc);
		calldoc.setLayout(null);
		
		calldoc_button = new JButton("<html>CALL YOUR<br><center>DOCTOR</html>");
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
				JOptionPane.showMessageDialog(null, "BYE!");
			}
		});
		
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		frame.getContentPane().add(QButton);
		
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
