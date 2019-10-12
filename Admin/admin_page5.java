import javax.swing.*;    
public class admin_page5 {  
public static void main(String[] args) {  

    JFrame f=new JFrame("Admin page5");  
    JLabel a_h;
    a_h=new JLabel("ADD Course");  
    a_h.setBounds(100,30,100,30); 
  
    JLabel a_id;
    a_id=new JLabel("Facuklty ID:");  
    a_id.setBounds(50,80, 100,30); 
    
    JComboBox comboBox1 = new JComboBox();
	 comboBox1.setBounds(150, 80,100,20);
    
    JLabel a_sem;
    a_sem=new JLabel("SEM:");  
    a_sem.setBounds(50,160, 100,30); 
    
    JComboBox comboBox2 = new JComboBox();
    comboBox2.addItem("1");
	 comboBox2.addItem("2");
	 comboBox2.addItem("3");
	 comboBox2.addItem("4");
    comboBox2.addItem("5");
    comboBox2.addItem("6");
    comboBox2.addItem("7");
    comboBox2.addItem("8");
	 comboBox2.setSelectedItem(null);
	 comboBox2.setBounds(150, 160,100,20);
    
    JLabel a_course;
    a_course=new JLabel("Course:");  
    a_course.setBounds(50,240,100,30); 
    
    JComboBox comboBox3 = new JComboBox();
	 comboBox3.setBounds(150,240,100,20);
          
    JButton b1=new JButton("Back"); 
    b1.setBounds(30,300,100,30); 
    
    JButton b2=new JButton("REMOVE"); 
    b2.setBounds(150,300,100,30); 

    f.add(a_h);
    f.add(a_id);
    f.add(comboBox1);
    f.add(a_sem);
    f.add(comboBox2);
    f.add(a_course);
    f.add(comboBox3);
    f.add(b1);
    f.add(b2);
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  