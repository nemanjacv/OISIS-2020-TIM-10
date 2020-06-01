package kontroleri;

import java.awt.Dimension;
import java.awt.Toolkit;

public class promenljive {

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = screenSize.height;
	int screenWidth = screenSize.width;
	
	//velicina prozora
	public int winHeight = (int) (Math.round(screenHeight * 0.50));
	public int winWidth = (int) (Math.round(screenWidth * 0.50));
			
	//velicina dugmeta
	int bHeight1 = (int) (Math.round(winHeight * 0.10));
	int bWidth1 = (int) (Math.round(winWidth * 0.25));
	
	//velicina polja
	int fHeight1 = (int) (Math.round(winHeight * 0.08));
	int fWidth1 = (int) (Math.round(winWidth * 0.20));
	
	//velicina logoa
	int lHeight1 = (int) (Math.round(winHeight * 0.32));
	int lWidth1 = (int) (Math.round(winHeight * 0.36));

    public int source1 = 1;

	
}
