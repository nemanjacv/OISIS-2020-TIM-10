package prozori;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kontroleri.promenljive;

public class Admin {

	JFrame prozor = new JFrame();
	JPanel regular = new JPanel();
	promenljive source = new promenljive();
	JButton dugme1 = new JButton("tehe");
	
	ImageIcon slika1 = new ImageIcon("img/bckgrnd.png");
	Image pozadina = slika1.getImage().getScaledInstance( source.winWidth, source.winHeight, Image.SCALE_SMOOTH);
	JLabel bckgrnd = new JLabel( new ImageIcon(pozadina, slika1.getDescription()) );
	
	public Admin()
	{
		prozor.setUndecorated(true);
		prozor.setPreferredSize(new Dimension(source.winWidth, source.winHeight));
		bckgrnd.setLayout(new GridBagLayout());
		prozor.setContentPane(bckgrnd);
		
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.fill= GridBagConstraints.BOTH;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		bckgrnd.add(dugme1, gbc);

		
		
		prozor.pack();
		prozor.setLocationRelativeTo(null);
	    prozor.setVisible(true);
	    
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

