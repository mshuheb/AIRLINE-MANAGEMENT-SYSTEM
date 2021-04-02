package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Adm_Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Adm_Mainframe() {
        super("ADMIN SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/admin.jpg")));
	NewLabel.setBounds(575, 30, 1400, 800); 
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("WELCOME ADMIN");
	AirlineManagementSystem.setForeground(Color.RED);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 40));
	AirlineManagementSystem.setBounds(0, 60, 1000, 55);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("MENU");
        AirlineSystem.setForeground(Color.RED);
	menuBar.add(AirlineSystem);
        
        JMenuItem View_Flights = new JMenuItem("VIEW_FLIGHT_DETAILS");
	AirlineSystem.add(View_Flights);
		
        JMenuItem Add_Flights = new JMenuItem("ADD_FLIGHT_DETAILS");
	AirlineSystem.add(Add_Flights);
		
	JMenuItem Remove_Flights = new JMenuItem("DELETE_FLIGHT_DETAILS");
	AirlineSystem.add(Remove_Flights);
        
        JMenuItem Booking_Details = new JMenuItem("BOOKING_DETAILS");
	AirlineSystem.add(Booking_Details);
        
        JMenuItem Reservation_Details = new JMenuItem("RESERVATION_DETAILS");
	AirlineSystem.add(Reservation_Details);
        
        JMenuItem Add_Reservation_Details = new JMenuItem("ADD RESERVATION_DETAILS");
	AirlineSystem.add(Add_Reservation_Details);
		
	JMenuItem Confirm_Payments = new JMenuItem("ADD_PAYMENT_DETAILS");
	AirlineSystem.add(Confirm_Payments);
        
        
        View_Flights.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Admview_Flight();
            }
	});
		
        Add_Flights.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Admadd_Flight();
               
                
            }
	});
        
	Remove_Flights.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Admrem_Flight();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
        
        Booking_Details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Admview_Customers();
            }
	});
        
        
        Reservation_Details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reservation_Details();
        
            }
	});
        
        Add_Reservation_Details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reserve_Ticket();
        
            }
	});
		
        Confirm_Payments.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Adm_Payments();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
        
        JMenu Options = new JMenu("OPTIONS");
        Options.setForeground(Color.RED);
	menuBar.add(Options); 
        
        JMenuItem Logout = new JMenuItem("LOGOUT");
	Options.add(Logout);
        
        Logout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
		
	
		
        setSize(1950,1090);
	setVisible(true);
    }
}