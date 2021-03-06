package prikaz;

import kontroleri.promenljive;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Logo extends JPanel {

	private static final long serialVersionUID = -958450762788196651L;
	promenljive source = new promenljive();
	public Logo()
	{
	ImageIcon logoico = new ImageIcon("img/logom.png");
	Image image3 = logoico.getImage().getScaledInstance( source.lWidth1, source.lHeight1 , Image.SCALE_SMOOTH);
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
