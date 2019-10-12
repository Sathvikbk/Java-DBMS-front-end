import javax.swing.*;    
public class student_page3 {  
public static void main(String[] args) {  

    JFrame f=new JFrame("Student page3");  
    JLabel s_h;
    s_h=new JLabel(" Course Feedback ");  
    s_h.setBounds(180,30,150,30); 
      
    JLabel s_r1;
    s_r1=new JLabel("1");  
    s_r1.setBounds(200,50,100,30);
     
    JLabel s_r2;
    s_r2=new JLabel("2");  
    s_r2.setBounds(240,50,100,30);
    
    JLabel s_r3;
    s_r3=new JLabel("3");  
    s_r3.setBounds(280,50,100,30);
    
    JLabel s_r4;
    s_r4=new JLabel("4");  
    s_r4.setBounds(320,50,100,30);
    
    JLabel s_r5;
    s_r5=new JLabel("5");  
    s_r5.setBounds(360,50,100,30);
    
    JLabel s_q1;
    s_q1=new JLabel("Question1");  
    s_q1.setBounds(50,80,100,30);
    
    JRadioButton q1_rad1= new JRadioButton("");
	 q1_rad1.setBounds(200, 80, 127, 25); 
    
    JRadioButton q1_rad2= new JRadioButton("");
	 q1_rad2.setBounds(240, 80, 127, 25);
    
    JRadioButton q1_rad3= new JRadioButton("");
	 q1_rad3.setBounds(280, 80, 127, 25);
    
    JRadioButton q1_rad4= new JRadioButton("");
	 q1_rad4.setBounds(320, 80, 127, 25);
    
    JRadioButton q1_rad5= new JRadioButton("");
	 q1_rad5.setBounds(360, 80, 127, 25);

   
    JLabel s_q2;
    s_q2=new JLabel("Question2:");  
    s_q2.setBounds(50,130, 100,30); 
    
    JRadioButton q2_rad1= new JRadioButton("");
	 q2_rad1.setBounds(200, 130, 127, 25); 
    
    JRadioButton q2_rad2= new JRadioButton("");
	 q2_rad2.setBounds(240, 130, 127, 25);
    
    JRadioButton q2_rad3= new JRadioButton("");
	 q2_rad3.setBounds(280, 130, 127, 25);
    
    JRadioButton q2_rad4= new JRadioButton("");
	 q2_rad4.setBounds(320, 130, 127, 25);
    
    JRadioButton q2_rad5= new JRadioButton("");
	 q2_rad5.setBounds(360, 130, 127, 25);

    JLabel s_q3;
    s_q3=new JLabel("Question3:");  
    s_q3.setBounds(50,180, 100,30);
    
    JRadioButton q3_rad1= new JRadioButton("");
	 q3_rad1.setBounds(200, 180, 127, 25); 
    
    JRadioButton q3_rad2= new JRadioButton("");
	 q3_rad2.setBounds(240, 180, 127, 25);
    
    JRadioButton q3_rad3= new JRadioButton("");
	 q3_rad3.setBounds(280, 180, 127, 25);
    
    JRadioButton q3_rad4= new JRadioButton("");
	 q3_rad4.setBounds(320, 180, 127, 25);
    
    JRadioButton q3_rad5= new JRadioButton("");
	 q3_rad5.setBounds(360, 180, 127, 25);

    
    JLabel s_q4;
    s_q4=new JLabel(" Question4:");  
    s_q4.setBounds(50,220,120,30);
    
    JRadioButton q4_rad1= new JRadioButton("");
	 q4_rad1.setBounds(200, 220, 127, 25); 
    
    JRadioButton q4_rad2= new JRadioButton("");
	 q4_rad2.setBounds(240, 220, 127, 25);
    
    JRadioButton q4_rad3= new JRadioButton("");
	 q4_rad3.setBounds(280,220, 127, 25);
    
    JRadioButton q4_rad4= new JRadioButton("");
	 q4_rad4.setBounds(320, 220, 127, 25);
    
    JRadioButton q4_rad5= new JRadioButton("");
	 q4_rad5.setBounds(360,220, 127, 25);

    
    JLabel s_q5;
    s_q5=new JLabel("Question5:");  
    s_q5.setBounds(50,270, 100,30); 
    
    JRadioButton q5_rad1= new JRadioButton("");
	 q5_rad1.setBounds(200, 270, 127, 25); 
    
    JRadioButton q5_rad2= new JRadioButton("");
	 q5_rad2.setBounds(240, 270, 127, 25);
    
    JRadioButton q5_rad3= new JRadioButton("");
	 q5_rad3.setBounds(280, 270, 127, 25);
    
    JRadioButton q5_rad4= new JRadioButton("");
	 q5_rad4.setBounds(320, 270, 127, 25);
    
    JRadioButton q5_rad5= new JRadioButton("");
	 q5_rad5.setBounds(360, 270, 127, 25);

    
    JLabel s_q6;
    s_q6=new JLabel("Question6:");  
    s_q6.setBounds(50,310, 100,30); 
    
    JRadioButton q6_rad1= new JRadioButton("");
	 q6_rad1.setBounds(200,310, 127, 25); 
    
    JRadioButton q6_rad2= new JRadioButton("");
	 q6_rad2.setBounds(240, 310, 127, 25);
    
    JRadioButton q6_rad3= new JRadioButton("");
	 q6_rad3.setBounds(280, 310, 127, 25);
    
    JRadioButton q6_rad4= new JRadioButton("");
	 q6_rad4.setBounds(320, 310, 127, 25);
    
    JRadioButton q6_rad5= new JRadioButton("");
	 q6_rad5.setBounds(360, 310, 127, 25);

    
    JButton b1=new JButton("Submit"); 
    b1.setBounds(30,360,100,30); 

    f.add(s_h);
    f.add(s_r1);
    f.add(s_r2);
    f.add(s_r3);
    f.add(s_r4);
    f.add(s_r5);
    
    f.add(s_q1);
    f.add(q1_rad1);
    f.add(q1_rad2);
    f.add(q1_rad3);
    f.add(q1_rad4);
    f.add(q1_rad5);
    
    f.add(s_q2);
    f.add(q2_rad1);
    f.add(q2_rad2);
    f.add(q2_rad3);
    f.add(q2_rad4);
    f.add(q2_rad5);
    
    f.add(s_q3);
    f.add(q3_rad1);
    f.add(q3_rad2);
    f.add(q3_rad3);
    f.add(q3_rad4);
    f.add(q3_rad5);
    
    f.add(s_q4); 
    f.add(q4_rad1);
    f.add(q4_rad2);
    f.add(q4_rad3);
    f.add(q4_rad4);
    f.add(q4_rad5);
    
    f.add(s_q5);
    f.add(q5_rad1);
    f.add(q5_rad2);
    f.add(q5_rad3);
    f.add(q5_rad4);
    f.add(q5_rad5);
    
    f.add(s_q6);
    f.add(q6_rad1);
    f.add(q6_rad2);
    f.add(q6_rad3);
    f.add(q6_rad4);
    f.add(q6_rad5);
    
    f.add(b1);
    
    f.setSize(1600,1600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  