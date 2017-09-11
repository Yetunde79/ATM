package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class WithDraw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String CurrentBalance;
	Deposit Obj = new Deposit();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithDraw frame = new WithDraw();
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
	
	public WithDraw(){
		Initialize_WithDraw();
		
		
	}
	public void WriteBackWD(){
    	FileWriter fwWD;
    	
    try{
    		
    	fwWD= new FileWriter(new File("C:\\Users\\Kings\\Documents\\AccountInformation.txt"));
    		
        
    		
    	for (int i = 0; i < 5; i++){
    		
    		
    		    if(i == 3){
    		    	
    		    	fwWD.write(GetCurrentB());
        			fwWD.write(System.lineSeparator());
        			i++;
    		    }
    		   
    			fwWD.write(Obj.array[i]);
    			fwWD.write(System.lineSeparator());
    			
    			
    		}

    					fwWD.close();
    
    }
    		catch(IOException ex){
    			
    			System.out.println("wht");
    		}
          
    	   
	}
	
	public String GetCurrentB(){
		
		return CurrentBalance;
	}
   public void SetCurrentB(String oldBalance){
		
		 this.CurrentBalance = oldBalance;
	}
	
	public void  Initialize_WithDraw(){
		Deposit Obj = new Deposit();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 616);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome  To  The  Withdraw  Section");
		
		lblWelcomeToThe.setBackground(Color.RED);
		lblWelcomeToThe.setForeground(Color.BLACK);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblWelcomeToThe.setBounds(67, 220, 419, 29);
		contentPane.add(lblWelcomeToThe);
		
		JLabel lblNewLabel = new JLabel("Current Balance Is :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(37, 304, 216, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("$ 0.00");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(391, 304, 80, 29);
		String WithdrawBalance  = Integer.toString(Obj.getBalanceNum());
		lblNewLabel_1.setText(WithdrawBalance);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblWithdrawAccount = new JLabel("Withdraw Account :");
		lblWithdrawAccount.setAutoscrolls(true);
		lblWithdrawAccount.setBackground(Color.RED);
		lblWithdrawAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWithdrawAccount.setBounds(37, 381, 203, 23);
		contentPane.add(lblWithdrawAccount);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(360, 379, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.setBorder(new LineBorder(Color.RED));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int userNum = Integer.parseInt(textField.getText());
			    int newbalance = Obj.getBalanceNum() - userNum;
				 String StrBalance = Integer.toString(newbalance);
				 SetCurrentB(StrBalance);
				
				WriteBackWD();
				
			
			}
		});
		btnNewButton.setBounds(405, 430, 115, 29);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel_2.setBounds(98, 16, 385, 73);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(0, 502, 582, 58);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("$");
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(327, 301, 20, 35);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("$");
		label_1.setForeground(new Color(0, 128, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(327, 369, 25, 35);
		contentPane.add(label_1);
		
		JButton btnNewButton_2 = new JButton("COUGAR ATM");
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(175, 85, 216, 58);
		contentPane.add(btnNewButton_2);
	}
	
	

}
