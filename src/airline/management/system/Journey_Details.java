package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Journey_Details extends JFrame{ 

    JTable table;
    JTextField textField;
    JLabel ReservationDetails,Pnrno,Ticketid,Fcode,Jnydate,Jnytime,Source,Destination,label,label1;
    JButton Show;

    public static void main(String[] args) {
        new Journey_Details();
    }

    public Journey_Details(){
	initialize();
    }

    private void initialize(){
        setTitle("JOURNEY_DETAILS");
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(null);
		
	JLabel TicketId = new JLabel("TICKET ID");
	TicketId.setFont(new Font("Tahoma", Font.PLAIN, 17));
	TicketId.setBounds(60, 160, 150, 26);
	add(TicketId);
        
        textField = new JTextField();
	textField.setBounds(200, 160, 150, 26);
	add(textField);
		
	JButton Show = new JButton("SHOW");
	Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
	Show.setBounds(200, 210, 150, 26);
	add(Show);
		
	

	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	ReservationDetails = new JLabel("JOURNEY DETAILS");
	ReservationDetails.setForeground(Color.RED);
	ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	ReservationDetails.setBounds(280, 27, 359, 31);
	add(ReservationDetails);
		
	Pnrno = new JLabel("PNR_NO");
	Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Pnrno.setBounds(79, 270, 83, 20);
	add(Pnrno);
		
	Ticketid = new JLabel("TICKET_ID");
	Ticketid.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Ticketid.setBounds(172, 270, 71, 20);
	add(Ticketid);
		
	Fcode = new JLabel("F_CODE");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Fcode.setBounds(297, 270, 103, 20);
	add(Fcode);
		
	Jnydate = new JLabel("JNY_DATE");
	Jnydate.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Jnydate.setBounds(390, 270, 94, 20);
	add(Jnydate);
		
	Jnytime = new JLabel("JNY_TIME");
	Jnytime.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Jnytime.setBounds(494, 270, 83, 20);
	add(Jnytime);
		
	Source = new JLabel("SOURCE");
	Source.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Source.setBounds(613, 270, 94, 20);
	add(Source);
		
	Destination = new JLabel("DESTINATION");
	Destination.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Destination.setBounds(717, 270, 94, 20);
	add(Destination);
		
        table = new JTable();
	table.setBounds(38, 310, 770, 130);
	add(table);
	
        
	
        setVisible(true);
		
	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                try {
                    String id  = textField.getText();
                    
                    conn c = new conn();
                    String str = "select * from ticket where ticket_id = '"+id+"'";
					
                    ResultSet rs = c.s.executeQuery(str);
		
                    table.setModel(DbUtils.resultSetToTableModel(rs));
					
		}catch(SQLException e) {
                    e.printStackTrace();
                }
            }
	});
		
	setSize(960,590);
        setLocation(400,200);
	setVisible(true);

    }
}