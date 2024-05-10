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
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;



public class purchaseInterface extends JFrame{
	
	//Creating a hashMap to store the number of seats per secyion
	HashMap<String, Integer> stages = new HashMap<String,Integer>();

	/*Declaring "global" variables */
	
	
    int finalNumberOfSeatsStage,finalNumberOfSeatsMainFloor, finalNumberOfSeatsBalcony; 
    int selectedTickets;
    
    //variables receive the section selected and the show time
	//Selected Items from dropdown
	String selectedItemShowTime;
    String selectedSection;
    String showTimeSelected;
    
    //variable receives final ticket price after user selection
    int totalToBePaid;
    boolean stage = false, mainFloor = false, balcony = false;
    
	//boolean aux graying out the dropdown according to the number of tickets
	boolean stageAvailability = true, mainFloorAvailability = true,  balconyAvailability = true;
	
	/*End global variables*/
	
	int numberTicketsListener = 0;
	
	//elements from the Frame/panel
	JFrame purchaseWindow;
	JPanel mainPanel, purchasePanel, imagePanel;
	JPanel bottonPanel;
	JButton purchaseButton;
	BufferedImage myPicture;
	GridBagConstraints con = new GridBagConstraints();
	
	
	String sectionOptions [] = {"","Stage Side", "Main Floor", "Balcony"};	
	String showTimeOptions [] = {"","Early Show", "Late Show"};
	String numberTicketsOptions [] = {"","1","2","3","4","5","6"};
	
	//initializing the dropdowns and their labels
	JLabel label1 = new JLabel ("Show Time:");
	final JComboBox<String> showTime = new JComboBox<String>(showTimeOptions);
	JLabel label2 = new JLabel ("Sections:");
	final JComboBox<String>  theaterSection = new JComboBox<String>(sectionOptions);
	JLabel label3 = new JLabel ("Number of Tickets:");
	final JComboBox<String>  numberOfTickets = new JComboBox<String>(numberTicketsOptions);
	JLabel totalPrice = new JLabel("Total Price:" );

//functions that populate each portion of the Panel (Right, Left, Up, Down)
	public void populateRightPanel(JPanel rightPanel) {

		
		//defining Right Panel dimensions
		rightPanel.setPreferredSize(new Dimension(350,500));
		rightPanel.setSize(380,200);
		
		//rightPanel.setBackground(new Color(153,102,255));
		rightPanel.setLayout(null);
		
		//defining the label related to this panel
		JLabel rightPanelLabel = new JLabel("Welcome to the Galaxy Theater");
		rightPanelLabel.setFont(new Font("Arial", Font.ITALIC, 25));
		rightPanel.add(Box.createRigidArea(new Dimension(360,40)));

		
		
		
		
		//dropdown and label dimension
		rightPanel.setBounds(100,100,200,30);
		label1.setBounds(125, 115, 150, 25);
		label2.setBounds(125, 185, 150, 25);
		label3.setBounds(125, 245, 150, 25);
		showTime.setBounds(125, 150, 150, 25);
		theaterSection.setBounds(125, 210, 150, 25);
		numberOfTickets.setBounds(125, 270, 150, 25);
	    totalPrice.setFont(new Font("Arial", Font.BOLD, 15));
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
			myPicture = ImageIO.read(new File("theater.png"));
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
//			//bottomPanel.setBackground(new Color(13,255,255));
			bottomPanel.setLayout(null);
			
			
			purchaseButton = new JButton("Purchase Ticket");
			purchaseButton.setBounds(300,50, 150, 50);
			bottomPanel.add(purchaseButton);
	}
	
