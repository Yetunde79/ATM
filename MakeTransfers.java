package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class MakeTransfers extends JFrame {
    Deposit obj3 = new Deposit();
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_4;
    boolean activiator ;
    boolean activiator1 ;
    String CurrentBalanceMT;
    Deposit Obj4 = new Deposit();
    private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeTransfers frame = new MakeTransfers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
  public MakeTransfers(){
	  
	  
	  Initialize_Mt();
  }
	/**
	 * Create the frame.
	 *
	 */
	public void WriteBackWD(){
    	FileWriter fwTM;
    	
    try{
    		
    	fwTM = new FileWriter(new File("C:\\Users\\Kings\\Documents\\AccountInformation.txt"));
    		
        
    		
    	for (int i = 0; i < 5; i++){
    		
    		
    		    if(i == 3){
    		    	
    		    	fwTM.write(GetCurrentBL());
        			fwTM.write(System.lineSeparator());
        			i++;
    		    }
    		   
    			fwTM.write(Obj4.array[i]);
    			fwTM.write(System.lineSeparator());
    			
    			
    		}

    					fwTM.close();
    
    }
    		catch(IOException ex){
    			
    			System.out.println("wht");
    		}
          
    	   
	}
	
	public String GetCurrentBL(){
		
		return CurrentBalanceMT;
	}
   public void SetCurrentBL(String oldBalance){
		
		 this.CurrentBalanceMT = oldBalance;
	}
  
  
  
	public void Initialize_Mt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 616);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToAcount = new JLabel("Welcome To Acount Transfer Section");
		lblWelcomeToAcount.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblWelcomeToAcount.setBounds(96, 137, 412, 44);
		contentPane.add(lblWelcomeToAcount);
		
		JLabel lblFrom = new JLabel("Move From :");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFrom.setBounds(15, 197, 136, 20);
		contentPane.add(lblFrom);
		
		JRadioButton rdbtnChecking = new JRadioButton("CHECKING");
		rdbtnChecking.setBackground(new Color(255, 255, 255));
		rdbtnChecking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activiator = true;
			}
		});
		rdbtnChecking.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnChecking.setBounds(72, 229, 155, 29);
		contentPane.add(rdbtnChecking);
		
		JRadioButton rdbtnSavings = new JRadioButton("SAVINGS");
		rdbtnSavings.setBackground(new Color(255, 255, 255));
		rdbtnSavings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"you do not have a savings account","Important Message",JOptionPane.PLAIN_MESSAGE);
				activiator = false;
			}
		});
		rdbtnSavings.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSavings.setBounds(72, 275, 155, 29);
		contentPane.add(rdbtnSavings);
		
		JLabel lblMoveTo = new JLabel("Move To :");
		lblMoveTo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMoveTo.setBounds(15, 326, 136, 20);
		contentPane.add(lblMoveTo);
		
		JRadioButton rdbtnChecking_1 = new JRadioButton("CHECKING");
		rdbtnChecking_1.setBackground(new Color(255, 255, 255));
		rdbtnChecking_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activiator1 = true;
				
			}
		});
		rdbtnChecking_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnChecking_1.setBounds(72, 358, 155, 29);
		contentPane.add(rdbtnChecking_1);
		
		JRadioButton rdbtnSavings_1 = new JRadioButton("SAVINGS");
		rdbtnSavings_1.setBackground(new Color(255, 255, 255));
		rdbtnSavings_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activiator1 = false;
				JOptionPane.showMessageDialog(null,"you do not have a savings account","Important Message",JOptionPane.PLAIN_MESSAGE);
			}
		});
		rdbtnSavings_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSavings_1.setBounds(72, 395, 155, 29);
		contentPane.add(rdbtnSavings_1);
		
		JRadioButton rdbtnAcountNumber = new JRadioButton("ACOUNT NUMBER ");
		rdbtnAcountNumber.setBackground(new Color(255, 255, 255));
		rdbtnAcountNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activiator1 = true;
			}
		});
		rdbtnAcountNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAcountNumber.setBounds(72, 432, 155, 32);
		contentPane.add(rdbtnAcountNumber);
		
		JButton btnTransfer = new JButton("TRANSFER");
		btnTransfer.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if((activiator == true) && (activiator1 = true)){
				
					
					int userInput = Integer.parseInt(textField_2.getText());
					int withdrawAm = Obj4.getBalanceNum()- userInput;
					String withdrawAm1 = Integer.toString(withdrawAm);
					SetCurrentBL(withdrawAm1);
					
					
					WriteBackWD();
				}
				else{
					JOptionPane.showMessageDialog(null,"you have made an invalied selection","Important Message",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnTransfer.setBounds(449, 432, 131, 31);
		contentPane.add(btnTransfer);
		
		ButtonGroup group = new ButtonGroup();
		ButtonGroup group1 = new ButtonGroup();
		
		group.add(rdbtnChecking );
		group.add(rdbtnSavings);
		
		group1.add(rdbtnChecking_1);
		group1.add(rdbtnSavings_1);
		group1.add(rdbtnAcountNumber);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(255, 0, 0)));
		textField_2.setBounds(291, 435, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(255, 0, 0)));
		textField_4.setEditable(false);
		textField_4.setText("0.00");
		textField_4.setText(obj3.array[3]);
		textField_4.setBounds(430, 206, 146, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCurrentBalance = new JLabel("Current Balance");
		lblCurrentBalance.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCurrentBalance.setBounds(420, 181, 145, 20);
		contentPane.add(lblCurrentBalance);
		
		JLabel lblTransferAccount = new JLabel("Transfer Account");
		lblTransferAccount.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTransferAccount.setBounds(281, 394, 161, 29);
		contentPane.add(lblTransferAccount);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(255, 0, 0)));
		textField.setBounds(426, 276, 146, 26);
		String Temp = Integer.toString(Obj4.getAcountNum());
		textField.setText(Temp);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAccountNumber.setBounds(420, 250, 155, 23);
		contentPane.add(lblAccountNumber);
		
		JLabel label = new JLabel("$");
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(271, 436, 20, 23);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("$");
		label_1.setForeground(new Color(0, 128, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_1.setBounds(399, 197, 29, 37);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel.setBounds(96, 0, 385, 72);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("COUGAR ATM");
		btnNewButton.setBorder(new LineBorder(new Color(255, 0, 0)));
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(174, 70, 230, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(0, 502, 580, 58);
		contentPane.add(btnNewButton_1);
	}
}
