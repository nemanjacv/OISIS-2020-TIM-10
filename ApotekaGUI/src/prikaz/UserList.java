package prikaz;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kontroleri.promenljive;

public class UserList extends JPanel  {
	
	private static final long serialVersionUID = -958450762788196651L;
	promenljive source = new promenljive();
	public UserList()
	{
	ImageIcon usrico = new ImageIcon("img/i1.png");
	Image image3 = usrico.getImage().getScaledInstance( source.lWidth1, source.lHeight1 , Image.SCALE_SMOOTH);
	JLabel UserList = new JLabel( new ImageIcon(image3,usrico.getDescription()));
	
	add(UserList);
	}

}
