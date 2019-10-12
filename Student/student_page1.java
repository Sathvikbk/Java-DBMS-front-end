import javax.swing.*;  
import java.awt.event.*;  
public class student_page1 {
    
    JLabel s_name1;     
    JTextField s_name2;
    
    JLabel s_email1;
    JTextField s_email2;
    
    JLabel s_dep1;
    JTextField s_dep2;
    
    JLabel s_sem1;
    JTextField s_sem2;
    
    JLabel s_usn1;
    JTextField s_usn2; 
    
    JButton b1;  
    student_page1(){  
        JFrame f= new JFrame();  
       
        s_name1=new JLabel("NAME:");  
        s_name1.setBounds(50,50, 100,30);  
        s_name2=new JTextField();  
        s_name2.setBounds(150,50,150,20);
       
        s_email1=new JLabel("EMAIL");  
        s_email1.setBounds(50,100, 100,30);    
        s_email2=new JTextField();  
        s_email2.setBounds(150,100,150,20);
        
        s_dep1=new JLabel("DEP");  
        s_dep1.setBounds(50,150, 100,30);    
        s_dep2=new JTextField();  
        s_dep2.setBounds(150,150,150,20); 
        
        s_sem1=new JLabel("SEM");  
        s_sem1.setBounds(50,200, 100,30);  
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("1");
	     comboBox.addItem("2");
	     comboBox.addItem("3");
	     comboBox.addItem("4");
        comboBox.addItem("5");
        comboBox.addItem("6");
        comboBox.addItem("7");
        comboBox.addItem("8");
	     comboBox.setSelectedItem(null);
        comboBox.setBounds(150, 200,150,20);
        
        s_usn1=new JLabel("USN");  
        s_usn1.setBounds(50,250, 100,30);  
        s_usn2=new JTextField();  
        s_usn2.setBounds(150,250,150,20);    
        
        b1=new JButton("Next");  
        b1.setBounds(150,300,100,30);      
        
        f.add(s_name1);
        f.add(s_name2);
        
        f.add(s_email1);
        f.add(s_email2);
        
        f.add(s_dep1);
        f.add(s_dep2);
        
        f.add(s_sem1);
        f.add(comboBox);
        
        f.add(s_usn1);
        f.add(s_usn2);
        
        f.add(b1);  
        
        f.setSize(1600,1600);  
        f.setLayout(null);  
        f.setVisible(true);  
    }           
public static void main(String[] args) {  
    new student_page1();  
} }  