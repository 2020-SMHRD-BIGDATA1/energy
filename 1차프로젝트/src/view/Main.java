package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACF5\uACF5");
		lblNewLabel.setBounds(31, 41, 139, 153);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC1C\uC778");
		lblNewLabel_1.setBounds(205, 41, 139, 153);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uB0B4\uC815\uBCF4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyInfo myinfoGUI = new MyInfo();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(356, 10, 71, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Login loginGUI = new Login();
			}
		});
		btnNewButton_1.setBounds(356, 31, 71, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
