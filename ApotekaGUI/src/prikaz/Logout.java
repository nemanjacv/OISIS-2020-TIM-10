package prikaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import prozori.Admin;
import prozori.Apotekar;
import prozori.Lekar;
import prozori.LoginWin;

public class Logout extends JPanel {
	

	private static final long serialVersionUID = -4813329911065574369L;
	JButton home = new JButton("");
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
				Admin.prozor.dispose();
				Lekar.prozor.dispose();
				Apotekar.prozor.dispose();
				
			}
		});
		  

		home.setPreferredSize(new Dimension(30, 30));
		ImageIcon btnn1 = new ImageIcon("img/i8.png");
		Image butn1 = btnn1.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnn1 = new ImageIcon(butn1, btnn1.getDescription());

		home.setIcon(btnn1);
		home.setBorder(null);
		home.setFocusable(false);
		home.setContentAreaFilled(false);
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Admin.wlcm.setVisible(true);
				Apotekar.wlcm.setVisible(true);
				Lekar.wlcm.setVisible(true);
				UserList.panel.setVisible(false);
				Lekovi.panel.setVisible(false);
				Lekovi.panel2.setVisible(false);
				Lekovi.panel3.setVisible(false);
				Lekovi2.panel.setVisible(false);
				Lekovi3.panel.setVisible(false);
				Recepti.panel.setVisible(false);
				Recepti.panel2.setVisible(false);
				Korpa.panel.setVisible(false);
				Izvestaj.panel.setVisible(false);
				AddUser.panel.setVisible(false);
			}
		});
		
		add(home);
		add(logout);
	}
}
