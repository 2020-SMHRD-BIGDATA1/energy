package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

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
		frame.setBounds(100, 100, 648, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB0B4\uC815\uBCF4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyInfo myinfoGUI = new MyInfo();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(549, 10, 71, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Login loginGUI = new Login();
			}
		});
		btnNewButton_1.setBounds(549, 36, 71, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uACF5\uACF5");
		rdbtnNewRadioButton.setBounds(40, 10, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uAC1C\uC778");
		rdbtnNewRadioButton_1.setBounds(174, 10, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(40, 37, 428, 33);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton_2 = new JButton("\uAC80\uC0C9");
		btnNewButton_2.setBounds(480, 38, 66, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List listGUI = new List();
				frame.setVisible(false);
			}
		});
		scrollPane.setBounds(40, 80, 580, 352);
		frame.getContentPane().add(scrollPane);
		
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		
		String[][] arr = new String[19][];
		String[] data = new String[19];
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\SMHRD\\Desktop\\광주광역시_서구_자전거대여소_20190228.csv"));
			sc.nextLine();
			for (int i = 0; sc.hasNextLine();i++) {
				data = sc.nextLine().split(",");
				arr[i] = data;
			}
			System.out.println(Arrays.toString(arr[0]));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		table = new JTable(arr, columnNames);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
	}
}
