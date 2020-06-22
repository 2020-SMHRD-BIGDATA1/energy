package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Controller;
import model.UserDAO;
import model.UserVO;

public class MyInfo {

	private JFrame frame;
	public static Controller controller = Login.controller;
	private UserDAO dao = new UserDAO();
	private JTextField txt_pw;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public MyInfo() {
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

		JButton dropinformation = new JButton("\uD0C8\uD1F4");
		dropinformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserVO loginUser = controller.getLoginUser();
				System.out.println(loginUser);
				String pw = loginUser.getPw();

				if (pw.equals(txt_pw.getText())) {

					String id = loginUser.getId();

					dao.delete(id);

					System.out.println("¼º°ø");
					JOptionPane.showMessageDialog(frame, "Å»Åð¼º°ø", "Å»Åð°á°ú", JOptionPane.PLAIN_MESSAGE);

					Login mainGUI = new Login();
					frame.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(frame, "Å»Åð½ÇÆÐ", "Å»Åð°á°ú", JOptionPane.PLAIN_MESSAGE);

				}

			}

		});
		dropinformation.setBounds(269, 204, 97, 23);
		frame.getContentPane().add(dropinformation);

		JLabel lblNewLabel = new JLabel("\uB0B4\uC815\uBCF4");
		lblNewLabel.setBounds(173, 22, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(72, 63, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_2.setBounds(72, 103, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_3.setBounds(72, 141, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);

		JTextField textField = new JTextField();
		textField.setBounds(141, 60, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(141, 100, 116, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JTextField textField_2 = new JTextField();
		textField_2.setBounds(141, 138, 116, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3_1 = new JLabel(
				"\uD0C8\uD1F4\uD558\uB824\uBA74\uBE44\uBC00\uBC88\uD638\uC785\uB825\uD574\uC8FC\uC138\uC694");
		lblNewLabel_3_1.setBounds(106, 180, 213, 15);
		frame.getContentPane().add(lblNewLabel_3_1);

		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(141, 205, 116, 21);
		frame.getContentPane().add(txt_pw);

	}

}
