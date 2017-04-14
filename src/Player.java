import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
public static boolean up = false;
 public static boolean down = false;
 public static boolean right = false;
 public static boolean left = false;
 final int widthP = 10;
 final int heightP = 10;
boolean inBoundsFL = true;
boolean inBoundsFR = true;
boolean inBoundsBL = true;
boolean inBoundsBR = true;
 
	public Player(){
		x = 21;
		y = 21;
	}
	void draw(Graphics g){
		System.out.println("redrawn");
		g.setColor(Color.BLACK);
		g.drawImage(GamePanel.pacmanImg, x, y, widthP, heightP, null);
	}
	void update(){
		System.out.println(x + " " + y);
	System.out.println(	GamePanel.MazeImg.getHeight());

	//for example, if pacman is heading right decrease x by 1.
		int a = GamePanel.MazeImg.getRGB(x, y);
		int b = GamePanel.MazeImg.getRGB(x + 10, y);
		int c = GamePanel.MazeImg.getRGB(x, y + 10);
		int d = GamePanel.MazeImg.getRGB(x + 10, y + 10);
		System.out.println(GamePanel.MazeImg.getRGB(x, y));
		
		if (a == -16777216) {
			inBoundsFL = true;
		}
		
		if (up == true) {
			y = y - 1;
		}
		if (down == true) {
			
			y = y + 1;
		}
		if (left == true) {
			
			x = x - 1;
		}
		if (right == true) {
			
			x = x + 1;
		}
	if (y >= GamePanel.MazeImg.getHeight() - heightP-1) {
		y = 1;
	}
	if (y <= 0) {
		y = GamePanel.MazeImg.getHeight() - heightP-1;
	}
	if (x >= GamePanel.MazeImg.getWidth() - widthP - 1) {
		x = 1;
	}
	if (x <= 0) {
		x = GamePanel.MazeImg.getWidth() - widthP - 1;
	}
	}
}
