package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.Controller;
import model.UserVO;

public class Login {

	private JFrame frame;
	private JTextField input_ID;
	private JPasswordField input_PW;
	public static Controller controller = new Controller();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
//		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		input_ID = new JTextField();
		input_ID.setBounds(118, 37, 116, 21);
		frame.getContentPane().add(input_ID);
		input_ID.setColumns(10);

		input_PW = new JPasswordField();
		input_PW.setBounds(128, 68, 104, 30);
		frame.getContentPane().add(input_PW);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 확인버튼 클릭
				// 1. id,pw를 컴포넌트에서 꺼내오기
				// 2. DB에서 해당 id,pw를 조회하기
				String id = input_ID.getText();
				String pw = String.valueOf(input_PW.getPassword());
				UserVO user = new UserVO(id, pw);
				boolean isSuccess = controller.login(user);

				if (isSuccess == true) {
					LoginPop pop = new LoginPop();
					frame.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(frame, "로그인 실패", // 메세지
							"로그인 결과", // 타이틀
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btn_login.setBounds(96, 134, 97, 23);
		frame.getContentPane().add(btn_login);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Join joinGUI = new Join();
				frame.setVisible(false);
			}
		});
		btn_join.setBounds(205, 134, 97, 23);
		frame.getContentPane().add(btn_join);

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(49, 37, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(59, 75, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

	}

}
