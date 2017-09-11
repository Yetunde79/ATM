package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;
import java.util.Scanner;

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
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;

public class Deposit extends JFrame {

	private JPanel contentPane;
	public  JTextField textFieldnum;
	public  int AccountNum;
	public  int Balance;
	public String fName;
	public String  lName;
	public String  NEWbalance;
	public String Status;
	String newblalanceConverted;
	String [] array = new String[12];
	 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Deposit(){
		setInfo();
		Initialize_Deposit();
		
		
	}

	/**
	 * Create the frame.
	 */
	
	public void setInfo(){
		
		Scanner x = null;
		
	   
		try{
			
			
		      x = new Scanner(new File("C:\\Users\\Kings\\Documents\\AccountInformation.txt"));
			     
		     System.out.println("could open");
		     
		     
			}
			catch(Exception e){
				
				
				System.out.println("couldn't open");
			}
	
		
		
		int i = 0;
	
		while(x.hasNextLine()){
		    array[i] = x.nextLine();
			i++;
			
			
		}
		
		int accountnum = Integer.parseInt(array[0]);
		 
		
		int accountbalance = Integer.parseInt(array[3]);
	
		setAccountNum(accountnum);
		setBalanceNum(accountbalance);
		setFirstName(array[1]);
		setLastName(array[2]);
		
		
		x.close();
		
		
		
		
	}
	
	public void setAccountNum(int num){
		
		this.AccountNum = num;
	}
    public int getAcountNum(){
		
		return this.AccountNum;
	}
   public void setBalanceNum(int num){
		
		this.Balance = num;
	}
    public int getBalanceNum(){
		
		return this.Balance;
	}
	
    public void setFirstName(String fname){
		
		this.fName = fname;
	}
    public String getFirstName(){
		
		return this.fName;
	}
    public void setLastName(String Lname){
		
		this.fName = Lname;
	}
    public String getLastName(){
		
		return this.fName;
	}
    
    public void SetNewbalance(String oldBalance){
    	
    	this.NEWbalance = oldBalance;
    	
   
    }
    public String GetSetNewbalance(){
    	
    	return this.NEWbalance;
    }

    
    public void WriteBack(){
    	FileWriter fw;
    	
    try{
    		
    	fw = new FileWriter(new File("C:\\Users\\Kings\\Documents\\AccountInformation.txt"));
    		

    		
    	for (int i = 0; i < 5; i++){
    		
    		
    		    if(i == 3){
    		    	
    		    	fw.write(GetSetNewbalance());
        			fw.write(System.lineSeparator());
        			i++;
    		    }
    			
    			fw.write(array[i]);
    			fw.write(System.lineSeparator());
    			
    			
    			
    			
    		}
 
    					fw.close();
    	}
    		catch(IOException e){
    			
    			System.out.println("wht");
    		}
    		
    		
    		
    	
    
    	
    	 
    }
	
	public void Initialize_Deposit() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 616);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 0));
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelocmeToDeposit = new JLabel(" Welcome To Deposit");
		lblWelocmeToDeposit.setForeground(Color.BLACK);
		lblWelocmeToDeposit.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblWelocmeToDeposit.setBounds(146, 179, 248, 31);
		contentPane.add(lblWelocmeToDeposit);
		
		JLabel lblNewLabel = new JLabel("Current Balance");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(Color.BLACK);
		//lblNewLabel.setBorder(new LineBorder(Color.RED));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(46, 226, 223, 31);
		contentPane.add(lblNewLabel);
		
		
		JLabel label = new JLabel("");
		label.setBounds(283, 137, 99, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("$0.00");
		label_1.setBorder(new LineBorder(Color.RED));
		label_1.setBounds(365, 228, 109, 31);
		contentPane.add(label_1);
		int bal = getBalanceNum();
		String setBal = Integer.toString(bal);
		label_1.setText(setBal);
		
		JLabel lblPleaseEnterThe = new JLabel("Please Enter The Account You Will like To Deport ");
		lblPleaseEnterThe.setForeground(Color.BLACK);
		
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPleaseEnterThe.setBounds(46, 305, 505, 38);
		contentPane.add(lblPleaseEnterThe);
		
		JLabel lblAccount = new JLabel("Account Deposit : ");
		lblAccount.setBackground(Color.WHITE);
		lblAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAccount.setBounds(46, 375, 183, 38);
		contentPane.add(lblAccount);
		
		textFieldnum = new JTextField();
		textFieldnum.setBorder(new LineBorder(Color.RED));
		textFieldnum.setBounds(328, 379, 158, 34);
		contentPane.add(textFieldnum);
		textFieldnum.setColumns(10);
		
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBorder(new LineBorder(Color.RED));
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int userNum = Integer.parseInt(textFieldnum.getText());
				int newbalance  = getBalanceNum() + userNum;
				newblalanceConverted = Integer.toString(newbalance);
				SetNewbalance(newblalanceConverted);
				
				WriteBack();
			}
		});
		btnDeposit.setBounds(428, 470, 115, 29);
		contentPane.add(btnDeposit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel_1.setBounds(89, 16, 385, 72);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("$");
		label_2.setForeground(new Color(0, 100, 0));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(339, 230, 22, 27);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("$");
		label_3.setForeground(new Color(0, 128, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(304, 386, 22, 27);
		contentPane.add(label_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(0, 515, 582, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("COUGAR ATM");
		btnNewButton_1.setForeground(new Color(220, 20, 60));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBorder(new LineBorder(Color.RED));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(176, 82, 212, 59);
		contentPane.add(btnNewButton_1);
	}
}