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
import prozori.Admin;

public class Lekovi extends JPanel {
	JButton prazan55 = new JButton("565");
	private static final long serialVersionUID = -958450762788196651L;
	promenljive source = new promenljive();
	public Lekovi()
	{
	
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
					Admin.prozor.add(prazan55, BorderLayout.CENTER);
					Admin.prozor.validate();
                    Admin.prozor.repaint();
					
				}
			});
			
		}
	});	
	add(logo);
	}

}