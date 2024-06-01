**Pietra Oliveira**

**Concert Ticket Purchase System**

**Design Document**

**CSE 223-100**

This project is a software program that enables users to purchase
tickets for the Galaxy Theater. The program allows the user to select a
showtime, price, location/section, and check for availability. The
theater staff can track sales and analyze them. Users can create an
account, log in to the system, cancel their ticket purchase, and choose
their tickets based on the showtime, price, location, and availability.

**[Project Milestone #1 - Selection GUI - Create
Account/Login/Cancel]**

The main window prompts the user to create an account, log in to an
existing account, or cancel the operation.
![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/322da7ca-10a6-4f7b-a78a-220652d16c02)

If they click on the button "Create Account", another window will appear
and they will be prompted to insert a Username and a Password.


![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/e65c28e2-6215-4c77-b52b-efb0562b236c)


If the user clicks on "Login", the Account Login window will appear and
they will be prompted to insert their Username and Password.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/5d3dafe2-0bfd-44bb-9452-4198bc86d59d)



**[Project Milestone #2 - Create Account, Login, and Main
Interface]**

At this point, when the user clicks on "Create Account", the username
and password are validated and consequently stored in a txt file if
valid. When the user clicks on "Login" the username and password are
validated and the purchase window appears.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/1223c575-1c89-4b6c-b8e4-ab9f8c759bf3)


There are two possible scenarios when the user is creating an account.
The first one is when they insert an invalid password. When that
happens, a warning message will appear and let them know the pattern
expected. The second one is when the password is valid. As a result, an
information window will appear, letting them know that the account was
successfully created, and the information will be stored in a text file.

**[Create Account Window]**

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/14825c5c-1484-46bb-880e-7b8891d4101b)


**[First Scenario - Invalid Password:]**

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/8744b622-4ed6-42f2-ac6c-694bf92755da)


**[Second Scenario - Valid password:]**

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/6a0d2eca-7d42-4399-a733-e0f19ea227fb)

**[Text file user_account_data.txt that is storing users
information:]**

-   Odd lines represent usernames

-   Even lines represent passwords

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/e89e9b0c-f675-4810-b9f1-9c4db9011449)



**[Login Window]**

Once the account is created, users will have to go to the login window
and type in their username and password. When the username and or
password does not match, a warning message will appear. When the
username and password matches with the information on the text file,
users will be taken to the Purchase

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/65ace2df-10eb-4481-958b-3df816f4a5a9)


**[Invalid Account Message]**

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/0f220550-3e1d-4322-88fc-17ca22ec0c7f)


**[Valid Account - User is directed to Purchase Window]**

At this window, users can select the show time, section of the theater,
and number of tickets.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/6746bcbb-4032-4439-a9ae-11ff99394f1c)

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/46e293a1-8cb4-492c-b369-862a2b4a0d0e)

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/5bd6e467-9d20-43cb-9ce5-2ac64842db9f)


**[Project Milestone #3 - Ticket Purchasing Interface]**

At this point, the ticket purchasing interface has been designed and
implemented. This interface handles ticket sales by allowing users to
select a show time, theater section and number of tickets that are
available. An algorithm was developed to check if the user selection is
allowed depending on the number of seats available on each theater
section. Beyond that, the final price is displayed according to the
options chosen.

**[Calculating total price according to show time, sections, and number
of tickets]**

If users selects a valid number of tickets according to their selections
under sections and show time, the system will calculate the Total Price
and exhibit the final value under the dropdown Number of Tickets.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/b1abcd5f-1212-430b-b1d7-989d112dcc01)


![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/c64eb383-a67f-40cd-9f31-7b85082122ce)


![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/a5551965-fdba-48d7-bd56-ce1156e1b625)


**[Validating user selection - Sections not available (number of tickets
\> number of seats available)]**

If the user selects more tickets than what is available, the sections
will gray out, and the system will not calculate the total price (\$0).

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/d545dfda-d8f8-4c70-8721-6ce105a5cd7c)

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/e994bfbc-c165-4884-988d-f94682b132e5)


**[Project Milestone #4 - Ticket Sales]**

At this stage, the system reads the available ticket count from a text
file and compares it to the number the user wishes to purchase. If the
user attempts to buy more tickets than are available, an error message
is displayed, as outlined in Milestone #3. Conversely, if the purchase
is successful---that is, if the number of tickets requested is
available---the text file is updated to reflect the new availability.
Additionally, the user is presented with a confirmation window showing
the purchase details, including the current date and time, number of
tickets purchased, section, showtime, and total price.

**[Number of Tickets available stored in three txt files]{.underline}**

The number of seats related to each section is stored in three txt
files: mainFloorNumberSeats.txt, balconyNumberSeats.txt and
StageSideSeats.txt

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/3cdc9a7a-e747-4445-a2f2-c3726ab053c3)


![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/80e23a76-6398-49bf-b8e7-db40db486d69)


**[Two functions are used to edit these txt files: updateSeatInformation
and setHashMapSeatInformation]**

The function setHashMapSeatInformation is used to read the information
from each txt file and put the number of seats on a HashMap so we can
manipulate these numbers throughout the program.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/8153c7ba-918a-4f44-84c4-9d9a25c72548)


The function updateSeatInformation is used to override the information
in each txt file according to the calculation of the final number of
seats that comes from the function updateTotalPrice

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/291e82d6-89de-4a35-ad7f-398d5090bb59)


Function updateTotalPrice:

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/507f9efe-4670-4b9c-9fc4-3a14f65b4ac8)


The values calculated on updateTotalPrice depends on the user selection
on the interface Purchasing a Ticket:

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/29eb548d-a7c4-49b6-bc3a-9881257539fa)


**[Once the user clicks on the button Purchase Ticket, the following
confirmation message appears:]**

At this screen, the user should see:

-   Current date and time

-   Number of tickets, Section and Show time

-   Final Price

-   Information about cancellation

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/8aa17120-8162-4f87-a866-5b5d17d36258)


