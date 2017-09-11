package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Point;

public class secondLayer extends JFrame {

	private JPanel contentPane;
	private JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondLayer frame = new secondLayer();
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
	

	
	
	public secondLayer() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 616);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDeposit = new JButton("                    Deposit");
		btnDeposit.setLocation(new Point(10, 2));
		btnDeposit.setForeground(Color.BLACK);
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDeposit.setBorder(new LineBorder(Color.RED));
		btnDeposit.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnDeposit.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
			}
		});
		btnDeposit.setBackground(Color.WHITE);
		btnDeposit.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Editing-Arrow-icon (1).png"));
	
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   
				Deposit newlayer = new Deposit();
				newlayer.setVisible(true);
				setVisible(false);
			}   
		
		});
	    
		btnDeposit.setBounds(15, 252, 214, 52);
		contentPane.add(btnDeposit);
		
		JButton btnWithdraw = new JButton("              Withdraw");
		btnWithdraw.setForeground(Color.BLACK);
		btnWithdraw.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnWithdraw.setBorder(new LineBorder(new Color(255, 0, 0)));
		btnWithdraw.setBackground(Color.WHITE);
		btnWithdraw.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Editing-Arrow-icon (1).png"));
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WithDraw newlayer1 = new WithDraw();
				newlayer1.setVisible(true);
				setVisible(false);
				
			}
		});
		btnWithdraw.setBounds(15, 417, 216, 63);
		contentPane.add(btnWithdraw);
		
		JButton btnCheckbalance = new JButton("       CheckBalance");
		btnCheckbalance.setForeground(Color.BLACK);
		btnCheckbalance.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCheckbalance.setBorder(new LineBorder(new Color(255, 0, 0)));
		btnCheckbalance.setBackground(Color.WHITE);
		btnCheckbalance.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Editing-Arrow-icon (1).png"));
		btnCheckbalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CheckBalance newlayer2 = new CheckBalance();
				newlayer2.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCheckbalance.setBounds(353, 249, 213, 58);
		contentPane.add(btnCheckbalance);
		
		JButton btnChangePassword = new JButton(" Change Password");
		btnChangePassword.setForeground(Color.BLACK);
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnChangePassword.setBorder(new LineBorder(new Color(255, 0, 0)));
		btnChangePassword.setBackground(Color.WHITE);
		btnChangePassword.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Editing-Arrow-icon (1).png"));
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChangePassword newlayer3 = new ChangePassword();
				newlayer3.setVisible(true);
				setVisible(false);
			}
		});
		btnChangePassword.setBounds(15, 320, 214, 68);
		contentPane.add(btnChangePassword);
		
		JButton btnMakeTransfer = new JButton("    Make Transfer");
		btnMakeTransfer.setForeground(Color.BLACK);
		btnMakeTransfer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMakeTransfer.setBorder(new LineBorder(new Color(255, 0, 0)));
		btnMakeTransfer.setBackground(Color.WHITE);
		btnMakeTransfer.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Editing-Arrow-icon (1).png"));
		btnMakeTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MakeTransfers newlayer4 = new MakeTransfers();
				newlayer4.setVisible(true);
				setVisible(false);
				
			}
		});
		btnMakeTransfer.setBounds(353, 324, 213, 64);
		contentPane.add(btnMakeTransfer);
		
		JButton btnLogout = new JButton("                  Logout");
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBorder(new LineBorder(new Color(255, 0, 0)));
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setIcon(new ImageIcon("C:\\Users\\kings\\Documents\\Editing-Arrow-icon (1).png"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Exit newlayer5 = new Exit();
				newlayer5.setVisible(true);
				setVisible(false);
				
			}
		});
		btnLogout.setBounds(353, 419, 213, 58);
		contentPane.add(btnLogout);
		
		JLabel lblYouHaveSuccessfully = new JLabel("You Have Successfully Login!");
		lblYouHaveSuccessfully.setForeground(Color.BLACK);
		lblYouHaveSuccessfully.setBounds(158, 132, 272, 36);
		contentPane.add(lblYouHaveSuccessfully);
		
		JLabel lblHowCanWe = new JLabel(" How Can We Help You Today With Our Excellent Services.");
		lblHowCanWe.setForeground(Color.BLACK);
		lblHowCanWe.setBounds(44, 184, 522, 20);
		contentPane.add(lblHowCanWe);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kings\\Downloads\\uh.jpg"));
		lblNewLabel.setBounds(88, 16, 388, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblOfficialAtm = new JLabel("       OFFICIAL  ATM");
		lblOfficialAtm.setAutoscrolls(true);
		lblOfficialAtm.setBorder(new LineBorder(Color.RED));
		lblOfficialAtm.setForeground(Color.RED);
		lblOfficialAtm.setBackground(Color.RED);
		lblOfficialAtm.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblOfficialAtm.setBounds(148, 80, 252, 36);
		contentPane.add(lblOfficialAtm);
	
	}
}
