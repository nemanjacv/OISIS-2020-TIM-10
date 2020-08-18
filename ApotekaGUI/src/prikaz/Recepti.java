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
import paneli.DodavanjeReceptaWin;
import paneli.ReceptiWin;
import prozori.Lekar;

public class Recepti extends JPanel {
	
	public static JPanel panel = new ReceptiWin();
	public static JPanel panel2 = new DodavanjeReceptaWin();
	private static final long serialVersionUID = 6714572452258716717L;
	promenljive source = new promenljive();
	public Recepti()
	{
	panel.setOpaque(false);
	panel2.setOpaque(false);
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
					Lekar.prozor.add(panel, BorderLayout.CENTER);
					Lekar.prozor.add(panel2, BorderLayout.CENTER);
					panel.setVisible(true);
					panel2.setVisible(false);
					Lekar.wlcm.setVisible(false);
					UserList.panel.setVisible(false);
					Izvestaj.panel.setVisible(false);
					Korpa.panel.setVisible(false);
					AddUser.panel.setVisible(false);
					Lekar.prozor.validate();
                    Lekar.prozor.repaint();
					
				}
			});
			
		}
	});	
	add(logo);
	}

}