**[Project Milestone #5 -- Staff Update and File handling]**

At this point, the Initial Window (Milestone #1) was updated and a new
Button was added so Staff Members can check sales Information. By
selecting a txt File with data from sales, the information is displayed
on the screen and a graph is generated.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/58af4c55-e365-4117-8806-c3baf74c12e4)


Once they click on the button "Staff" they will be prompted to select a
txt file that has information about the seats related to each section:

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/c22a3eb9-4159-4ffb-8f1c-1c8f2a49e0c6)


The first line of the txt file stores information about the Early Show,
where the first position is referent to the Stage Side, the second to
Main Floor and the third one to the Balcony. The second line stores
information about the Late show, and each position is referring to the
Stage side, Main Floor and Balcony, respectively.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/f9349402-3b32-4a7f-913a-e3d228e1cb47)


**[Visualizing Sales Information]**

Once the user clicks on the button "Open", the Staff Window opens up and
the staff member can visualize information about the sales:

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/efde28f8-e2e7-4f08-882b-cde6c49d1974)


While the numbers under Seating are fixed, the numbers that are under
Open are read from the txt file "StaffingMonitoring.txt" (user
selection).

**[Calculations to display the data]**

To display the data graphically, it was not only necessary to calculate
the "percentage", but also to adjust the scale to fit on the graph:

**Finding the sales percentage to display the bars:**

-   This equation is valid for all the sections under early/late show

> $Section\  = \ ((Seating\  - \ Open)/Seating)*\ 100;$

-   Once the calculations were executed, this value was plotted on the
    width of the g.fillRect method:

> $g.fillRect(int\ x,\ int\ y,\ int\ width,\ int\ height)$

$$

**Finding the early and late sales and the combination of both:**

-   Early Sales:

> $Early\ Sales\ Stage\  = \ ((150\  - \ Open)*\ 60);$
>
> $Early\ Sales\ Main\ Floor = \ ((280\  - \ Open)*\ 40);$
>
> $Early\ Sales\ Balcony = \ ((250\  - \ Open)*\ 20);$
>
> $Total\ Early\ Sales = \ Early\ Sales\ Stage\  + Early\ Sales\ Main\ Floor\  + Early\ Sales\ Balcony\ \ \ $

-   Late Sales:

> $Late\ Sales\ Stage\  = \ ((150\  - \ Open)*\ 80);$
>
> $Late\ Sales\ Main\ Floor = \ ((280\  - \ Open)*\ 60);$
>
> $Late\ Sales\ Balcony = \ ((250\  - \ Open)*\ 30);$
>
> $Total\ Late\ Sales = \ Late\ \ Sales\ Stage\  + Late\ Sales\ Main\ Floor\  + Late\ Sales\ Balcony\ \ $

-   Combined Sales

> $Combined = \ Total\ Early\ Sales\  + \ Total\ Late\ Sales\ $

**[Saving the File]**

When users click on "File", they see two options: "Open" and "Save".
When clicking on "Open", another window pops up so they can type in the
name of the file they need to save.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/65c1edf3-8bd6-4bcc-9b8b-ff2b8aa8e983)


New Window prompts them to enter the name of the File they want to save:

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/577aec6a-ca5e-4791-80b5-b155764ef36e)


Confirmation Window letting them know the location where the file was
saved.

