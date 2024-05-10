package testWorkspace;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

import javax.swing.filechooser.*;

public class staffWindow extends JFrame {
	
	double calcEarlySales,calcLateShow;
	double eSalesStage, lSalesStage;
	double eSalesMain, lSalesMain;
	double eSalesBalcony, lSalesBalcony;
	
	 private void openFile() {
	        JFileChooser fileChooser = new JFileChooser();
	        fileChooser.setAcceptAllFileFilterUsed(false);
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "doc");
	        fileChooser.addChoosableFileFilter(filter);

	        int result = fileChooser.showOpenDialog(this);
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = fileChooser.getSelectedFile();
	            JOptionPane.showMessageDialog(this, "Selected file: " + selectedFile.getAbsolutePath());
	        }
	    }
	 private void saveFile() {
	        JFileChooser fileChooser = new JFileChooser();
	        fileChooser.setDialogTitle("Specify a file to save");

	        int userSelection = fileChooser.showSaveDialog(this);
	        if (userSelection == JFileChooser.APPROVE_OPTION) {
	            File fileToSave = fileChooser.getSelectedFile();
	            JOptionPane.showMessageDialog(this, "Save as file: " + fileToSave.getAbsolutePath());
	        }
	    }

		
	public static String fileOpenAndRead() {
		File workingDir = new File(System.getProperty("user.dir"));
		
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Choose a Data File");
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
					info.append("\n");
				}
				scan.close();
				return info.toString();
			}
			
			
			
		}catch(Exception e) {
			return null;
		}
		
	}
	
	public static String getStageSeats(String [] arrayOfSeats) {
		String numberSeats;
		
		numberSeats = arrayOfSeats[0];
		
		return numberSeats;
	}
	
	public static String getMainSeats(String [] arrayOfSeats) {
		String numberSeats;
		
		numberSeats = arrayOfSeats[1];
		
		return numberSeats;
	}
	
	public static String getBalconySeats(String [] arrayOfSeats) {
		String numberSeats;
		
		numberSeats = arrayOfSeats[2];
		
		return numberSeats;
	}
	
	
	public staffWindow() {
		
	
		
		//Frame setup
		setTitle("Staff Operations");  // Sets the title of the JFrame
	    setSize(600, 600);             // Sets the size of the JFrame
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Sets the default close operation
	    setLocationRelativeTo(null);   // Centers the frame on the screen

	    //Creating the Menu Bar
	    JMenuBar mBar = new JMenuBar();
	    
	    //Creating the menu tab
	    JMenu fileMenu = new JMenu("File");
	    
	    //Creating the options of the file Menu
	    JMenuItem openItem = new JMenuItem("Open");
	    JMenuItem saveItem = new JMenuItem("Save");
	    
	    //adding the options to the menu
	    fileMenu.add(openItem);
	    fileMenu.add(saveItem);
	    
	    //adding the file tab to the menuBar
	    mBar.add(fileMenu);
	    
	    //adding the menu to the frame
	    setJMenuBar(mBar);
	    
	    //setting up a listener to each option of the menu bar
	    openItem.addActionListener(e -> openFile());
	    saveItem.addActionListener(e -> saveFile());
	    
	   /*Receiving and treating the info that comes from the txt file*/
	
	    //receiving the info from the txt file once users select a file
	    String ticketsData= fileOpenAndRead();
	    
	    //dividing the info according to Early and Late shows
	    String [] splitTickets= ticketsData.split("\n");
	    System.out.println(splitTickets[0]);
	    
	    String [] earlyShow = splitTickets[0].split(";");
	    String [] lateShow = splitTickets[1].split(";");

	    //getting the number of seats available so we can write on the panel 
	    String earlyStageSeats = getStageSeats(earlyShow);
	    String earlyMainSeats = getMainSeats(earlyShow);
	    String earlyBalconySeats = getBalconySeats(earlyShow);
	    String lateStageSeats = getStageSeats(lateShow);
	    String lateMainSeats = getMainSeats(lateShow);
	    String lateBalconySeats = getBalconySeats(lateShow);

	    
	    /*
	     parsing the seat data to double so we can calculate the totals 
	     and add to the panel at the bottom
		*/
	    
	    //Early Show Info
	    double eStageSeat = Double.parseDouble(earlyStageSeats);
		//multiplying by the Stageprice
		eSalesStage = ((150 - eStageSeat)* 60);
		
		
		double eMainSeat = Double.parseDouble(earlyMainSeats);
		eSalesMain = ((280 - eMainSeat) *40);
		
		
		double eBalcony = Double.parseDouble(earlyBalconySeats);
		//multiplying by the balcony price
		eSalesBalcony = ((250 - eBalcony) * 20);
		
		//calculating total sales for early show
		calcEarlySales = eSalesStage + eSalesMain + eSalesBalcony;
		
		//Late Show Info
		double lStage = Double.parseDouble(lateStageSeats);
		lSalesStage = ((150 - lStage) *80);

		double lMain = Double.parseDouble(lateMainSeats);
		lSalesMain = ((280 - lMain) * 60);

		double lBalcony = Double.parseDouble(lateBalconySeats);
		lSalesBalcony = ((250 - lBalcony) *30);
		
		//calculating total sales for late show
		calcLateShow = lSalesStage + lSalesMain + lSalesBalcony;
	    
	    
	    // Main content panel with BorderLayout
	    JPanel contentPanel = new JPanel(new BorderLayout());
	    setContentPane(contentPanel); // Use this panel as the main content pane



	    /*RIGHT PANEL COMPONENTS*/
	    
	    //Creating the Right Panel
	    JPanel rightPanel = new JPanel();
	    
	    rightPanel.setPreferredSize(new Dimension(360,500));
		rightPanel.setLayout(null);
		

		//defining other elements from this panel
		JLabel rightPanelLabel = new JLabel("Ticket Sales Status");
	    rightPanelLabel.setFont(new Font("Arial", Font.BOLD, 15));

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
			

				
				int auxMathInt = (int) (((150 - eStageSeat) /150 )*100.0);
				g.setColor(Color.PINK);
				g.fillRect(10,10,auxMathInt,10);
				
				
				//multiplying by the Main price
				auxMathInt = (int) (((280 - eMainSeat) /280 )*100.0);
				g.setColor(Color.GREEN);
				g.fillRect(10,30,auxMathInt,10);
				
				
			
				auxMathInt = (int) (((250 - eBalcony) /250 )*100.0);
				g.setColor(Color.BLUE);
				g.fillRect(10,50,auxMathInt,10);
				
		
				
				//Late Show Data
				
				
				auxMathInt = (int) (((280 - lStage) /280 )*100.0);
				g.setColor(Color.PINK);
				g.fillRect(10,90,auxMathInt,10);
				
				//finding the Main percentual in int 

				
				auxMathInt = (int) (((280 - lMain) /280 )*100.0);
				g.setColor(Color.GREEN);
				g.fillRect(10,110,auxMathInt,10);
				
				
				auxMathInt = (int) (((250 - lBalcony) /250 )*100.0);
				g.setColor(Color.BLUE);
				g.fillRect(10,130,auxMathInt,10);
				
			
			}
			
		};
		
		comp.setPreferredSize(new Dimension(200,200));
		
		
		graph.add(comp);
		rightPanel.add(graph);    
			 
	    
	    // Add the right panel to the right side of the frame
	    contentPanel.add(rightPanel, BorderLayout.EAST); // Add to the EAST to occupy the right side
	    
	    /*END RIGHT PANEL*/
	    
	    
	    
	    
	    /*LEFT PANEL COMPONENTS*/
	    
	    // Left Panel
	    JPanel leftPanel = new JPanel();
	    
		leftPanel.setPreferredSize(new Dimension(370,500));
		leftPanel.setSize(370,200);
		
		//rightPanel.setBackground(new Color(153,102,255));
		leftPanel.setLayout(null);
		leftPanel.add(Box.createRigidArea(new Dimension(370,40)));

		//defining other elements from this panel
		JLabel leftPanelLabel = new JLabel("Staff Seating Update");
		JLabel updateTitle = new JLabel("Update");
		JLabel earlyTitle = new JLabel ("Early Show");
		JLabel seatingOpen = new JLabel("Seating   Open");
		JLabel earlyStageTitle = new JLabel("Stage Side");
		JLabel earlyMainTitle = new JLabel("Main Floor");
		JLabel earlyBalconyTitle = new JLabel("Balcony");
		JLabel lateStageTitle = new JLabel("Stage Side");
		JLabel lateMainTitle = new JLabel("Main Floor");
		JLabel lateBalconyTitle = new JLabel("Balcony");
		JLabel lateShowTitle = new JLabel ("Late Show");
		JLabel earlySeatingStage = new JLabel ("(150)  /");
		JLabel earlySeatingMain = new JLabel ("(280)  /");
		JLabel earlySeatingBalcony = new JLabel ("(250)  /");
		JLabel lateSeatingStage = new JLabel ("(150)  /");
		JLabel lateSeatingMain = new JLabel ("(280)  /");
		JLabel lateSeatingBalcony = new JLabel ("(250)  /");
		JLabel earlyStageOpen = new JLabel(earlyStageSeats);
		JLabel earlyMainOpen  = new JLabel(earlyMainSeats);
		JLabel earlyBalconyOpen  = new JLabel(earlyBalconySeats);
		JLabel lateStageOpen = new JLabel(lateStageSeats);
		JLabel lateMainOpen  = new JLabel(lateMainSeats);
		JLabel lateBalconyOpen  = new JLabel(lateBalconySeats);

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
		
		
		
