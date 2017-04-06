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
	}
	void update(){
		System.out.println(x + " " + y);
	System.out.println(	GamePanel.MazeImg.getHeight());
		GamePanel.MazeImg.getRGB(x, y);
		GamePanel.MazeImg.getRGB(x + 10, y);
		GamePanel.MazeImg.getRGB(x, y + 10);
		GamePanel.MazeImg.getRGB(x + 10, y + 10);
		GamePanel.MazeImg.getRGB(x + 5, y);
		GamePanel.MazeImg.getRGB(x, y + 5);
		GamePanel.MazeImg.getRGB(x + 5, y + 10);
		GamePanel.MazeImg.getRGB(x + 10, y + 5);
		System.out.println(GamePanel.MazeImg.getRGB(x, y));
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
		y = 0;
	}
	if (y <= 0) {
		y = GamePanel.MazeImg.getHeight() - heightP-1;
	}
	if (x >= GamePanel.MazeImg.getWidth() - widthP) {
		x = 0;
	}
	if (x <= 0) {
		x = GamePanel.MazeImg.getWidth() - widthP;
	}
	}
}
