import javax.swing.*;

public class MyFrame extends JFrame {
	
	GraphicsD graphicD = new GraphicsD();
	
	public MyFrame() {
		
		this.setSize(420,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(graphicD);
		this.setVisible(true);
		
		
		
	}

}
