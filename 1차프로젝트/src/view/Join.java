package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import controller.Controller;
import model.UserDAO;
import model.UserVO;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Join {

	private JFrame frame;
	private JTextField inputName;
	private JTextField inputId;
	private JPasswordField inputPw;
	private JPasswordField inputPwCheck;
	private JTextField inputAge;
	private JTextField inputAddr;
	private JTextField inputPhone;
	private UserDAO dao = new UserDAO();
	private int overlapId = 0;
	private int overlapPw = 0;
	private static Controller controller = Login.controller;
	


	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Join() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 26, 382, 46);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 91, 26);
		panel.add(lblNewLabel);
		
		inputName = new JTextField();
		inputName.setBounds(102, 0, 268, 46);
		panel.add(inputName);
		inputName.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(12, 89, 382, 46);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 91, 26);
		panel_1.add(lblNewLabel_1);
		
		inputId = new JTextField();
		inputId.setColumns(10);
		inputId.setBounds(102, 0, 187, 46);
		panel_1.add(inputId);
		
		JButton btnNewButton_2 = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton_2.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				String id = inputId.getText();
				
				if (controller.sendId(id) > 0) {
					JOptionPane.showMessageDialog(frame,
							"사용가능한 아이디입니다",
							"중복확인 결과",
							JOptionPane.INFORMATION_MESSAGE);
					overlapId = 1;

				}
				else {
					JOptionPane.showMessageDialog(frame,
							"중복된 아이디입니다",
							"중복확인 결과",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(301, 0, 81, 46);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(12, 156, 382, 46);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 10, 91, 26);
		panel_2.add(lblNewLabel_2);
		
		inputPw = new JPasswordField();
		inputPw.setBounds(104, 0, 266, 46);
		panel_2.add(inputPw);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(12, 222, 382, 46);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(12, 10, 91, 26);
		panel_3.add(lblNewLabel_3);
		
		inputPwCheck = new JPasswordField();
		inputPwCheck.setBounds(104, 0, 266, 46);
		panel_3.add(inputPwCheck);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(12, 289, 382, 46);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 10, 91, 26);
		panel_1_1.add(lblNewLabel_1_1);
		
		inputAge = new JTextField();
		inputAge.setColumns(10);
		inputAge.setBounds(102, 0, 268, 46);
		panel_1_1.add(inputAge);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(12, 355, 382, 46);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC0AC\uB294\uACF3");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(12, 10, 91, 26);
		panel_1_2.add(lblNewLabel_1_2);
		
		inputAddr = new JTextField();
		inputAddr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputAddr.setText("");
				inputAddr.setForeground(Color.BLACK);
			}
		});
		inputAddr.setForeground(Color.LIGHT_GRAY);
		inputAddr.setText("시/구/동");
		inputAddr.setColumns(10);
		inputAddr.setBounds(102, 0, 268, 46);
		panel_1_2.add(inputAddr);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(12, 424, 382, 46);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(12, 10, 91, 26);
		panel_1_3.add(lblNewLabel_1_3);
		
		inputPhone = new JTextField();
		inputPhone.setColumns(10);
		inputPhone.setBounds(102, 0, 268, 46);
		panel_1_3.add(inputPhone);
		
		JButton btnJoin = new JButton("\uD655\uC778");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = inputId.getText();
				String name = inputName.getText();
				int age = Integer.parseInt(inputAge.getText());
				String addr = inputAddr.getText();
				String phone = inputPhone.getText();
				
				if (inputPw.getText().equals(inputPwCheck.getText())) {
					String pw = inputPw.getText();
					overlapPw = 1;					
					UserVO joinUser = new UserVO(id, pw, name, age, addr, phone);
					if (overlapId==1 && overlapPw==1) {
						
						int cnt = controller.join(joinUser);
						if (cnt > 0) {
							JOptionPane.showMessageDialog(frame,
								    "가입을 축하드립니다",
								    "회원가입 결과",
								    JOptionPane.PLAIN_MESSAGE);
							Login loginGUI = new Login();
							frame.setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(frame,
								    "회원가입이 실패했습니다.",
								    "회원가입 결과",
								    JOptionPane.PLAIN_MESSAGE);
						}
						
					}
					
				}
				else {
					JOptionPane.showMessageDialog(frame,
						    "비밀번호가 일치하지 않습니다",
						    "회원가입 결과",
						    JOptionPane.PLAIN_MESSAGE);
				}
				
			}
		});
		btnJoin.setBounds(85, 475, 97, 23);
		frame.getContentPane().add(btnJoin);
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(194, 475, 97, 23);
		frame.getContentPane().add(btnCancel);
	}
}
