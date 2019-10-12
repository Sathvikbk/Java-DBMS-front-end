import javax.swing.*;    
public class admin_page1 {  
public static void main(String[] args) {  

    JFrame f=new JFrame("Admin page1");  
    JLabel a_h;
    a_h=new JLabel("Admin");  
    a_h.setBounds(100,30,100,30); 

    JLabel a_id1;
    a_id1=new JLabel("NAME:");  
    a_id1.setBounds(50,80, 100,30); 
    JTextField a_id2;
    a_id2=new JTextField();  
    a_id2.setBounds(150,80,100,30);
    
    JLabel a_pass1;
    a_pass1=new JLabel("Password:");  
    a_pass1.setBounds(50,120, 100,30);
    JPasswordField a_passwordField; 
    a_passwordField = new JPasswordField();
	 a_passwordField.setBounds(150, 120, 100, 30);   
   
    JButton b1=new JButton("Submit"); 
    
    b1.setBounds(50,200,95,30); 
    f.add(a_h);
    f.add(a_id1);
    f.add(a_id2);
    f.add(a_pass1);
    f.add(a_passwordField);
    f.add(b1);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  