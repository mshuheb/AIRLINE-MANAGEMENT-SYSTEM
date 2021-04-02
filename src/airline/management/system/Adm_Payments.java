package airline.management.system;

import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Adm_Payments extends JFrame{ 

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5;

        public Adm_Payments(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD PAYMENT DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel pnr_no = new JLabel("PNR NO");
            pnr_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pnr_no.setBounds(60, 80, 150, 27);
            add(pnr_no);
            
            textField = new JTextField();
            textField.setBounds(200, 80, 150, 27);
            add(textField);
			
            JButton Next = new JButton("ADD");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel phone_no = new JLabel("PHONE NO");
            phone_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            phone_no.setBounds(60, 120, 150, 27);
            add(phone_no);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 120, 150, 27);
            add(textField_1);
            
            JLabel cheque_no = new JLabel("CHEQUE NO");
            cheque_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            cheque_no.setBounds(60, 170, 150, 27);
            add(cheque_no);
			
            textField_2 = new JTextField();
            textField_2.setBounds(200, 170, 150, 27);
            add(textField_2);
            		
            JLabel card_no = new JLabel("CARD NO");
            card_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            card_no.setBounds(60, 220, 150, 27);
            add(card_no);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);
	
            JLabel paid_amount = new JLabel("PAID AMOUNT");
            paid_amount.setFont(new Font("Tahoma", Font.PLAIN, 17));
            paid_amount.setBounds(60, 270, 150, 27);
            add(paid_amount);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);

            
            JLabel pay_date = new JLabel("PAY DATE");
            pay_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pay_date.setBounds(60, 320, 150, 27);
            add(pay_date);
			
            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);
	
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD PAYMENT DETAILS");
            AddPassengers.setForeground(Color.RED);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(420, 24, 442, 35);
            add(AddPassengers);
            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/pay.png"));
            JLabel image = new JLabel(i1);
            image.setBounds(450,80,225,225);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String pnr_no = textField.getText();
                    String phone_no = textField_1.getText();
                    String cheque_no =  textField_2.getText();
                    String card_no = textField_3.getText();
                    String paid_amount = textField_4.getText();
                    String pay_date = textField_5.getText();
                    
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO payment values( '"+pnr_no+"', '"+phone_no+"', '"+cheque_no+"','"+card_no+"', '"+paid_amount+"', '"+pay_date+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Payment Details Added Successfully");
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
        new Payment_Details();
    }   
}