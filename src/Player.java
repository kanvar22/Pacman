import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
public static boolean up = false;
 public static boolean down = false;
 public static boolean right = false;
 public static boolean left = false;
 final int widthP = 10;
 final int heightP = 10;

	public Player(){
		x = 21;
		y = 21;
	}
	void draw(Graphics g){
		System.out.println("redrawn");
		g.setColor(Color.BLACK);
		g.drawImage(GamePanel.pacmanImg, x, y, widthP, heightP, null);
		System.out.println("hello my name is y" + y);
		System.out.println("hello my name is x" + x);
	
	}
	void update(){
		
		if (up == true) {
			System.out.println("tester" + y);
			System.out.println("Up");
			y = y - 1;
		}
		if (down == true) {
			System.out.println("Down");
			y = y + 1;
		}
		if (left == true) {
			System.out.println("Left lkm ");
			x = x - 1;
		}
		if (right == true) {
			System.out.println("Right");
			x = x + 1;
		}
		System.out.println("(" + x + ", " + y + ")");
	if (y > Pacman.height) {
		y = 0;
	}
	if (y < 0) {
		y = Pacman.height;
	}
	if (x > Pacman.width) {
		x = 0;
	}
	if (x < 0) {
		x = Pacman.width;
	}
	}
}
