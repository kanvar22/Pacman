import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
public static boolean up = false;
 public static boolean down = false;
 public static boolean right = false;
 public static boolean left = false;

	public Player(){
		x = 21;
		y = 21;
	}
	void draw(Graphics g){
		System.out.println("redrawn");
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 100, 100);
	}
	void update(){
		if (up == true) {
			System.out.println("tester" + y);
			System.out.println("Up");
			y--;
		}
		if (down == true) {
			System.out.println("Down");
			y++;
		}
		if (left == true) {
			System.out.println("Left");
			x--;
		}
		if (right == true) {
			System.out.println("Right");
			x++;
		}
		System.out.println("(" + x + ", " + y + ")");
	}
}
