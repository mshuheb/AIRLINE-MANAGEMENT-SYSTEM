
package airline.management.system;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Admview_Flight extends JFrame{  

    private JTable table;
    
    
    public static void main(String[] args){		 
	new Flight_Info().setVisible(true);    
    }
    
    public Admview_Flight(){
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	setLayout(null);
	setVisible(true);
	
		
	JLabel FlightDetails = new JLabel("FLIGHT DETAILS");
	FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	FlightDetails.setForeground(new Color(255, 0, 0));
	FlightDetails.setBounds(50, 20, 570, 35);
	add(FlightDetails);
		
	JButton btnShow = new JButton("SHOW");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
	
        btnShow.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
	
                
                try {
                    conn c = new conn();
                    String str = "select flight.flight_code,flight_name,source,destination,capacity,class_code,class_name from flight,sector where flight.flight_code=sector.flight_code";                 
                    ResultSet rs = c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));	
                    
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });

        btnShow.setBounds(50, 100, 200, 30);
	add(btnShow);
		
        table = new JTable();
        table.setBackground(Color.WHITE);
	table.setBounds(23, 250, 800, 300);
        
        JScrollPane pane = new JScrollPane(table);
	pane.setBounds(23, 250, 1100, 300);
        pane.setBackground(Color.WHITE);
        add(pane);
		
		
	JLabel FlightCode = new JLabel("FLIGHT CODE");
	FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
        FlightCode.setBounds(23, 220, 126, 14);
	add(FlightCode);
		
	JLabel FlightName = new JLabel("FLIGHT NAME");
        FlightName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	FlightName.setBounds(185, 220, 120, 14);
	add(FlightName);
		
	JLabel Source = new JLabel("SOURCE");
	Source.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Source.setBounds(350, 220, 104, 14);
	add(Source);
		
	JLabel Destination = new JLabel("DESTINATION");
	Destination.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Destination.setBounds(500, 220, 120, 14);
	add(Destination);
		
		
	JLabel Capacity = new JLabel("CAPACITY");
	Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Capacity.setBounds(660, 220, 111, 14);
	add(Capacity);
		
	JLabel ClassCode = new JLabel("CLASS CODE");
	ClassCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	ClassCode.setBounds(820, 220, 120, 14);
	add(ClassCode);
		
	JLabel ClassName = new JLabel("CLASS NAME");
	ClassName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	ClassName.setBounds(970, 220, 111, 14);
	add(ClassName);
		
	
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(900,650);
        setVisible(true);
        setLocation(400,200);
		
    }
}


