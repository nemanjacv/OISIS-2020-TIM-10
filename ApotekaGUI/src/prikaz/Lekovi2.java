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
import paneli.LekoviWin2;
import prozori.Admin;
import prozori.Lekar;

public class Lekovi2 extends JPanel {
	
	public static JPanel panel = new LekoviWin2();
	private static final long serialVersionUID = 6714572452258716717L;
	promenljive source = new promenljive();
	public Lekovi2()
	{
	panel.setOpaque(false);
	ImageIcon logoico = new ImageIcon("img/i3.png");
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
					Lekar.prozor.add(panel, BorderLayout.CENTER);
					panel.setVisible(true);
					Admin.wlcm.setVisible(false);
					Lekar.wlcm.setVisible(false);
					UserList.panel.setVisible(false);
					Recept.panel.setVisible(false);
					Izvestaj.panel.setVisible(false);
					Korpa.panel.setVisible(false);
					AddUser.panel.setVisible(false);
					Admin.prozor.validate();
                    Admin.prozor.repaint();
					
				}
			});
			
		}
	});	
	add(logo);
	}

}
