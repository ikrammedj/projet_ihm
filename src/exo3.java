import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;

public class exo3 extends JFrame implements ActionListener{
	
JTextArea ta;
JMenuItem i1,i2,i3,i4;

public exo3() {
	this.setTitle("fenetres");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	JMenuBar br = new JMenuBar ();
	JMenu file = new JMenu ("file");
	JMenu edit = new JMenu ("edit");
	JMenu help = new JMenu ("help");
	
	i1= new JMenuItem ("copy");
	i2= new JMenuItem ("cut");
	i3= new JMenuItem ("past");
	i4= new JMenuItem ("selectAll");
	
	edit.add(i4);
	edit.add(i1);
	edit.add(i2);
	edit.add(i3);
	
	br.add(file);
	br.add(edit);
	br.add(help);
	
	
	ta = new JTextArea (40,40);
	this.add(br,BorderLayout.NORTH);

	this.add(ta,BorderLayout.CENTER);
	this.pack();
	this.setVisible (true);
	
	i1.addActionListener(this);
	i2.addActionListener(this);
	i3.addActionListener(this);
	i4.addActionListener(this);
	
}

public void actionPerformed (ActionEvent e) {
	if(e.getSource()==i1) ta.copy();
	if(e.getSource()==i2) ta.cut();
	if(e.getSource()==i3) ta.paste();
	if(e.getSource()==i4) ta.selectAll();	

	
}
public static void main(String[] args) {
	
	new exo3();
	
	
}		
}
