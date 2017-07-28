import java.awt.Graphics;
import java.awt.Rectangle;

public class Coin extends GameObject{
final int widthc = 100;
final int heightc = 100;
boolean isAlive = false;
public Coin (int x, int y){
	this.x = x;
	this.y = y;
	collisionBox = new Rectangle(x, y, widthc, heightc);

}

void update(){
this.collisionBox.setBounds(x, y, widthc, heightc);	
}
void draw (Graphics g){
	g.drawImage(GamePanel.CoinImg, x, y, widthc, heightc, null);

}
}
