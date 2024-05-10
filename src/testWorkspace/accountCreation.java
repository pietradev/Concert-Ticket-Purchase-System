package testWorkspace;
import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class accountCreation extends JFrame{
	
	
	//declaring elements from the panel/frame 
	JFrame createAcctGUI; //variable that will hold the window object
	JPanel accountPanel; //Panel where we are going to add the elements
	JLabel userNameLabel;
	JLabel passwordLabel;
	JTextField textFieldUserName;
	JTextField textFieldPassword;
	JButton createAcctButton;
	ImageIcon userPhoto;
	
	//function to verify new user name and password 
	public static boolean newUserPasswordValidation(String userPassword){
		int index = 0, digit = 0, upper = 0, lower = 0;
		boolean isValid = false;
		
		if(userPassword.length() >= 9) {
			//verifying each letter from my userName
			while(index < userPassword.length()) {
				char letter = userPassword.charAt(index);
				
				if(Character.isDigit(letter)) {
					digit++;
				}
				if(Character.isUpperCase(letter)) {
					upper++;
				}
				if(Character.isLowerCase(letter)) {
					lower++;
				}
				index++;
			}		
			
			if(digit > 0 && upper > 0 && lower > 0) {
				isValid = true;
			}
		}
		else {
			System.out.println("Invalid Password");
			isValid = false;
		}
	return isValid;
	}
	
	
	//Constructor to initiate these elements
	public accountCreation() {
	
	BufferedImage mainImage;
	JLabel picLabel = new JLabel();
	
	try{
		mainImage = ImageIO.read(new File("UserCreationPhoto.png"));
		picLabel.setIcon(new ImageIcon(mainImage));
	}
	catch(IOException e1){
		
	}
	
		
	//Defining components - Frame, Panel, labels, input fields , button 
		createAcctGUI = new JFrame("Create a new account");
		accountPanel = new JPanel();
		
		//Username section
		userNameLabel = new JLabel("Enter a Username: ");
		textFieldUserName = new JTextField(50);
		
		//Password section
		passwordLabel = new JLabel("Create a password:");
		textFieldPassword = new JTextField(9);
		
		//Button section
		createAcctButton = new JButton("Create Account");
		
		//Defining dimension of elements
		
		//defining the dimensions of the frame and pane
		createAcctGUI.setSize(500,500);
		accountPanel.setLayout(null);
		accountPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Teather Tickets - Create Account"));
		
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
				
				
				//validating inputs 
				boolean isPasswordValid = newUserPasswordValidation(pWord);
				
				if(isPasswordValid) {
					//writing the inputs on a txt file
					try {
						FileWriter userInfoWriter = new FileWriter("user_account_data.txt",true);
						PrintWriter userInfoOut = new PrintWriter(userInfoWriter);
						userInfoOut.write(uName + '\n');
						userInfoOut.write(pWord + '\n');
						userInfoOut.close();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
					
				   JOptionPane.showMessageDialog(null, "Your account has been sucessfully created", "Account Created",JOptionPane.INFORMATION_MESSAGE);
				   createAcctGUI.dispose();
				   new userLogin();

				}
				else {
					//print a message asking for a new password 
					JOptionPane.showMessageDialog(null, "Invalid password has been entered. Make sure your password has 1 digit, 1 Uppercase, 1 Lowercase and at least length 9", "Invalid Password",JOptionPane.WARNING_MESSAGE);

				}
				

				
				
				
			}	
			
		}
		
		ButtonListener btnL = new ButtonListener();
		createAcctButton.addActionListener(btnL);
		
		
		
	}//end of constructor 



	


	

}






/*
 * ***********************
 * 		PSEUDOCODE
 * ***********************
 * 1) Ask user to input their user name and password
 * 2) Validate Password for length - 9 characters -> must have one uppercase, lowercase, and a digit
 * - Handle invalid input by displaying a message that says that the password is invalid - should contain instructions for the user
 * 3) Store the password and username into a file for retrieval by the login function (file handling)
 * 
 * Step 1 - create a JFRAME 
 * Step 2 - Add elements to the window
 * -> Username input + label
 * -> Password input + label
 * ->Buttons: Cancel and Create Account 
 * 
 * 
 * 
 * */
