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
	public int lHeight = (int) (Math.round(winHeight * 0.32));
	public int lWidth = (int) (Math.round(winHeight * 0.36));
	
	//velicina logoa manjeg
	public int lHeight1 = (int) (Math.round(winHeight * 0.14));
	public int lWidth1 = (int) (Math.round(winHeight * 0.15));
	
	//velicina ikonica
	public int iHeight = (int) (Math.round(winHeight * 0.15));
	public int iWidth = (int) (Math.round(winHeight * 0.15));
	
	//velicina dugmeta za logo manji
	public int blHeight1 = (int) (Math.round(winHeight * 0.15));
	public int blWidth1 = (int) (Math.round(winWidth * 0.09));
	
	//block
	public int blHeight = (int) (Math.round(screenHeight * 0.07));
	public int blWidth = (int) (Math.round(screenWidth * 0.048));

    public int source1 = 1;

	
}
