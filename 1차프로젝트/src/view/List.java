package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class List {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public List() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 659, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uC608\uC57D");
		btnNewButton.setBounds(490, 31, 86, 55);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uB098\uBA38\uC9C0\uB294 \uC124\uBA85");
		lblNewLabel.setBounds(59, 266, 156, 81);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(59, 31, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC7A5\uC18C");
		lblNewLabel_2.setBounds(59, 71, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC790\uC804\uAC70\uC608\uC57D\uAC00\uB2A5\uAC2F\uC218");
		lblNewLabel_3.setBounds(59, 110, 117, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uADF8\uB9BC");
		lblNewLabel_4.setBounds(76, 158, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("\uADF8\uB9BC");
		lblNewLabel_4_1.setBounds(173, 158, 57, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("\uADF8\uB9BC");
		lblNewLabel_4_1_1.setBounds(274, 158, 57, 15);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("\uADF8\uB9BC");
		lblNewLabel_4_1_1_1.setBounds(375, 158, 57, 15);
		frame.getContentPane().add(lblNewLabel_4_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(77, 194, 30, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(173, 194, 30, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(269, 194, 30, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBounds(372, 194, 30, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("\uAC00\uACA9");
		lblNewLabel_5.setBounds(59, 226, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
