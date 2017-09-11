package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Exit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exit frame = new Exit();
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
	public Exit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 615);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thank You For Using CouagrATM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(104, 214, 358, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Would You Like To Exit Now");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(124, 273, 414, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Would You Like To Go Back To Main Menu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(53, 368, 456, 69);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBorder(new LineBorder(Color.RED));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(220, 323, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Main Menu");
		btnNewButton_1.setBorder(new LineBorder(Color.RED));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstLayer newlayer6 = new firstLayer();
				newlayer6.setVisible(true);
				setVisible(false);
			
			}
		});
		btnNewButton_1.setBounds(220, 437, 115, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel_3.setBounds(100, 16, 385, 81);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(0, 497, 581, 62);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("COUGAR ATM");
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(197, 89, 197, 54);
		contentPane.add(btnNewButton_3);
	}

}
