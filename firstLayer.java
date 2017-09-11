package ATM;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class firstLayer extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	public String password;
	public int AccountNum;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstLayer window = new firstLayer();
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
	public firstLayer() {
		setInfo();
		initialize();
		
	}
	
	
		
		public void setInfo(){
			
			Scanner x = null;
			int num = 0;
		    String sample = "";
			try{
				
				
			      x = new Scanner(new File("C:\\Users\\Kings\\Documents\\password.txt"));
				     
			     System.out.println("could open");
			     
			     
				}
				catch(Exception e){
					
					
					System.out.println("couldn't open");
				}
			
			
			
			while(x.hasNext()){
				
				 num = x.nextInt();
				 sample = x.next(); 
				
				
			}
			setpassword(sample);
			setAccountNum(num);
			
			
			
			
		}
		
		public void setpassword(String passwordF){
			
			this.password = passwordF;
		}
        public String Getpassword(){
			
			return this.password;
		}
		
        public void setAccountNum(int AcountNumF){
			
			 this.AccountNum = AcountNumF;
		}
        public int GetAccountNum(){
			
			return this.AccountNum;
		}
		
		
		
		


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		frame.setBounds(100, 100, 603, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	   	
	   	JButton btnLogin = new JButton("Login");
	   	btnLogin.setOpaque(false);
	   	btnLogin.setForeground(new Color(255, 0, 0));
	   	btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
	   	btnLogin.setBackground(new Color(0, 0, 255));
	   	
	   	
	   btnLogin.addActionListener(new ActionListener() {
	   		public void actionPerformed(ActionEvent e) {
	   			
	   			
	   			
	   			int acountnum;
	   			acountnum = Integer.parseInt(textField.getText());
	   			String passwordnum;
	   			passwordnum = new String(passwordField.getPassword());
	   			
	   			
	   			
	   			
	   			try{
	   				
	   					if((acountnum == GetAccountNum())&(passwordnum.equals(Getpassword()))){				
	   						
	   						
	   						
	   						JOptionPane.showMessageDialog(null,"you have successful login","IMPORTANT", JOptionPane.PLAIN_MESSAGE);
	   						frame.dispose();
	   						secondLayer newlayer = new secondLayer();
	   						newlayer.setVisible(true);
	   					}
	   					else{
	   						
	   						JOptionPane.showMessageDialog(null,"you were not successful","IMPORTANT", JOptionPane.PLAIN_MESSAGE);
	   					}
	   				
	   				
	   			}catch(Exception M){
	   				
	   				
	   			JOptionPane.showMessageDialog(null,"you didn't enter correct account number and password","IMPORTANT", JOptionPane.PLAIN_MESSAGE);
	   			}
	   			
	   			
	   		
	   			
	   		}
	   	});
	   	
	   	JLabel lblPassword = new JLabel("PassWord :");
	   	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
	   	lblPassword.setBounds(145, 386, 97, 32);
	   	frame.getContentPane().add(lblPassword);
	   	
	   	JLabel lblId = new JLabel("Account#");
	   	lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
	   	lblId.setBounds(146, 335, 84, 27);
	   	frame.getContentPane().add(lblId);
	   
	   	btnLogin.setBounds(288, 436, 115, 29);
	   	frame.getContentPane().add(btnLogin);
	   	
	   	passwordField = new JPasswordField();
	   	passwordField.setBorder(new LineBorder(new Color(255, 0, 0)));
	   	passwordField.setOpaque(false);
	   	passwordField.setSelectedTextColor(new Color(144, 238, 144));
	   	passwordField.setForeground(new Color(255, 0, 0));
	   	passwordField.setCaretColor(new Color(127, 255, 0));
	   	passwordField.setDisabledTextColor(new Color(109, 109, 109));
	   	passwordField.setBackground(Color.WHITE);
	   	passwordField.setBounds(240, 386, 215, 34);
	   	
	   	frame.getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 549, 0);
		frame.getContentPane().add(label);
		
		JLabel lblWelcomeToCougaratm = new JLabel(" Welcome To CougarATM");
		lblWelcomeToCougaratm.setForeground(new Color(255, 255, 255));
		lblWelcomeToCougaratm.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToCougaratm.setBounds(156, 47, 377, 41);
		frame.getContentPane().add(lblWelcomeToCougaratm);
		
		textField = new JTextField("");
		textField.setBorder(new LineBorder(new Color(255, 0, 0)));
		textField.setBackground(new Color(255, 255, 255));
		textField.setCaretColor(new Color(255, 0, 0));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(230, 335, 225, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField(".");
		textField_2.setBorder(new LineBorder(new Color(169, 169, 169)));
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setBounds(134, 319, 337, 171);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Campus_Image_R_Cullen_in_Day_with_Fountains_1.jpg"));
		lblNewLabel.setBounds(0, 0, 581, 432);
		frame.getContentPane().add(lblNewLabel);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("ToggleButton.highlight"));
		textArea.setBounds(0, 434, 581, 131);
		frame.getContentPane().add(textArea);
		
		
	
}
}
