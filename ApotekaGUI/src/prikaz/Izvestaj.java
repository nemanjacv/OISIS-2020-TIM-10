package prikaz;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import kontroleri.promenljive;

public class Izvestaj extends JPanel {
	private static final long serialVersionUID = -958450762788196651L;
	promenljive source = new promenljive();
	public Izvestaj()
	{
	ImageIcon logoico = new ImageIcon("img/i2.png");
	Image image3 = logoico.getImage().getScaledInstance( source.iWidth, source.iHeight , Image.SCALE_SMOOTH);
	JButton logo = new JButton("");
	logoico = new ImageIcon(image3, logoico.getDescription());
	logo.setPreferredSize(new Dimension(source.blWidth1,source.blHeight1));
	logo.setIcon(logoico);
	logo.setBorder(null);
	logo.setFocusable(false);
	logo.setContentAreaFilled(false);
			
	add(logo);
	}
}
