package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class ChangePassword extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	String CurrentPassword;
    firstLayer Obj2 = new firstLayer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword frame = new ChangePassword();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public ChangePassword(){
    	
    	Initialize_ChPassword();
    }
	/**
	 * Create the frame.
	 */

	public void WriteBackCP(){
    	FileWriter fwCP;
    	String AccNum = Integer.toString(Obj2.AccountNum);
    	
    try{
    		
    	fwCP= new FileWriter(new File("C:\\Users\\Kings\\Documents\\password.txt"));
        fwCP.write(AccNum); 
    		    fwCP.write("\t");
    	        fwCP.write(GetCurrentPW());
		       
		     
    					fwCP.close();
    					
    }
    		catch(IOException ex){
    			
    			System.out.println("wht");
    		}
         
    	   
	}
    public String GetCurrentPW(){
		
		return CurrentPassword;
	}
    public void SetCurrentPW(String oldpassword){
		
		 this.CurrentPassword = oldpassword;
	}
	public void  Initialize_ChPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 616);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToChange = new JLabel("Welcome To  Change Password Section");
		lblWelcomeToChange.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblWelcomeToChange.setBounds(76, 151, 419, 27);
		contentPane.add(lblWelcomeToChange);
		
		JLabel lblAccount = new JLabel("Account Number:");
		lblAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAccount.setBounds(43, 220, 212, 27);
		contentPane.add(lblAccount);
		
		JLabel lblNewLabel = new JLabel("Current Password :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(43, 283, 212, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewPassord = new JLabel("New Password :");
		lblNewPassord.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewPassord.setBounds(43, 345, 184, 27);
		contentPane.add(lblNewPassord);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.RED));
		textField.setBounds(283, 222, 212, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(Color.RED));
		textField_1.setBounds(283, 285, 212, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.RED, 1, true));
		textField_2.setBounds(283, 347, 212, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnChangePassword = new JButton("Change password");
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChangePassword.addActionListener(new ActionListener() {
			
			String AccNum1 = Integer.toString(Obj2.AccountNum);
		
			
			public void actionPerformed(ActionEvent e) {
				
			 if(((textField.getText()).equals(AccNum1)) && (Obj2.password.equals(textField_1.getText()))){
					
					SetCurrentPW(textField_2.getText());
					WriteBackCP();
				}
				
				
			}
		});
		btnChangePassword.setBounds(321, 411, 212, 43);
		contentPane.add(btnChangePassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel_1.setBounds(91, 16, 385, 66);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("COUAGR ATM");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(168, 80, 212, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(0, 494, 580, 66);
		contentPane.add(btnNewButton_1);
	}
}
