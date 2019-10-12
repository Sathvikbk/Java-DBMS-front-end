import javax.swing.*;    
public class faculty_page1 {  
public static void main(String[] args) {  

    JFrame f=new JFrame("Faculty page1");  
    JLabel f_h;
    f_h=new JLabel("Faculty");  
    f_h.setBounds(100,30,100,30); 

    JLabel f_id1;
    f_id1=new JLabel("NAME:");  
    f_id1.setBounds(50,80, 100,30); 
    JTextField f_id2;
    f_id2=new JTextField();  
    f_id2.setBounds(150,80,100,30);
    
    JLabel f_pass1;
    f_pass1=new JLabel("Password:");  
    f_pass1.setBounds(50,120, 100,30); 
    JPasswordField f_passwordField; 
    f_passwordField = new JPasswordField();
	 f_passwordField.setBounds(150, 120, 100, 30);       
    JButton b1=new JButton("Submit"); 
    
    b1.setBounds(50,200,95,30); 
    f.add(f_h);
    f.add(f_id1);
    f.add(f_id2);
    f.add(f_pass1);
    f.add(f_passwordField);
    f.add(b1);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  