import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myframe extends JFrame implements ActionListener{
	Container c;
	JButton btn1 = new JButton("BLUE");
	JButton btn2 = new JButton("RED");
	JButton btn3 = new JButton("GREEN");
      Myframe(){
	    c = this.getContentPane();
		c.setLayout(null);
		
		btn1.setBounds(100,100,100,50);
		btn2.setBounds(250,100,100,50);
		btn3.setBounds(400,100,100,50);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	
	
		btn1.addActionListener(this);
	
		btn2.addActionListener(this);
		
		btn3.addActionListener(this);
	     
		btn1.setVisible(true);
		btn2.setVisible(true);
		btn3.setVisible(true);
	  }
	  
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			c.setBackground(Color.BLUE);
		}
		if(e.getSource()==btn2){
			c.setBackground(Color.RED);
		}
		if(e.getSource()==btn3){
			c.setBackground(Color.GREEN);
		}
		
		
	}
}







class  ColorButton{
	public static void main(String args[]){
		Myframe f = new Myframe();
		f.setTitle("Zain 4");
		f.setSize(700,500);
		f.setLocation(100,50);
		
	    ImageIcon icon = new ImageIcon("Airplane.png");
	    f.setIconImage(icon.getImage());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}