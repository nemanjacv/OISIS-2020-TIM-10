package prikaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import kontroleri.promenljive;

public class TabelaLekova extends JPanel{
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Workbook wb;
	private static Sheet sh;
	private static Row row;
	private static Cell cell;

	private static final long serialVersionUID = -3355785051368920675L;

	promenljive source = new promenljive();
	
    public TabelaLekova() {
        super(new GridLayout(1,0));
        
				try {
					fis= new FileInputStream("./podaci.xlsx");
					wb= WorkbookFactory.create(fis);
					sh=wb.getSheet("lekovi");
				    int noRows = sh.getLastRowNum();
				    
				    String[] columnNames = {"Naziv",
                            "Sifra",
                            "Recept",
                            "Proizvodjac",
                            "Cena"
                            };
			
    		Object[][] data = new Object[noRows][5];
    		
    		for (int i=0; i< noRows; i++)
    		{
    			data[i][0] = sh.getRow(i+1).getCell(0);
    			data[i][1] = sh.getRow(i+1).getCell(1);
    			data[i][2] = sh.getRow(i+1).getCell(2);
    			data[i][3] = sh.getRow(i+1).getCell(3);
    			data[i][4] = sh.getRow(i+1).getCell(4);
    		}

    final JTable table = new JTable(data, columnNames);
    table.setPreferredScrollableViewportSize(new Dimension(source.winWidth/2,source.winHeight/3));
    table.setFillsViewportHeight(true);
    table.setOpaque(false);
    table.setFont(new Font("Calibri", Font.PLAIN, 15));

    //Create the scroll pane and add the table to it.
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setOpaque(false);
    scrollPane.getViewport().setOpaque(false);
    LineBorder lb = new LineBorder(new Color(0,0,0,0)); // transparent border
    scrollPane.setBorder(lb);
    
    //Add the scroll pane to this panel.
    add(scrollPane);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EncryptedDocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
    }

}
