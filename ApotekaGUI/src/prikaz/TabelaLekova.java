package prikaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import kontroleri.promenljive;

public class TabelaLekova extends JPanel{

	private static final long serialVersionUID = -3355785051368920675L;

	promenljive source = new promenljive();
	
    public TabelaLekova() {
        super(new GridLayout(1,0));

        String[] columnNames = {"First Name",
                                "Last Name",
                                "Sport",
                                "# of Years",
                                "Vegetarian"};

        Object[][] data = {
        			{"Kathy", "Smith",
        		     "Snowboarding", new Integer(5), new Boolean(false)},
        		    {"John", "Doe",
        		     "Rowing", new Integer(3), new Boolean(true)},
        		    {"Sue", "Black",
        		     "Knitting", new Integer(2), new Boolean(false)},
        		    {"Jane", "White",
        		     "Speed reading", new Integer(20), new Boolean(true)},
        		    {"Joe", "Brown",
        		     "Pool", new Integer(10), new Boolean(false)}
        };

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
    }

}
