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

public class Charge {
	
	private JFrame frame;
	private JTextField charge_money;
	private JLabel money;
	private Controller controller = Login.controller;
	public UserDAO dao = Join.dao;
	int charge = controller.getLoginUser().getMoney();
	
	public Charge() {
		System.out.println(charge);
	      initialize();
	      frame.setVisible(true);
	      money.setText(charge+"");

	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC\uC794\uC561");
		lblNewLabel.setBounds(46, 27, 92, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCDA9\uC804\uAE08\uC561");
		lblNewLabel_1.setBounds(46, 71, 92, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		charge_money = new JTextField();
		charge_money.setBounds(148, 75, 116, 21);
		frame.getContentPane().add(charge_money);
		charge_money.setColumns(10);
		
		JButton cha = new JButton("\uCDA9\uC804\uD558\uAE30");
		cha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String id = controller.getLoginUser().getId();
		            charge += Integer.parseInt(charge_money.getText());
		            UserVO chargeMoney = new UserVO(id, charge);
		            
		            int cnt = dao.updatemoney(chargeMoney);
		            
		            
		            
		            if (cnt > 0) {
		               money.setText(charge + "");
		               JOptionPane.showMessageDialog(frame,
		                      "충전완료",
		                      "충전결과",
		                      JOptionPane.PLAIN_MESSAGE);
		               Login loginGUI = new Login();
		               frame.setVisible(true);
		            }
		            else {
		               JOptionPane.showMessageDialog(frame,
		                      "충전실패.",
		                      "충전결과",
		                      JOptionPane.PLAIN_MESSAGE);
		            }

			}
		});
		cha.setBounds(276, 74, 97, 23);
		frame.getContentPane().add(cha);
		
		JButton btnNewButton_1 = new JButton("<-");
		btnNewButton_1.setBounds(0, 0, 72, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		money = new JLabel("New label");
		money.setBounds(150, 34, 57, 15);
		frame.getContentPane().add(money);
	}
}
