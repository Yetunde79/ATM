package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class CheckBalance extends JFrame {
Deposit Obj1 = new Deposit();
	private JPanel contentPane;
	private JTextField txtReady;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalance frame = new CheckBalance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CheckBalance() {
		ButtonGroup group = new ButtonGroup();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 610);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("    Welcome To The CheckBalance Section");
		
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblWelcomeToThe.setBounds(54, 146, 468, 37);
		contentPane.add(lblWelcomeToThe);
		
		JRadioButton rdbtnCheckBalance = new JRadioButton("Check Credit Balance");
		rdbtnCheckBalance.setBackground(new Color(255, 255, 255));
		rdbtnCheckBalance.setBorder(new LineBorder(new Color(255, 0, 0), 1, true));
		rdbtnCheckBalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtReady.setText("you dont have a Savings Account");
			}
		});
		rdbtnCheckBalance.setBounds(162, 329, 305, 29);
		contentPane.add(rdbtnCheckBalance);
		group.add(rdbtnCheckBalance);
		
		JRadioButton rdbtnCheckDebit = new JRadioButton("Check Debit Balance");
		rdbtnCheckDebit.setBackground(new Color(255, 255, 255));
		rdbtnCheckDebit.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnCheckDebit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String balance = Integer.toString(Obj1.Balance);
				txtReady.setText(balance );
			System.out.println(balance );
			}
		});
		rdbtnCheckDebit.setBounds(162, 412, 305, 29);
		contentPane.add(rdbtnCheckDebit);
		group.add(rdbtnCheckDebit);
		
		txtReady = new JTextField();
		txtReady.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtReady.setBorder(new LineBorder(Color.RED));
		txtReady.setText("   Are you Ready!!");
		txtReady.setBounds(120, 231, 378, 37);
		contentPane.add(txtReady);
		txtReady.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel.setBounds(98, 0, 369, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(0, 498, 580, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("COUGAR ATM");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton_1.setBounds(187, 56, 200, 43);
		contentPane.add(btnNewButton_1);
	}
}
