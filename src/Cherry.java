import java.awt.Graphics;
import java.awt.Rectangle;

public class Cherry extends GameObject{
	final int widthe = 20;
	final int heighte = 20;
	public Cherry (int x, int y){
		this.x = x;
		this.y = y;
		

	} 
	
	void draw (Graphics g){
		g.drawImage(GamePanel.CherryImg, x, y, widthe, heighte, null);

	}
}
