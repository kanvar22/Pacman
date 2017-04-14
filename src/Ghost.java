import java.awt.Color;
import java.awt.Graphics;



public class Ghost extends GameObject{
	 final int widthP = 50;
	 final int heightP = 50;
	 
	 public Ghost(){
			x = 30;
			y = 30;
		}
	 
	void draw(Graphics g){
		System.out.println("redrawn");
		g.setColor(Color.BLACK);
		g.drawImage(GamePanel.pacmanImg, x, y, widthP, heightP, null);
	}
	
}
