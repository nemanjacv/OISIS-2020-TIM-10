package prikaz;

import kontroleri.promenljive;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Logo extends JLabel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	promenljive source = new promenljive();
	public Logo()
	{
	ImageIcon logoico = new ImageIcon("img/logo.png");
	Image image3 = logoico.getImage().getScaledInstance( source.lWidth1, source.lHeight1 , Image.SCALE_SMOOTH);
	JLabel logo = new JLabel( new ImageIcon(image3, logoico.getDescription()) );
	add(logo);
	}
}
