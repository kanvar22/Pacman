import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	public int x;
	public int y;
	int width;
	int height;
	boolean isAlive = true;
	Rectangle collisionBox;
	
	public GameObject(){
		width = 100;
		height = 100;
	}
	void update(){
	
	}
	void draw(Graphics g){
		//g.fillRect(x, y, width, height);
	}
}