	public void compareTickets(HashMap stages, int numberTickets) {

		int stageSeats = (int) stages.get("Stage Side");
		int mainFloorSeats = (int) stages.get("Main Floor");
		int balconySeats = (int) stages.get("Balcony");
		
		System.out.println(stageSeats +"-"+  mainFloorSeats +"-"+ balconySeats);
		
		if(stageSeats < numberTickets) {
			
			stageAvailability = false;
		
		}
		else if(stageSeats >= numberTickets) {
			stageAvailability = true;
		}
		
		if(mainFloorSeats < numberTickets) {
			
			mainFloorAvailability = false;
		}
		else if(mainFloorSeats >= numberTickets) {
			
			mainFloorAvailability = true;
		}
		
		if(balconySeats < numberTickets) {
			
			balconyAvailability = false;
		}
		else if(balconySeats >= numberTickets) {
			
			balconyAvailability = true;
		}	
		
		System.out.println("Stage Availability: " + stageAvailability +"\n" + "Main Floor: " + mainFloorAvailability +"\n" + "Balcony: " + balconyAvailability +"\n");
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
			
			
			Scanner in = new Scanner (new File("StageSideSeats.txt"));
			numberSeatsStage = in.nextInt();
			in.close();
			
			//reading number of seats Main Floor
			in = new Scanner (new File("mainFloorNumberSeats.txt"));
			numberSeatsMainFloor = in.nextInt();
			in.close();
			
			//reading number of seats Balcony
			in = new Scanner (new File("balconyNumberSeats.txt"));
			numberSeatsBalcony = in.nextInt();
			in.close();
			
			//initializing the stage hash
			stages.put("Stage Side", numberSeatsStage);
			stages.put("Main Floor", numberSeatsMainFloor);
			stages.put("Balcony",numberSeatsBalcony);
		}
		catch(Exception e) {
			System.out.println("No seats were found");
		}
	}
	public void updateSeatInformation(String fileNameUpdateSeat, int finalNumberOfSeats) {
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
			System.out.println("");
		}
	}
	public void updateTotalPrice(HashMap stages) {
	    selectedSection = (String) theaterSection.getSelectedItem();
	    showTimeSelected = (String) showTime.getSelectedItem();
	    selectedTickets = numberOfTickets.getSelectedIndex(); // Assuming the first index is "0" which should not affect the calculation
	    int pricePerTicket = 0;
	    
	    if ("Stage Side".equals(selectedSection) && "Early Show".equals(showTimeSelected) && stageAvailability) {
	        pricePerTicket = 60;
	        System.out.println(stages.get("Stage Side"));
	        int seatsStage = (int) stages.get("Stage Side");
	        finalNumberOfSeatsStage = seatsStage - selectedTickets;
	        System.out.println(finalNumberOfSeatsStage);
	        stage = true;
	        
	        
	    } else if("Stage Side".equals(selectedSection) && "Late Show".equals(showTimeSelected) && stageAvailability) {
	    	pricePerTicket = 80;
	    	 int seatsStage = (int) stages.get("Stage Side");
		     finalNumberOfSeatsStage = seatsStage - selectedTickets;
		     stage = true;
	    }
	    
	    if("Main Floor".equals(selectedSection)&& "Early Show".equals(showTimeSelected) && mainFloorAvailability) {
	        pricePerTicket = 40; 
	    	int seatsStage = (int) stages.get("Main Floor");
		    finalNumberOfSeatsMainFloor = seatsStage - selectedTickets;
		    mainFloor = true;
		    
	    } else if ("Main Floor".equals(selectedSection)&& "Late Show".equals(showTimeSelected) && mainFloorAvailability) {
	        pricePerTicket = 60;
	    	int seatsStage = (int) stages.get("Main Floor");
		    finalNumberOfSeatsMainFloor = seatsStage - selectedTickets;
		    mainFloor = true;

	    }
	  
	    if("Balcony".equals(selectedSection)&& "Early Show".equals(showTimeSelected) && balconyAvailability) {
	        pricePerTicket = 20;
	    	int seatsStage = (int) stages.get("Balcony");
		    finalNumberOfSeatsBalcony = seatsStage - selectedTickets;
		    balcony = true;
		    
	    } else if ("Balcony".equals(selectedSection)&& "Late Show".equals(showTimeSelected) && balconyAvailability) {
	        pricePerTicket = 30;
	    	int seatsStage = (int) stages.get("Balcony");
		    finalNumberOfSeatsBalcony = seatsStage - selectedTickets;
		    balcony = true;
	    }
	 
	    
	    totalToBePaid = pricePerTicket * selectedTickets;
	    
	    totalPrice.setText("Total to be paid: $" + totalToBePaid);
	    purchasePanel.revalidate();
	    purchasePanel.repaint();
	}	

