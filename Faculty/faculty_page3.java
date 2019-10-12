import javax.swing.*;    
public class faculty_page3 {  
public static void main(String[] args) {  

    JFrame f=new JFrame("Faculty page3");  
    JLabel f_h;
    f_h=new JLabel(" Course Rating ");  
    f_h.setBounds(180,30,100,30); 


    JLabel f_q1;
    f_q1=new JLabel("Question1");  
    f_q1.setBounds(180,80,100,30); 
   
    JLabel f_q2;
    f_q2=new JLabel("Question2:");  
    f_q2.setBounds(50,130, 100,30); 
    
    JLabel f_q3;
    f_q3=new JLabel("Question3:");  
    f_q3.setBounds(50,180, 100,30);
    
    JLabel f_q4;
    f_q4=new JLabel(" Question4:");  
    f_q4.setBounds(50,220,120,30);
    
    JLabel f_q5;
    f_q5=new JLabel("Question5:");  
    f_q5.setBounds(50,270, 100,30); 

    JLabel f_q6;
    f_q6=new JLabel("Question6:");  
    f_q6.setBounds(50,310, 100,30); 
    
    JButton b1=new JButton("Back"); 
    b1.setBounds(30,360,100,30); 
    
    JButton b2=new JButton("Logout"); 
    b2.setBounds(150,360,100,30);

    f.add(f_h);
    f.add(f_q1);
    f.add(f_q2);
    f.add(f_q3);
    f.add(f_q4); 
    f.add(f_q5);
    f.add(f_q6);
    f.add(b1);
    f.add(b2);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  