import java.awt.Graphics;

public class Coin extends GameObject{
final int widthc = 50;
final int heightc = 50;
public Coin (int x, int y){
	this.x = x;
	this.y = y;
}
void draw (Graphics g){
	g.drawImage(GamePanel.CoinImg, x, y, widthc, heightc, null);
}
}
