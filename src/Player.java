import java.awt.Graphics;

public class Player extends GameObject{

	public Player(){
		
	}
	void draw(Graphics g){
	g.fillOval(x, y, 100, 100);
}
}
