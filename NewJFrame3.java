



import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame3 extends javax.swing.JFrame implements ActionListener{
	
	Account theAc = new Account();
	Account[] accountList = new Account[10];
	
	private JButton LoginButton;
	
	private JTextArea bankinfoButton;
	private JButton transferButton;
	private JButton CreateAccount;
	private JTextField moneytextfield;
	private JTextField account1;
				LoginButton.addActionListener(this);
			}
			{
				LogoutButton = new JButton();
				getContentPane().add(LogoutButton);
				LogoutButton.setText("Log Out");
				LogoutButton.setBounds(137, 12, 120, 44);
				LogoutButton.addActionListener(this);
			}
			{
				bankinfoButton = new JTextArea();
				getContentPane().add(bankinfoButton);
				bankinfoButton.setText("Displays bank account information");
				bankinfoButton.setBounds(336, 215, 277, 189);
				
			}
			{
				DepositButton = new JButton();
				getContentPane().add(DepositButton);
				DepositButton.setText("Deposit");
				DepositButton.setBounds(12, 150, 120, 50);
				DepositButton.addActionListener(this);
			}
			{
				WithdrawButton = new JButton();
				getContentPane().add(WithdrawButton);
				WithdrawButton.setText("Withdraw");
				WithdrawButton.setBounds(151, 150, 120, 50);
				WithdrawButton.addActionListener(this);
			}
			{
				BalanceButton = new JButton();
				getContentPane().add(BalanceButton);
				BalanceButton.setText("Balance");
				BalanceButton.setBounds(12, 223, 120, 52);
				BalanceButton.addActionListener(this);
			}
			{
				transferButton = new JButton();
				getContentPane().add(transferButton);
				transferButton.setText("Transfer");
				transferButton.setBounds(12, 298, 120, 52);
				transferButton.addActionListener(this);
			}
			{
				accountname = new JTextField();
				getContentPane().add(accountname);
				accountname.setText("Please Enter account name");
				accountname.setBounds(12, 76, 193, 23);
				accountname.addActionListener(this);
			}
			{
				accountpw = new JTextField();
				getContentPane().add(accountpw);
				accountpw.setText("Please Enter Account Password");
				accountpw.setBounds(12, 115, 193, 23);
				accountpw.addActionListener(this);
			}
			{
				account1 = new JTextField();
				getContentPane().add(account1);
				account1.setText("Please enter account you would like to transfer funds to");
				account1.setBounds(0, 370, 313, 34);
				account1.addActionListener(this);
				
			}
			{
				moneytextfield = new JTextField();
				getContentPane().add(moneytextfield);
				moneytextfield.setText("Enter cash here");
				moneytextfield.setBounds(163, 258, 99, 23);
				moneytextfield.addActionListener(this);
			}
			{
				CreateAccount = new JButton();
				getContentPane().add(CreateAccount);
				CreateAccount.setText("Create Account");
				CreateAccount.setBounds(268, 12, 130, 44);
				CreateAccount.addActionListener(this);
				
				
			}
			pack();
			this.setSize(651, 460);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
/*		private JButton LoginButton;
		private JTextField bankinfoButton;
		private JButton transgerButton;
		private JButton jButton1;
		private JTextField moneytextfield;
		private JEditorPane account1;
		private JTextField accountpw;
		private JTextField accountname;
		private JButton BalanceButton;
		private JButton WithdrawButton;
		private JButton DepositButton;
		private JButton LogoutButton;*/
		
		
			
			

		
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Create Account")) {
			//Step3: create new account
			theAc = new Account(accountname.getText());
			bankinfoButton.setText("New Account Created!");
			accountList[Account.getNumAccount()-1] = theAc;
			//Step4: Show customer info.
			bankinfoButton.setText(theAc.toString());
			//createAcButton.setEnabled(false);
			
		}
				
		 if(e.getActionCommand().equals("Print Account List")){
			
		}
		if(e.getActionCommand().equals("Deposit")) {
			
			
		
	    }
		if(e.getActionCommand().equals("Withdrawl")) {
			
			
			
			
			
	}
		if(e.getActionCommand().equals("Balance")) {
			
			
			
	}
		if(e.getActionCommand().equals("Login")) {
			
			
				
		}
	}
	}