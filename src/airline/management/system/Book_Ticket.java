package airline.management.system;

import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Book_Ticket extends JFrame{ 

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7;

        public Book_Ticket(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("BOOK FLIGHT TICKET");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel name = new JLabel("NAME");
            name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            name.setBounds(60, 30, 150, 27);
            add(name);

            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);
		
            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 470, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
      
			
            JLabel PassportNo = new JLabel("PASSPORT NO");
            PassportNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PassportNo.setBounds(60, 80, 150, 27);
            add(PassportNo);
            
            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);
            
            JLabel Address = new JLabel("ADDRESS");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(60, 120, 150, 27);
            add(Address);
			
            textField_2 = new JTextField();
            textField_2.setBounds(200, 120, 150, 27);
            add(textField_2);
			
            JLabel Nationality = new JLabel("NATIONALITY");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Nationality.setBounds(60, 170, 150, 27);
            add(Nationality);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 170, 150, 27);
            add(textField_3);
			
            JLabel PhoneNo = new JLabel("PHONE NO");
            PhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PhoneNo.setBounds(60, 220, 150, 27);
            add(PhoneNo);
			
            textField_4 = new JTextField();
            textField_4.setBounds(200, 220, 150, 27);
            add(textField_4);
	
            JLabel JourneyDate = new JLabel("JOURNEY DATE");
            JourneyDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
            JourneyDate.setBounds(60, 270, 150, 27);
            add(JourneyDate);
	
            textField_5 = new JTextField();
            textField_5.setBounds(200, 270, 150, 27);
            add(textField_5);
	
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 320, 150, 27);
            add(Gender);
		
            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(200, 320, 70, 27);
            add(NewRadioButton);
	
            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(280, 320, 70, 27);
            add(Female);
            
           JLabel Source = new JLabel("SOURCE");
            Source.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Source.setBounds(60, 370, 150, 27);
            add(Source);
			
            textField_6 = new JTextField();
            textField_6.setBounds(200, 370, 150, 27);
            add(textField_6);
            
             JLabel Destination = new JLabel("DESTINATION");
            Destination.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Destination.setBounds(60, 420, 150, 27);
            add(Destination);

            textField_7 = new JTextField();
            textField_7.setBounds(200, 420, 150, 27);
            add(textField_7);
	
	
            setVisible(true);
	
            JLabel BookTicket = new JLabel("BOOK FLIGHT TICKET");
            BookTicket.setForeground(Color.RED);
            BookTicket.setFont(new Font("Tahoma", Font.PLAIN, 31));
            BookTicket.setBounds(420, 24, 442, 35);
            add(BookTicket);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/book.png"));
            JLabel image = new JLabel(i1);
            image.setBounds(450,80,280,410);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String name = textField.getText();
                    String passport_no = textField_1.getText();
                    String address =  textField_2.getText();
                    String nationality = textField_3.getText();
                    String phone_no = textField_4.getText();
                    String journey_date = textField_5.getText();
                    String source = textField_6.getText();
                    String destination = textField_7.getText();
                    String gender = null;
                    
                    
                    if(NewRadioButton.isSelected()){
                        gender = "MALE";
                    
                    }else if(Female.isSelected()){
                        gender = "FEMALE";
                    }
                    
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO booking values( '"+name+"','"+passport_no+"','"+address+"', '"+nationality+"','"+gender+"','"+phone_no+"', '"+journey_date+"','"+source+"','"+destination+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Booking Proceeded");
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
        new Book_Ticket();
    }   
}
