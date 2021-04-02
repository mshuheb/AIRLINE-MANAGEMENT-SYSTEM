package airline.management.system;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Admview_Customers extends JFrame{  

    private JTable table;
    
    public static void main(String[] args){		 
	new Admview_Customers().setVisible(true);    
    }
    
    public Admview_Customers(){
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	setLayout(null);
	setVisible(true);
	
		
	JLabel PassengerDetails = new JLabel("BOOKING DETAILS");
	PassengerDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	PassengerDetails.setForeground(new Color(255, 0, 0));
	PassengerDetails.setBounds(50, 20, 570, 35);
	add(PassengerDetails);
		
	JButton btnShow = new JButton("SHOW");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
	
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                
                try {
                    conn c = new conn();
                    String str = "select * from booking";                 
               
                   

                    
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
		
	
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(900,650);
        setVisible(true);
        setLocation(400,200);
		
    }
}