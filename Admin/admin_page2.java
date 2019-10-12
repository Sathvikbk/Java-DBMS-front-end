import javax.swing.*;  
import java.awt.event.*;  
public class admin_page2 {  
public static void main(String[] args) {
    int newSizeX=400;
    int newSizeY=600;  
    JFrame f=new JFrame("page2");  

    JButton add_faculty=new JButton("Add Faculty"); 
    add_faculty.setBounds(50,100,150,30);
    JButton view_faculty=new JButton("View Faculty"); 
    view_faculty.setBounds(220,100,150,30);
    JButton add_course=new JButton("Add course");
    add_course.setBounds(50,150,150,30);
    JButton remove_faculty=new JButton("Remove Faculty");
    remove_faculty.setBounds(220,150,150,30);
    JButton log_out=new JButton("Log out");
    log_out.setBounds(120,200,150,30);
             
    f.add(add_faculty);
    f.add(view_faculty);
    f.add(add_course);
    f.add(remove_faculty);
    f.add(log_out);
    
  
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  