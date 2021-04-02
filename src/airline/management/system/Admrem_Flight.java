package airline.management.system;

import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Admrem_Flight extends JFrame{ 

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

        public Admrem_Flight(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("REMOVE FLIGHTS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel flight_code = new JLabel("FLIGHT CODE");
            flight_code.setFont(new Font("Tahoma", Font.PLAIN, 17));
            flight_code.setBounds(60, 80, 150, 27);
            add(flight_code);
            
            textField = new JTextField();
            textField.setBounds(200, 80, 150, 27);
            add(textField);
			
            JButton Next = new JButton("REMOVE");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel flight_name = new JLabel("FLIGHT NAME");
            flight_name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            flight_name.setBounds(60, 120, 150, 27);
            add(flight_name);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 120, 150, 27);
            add(textField_1);
            
            JLabel source = new JLabel("SOURCE");
            source.setFont(new Font("Tahoma", Font.PLAIN, 17));
            source.setBounds(60, 170, 150, 27);
            add(source);
			
            textField_2 = new JTextField();
            textField_2.setBounds(200, 170, 150, 27);
            add(textField_2);
            		
            JLabel destination = new JLabel("DESTINATION");
            destination.setFont(new Font("Tahoma", Font.PLAIN, 17));
            destination.setBounds(60, 220, 150, 27);
            add(destination);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);
	
            JLabel capacity = new JLabel("CAPACITY");
            capacity.setFont(new Font("Tahoma", Font.PLAIN, 17));
            capacity.setBounds(60, 270, 150, 27);
            add(capacity);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);
	
            JLabel class_code = new JLabel("CLASS CODE");
            class_code.setFont(new Font("Tahoma", Font.PLAIN, 17));
            class_code.setBounds(60, 320, 150, 27);
            add(class_code);
            
            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);
		
 
            
            JLabel class_name = new JLabel("CLASS NAME");
            class_name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            class_name.setBounds(60, 370, 150, 27);
            add(class_name);
			
            textField_6 = new JTextField();
            textField_6.setBounds(200, 370, 150, 27);
            add(textField_6);
	
            setVisible(true);
	
            JLabel AddFlights = new JLabel("REMOVE FLIGHT DETAILS");
            AddFlights.setForeground(Color.RED);
            AddFlights.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddFlights.setBounds(420, 24, 442, 35);
            add(AddFlights);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/logo.png"));
            JLabel image = new JLabel(i1);
            image.setBounds(450,80,225,225);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String flight_code = textField.getText();
                    String flight_name = textField_1.getText();
                    String source =  textField_2.getText();
                    String destination = textField_3.getText();
                    String capacity = textField_4.getText();
                    String class_code = textField_5.getText();
                    String class_name = textField_6.getText();
                    
                    try {
                        conn c = new conn();
                      
                        
                        c.s.executeUpdate("DELETE FROM flight where flight_code='"+flight_code+"' and flight_name='"+flight_name+"' and source='"+source+"' and destination='"+destination+"'");
                        c.s.executeUpdate("DELETE FROM sector where flight_code='"+flight_code+"' and capacity='"+capacity+"' and class_code='"+class_code+"' and class_name='"+class_name+"'");
                        JOptionPane.showMessageDialog(null,"Flight Removed");
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
        new Admrem_Flight();
    }   
}