package airline.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Cancel extends JFrame { //Sixth
    
    private JTextField textField,textField_1;

    public static void main(String[] args) {
        new Cancel();
    }
    
    public Cancel() {
        initialize();
    }
    
    private void initialize() {
        setTitle("CANCELLATION");
	getContentPane().setBackground(Color.WHITE);
	setBounds(100, 100, 801, 472);
	setLayout(null);
		
	JLabel Cancellation = new JLabel("CANCELLATION");
	Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
	Cancellation.setBounds(185, 24, 259, 38);
	add(Cancellation);
		
	
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/cancel.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(470, 100, 250, 250);
	add(NewLabel);
		
	JLabel PassengerNo = new JLabel("PASSENGER NO");
	PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	PassengerNo.setBounds(60, 100, 132, 26);
	add(PassengerNo);
		
	JLabel Ticketid = new JLabel("TICKET_ID");
	Ticketid.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Ticketid.setBounds(60, 150, 150, 27);
	add(Ticketid);
		
	JButton Cancel = new JButton("CANCEL");
	Cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
	Cancel.setBounds(250, 350, 150, 30);
	add(Cancel);
		
	textField = new JTextField();
	textField.setBounds(250, 100, 150, 27);
	add(textField);
	
        textField_1 = new JTextField();
	textField_1.setBounds(250, 150, 150, 27);
	add(textField_1);
	
        Cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                String passenger_no = textField.getText();
		String ticket_id = textField_1.getText();
		
		String pnr = textField.getText();
                String id = textField_1.getText();
					
		try{	
                    conn c = new conn();
                    String str = "DELETE FROM ticket where pnr_no='"+pnr+"' and ticket_id='"+id+"'"; 
		
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Ticket Canceled");
                    setVisible(false);
						
		}catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
			
	setSize(860,500);
	setVisible(true);
        setLocation(400,200);
    }
}
                    
                
                
            
       