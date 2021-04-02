package airline.management.system;

import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Reserve_Ticket extends JFrame{ 

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

        public Reserve_Ticket(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD RESERVATION DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel pnr_no = new JLabel("PNR NO");
            pnr_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pnr_no.setBounds(60, 30, 150, 27);
            add(pnr_no);
            
            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);
			
            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel ticket_id = new JLabel("TICKET ID");
            ticket_id .setFont(new Font("Tahoma", Font.PLAIN, 17));
            ticket_id .setBounds(60, 80, 150, 27);
            add(ticket_id );
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);
            
            JLabel flight_code = new JLabel("FLIGHT CODE");
            flight_code.setFont(new Font("Tahoma", Font.PLAIN, 17));
            flight_code.setBounds(60, 120, 150, 27);
            add(flight_code);
			
            textField_2 = new JTextField();
            textField_2.setBounds(200, 120, 150, 27);
            add(textField_2);
            		
            JLabel journey_date = new JLabel("JOURNEY DATE");
            journey_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            journey_date.setBounds(60, 170, 150, 27);
            add(journey_date);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 170, 150, 27);
            add(textField_3);
	
            JLabel journey_time = new JLabel("JOURNEY TIME");
            journey_time.setFont(new Font("Tahoma", Font.PLAIN, 17));
            journey_time.setBounds(60, 220, 150, 27);
            add(journey_time);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 220, 150, 27);
            add(textField_4);
	
            JLabel source = new JLabel("SOURCE");
            source .setFont(new Font("Tahoma", Font.PLAIN, 17));
            source .setBounds(60, 270, 150, 27);
            add(source );
            
            textField_5 = new JTextField();
            textField_5.setBounds(200, 270, 150, 27);
            add(textField_5);
            
            JLabel destination = new JLabel("DESTINATION");
            destination.setFont(new Font("Tahoma", Font.PLAIN, 17));
            destination.setBounds(60, 320, 150, 27);
            add(destination);
            
            textField_6 = new JTextField();
            textField_6.setBounds(200, 320, 150, 27);
            add(textField_6);
			
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD RESERVATION DETAILS");
            AddPassengers.setForeground(Color.RED);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(420, 24, 442, 35);
            add(AddPassengers);

            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/logo.png"));
            JLabel image = new JLabel(i1);
            image.setBounds(450,80,280,410);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String pnr_no = textField.getText();
                    String ticket_id = textField_1.getText();
                    String flight_code =  textField_2.getText();
                    String journey_date = textField_3.getText();
                    String journey_time = textField_4.getText();
                    String source = textField_5.getText();
                    String destination = textField_6.getText();
                    
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO ticket values( '"+pnr_no+"', '"+ticket_id+"', '"+flight_code+"','"+journey_date+"', '"+journey_time+"', '"+source+"','"+destination+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Details Added Successfully");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setSize(900,600);
            setVisible(true);
            setLocation(400,200);
			
	}
        
    public static void main(String[] args){
        new Reserve_Ticket();
    }   
}