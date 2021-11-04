import java.awt.*;
import javax.swing.*;

//Bank Logo

public class GraphicsD extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		//Background color of Scrren
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		Graphics2D g2D=(Graphics2D)g;
		
		
		
		//Line size, color
		g2D.setColor(Color.RED);
		g2D.setStroke(new BasicStroke(10));
		g2D.drawLine(0,0,400,400);
		
		//Line size, color
		g2D.setColor(Color.BLUE);
		g2D.setStroke(new BasicStroke(10));
		g2D.drawLine(200,200,0,0);
		
		
		//Font
		g2D.setFont(new Font("Times New Roman", Font.ITALIC,50));
		g2D.setColor(Color.MAGENTA);
		g2D.drawString("Bank of NC", 140,100 );
		
		//Draw Triangle
		int[]x={100,200,310};
		int[]y= {300,127,300};

		g2D.setColor(Color.GREEN);
		g2D.drawPolygon(x,y,3);
	
		
		
	}

}
