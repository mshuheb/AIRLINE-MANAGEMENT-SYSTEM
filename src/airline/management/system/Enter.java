package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Enter extends JFrame{

    public static void main(String[] args) {
        new Enter().setVisible(true);
    }
    
    public Enter() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 
        
        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/logo2.jpg")));
	NewLabel.setBounds(400, 30, 1400, 800); 
	add(NewLabel); 

        
        
        JLabel AirlineManagementSystem = new JLabel("AIRLINE MANAGEMENT SYSTEM");
	AirlineManagementSystem.setForeground(Color.RED);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 50));
	AirlineManagementSystem.setBounds(0, 20, 1000, 55);
	NewLabel.add(AirlineManagementSystem);
        JButton Enter = new JButton("LOGIN");
	Enter.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Enter.setBackground(Color.BLACK);
        Enter.setForeground(Color.WHITE);
	Enter.setBounds(620, 120, 150, 26);
	add(Enter);
        
        JButton Admin = new JButton("ADMIN");
	Admin.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Admin.setBackground(Color.BLACK);
        Admin.setForeground(Color.WHITE);
	Admin.setBounds(620, 140, 150, 26);
	add(Admin);
        
        setVisible(true);
        
        Enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Login();
                
            }
        });
        
         Admin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Adm_Login();
                
            }
        });
             setSize(1950,1090);
	setVisible(true);
        }
}

 