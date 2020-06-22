package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class List {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List();
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
	public List() {
		initialize();
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
		lblNewLabel.setBounds(70, 89, 276, 238);
		frame.getContentPane().add(lblNewLabel);
	}

}
