package testWorkspace;
import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class userLogin extends JFrame{
	JFrame createAcctGUI; //variable that will hold the window object
	JPanel accountPanel; //Panel where we are going to add the elements
	JLabel userNameLabel;
	JLabel passwordLabel;
	JTextField textFieldUserName;
	JTextField textFieldPassword;
	JButton createAcctButton;
	ImageIcon userPhoto;
	//verify account method
	
	boolean verifyAccount(String userName, String password) {
		boolean valid = false;
		String user = "";
		String pass = "";
		
		try {
			Scanner in = new Scanner (new File("user_account_data.txt"));
			
			while(in.hasNextLine()) {
				user = in.nextLine();
				if(in.hasNextLine()) {
					pass = in.nextLine();
				}
				
				if(user.equals(userName) && pass.equals(password)) {
					System.out.println("we have a match");
					valid = true;
				}
			}
			in.close();
		}
		catch(Exception e) {
			valid = false;
		}
	
		return valid;
	}
	//Constructor to initiate these elements
	public userLogin() {
	
	BufferedImage mainImage;
	JLabel picLabel = new JLabel();
	
//	try{
//		mainImage = ImageIO.read(new File("UserCreationPhoto.png"));
//		picLabel.setIcon(new ImageIcon(mainImage));
//	}
//	catch(IOException e1){
//		
//	}
		
	//Defining components - Frame, Panel, labels, input fields , button 
		createAcctGUI = new JFrame("Account Login");
		accountPanel = new JPanel();
		
		//Username section
		userNameLabel = new JLabel("Username: ");
		textFieldUserName = new JTextField(50);
		
		//Password section
		passwordLabel = new JLabel("Password:");
		textFieldPassword = new JTextField(9);
		
		//Button section
		createAcctButton = new JButton("Continue");
		
	//Defining dimension of elements
		
		//defining the dimensions of the frame and pane
		createAcctGUI.setSize(500,500);
		accountPanel.setLayout(null);
		accountPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Account Login"));
		
		picLabel.setSize(100,100);
		picLabel.setBounds(110,60,110,100);
		userNameLabel.setBounds(150,100,150,20); //x,y, width, height
		textFieldUserName.setBounds(150, 120, 200, 20);
		
		passwordLabel.setBounds(150, 140, 260, 20);
		textFieldPassword.setBounds(150,170, 200, 20);
		
		createAcctButton.setBounds(185,220,130,30);
		

		
		
		//Adding the elements to the Panel and then adding the panel to the frame
		accountPanel.add(picLabel);
		accountPanel.add(userNameLabel);
		accountPanel.add(textFieldUserName);
		accountPanel.add(passwordLabel);
		accountPanel.add(textFieldPassword);
		accountPanel.add(createAcctButton);
		
		
		
		
	//adding panel to the frame
		createAcctGUI.add(accountPanel);
		createAcctGUI.setLocationRelativeTo(accountPanel); //centralizing the location of the account panel
		
	
	//Creating the frame
		createAcctGUI.setVisible(true);
	
	//action listener for the create account button
		class ButtonListener implements ActionListener{
			
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked");
				//storing the username and password input on the variable uName and pWord respectively
				String uName = textFieldUserName.getText();
				String pWord = textFieldPassword.getText();
				boolean accountVerification;
				//checking if user has a valid login and password
				accountVerification = verifyAccount(uName,pWord);
				
				if(accountVerification) {
					new purchaseInterface();
					createAcctGUI.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Invalid Account/Password", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}	
			
		}
		createAcctButton.addActionListener(new ButtonListener());
		
	}



	


}
