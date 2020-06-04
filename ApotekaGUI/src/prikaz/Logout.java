package prikaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import prozori.Admin;
import prozori.LoginWin;

public class Logout extends JPanel {
	

	private static final long serialVersionUID = -4813329911065574369L;
	JButton prazan5 = new JButton("5");
	public static JButton logout = new JButton("Izloguj se");
	
	public Logout() 
	{
		logout.setFont(new Font("Calibri", Font.PLAIN, 15));
		logout.setForeground(new Color(0x008000));
		logout.setBorderPainted(false);
		logout.setFocusable(false);
		logout.setContentAreaFilled(false);
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginWin login = new LoginWin();
				login.setVisible(true);
				Admin.prozor.setVisible(false);
				
			}
		});
		add(prazan5);
		add(logout);
	}
}
