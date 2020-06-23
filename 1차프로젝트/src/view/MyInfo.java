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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class MyInfo {

	private JFrame frame;
	public static Controller controller = Login.controller;
	private UserDAO dao = new UserDAO();
	private JTextField txt_pw;
	private JTextField change_phone;
	private JTextField change_pw;
	private JTextField change_addr;

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

					System.out.println("성공");
					JOptionPane.showMessageDialog(frame, "탈퇴성공", "탈퇴결과", JOptionPane.PLAIN_MESSAGE);

					Login mainGUI = new Login();
					frame.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(frame, "탈퇴실패", "탈퇴결과", JOptionPane.PLAIN_MESSAGE);

				}

			}

		});
		dropinformation.setBounds(269, 204, 97, 23);
		frame.getContentPane().add(dropinformation);

		JLabel lblNewLabel = new JLabel("\uB0B4\uC815\uBCF4");
		lblNewLabel.setBounds(173, 22, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1.setBounds(72, 63, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(72, 103, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_3.setBounds(72, 141, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);

		change_phone = new JTextField();
		change_phone.setBounds(141, 60, 116, 21);
		frame.getContentPane().add(change_phone);
		change_phone.setColumns(10);

		change_addr = new JTextField();
		change_addr.setBounds(141, 100, 116, 21);
		frame.getContentPane().add(change_addr);
		change_addr.setColumns(10);

		change_pw = new JTextField();
		change_pw.setBounds(141, 138, 116, 21);
		frame.getContentPane().add(change_pw);
		change_pw.setColumns(10);

		txt_pw = new JTextField();
		txt_pw.setForeground(Color.LIGHT_GRAY);
		txt_pw.setText("탈퇴하려면 비밀번호를 입력해주세요");
		txt_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txt_pw.setText("");
				txt_pw.setForeground(Color.BLACK);
			}
		});
		txt_pw.setColumns(10);
		txt_pw.setBounds(49, 205, 208, 21);
		frame.getContentPane().add(txt_pw);
		
		JButton btnNewButton = new JButton("\uC608\uC57D\uD604\uD669");
		btnNewButton.setBounds(283, 59, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDA9\uC804\uD558\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Charge charge = new Charge();
				frame.setVisible(false);

			}
		});
		btnNewButton_1.setBounds(283, 99, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnChange = new JButton("\uC218\uC815");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = controller.getLoginUser().getId();
				String phone = change_phone.getText();
				String addr = change_addr.getText();
				String pw = change_pw.getText();
				
				UserVO change = new UserVO(id, pw, addr, phone);
				
				int cnt = controller.changeUser(change);
				
				if (cnt > 0) {
					JOptionPane.showMessageDialog(frame, "수정이 성공되었습니다", "수정결과", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(frame, "수정이 실패되었습니다", "수정결과", JOptionPane.PLAIN_MESSAGE);
				}
				
				
		
				
			}
		});
		btnChange.setBounds(283, 137, 97, 23);
		frame.getContentPane().add(btnChange);
		
		JButton btnNewButton_1_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_1_1.setBounds(269, 171, 97, 23);
		frame.getContentPane().add(btnNewButton_1_1);

	}

}