//		label2.setBounds(125, 185, 150, 25);
//		label3.setBounds(125, 245, 150, 25);
//		showTime.setBounds(125, 150, 150, 25);
//		theaterSection.setBounds(125, 210, 150, 25);
//		numberOfTickets.setBounds(125, 270, 150, 25);
//	    totalPrice.setFont(new Font("Arial", Font.BOLD, 15));
//	    totalPrice.setBounds(125, 315, 170, 25);
	   
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

	    
	    /*End of Left Panel Components*/
	    
	    
	    
	    // Left Pane Set up - Set the preferred size or min/max size of rightPanel if you need to control its sizing
		leftPanel.setBackground(Color.WHITE); // Set a different background color to differentiate
//	    leftPanel.setPreferredSize(new Dimension(300, 200));
	    contentPanel.add(leftPanel, BorderLayout.WEST); // This panel will occupy the rest of the space
	

	    
	    
	    /*BOTTOM PANEL COMPONENTS*/
	    //Bottom Pane - creating the bottom Pane to add the total earnings
	    JPanel bottomPanel = new JPanel();
	   
	    //Creating the Bottom Panel
	    String salesInfo = String.format("<html><body>"
	    	    + "<table>"
	    	    + "<tr><td>Early Sales:</td> <td style='text-align: right;'>$%,.2f</td></tr>"
	    	    + "<tr><td>Late Show Sales:</td> <td style='text-align: right;'>$%,.2f</td></tr>"
	    	    + "<tr><td>Combined:</td> <td style='text-align: right;'>$%,.2f</td></tr>"
	    	    + "</table>"
	    	    + "</body></html>", calcEarlySales, calcLateShow, calcEarlySales + calcLateShow);


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

