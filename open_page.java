import javax.swing.*;    
public class open_page {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Display page");    
    JLabel d_h;
    d_h=new JLabel("Corse End Survey and Analysis");  
    d_h.setBounds(100,30,100,30);
    
    JButton b1=new JButton("Student"); 
    b1.setBounds(50,100,95,30);
    
    JButton b2=new JButton("Faculty"); 
    b2.setBounds(170,100,95,30);

    JButton b3=new JButton("Admin"); 
    b3.setBounds(290,100,95,30);
    
    f.add(d_h);
    f.add(b1);
    f.add(b2);  
    f.add(b3);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  