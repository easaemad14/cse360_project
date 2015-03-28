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


public class RateSymptoms {

	private JFrame frame;
	private JLabel header_label, symptoms_label, num_label;
	private JPanel mid_panel, symptoms_panel, rate_panel;
	private JButton minus, plus, QButton, NextButton;
	private static int num = 5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RateSymptoms window = new RateSymptoms();
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
	public RateSymptoms() {
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
		
		mid_panel = new JPanel();
		mid_panel.setBackground(new Color(102, 0, 255));
		mid_panel.setBounds(47, 74, 223, 290);
		frame.getContentPane().add(mid_panel);
		mid_panel.setLayout(null);
		
		symptoms_panel = new JPanel();
		symptoms_panel.setBounds(10, 11, 203, 40);
		mid_panel.add(symptoms_panel);
		symptoms_panel.setLayout(null);
		
		symptoms_label = new JLabel("Sysmptoms");
		symptoms_label.setForeground(new Color(102, 0, 255));
		symptoms_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		symptoms_label.setHorizontalAlignment(SwingConstants.CENTER);
		symptoms_label.setBounds(0, 0, 203, 40);
		symptoms_panel.add(symptoms_label);
		
		rate_panel = new JPanel();
		rate_panel.setBounds(30, 62, 163, 163);
		mid_panel.add(rate_panel);
		rate_panel.setLayout(null);
		
		num_label = new JLabel("5");
		num_label.setForeground(new Color(102, 0, 255));
		num_label.setFont(new Font("Tahoma", Font.PLAIN, 60));
		num_label.setHorizontalAlignment(SwingConstants.CENTER);
		num_label.setBounds(0, 0, 163, 163);
		rate_panel.add(num_label);
		
		minus = new JButton("-");
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
		
		plus = new JButton("+");
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
				JOptionPane.showMessageDialog(null, "BYE!");
			}
		});
		QButton.setBackground(new Color(102, 0, 255));
		QButton.setBounds(47, 373, 89, 23);
		frame.getContentPane().add(QButton);
		
		NextButton = new JButton("NEXT");
		NextButton.setForeground(new Color(255, 255, 255));
		NextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Next..." );
			}
		});
		NextButton.setBackground(new Color(102, 0, 255));
		NextButton.setBounds(180, 373, 89, 23);
		frame.getContentPane().add(NextButton);
		
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 333, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
