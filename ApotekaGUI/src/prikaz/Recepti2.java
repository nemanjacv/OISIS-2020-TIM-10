package prikaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import kontroleri.promenljive;
import paneli.ReceptiWin2;
import prozori.Apotekar;

public class Recepti2 extends JPanel {
	
	public static JPanel panel = new ReceptiWin2();
	private static final long serialVersionUID = 6714572452258716717L;
	promenljive source = new promenljive();
	public Recepti2()
	{
	panel.setOpaque(false);
	ImageIcon logoico = new ImageIcon("img/i6.png");
	Image image3 = logoico.getImage().getScaledInstance( source.iWidth, source.iHeight , Image.SCALE_SMOOTH);
	JButton logo = new JButton("");
	logoico = new ImageIcon(image3, logoico.getDescription());
	logo.setPreferredSize(new Dimension(source.blWidth1,source.blHeight1));
	logo.setIcon(logoico);
	logo.setBorder(null);
	logo.setFocusable(false);
	logo.setContentAreaFilled(false);
	logo.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					Apotekar.prozor.add(panel, BorderLayout.CENTER);
					panel.setVisible(true);
					Apotekar.wlcm.setVisible(false);
					Lekovi3.panel.setVisible(false);
					UserList.panel.setVisible(false);
					Izvestaj.panel.setVisible(false);
					Korpa.panel.setVisible(false);
					Shop.panel.setVisible(false);
					AddUser.panel.setVisible(false);
					Apotekar.prozor.validate();
					Apotekar.prozor.repaint();
					
				}
			});
			
		}
	});	
	add(logo);
	}

}
