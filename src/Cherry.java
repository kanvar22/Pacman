import java.awt.Graphics;
import java.awt.Rectangle;

public class Cherry extends GameObject{
	final int widthe = 20;
	final int heighte = 20;
	public Cherry (int x, int y){
		this.x = x;
		this.y = y;
		collisionBox = new Rectangle(x, y, widthe, heighte);

	} 
	void update(){
		this.collisionBox.setBounds(x, y, widthe, heighte);	
		}
	void draw (Graphics g){
		g.drawImage(GamePanel.CherryImg, x, y, widthe, heighte, null);

	}
}
