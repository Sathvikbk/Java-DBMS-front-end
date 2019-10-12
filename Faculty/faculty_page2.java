import javax.swing.*;  
import java.awt.event.*;  
public class faculty_page2 {  
public static void main(String[] args) {
    int newSizeX=400;
    int newSizeY=600;  
    JFrame f=new JFrame("page2");  
    
    JLabel f_h;
    f_h=new JLabel("Course");  
    f_h.setBounds(160,40,100,30); 


    JButton course1=new JButton("course1"); 
    course1.setBounds(50,100,95,30);
    JButton course2=new JButton("course2"); 
    course2.setBounds(160,100,95,30);
    JButton course3=new JButton("course3");
    course3.setBounds(270,100,95,30);
    JButton course4=new JButton("course4");
    course4.setBounds(100,150,95,30);
    JButton course5=new JButton("course5");
    course5.setBounds(210,150,95,30);
    JButton exit=new JButton("EXIT");
    exit.setBounds(160,200,95,30);
         
    f.add(f_h);
    f.add(course1);
    f.add(course2);
    f.add(course3);
    f.add(course4);
    f.add(course5);
    f.add(exit);
  
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  