![image](https://github.com/pietradev/Concert-Ticket-Purchase-System/assets/123756392/c13a2467-1dda-48d2-b0a0-63d9d7ef0307)

**[Java Code]**

**Initial Window**

package testWorkspace;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import java.util.Scanner;

import java.awt.\*;

public class initialWindowTicketPurchase {

public static void main(String\[\] args) {

// TODO Auto-generated method stub

Scanner in = new Scanner(System.in);

//Main Dialog options

Object\[\] options = {\"Cancel\", \"Create Account\", \"Login\",
\"Staff\"};

int selection = JOptionPane.showOptionDialog(

null,//parent window

\"\\n \\t\\t\\t\\t\\t\\t\\t Concert Ticket Purchase
Systemn\\n\\n\\n\\n\",//text inside the dialog

\"Concert Tickets\",

JOptionPane.YES_NO_CANCEL_OPTION, //option type of the dialog

JOptionPane.QUESTION_MESSAGE,//MESSAGE TYPE

new ImageIcon(\"theater.png\"),

options,

options\[2\]

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

**Account Creation Window**

package testWorkspace;

import javax.swing.\*;

import java.util.Scanner;

import java.awt.\*;

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

if(userPassword.length() \>= 9) {

//verifying each letter from my userName

while(index \< userPassword.length()) {

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

if(digit \> 0 && upper \> 0 && lower \> 0) {

isValid = true;

}

}

else {

System.out.println(\"Invalid Password\");

isValid = false;

}

return isValid;

}

//Constructor to initiate these elements

public accountCreation() {

BufferedImage mainImage;

JLabel picLabel = new JLabel();

try{

mainImage = ImageIO.read(new File(\"UserCreationPhoto.png\"));

picLabel.setIcon(new ImageIcon(mainImage));

}

catch(IOException e1){

}

//Defining components - Frame, Panel, labels, input fields , button

createAcctGUI = new JFrame(\"Create a new account\");

accountPanel = new JPanel();

//Username section

userNameLabel = new JLabel(\"Enter a Username: \");

textFieldUserName = new JTextField(50);

//Password section

passwordLabel = new JLabel(\"Create a password:\");

textFieldPassword = new JTextField(9);

//Button section

createAcctButton = new JButton(\"Create Account\");

//Defining dimension of elements

//defining the dimensions of the frame and pane

createAcctGUI.setSize(500,500);

accountPanel.setLayout(null);

accountPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
\"Teather Tickets - Create Account\"));

picLabel.setSize(100,100);

picLabel.setBounds(110,60,110,100);

userNameLabel.setBounds(150,100,150,20); //x,y, width, height

textFieldUserName.setBounds(150, 120, 200, 20);

passwordLabel.setBounds(150, 140, 260, 20);

textFieldPassword.setBounds(150,170, 200, 20);

createAcctButton.setBounds(185,220,130,30);

//Adding the elements to the Panel and then adding the panel to the
frame

accountPanel.add(picLabel);

accountPanel.add(userNameLabel);

accountPanel.add(textFieldUserName);

accountPanel.add(passwordLabel);

accountPanel.add(textFieldPassword);

accountPanel.add(createAcctButton);

//adding panel to the frame

createAcctGUI.add(accountPanel);

createAcctGUI.setLocationRelativeTo(accountPanel); //centralizing the
location of the account panel

//Creating the frame

createAcctGUI.setVisible(true);

//action listener for the create account button

class ButtonListener implements ActionListener{

public void actionPerformed(ActionEvent e) {

System.out.println(\"Button Clicked\");

//storing the username and password input on the variable uName and
pWord respectively

String uName = textFieldUserName.getText();

String pWord = textFieldPassword.getText();

//validating inputs

boolean isPasswordValid = newUserPasswordValidation(pWord);

if(isPasswordValid) {

//writing the inputs on a txt file

try {

FileWriter userInfoWriter = new
FileWriter(\"user_account_data.txt\",true);

PrintWriter userInfoOut = new PrintWriter(userInfoWriter);

userInfoOut.write(uName + \'\\n\');

userInfoOut.write(pWord + \'\\n\');

userInfoOut.close();

} catch (IOException e1) {

// TODO Auto-generated catch block

}

JOptionPane.showMessageDialog(null, \"Your account has been sucessfully
created\", \"Account Created\",JOptionPane.INFORMATION_MESSAGE);

createAcctGUI.dispose();

}

else {

//print a message asking for a new password

JOptionPane.showMessageDialog(null, \"Invalid password has been entered.
Make sure your password has 1 digit, 1 Uppercase, 1 Lowercase and at
least length 9\", \"Invalid Password\",JOptionPane.WARNING_MESSAGE);

}

}

}

ButtonListener btnL = new ButtonListener();

createAcctButton.addActionListener(btnL);

}//end of constructor

}

/\*

\* \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

\* PSEUDOCODE

\* \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

\* 1) Ask user to input their user name and password

\* 2) Validate Password for length - 9 characters -\> must have one
uppercase, lowercase, and a digit

\* - Handle invalid input by displaying a message that says that the
password is invalid - should contain instructions for the user

\* 3) Store the password and username into a file for retrieval by the
login function (file handling)

\*

\* Step 1 - create a JFRAME

\* Step 2 - Add elements to the window

\* -\> Username input + label

\* -\> Password input + label

\* -\>Buttons: Cancel and Create Account

\*

\*

\*

\* \*/

**Login Window**

package testWorkspace;

import javax.swing.\*;

import java.util.Scanner;

import java.awt.\*;

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

String user = \"\";

String pass = \"\";

try {

Scanner in = new Scanner (new File(\"user_account_data.txt\"));

while(in.hasNextLine()) {

user = in.nextLine();

if(in.hasNextLine()) {

pass = in.nextLine();

}

if(user.equals(userName) && pass.equals(password)) {

System.out.println(\"we have a match\");

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

// try{

// mainImage = ImageIO.read(new File(\"UserCreationPhoto.png\"));

// picLabel.setIcon(new ImageIcon(mainImage));

// }

// catch(IOException e1){

//

// }

//Defining components - Frame, Panel, labels, input fields , button

createAcctGUI = new JFrame(\"Account Login\");

accountPanel = new JPanel();

//Username section

userNameLabel = new JLabel(\"Username: \");

textFieldUserName = new JTextField(50);

//Password section

passwordLabel = new JLabel(\"Password:\");

textFieldPassword = new JTextField(9);

//Button section

createAcctButton = new JButton(\"Continue\");

//Defining dimension of elements

//defining the dimensions of the frame and pane

createAcctGUI.setSize(500,500);

accountPanel.setLayout(null);

accountPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
\"Account Login\"));

picLabel.setSize(100,100);

picLabel.setBounds(110,60,110,100);

userNameLabel.setBounds(150,100,150,20); //x,y, width, height

textFieldUserName.setBounds(150, 120, 200, 20);

passwordLabel.setBounds(150, 140, 260, 20);

textFieldPassword.setBounds(150,170, 200, 20);

createAcctButton.setBounds(185,220,130,30);

//Adding the elements to the Panel and then adding the panel to the
frame

accountPanel.add(picLabel);

accountPanel.add(userNameLabel);

accountPanel.add(textFieldUserName);

accountPanel.add(passwordLabel);

accountPanel.add(textFieldPassword);

accountPanel.add(createAcctButton);

//adding panel to the frame

createAcctGUI.add(accountPanel);

createAcctGUI.setLocationRelativeTo(accountPanel); //centralizing the
location of the account panel

//Creating the frame

createAcctGUI.setVisible(true);

//action listener for the create account button

class ButtonListener implements ActionListener{

public void actionPerformed(ActionEvent e) {

System.out.println(\"Button Clicked\");

//storing the username and password input on the variable uName and
pWord respectively

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

JOptionPane.showMessageDialog(null, \"Invalid Username or Password\",
\"Invalid Account/Password\", JOptionPane.ERROR_MESSAGE);

}

}

}

createAcctButton.addActionListener(new ButtonListener());

}

}

**Purchase Window**

package testWorkspace;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Color;

import java.awt.Component;

import java.awt.Dimension;

import java.awt.Font;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;

import java.awt.Insets;

import java.awt.image.BufferedImage;

import java.io.BufferedWriter;

import java.io.Closeable;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.HashMap;

import java.util.Locale;

import java.util.Scanner;

import javax.imageio.ImageIO;

import javax.swing.\*;

import javax.swing.SpringLayout.Constraints;

public class purchaseInterface extends JFrame{

//Creating a hashMap to store the number of seats per secyion

HashMap\<String, Integer\> stages = new HashMap\<String,Integer\>();

/\*Declaring \"global\" variables \*/

int finalNumberOfSeatsStage,finalNumberOfSeatsMainFloor,
finalNumberOfSeatsBalcony;

int selectedTickets;

//variables receive the section selected and the show time

//Selected Items from dropdown

String selectedItemShowTime;

String selectedSection;

String showTimeSelected;

//variable receives final ticket price after user selection

int totalToBePaid;

boolean stage = false, mainFloor = false, balcony = false;

//boolean aux graying out the dropdown according to the number of
tickets

boolean stageAvailability = true, mainFloorAvailability = true,
balconyAvailability = true;

/\*End global variables\*/

int numberTicketsListener = 0;

//elements from the Frame/panel

JFrame purchaseWindow;

JPanel mainPanel, purchasePanel, imagePanel;

JPanel bottonPanel;

JButton purchaseButton;

BufferedImage myPicture;

GridBagConstraints con = new GridBagConstraints();

String sectionOptions \[\] = {\"\",\"Stage Side\", \"Main Floor\",
\"Balcony\"};

String showTimeOptions \[\] = {\"\",\"Early Show\", \"Late Show\"};

String numberTicketsOptions \[\] =
{\"\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"};

//initializing the dropdowns and their labels

JLabel label1 = new JLabel (\"Show Time:\");

final JComboBox\<String\> showTime = new
JComboBox\<String\>(showTimeOptions);

JLabel label2 = new JLabel (\"Sections:\");

final JComboBox\<String\> theaterSection = new
JComboBox\<String\>(sectionOptions);

JLabel label3 = new JLabel (\"Number of Tickets:\");

final JComboBox\<String\> numberOfTickets = new
JComboBox\<String\>(numberTicketsOptions);

JLabel totalPrice = new JLabel(\"Total Price:\" );

//functions that populate each portion of the Panel (Right, Left, Up,
Down)

public void populateRightPanel(JPanel rightPanel) {

//defining Right Panel dimensions

rightPanel.setPreferredSize(new Dimension(350,500));

rightPanel.setSize(380,200);

//rightPanel.setBackground(new Color(153,102,255));

rightPanel.setLayout(null);

//defining the label related to this panel

JLabel rightPanelLabel = new JLabel(\"Welcome to the Galaxy Theater\");

rightPanelLabel.setFont(new Font(\"Arial\", Font.ITALIC, 25));

rightPanel.add(Box.createRigidArea(new Dimension(360,40)));

//dropdown and label dimension

rightPanel.setBounds(100,100,200,30);

label1.setBounds(125, 115, 150, 25);

label2.setBounds(125, 185, 150, 25);

label3.setBounds(125, 245, 150, 25);

showTime.setBounds(125, 150, 150, 25);

theaterSection.setBounds(125, 210, 150, 25);

numberOfTickets.setBounds(125, 270, 150, 25);

totalPrice.setFont(new Font(\"Arial\", Font.BOLD, 15));

totalPrice.setBounds(125, 315, 170, 25);

//Adding elements to the Panel

GridBagConstraints constraints = new GridBagConstraints();

constraints.gridx = 4;

rightPanel.add(rightPanelLabel);

rightPanel.add(label1);

rightPanel.add(theaterSection, constraints);

rightPanel.add(label2);

rightPanel.add(showTime, constraints);

rightPanel.add(label3);

rightPanel.add(numberOfTickets, constraints);

rightPanel.add(totalPrice);

}

public void populateLeftPanel(JPanel leftPanel) {

//defining Left Panel dimensions

leftPanel.setPreferredSize(new Dimension(300,500));

leftPanel.setSize(180,200);

//leftPanel.setBackground(new Color(5,5,255));

leftPanel.setLayout(new GridBagLayout());

GridBagConstraints con = new GridBagConstraints();

con.insets = new Insets(10,10,10,10);

con.weightx = 0.5;

try {

myPicture = ImageIO.read(new File(\"theater.png\"));

JLabel picLabel = new JLabel(new ImageIcon(myPicture));

con.gridx = 0;

con.gridy = 4;

con.gridwidth = 4;

con.anchor = GridBagConstraints.CENTER;

leftPanel.add(picLabel, con);

}

catch(IOException e) {

e.printStackTrace();

}

}

public void populateBottomPanel(JPanel bottomPanel) {

//defining Right Panel dimensions

bottomPanel.setPreferredSize(new Dimension(700,600));

bottomPanel.setSize(380,200);

// //bottomPanel.setBackground(new Color(13,255,255));

bottomPanel.setLayout(null);

purchaseButton = new JButton(\"Purchase Ticket\");

purchaseButton.setBounds(300,50, 150, 50);

bottomPanel.add(purchaseButton);

}

public void compareTickets(HashMap stages, int numberTickets) {

int stageSeats = (int) stages.get(\"Stage Side\");

int mainFloorSeats = (int) stages.get(\"Main Floor\");

int balconySeats = (int) stages.get(\"Balcony\");

System.out.println(stageSeats +\"-\"+ mainFloorSeats +\"-\"+
balconySeats);

if(stageSeats \< numberTickets) {

stageAvailability = false;

}

else if(stageSeats \>= numberTickets) {

stageAvailability = true;

}

if(mainFloorSeats \< numberTickets) {

mainFloorAvailability = false;

}

else if(mainFloorSeats \>= numberTickets) {

mainFloorAvailability = true;

}

if(balconySeats \< numberTickets) {

balconyAvailability = false;

}

else if(balconySeats \>= numberTickets) {

balconyAvailability = true;

}

System.out.println(\"Stage Availability: \" + stageAvailability
+\"\\n\" + \"Main Floor: \" + mainFloorAvailability +\"\\n\" +
\"Balcony: \" + balconyAvailability +\"\\n\");

}

public void setHashMapSeatInformation(HashMap stages) {

//the number of seats on the txt file follows the following order

// Position 1 - Stage side seats

// Position 2 - Main Floor seats

//Position 3 - Balcony seats

int numberSeatsStage = 0;

int numberSeatsMainFloor = 0;

int numberSeatsBalcony = 0;

try {

//reading number of seats Stage file

Scanner in = new Scanner (new File(\"StageSideSeats.txt\"));

numberSeatsStage = in.nextInt();

in.close();

//reading number of seats Main Floor

in = new Scanner (new File(\"mainFloorNumberSeats.txt\"));

numberSeatsMainFloor = in.nextInt();

in.close();

//reading number of seats Balcony

in = new Scanner (new File(\"balconyNumberSeats.txt\"));

numberSeatsBalcony = in.nextInt();

in.close();

//initializing the stage hash

stages.put(\"Stage Side\", numberSeatsStage);

stages.put(\"Main Floor\", numberSeatsMainFloor);

stages.put(\"Balcony\",numberSeatsBalcony);

}

catch(Exception e) {

System.out.println(\"No seats were found\");

}

}

public void updateSeatInformation(String fileNameUpdateSeat, int
finalNumberOfSeats) {

//the number of seats on the txt file follows the following order

// Position 1 - Stage side seats

// Position 2 - Main Floor seats

//Position 3 - Balcony seats

try {

String numberSeats = Integer.toString(finalNumberOfSeats);

//reading number of seats Stage file

FileWriter fw = new FileWriter(fileNameUpdateSeat,false);

PrintWriter newSeat = new PrintWriter(fw);

newSeat.write(numberSeats);

newSeat.close();

fw.close();

}

catch(Exception e) {

System.out.println(\"\");

}

}

public void updateTotalPrice(HashMap stages) {

selectedSection = (String) theaterSection.getSelectedItem();

showTimeSelected = (String) showTime.getSelectedItem();

selectedTickets = numberOfTickets.getSelectedIndex(); // Assuming the
first index is \"0\" which should not affect the calculation

int pricePerTicket = 0;

if (\"Stage Side\".equals(selectedSection) && \"Early
Show\".equals(showTimeSelected) && stageAvailability) {

pricePerTicket = 60;

System.out.println(stages.get(\"Stage Side\"));

int seatsStage = (int) stages.get(\"Stage Side\");

finalNumberOfSeatsStage = seatsStage - selectedTickets;

System.out.println(finalNumberOfSeatsStage);

stage = true;

} else if(\"Stage Side\".equals(selectedSection) && \"Late
Show\".equals(showTimeSelected) && stageAvailability) {

pricePerTicket = 80;

int seatsStage = (int) stages.get(\"Stage Side\");

finalNumberOfSeatsStage = seatsStage - selectedTickets;

stage = true;

}

if(\"Main Floor\".equals(selectedSection)&& \"Early
Show\".equals(showTimeSelected) && mainFloorAvailability) {

pricePerTicket = 40;

int seatsStage = (int) stages.get(\"Main Floor\");

finalNumberOfSeatsMainFloor = seatsStage - selectedTickets;

mainFloor = true;

} else if (\"Main Floor\".equals(selectedSection)&& \"Late
Show\".equals(showTimeSelected) && mainFloorAvailability) {

pricePerTicket = 60;

int seatsStage = (int) stages.get(\"Main Floor\");

finalNumberOfSeatsMainFloor = seatsStage - selectedTickets;

mainFloor = true;

}

if(\"Balcony\".equals(selectedSection)&& \"Early
Show\".equals(showTimeSelected) && balconyAvailability) {

pricePerTicket = 20;

int seatsStage = (int) stages.get(\"Balcony\");

finalNumberOfSeatsBalcony = seatsStage - selectedTickets;

balcony = true;

} else if (\"Balcony\".equals(selectedSection)&& \"Late
Show\".equals(showTimeSelected) && balconyAvailability) {

pricePerTicket = 30;

int seatsStage = (int) stages.get(\"Balcony\");

finalNumberOfSeatsBalcony = seatsStage - selectedTickets;

balcony = true;

}

totalToBePaid = pricePerTicket \* selectedTickets;

totalPrice.setText(\"Total to be paid: \$\" + totalToBePaid);

purchasePanel.revalidate();

purchasePanel.repaint();

}

public purchaseInterface() {

//initializing the stage hash

setHashMapSeatInformation(stages);

//Creating and Initializng the Frame Object

purchaseWindow = new JFrame(\"Purchasing a Ticket\");

//Creating each Panel Object

mainPanel = new JPanel();

purchasePanel = new JPanel();

imagePanel = new JPanel();

bottonPanel = new JPanel();

/\*defining dimensions of elements\*/

//Frame dimension

purchaseWindow.setSize(700,700);

mainPanel.setSize(700,700);

//initializing each Panel

populateLeftPanel(imagePanel);

populateRightPanel(purchasePanel);

populateBottomPanel(bottonPanel);

//adding panel to the frame

mainPanel.add(imagePanel);

mainPanel.add(purchasePanel);

mainPanel.add(bottonPanel);

purchaseWindow.add(mainPanel);

purchaseWindow.setLocationRelativeTo(mainPanel);

//creating the frame

purchaseWindow.setVisible(true);

//adding a listener to the dropdown Tickets

numberOfTickets.addActionListener(new ActionListener() {

\@Override

public void actionPerformed(ActionEvent e) {

// This code is executed when the user selects an item

int selectedItem = Integer.parseInt((String)
numberOfTickets.getSelectedItem()) ;

numberTicketsListener = selectedItem;

System.out.println(numberTicketsListener);

//checking if there are seats available

compareTickets(stages, selectedItem);

updateTotalPrice(stages);

}

});

//listener to time of the show

showTime.addActionListener(new ActionListener() {

\@Override

public void actionPerformed(ActionEvent e) {

// This code is executed when the user selects an item

selectedItemShowTime = (String) (showTime.getSelectedItem()) ;

//checking if there are seats available

}

});

class DisabledItemRenderer extends DefaultListCellRenderer {

\@Override

public Component getListCellRendererComponent(JList\<?\> list, Object
value, int index, boolean isSelected, boolean cellHasFocus) {

Component component = super.getListCellRendererComponent(list, value,
index, isSelected, cellHasFocus);

// Change the condition based on your availability logic

if ((value.equals(\"Stage Side\") && !stageAvailability) \|\|

(value.equals(\"Main Floor\") && !mainFloorAvailability) \|\|

(value.equals(\"Balcony\") && !balconyAvailability)) {

component.setEnabled(false);

component.setForeground(Color.GRAY);

} else {

component.setEnabled(true);

component.setForeground(Color.BLACK);

}

return component;

}

}

// Setting custom renderer for theaterSection JComboBox to visually
disable options

theaterSection.setRenderer(new DisabledItemRenderer());

// Adding ActionListener to theaterSection to prevent selection of
disabled sections

theaterSection.addActionListener(new ActionListener() {

private String lastSelection = sectionOptions\[0\]; // Assuming the
first option is a default or placeholder

\@Override

public void actionPerformed(ActionEvent e) {

JComboBox\<String\> cb = (JComboBox\<String\>) e.getSource();

String selectedSection = (String) cb.getSelectedItem();

// Logic to determine if the selected section is unavailable

if ((selectedSection.equals(\"Stage Side\") && !stageAvailability) \|\|

(selectedSection.equals(\"Main Floor\") && !mainFloorAvailability) \|\|

(selectedSection.equals(\"Balcony\") && !balconyAvailability)) {

// Optionally, show a dialog or warning that the selection is
unavailable

JOptionPane.showMessageDialog(purchaseWindow, \"This section is not
available.\", \"Selection Error\", JOptionPane.ERROR_MESSAGE);

// Revert to last valid selection or default

cb.setSelectedItem(lastSelection);

} else {

// Update lastSelection if the selected section is available

lastSelection = selectedSection;

updateTotalPrice(stages);

}

}

});

//action listener for the purchase button

class ButtonListener implements ActionListener{

public void actionPerformed(ActionEvent e) {

//new purchaseInterface(); -\> exhibit new window

//update txt file

if(stage) {

updateSeatInformation(\"StageSideSeats.txt\", finalNumberOfSeatsStage);

}

else if(mainFloor) {

updateSeatInformation(\"mainFloorNumberSeats.txt\",
finalNumberOfSeatsMainFloor);

}

else if(balcony){

updateSeatInformation(\"balconyNumberSeats.txt\",
finalNumberOfSeatsBalcony);

}

//Confirmation Window

//Current date info

LocalDateTime now = LocalDateTime.now();

// If you want to format the date and time, you can use a
DateTimeFormatter

DateTimeFormatter formatter = DateTimeFormatter.ofPattern(\"EEEE, MMMM
d, yyyy, hh:mm a\", Locale.ENGLISH);

String formattedDateTime = now.format(formatter);

// Details of the ticket purchase to display

String message = String.format(\"\<html\>\<body\>\"

\+ \"\<h2\>Ticket Purchase Confirmed - %s\</h2\>\"

\+ \"\<p\>Thank you for purchasing %d tickets on the %s for the
%s.\</p\>\"

\+ \"\<p\>The price is \$%d.\</p\>\"

\+ \"\<p\>We hope you enjoy the show.\</p\>\"

\+ \"\<p\>Cancellations must be made by calling (800) Galaxy1.\</p\>\"

\+ \"\</body\>\</html\>\",
formattedDateTime,selectedTickets,selectedSection,showTimeSelected,
totalToBePaid);

// Show the confirmation dialog

JOptionPane.showMessageDialog(null, message, \"Ticket Purchase
Confirmed - \"+formattedDateTime, JOptionPane.INFORMATION_MESSAGE);

}

}

purchaseButton.addActionListener(new ButtonListener());

}

}

**Staff Window**

package testWorkspace;

import javax.swing.\*;

import java.awt.\*;

import java.awt.event.\*;

import java.io.File;

import java.util.Scanner;

import javax.swing.filechooser.\*;

public class staffWindow extends JFrame {

double calcEarlySales,calcLateShow;

double eSalesStage, lSalesStage;

double eSalesMain, lSalesMain;

double eSalesBalcony, lSalesBalcony;

private void openFile() {

JFileChooser fileChooser = new JFileChooser();

fileChooser.setAcceptAllFileFilterUsed(false);

FileNameExtensionFilter filter = new FileNameExtensionFilter(\"Text
Files\", \"txt\", \"doc\");

fileChooser.addChoosableFileFilter(filter);

int result = fileChooser.showOpenDialog(this);

if (result == JFileChooser.APPROVE_OPTION) {

File selectedFile = fileChooser.getSelectedFile();

JOptionPane.showMessageDialog(this, \"Selected file: \" +
selectedFile.getAbsolutePath());

}

}

private void saveFile() {

JFileChooser fileChooser = new JFileChooser();

fileChooser.setDialogTitle(\"Specify a file to save\");

int userSelection = fileChooser.showSaveDialog(this);

if (userSelection == JFileChooser.APPROVE_OPTION) {

File fileToSave = fileChooser.getSelectedFile();

JOptionPane.showMessageDialog(this, \"Save as file: \" +
fileToSave.getAbsolutePath());

}

}

public static String fileOpenAndRead() {

File workingDir = new File(System.getProperty(\"user.dir\"));

JFileChooser chooser = new JFileChooser();

chooser.setDialogTitle(\"Choose a Data File\");

chooser.setCurrentDirectory(workingDir);

int status = chooser.showOpenDialog(null);

try {

if(status != JFileChooser.APPROVE_OPTION) {

return null;

}

else {

File file = chooser.getSelectedFile();

Scanner scan = new Scanner(file);

StringBuilder info = new StringBuilder();

while(scan.hasNext()) {

info.append(scan.nextLine());

info.append(\"\\n\");

}

scan.close();

return info.toString();

}

}catch(Exception e) {

return null;

}

}

public static String getStageSeats(String \[\] arrayOfSeats) {

String numberSeats;

numberSeats = arrayOfSeats\[0\];

return numberSeats;

}

public static String getMainSeats(String \[\] arrayOfSeats) {

String numberSeats;

numberSeats = arrayOfSeats\[1\];

return numberSeats;

}

public static String getBalconySeats(String \[\] arrayOfSeats) {

String numberSeats;

numberSeats = arrayOfSeats\[2\];

return numberSeats;

}

public staffWindow() {

//Frame setup

setTitle(\"Staff Operations\"); // Sets the title of the JFrame

setSize(600, 600); // Sets the size of the JFrame

setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Sets the default
close operation

setLocationRelativeTo(null); // Centers the frame on the screen

//Creating the Menu Bar

JMenuBar mBar = new JMenuBar();

//Creating the menu tab

JMenu fileMenu = new JMenu(\"File\");

//Creating the options of the file Menu

JMenuItem openItem = new JMenuItem(\"Open\");

JMenuItem saveItem = new JMenuItem(\"Save\");

//adding the options to the menu

fileMenu.add(openItem);

fileMenu.add(saveItem);

//adding the file tab to the menuBar

mBar.add(fileMenu);

//adding the menu to the frame

setJMenuBar(mBar);

//setting up a listener to each option of the menu bar

openItem.addActionListener(e -\> openFile());

saveItem.addActionListener(e -\> saveFile());

/\*Receiving and treating the info that comes from the txt file\*/

//receiving the info from the txt file once users select a file

String ticketsData= fileOpenAndRead();

//dividing the info according to Early and Late shows

String \[\] splitTickets= ticketsData.split(\"\\n\");

System.out.println(splitTickets\[0\]);

String \[\] earlyShow = splitTickets\[0\].split(\";\");

String \[\] lateShow = splitTickets\[1\].split(\";\");

//getting the number of seats available so we can write on the panel

String earlyStageSeats = getStageSeats(earlyShow);

String earlyMainSeats = getMainSeats(earlyShow);

String earlyBalconySeats = getBalconySeats(earlyShow);

String lateStageSeats = getStageSeats(lateShow);

String lateMainSeats = getMainSeats(lateShow);

String lateBalconySeats = getBalconySeats(lateShow);

/\*

parsing the seat data to double so we can calculate the totals

and add to the panel at the bottom

\*/

//Early Show Info

double eStageSeat = Double.parseDouble(earlyStageSeats);

//multiplying by the Stageprice

eSalesStage = ((150 - eStageSeat)\* 60);

double eMainSeat = Double.parseDouble(earlyMainSeats);

eSalesMain = ((280 - eMainSeat) \*40);

double eBalcony = Double.parseDouble(earlyBalconySeats);

//multiplying by the balcony price

eSalesBalcony = ((250 - eBalcony) \* 20);

//calculating total sales for early show

calcEarlySales = eSalesStage + eSalesMain + eSalesBalcony;

//Late Show Info

double lStage = Double.parseDouble(lateStageSeats);

lSalesStage = ((150 - lStage) \*80);

double lMain = Double.parseDouble(lateMainSeats);

lSalesMain = ((280 - lMain) \* 60);

double lBalcony = Double.parseDouble(lateBalconySeats);

lSalesBalcony = ((250 - lBalcony) \*30);

//calculating total sales for late show

calcLateShow = lSalesStage + lSalesMain + lSalesBalcony;

// Main content panel with BorderLayout

JPanel contentPanel = new JPanel(new BorderLayout());

setContentPane(contentPanel); // Use this panel as the main content pane

/\*RIGHT PANEL COMPONENTS\*/

//Creating the Right Panel

JPanel rightPanel = new JPanel();

rightPanel.setPreferredSize(new Dimension(360,500));

rightPanel.setLayout(null);

//defining other elements from this panel

JLabel rightPanelLabel = new JLabel(\"Ticket Sales Status\");

rightPanelLabel.setFont(new Font(\"Arial\", Font.BOLD, 15));

//Label Dimensions

rightPanelLabel.setBounds(50, -50, 150, 200);

//Adding elements to the Panel

GridBagConstraints constraints = new GridBagConstraints();

constraints.gridx = 4;

// Set the background color

rightPanel.setBackground(Color.white);

rightPanel.add(rightPanelLabel);

//creating another panel to add the graph

JPanel graph = new JPanel();

graph.setBounds(50,150,200,170);

JComponent comp = new JComponent() {

public void paintComponent(Graphics g) {

super.paintComponent(g);

int auxMathInt = (int) (((150 - eStageSeat) /150 )\*100.0);

g.setColor(Color.PINK);

g.fillRect(10,10,auxMathInt,10);

//multiplying by the Main price

auxMathInt = (int) (((280 - eMainSeat) /280 )\*100.0);

g.setColor(Color.GREEN);

g.fillRect(10,30,auxMathInt,10);

auxMathInt = (int) (((250 - eBalcony) /250 )\*100.0);

g.setColor(Color.BLUE);

g.fillRect(10,50,auxMathInt,10);

//Late Show Data

auxMathInt = (int) (((280 - lStage) /280 )\*100.0);

g.setColor(Color.PINK);

g.fillRect(10,90,auxMathInt,10);

//finding the Main percentual in int

auxMathInt = (int) (((280 - lMain) /280 )\*100.0);

g.setColor(Color.GREEN);

g.fillRect(10,110,auxMathInt,10);

auxMathInt = (int) (((250 - lBalcony) /250 )\*100.0);

g.setColor(Color.BLUE);

g.fillRect(10,130,auxMathInt,10);

}

};

comp.setPreferredSize(new Dimension(200,200));

graph.add(comp);

rightPanel.add(graph);

// Add the right panel to the right side of the frame

contentPanel.add(rightPanel, BorderLayout.EAST); // Add to the EAST to
occupy the right side

/\*END RIGHT PANEL\*/

/\*LEFT PANEL COMPONENTS\*/

// Left Panel

JPanel leftPanel = new JPanel();

leftPanel.setPreferredSize(new Dimension(370,500));

leftPanel.setSize(370,200);

//rightPanel.setBackground(new Color(153,102,255));

leftPanel.setLayout(null);

leftPanel.add(Box.createRigidArea(new Dimension(370,40)));

//defining other elements from this panel

JLabel leftPanelLabel = new JLabel(\"Staff Seating Update\");

JLabel updateTitle = new JLabel(\"Update\");

JLabel earlyTitle = new JLabel (\"Early Show\");

JLabel seatingOpen = new JLabel(\"Seating Open\");

JLabel earlyStageTitle = new JLabel(\"Stage Side\");

JLabel earlyMainTitle = new JLabel(\"Main Floor\");

JLabel earlyBalconyTitle = new JLabel(\"Balcony\");

JLabel lateStageTitle = new JLabel(\"Stage Side\");

JLabel lateMainTitle = new JLabel(\"Main Floor\");

JLabel lateBalconyTitle = new JLabel(\"Balcony\");

JLabel lateShowTitle = new JLabel (\"Late Show\");

JLabel earlySeatingStage = new JLabel (\"(150) /\");

JLabel earlySeatingMain = new JLabel (\"(280) /\");

JLabel earlySeatingBalcony = new JLabel (\"(250) /\");

JLabel lateSeatingStage = new JLabel (\"(150) /\");

JLabel lateSeatingMain = new JLabel (\"(280) /\");

JLabel lateSeatingBalcony = new JLabel (\"(250) /\");

JLabel earlyStageOpen = new JLabel(earlyStageSeats);

JLabel earlyMainOpen = new JLabel(earlyMainSeats);

JLabel earlyBalconyOpen = new JLabel(earlyBalconySeats);

JLabel lateStageOpen = new JLabel(lateStageSeats);

JLabel lateMainOpen = new JLabel(lateMainSeats);

JLabel lateBalconyOpen = new JLabel(lateBalconySeats);

//Label Dimensions

leftPanelLabel.setBounds(10, 90, 150, 25);

updateTitle.setBounds(140, 90, 150, 25);

earlyTitle.setBounds(10,120, 150,25);

seatingOpen.setBounds(140,140, 170, 25);

//Early Show Labels

earlyStageTitle.setBounds(10,160, 150, 25);

earlySeatingStage.setBounds(150,160, 150, 25);

earlyStageOpen.setBounds(200,160, 150, 25);

earlyMainTitle.setBounds(10,175, 150, 25);

earlySeatingMain.setBounds(150, 175,150,25);

earlyMainOpen.setBounds(200,175,150,25);

earlyBalconyTitle.setBounds(10,190, 150, 25);

earlySeatingBalcony.setBounds(150,190,150,25);

earlyBalconyOpen.setBounds(200,190,150,25);

//Late Show Labels

lateShowTitle.setBounds(10,220,150,25);

lateStageTitle.setBounds(10,240, 150, 25);

lateSeatingStage.setBounds(150,240, 150, 25);

lateStageOpen.setBounds(200,240, 150, 25);

lateMainTitle.setBounds(10,255, 150, 25);

lateSeatingMain.setBounds(150, 255,150,25);

lateMainOpen.setBounds(200,255,150,25);

lateBalconyTitle.setBounds(10,270, 150, 25);

lateSeatingBalcony.setBounds(150,270,150,25);

lateBalconyOpen.setBounds(200,270,150,25);

// label2.setBounds(125, 185, 150, 25);

// label3.setBounds(125, 245, 150, 25);

// showTime.setBounds(125, 150, 150, 25);

// theaterSection.setBounds(125, 210, 150, 25);

// numberOfTickets.setBounds(125, 270, 150, 25);

// totalPrice.setFont(new Font(\"Arial\", Font.BOLD, 15));

// totalPrice.setBounds(125, 315, 170, 25);

//Adding elements to the Panel

constraints.gridx = 4;

leftPanel.add(leftPanelLabel);

leftPanel.add(updateTitle);

leftPanel.add(earlyTitle);

leftPanel.add(seatingOpen);

leftPanel.add(earlyStageTitle);

leftPanel.add(earlySeatingStage);

leftPanel.add(earlyStageOpen);

leftPanel.add(earlyMainTitle);

leftPanel.add(earlySeatingMain);

leftPanel.add(earlyMainOpen);

leftPanel.add(earlyBalconyTitle);

leftPanel.add(earlySeatingBalcony);

leftPanel.add(earlyBalconyOpen);

leftPanel.add(lateShowTitle);

leftPanel.add(lateStageTitle);

leftPanel.add(lateSeatingStage);

leftPanel.add(lateStageOpen);

leftPanel.add(lateMainTitle);

leftPanel.add(lateSeatingMain);

leftPanel.add(lateMainOpen);

leftPanel.add(lateBalconyTitle);

leftPanel.add(lateSeatingBalcony);

leftPanel.add(lateBalconyOpen);

/\*End of Left Panel Components\*/

// Left Pane Set up - Set the preferred size or min/max size of
rightPanel if you need to control its sizing

leftPanel.setBackground(Color.WHITE); // Set a different background
color to differentiate

// leftPanel.setPreferredSize(new Dimension(300, 200));

contentPanel.add(leftPanel, BorderLayout.WEST); // This panel will
occupy the rest of the space

/\*BOTTOM PANEL COMPONENTS\*/

//Bottom Pane - creating the bottom Pane to add the total earnings

JPanel bottomPanel = new JPanel();

//Creating the Bottom Panel

String salesInfo = String.format(\"\<html\>\<body\>\"

\+ \"\<table\>\"

\+ \"\<tr\>\<td\>Early Sales:\</td\> \<td style=\'text-align:
right;\'\>\$%,.2f\</td\>\</tr\>\"

\+ \"\<tr\>\<td\>Late Show Sales:\</td\> \<td style=\'text-align:
right;\'\>\$%,.2f\</td\>\</tr\>\"

\+ \"\<tr\>\<td\>Combined:\</td\> \<td style=\'text-align:
right;\'\>\$%,.2f\</td\>\</tr\>\"

\+ \"\</table\>\"

\+ \"\</body\>\</html\>\", calcEarlySales, calcLateShow,
calcEarlySales + calcLateShow);

JLabel salesInf = new JLabel(salesInfo);

// bottomPanel.setPreferredSize(new Dimension(100,100));

bottomPanel.setLayout(null);

salesInf.setBounds(220,5,310,90);

bottomPanel.setBackground(Color.pink);

bottomPanel.setPreferredSize(new Dimension(100,100));

bottomPanel.add(salesInf);

contentPanel.add(bottomPanel, BorderLayout.SOUTH);

setVisible(true);

}

}