public static String fileOpenAndRead() {
	File workingDir = new File(System.getProperty("user.dir"));
	
	JFileChooser chooser = new JFileChooser();
	chooser.setDialogTitle("Choose Data File");
	chooser.setCurrentDirectory(workingDir);
	
	
	int status = chooser.showOpenDialog(null);
	
	try {
		if(status != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		else {
			File file= chooser.getSelectedFile();
			Scanner scan = new Scanner(file);
			StringBuilder info = new StringBuilder();
			while(scan.hasNext()) {
				info.append(scan.nextLine());
				info.append("\n");
			}
			
			scan.close();
			return info.toString();
		}
	}
	catch(Exception e) {
		return null;
	}
}


	public purchaseInterface() {
		
		

		
		//initializing the stage hash
		setHashMapSeatInformation(stages);
		
		//Creating and Initializng the Frame Object
		purchaseWindow = new JFrame("Purchasing a Ticket");
		
	
		//Creating each Panel Object
		mainPanel = new JPanel();
		purchasePanel = new JPanel();
		imagePanel = new JPanel();
		bottonPanel = new JPanel();
		
		/*defining dimensions of elements*/
		
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
	       @Override
	        public void actionPerformed(ActionEvent e) {
	         // This code is executed when the user selects an item
	              int selectedItem = Integer.parseInt((String) numberOfTickets.getSelectedItem()) ;
	              
	              numberTicketsListener = selectedItem;
	              System.out.println(numberTicketsListener);
	              //checking if there are seats available
	              compareTickets(stages, selectedItem);
	              updateTotalPrice(stages);
	              
	          }
	     });
	    //listener to time of the show
	    showTime.addActionListener(new ActionListener() {
		       @Override
		        public void actionPerformed(ActionEvent e) {
		         // This code is executed when the user selects an item
		    	   selectedItemShowTime = (String) (showTime.getSelectedItem()) ;
		              //checking if there are seats available
		    	  
		              
		          }
		 });
	    class DisabledItemRenderer extends DefaultListCellRenderer {
	        @Override
	        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
	            Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

	            // Change the condition based on your availability logic
	            if ((value.equals("Stage Side") && !stageAvailability) ||
	                (value.equals("Main Floor") && !mainFloorAvailability) ||
	                (value.equals("Balcony") && !balconyAvailability)) {
	                component.setEnabled(false);
	                component.setForeground(Color.GRAY);
	            } else {
	                component.setEnabled(true);
	                component.setForeground(Color.BLACK);
	            }

	            return component;
	        }
	    }

	    // Setting custom renderer for theaterSection JComboBox to visually disable options
	    theaterSection.setRenderer(new DisabledItemRenderer());

	    // Adding ActionListener to theaterSection to prevent selection of disabled sections
	    theaterSection.addActionListener(new ActionListener() {
	        private String lastSelection = sectionOptions[0]; // Assuming the first option is a default or placeholder

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            JComboBox<String> cb = (JComboBox<String>) e.getSource();
	            String selectedSection = (String) cb.getSelectedItem();

	            // Logic to determine if the selected section is unavailable
	            if ((selectedSection.equals("Stage Side") && !stageAvailability) ||
	                (selectedSection.equals("Main Floor") && !mainFloorAvailability) ||
	                (selectedSection.equals("Balcony") && !balconyAvailability)) {

	                // Optionally, show a dialog or warning that the selection is unavailable
	                JOptionPane.showMessageDialog(purchaseWindow, "This section is not available.", "Selection Error", JOptionPane.ERROR_MESSAGE);

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
			
				
				//new purchaseInterface(); -> exhibit new window 
				

				//update txt file 
				if(stage) {
					updateSeatInformation("StageSideSeats.txt", finalNumberOfSeatsStage);
					

					
				}
				else if(mainFloor) {
					updateSeatInformation("mainFloorNumberSeats.txt", finalNumberOfSeatsMainFloor);

				}
				else if(balcony){
					updateSeatInformation("balconyNumberSeats.txt", finalNumberOfSeatsBalcony);				
				}
				
			
				//Confirmation Window
				
				//Current date info
		        LocalDateTime now = LocalDateTime.now();
		        
		        // If you want to format the date and time, you can use a DateTimeFormatter
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, hh:mm a", Locale.ENGLISH);
		        String formattedDateTime = now.format(formatter);
		        
			    // Details of the ticket purchase to display
		        String message = String.format("<html><body>"
		                + "<h2>Ticket Purchase Confirmed - %s</h2>"
		                + "<p>Thank you for purchasing %d tickets on the %s for the %s.</p>"
		                + "<p>The price is $%d.</p>"
		                + "<p>We hope you enjoy the show.</p>"
		                + "<p>Cancellations must be made by calling (800) Galaxy1.</p>"
		                + "</body></html>", formattedDateTime,selectedTickets,selectedSection,showTimeSelected, totalToBePaid);

		        // Show the confirmation dialog
		        JOptionPane.showMessageDialog(null, message, "Ticket Purchase Confirmed - "+formattedDateTime, JOptionPane.INFORMATION_MESSAGE);
			}	
			
		}		
		
		purchaseButton.addActionListener(new ButtonListener());




	}
}
