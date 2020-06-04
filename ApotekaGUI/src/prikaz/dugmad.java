package prikaz;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import prozori.Admin;

public class dugmad extends JPanel {
	

	private static final long serialVersionUID = -3237368039831873817L;
	
	JButton b1=new JButton();
	JButton b2=new JButton();
	
	public dugmad()
	{

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Admin.prozor.setState(Frame.ICONIFIED);
				
			}
		});
		
		b1.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn1 = new ImageIcon("img/2.png");
		Image butn1 = btnn1.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn1 = new ImageIcon(butn1, btnn1.getDescription());
		
		b1.setIcon(btnn1);
		b1.setBorder(null);
		b1.setFocusable(false);
		b1.setContentAreaFilled(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		b2.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn2 = new ImageIcon("img/1.png");
		Image butn2 = btnn2.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn2 = new ImageIcon(butn2, btnn2.getDescription());
		
		b2.setIcon(btnn2);
		b2.setBorder(null);
		b2.setFocusable(false);
		b2.setContentAreaFilled(false);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(b2);
		add(b1);
	}

}
