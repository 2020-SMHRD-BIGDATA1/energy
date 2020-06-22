package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.Controller;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPop {

	private JFrame frame;
	private JLabel pop;
	private Controller controller = Login.controller;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public LoginPop() {
		initialize();
		pop.setText(controller.getLoginUser().getName());
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main mainGUI = new Main();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(54, 92, 97, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pop = new JLabel("New label");
		pop.setBounds(69, 31, 106, 51);
		frame.getContentPane().add(pop);
	}

}
