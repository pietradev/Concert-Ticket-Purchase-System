package testWorkspace;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.*;



public class initialWindowTicketPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		//Main Dialog options
		Object[] options = {"Cancel", "Create Account", "Login", "Staff"};
		
		int selection = JOptionPane.showOptionDialog(
				null,//parent window
				"\n	\t\t\t\t\t\t\t Concert Ticket Purchase Systemn\n\n\n\n",//text inside the dialog
				"Concert Tickets",
				JOptionPane.YES_NO_CANCEL_OPTION, //option type of the dialog
				JOptionPane.QUESTION_MESSAGE,//MESSAGE TYPE
				new ImageIcon("theater.png"),
				options,
				options[2]
		);
		
		//button selection - leads to different actions 
		if(selection == 1) {
			
			new accountCreation();
			//create another class for creating an account
			
		}
		else if(selection == 2) {
			//create another class for login
			//new userLogin ();
			new userLogin();
		}
		
		else if(selection == 3) {
			new staffWindow();
		}
		
		else {
			System.exit(0);
			
		}	
		
	}

}
