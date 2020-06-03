package prikaz;

import kontroleri.promenljive;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logo extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -958450762788196651L;
	promenljive source = new promenljive();
	public Logo()
	{
	ImageIcon logoico = new ImageIcon("img/logo.png");
	Image image3 = logoico.getImage().getScaledInstance( source.lWidth1, source.lHeight1 , Image.SCALE_SMOOTH);
	JLabel logo = new JLabel( new ImageIcon(image3, logoico.getDescription()));
	
	add(logo);
	}
}
