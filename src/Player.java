import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
public static boolean up = false;
 public static boolean down = false;
 public static boolean right = false;
 public static boolean left = false;
 final int widthP = 8;
 final int heightP = 8;
//Regular boolean
boolean inBoundsFL = true;
boolean inBoundsFR = true;
boolean inBoundsBL = true;
boolean inBoundsBR = true;
//Side Boolean
boolean inBoundsSML = true;
boolean inBoundsSMR = true;
boolean inBoundsBM = true;
boolean inBoundsFM = true;


 
	public Player(){
		x = 21;
		y = 21;
	}
	public int getX(){
		return x;
	}
	void draw(Graphics g){
		System.out.println("redrawn");
		g.setColor(Color.BLACK);
		g.drawImage(GamePanel.pacmanImg, x, y, widthP, heightP, null);
	}
	void update(){
		System.out.println(x + " " + y);
	System.out.println(	GamePanel.MazeImg.getHeight());

	//Color Detection
		int a = GamePanel.MazeImg.getRGB(x, y);
		int b = GamePanel.MazeImg.getRGB(x + widthP, y);
		int c = GamePanel.MazeImg.getRGB(x, y + heightP);
		int d = GamePanel.MazeImg.getRGB(x + widthP, y + heightP);
		int e = GamePanel.MazeImg.getRGB(x + 4, y);
		int f = GamePanel.MazeImg.getRGB(x , y + 4);
		int g = GamePanel.MazeImg.getRGB(x + 8, y + 4);
		int h = GamePanel.MazeImg.getRGB(x + 4, y + 8);
		System.out.println(GamePanel.MazeImg.getRGB(x, y));
		
		if (a != -16777216 && b != -16777216) {
			inBoundsFL = false;
			inBoundsFR = false;
		}
		
		if (b != -16777216 && d != -16777216) {
			inBoundsFR = false;
			inBoundsBR = false;
		}
		
		if (d != -16777216 && c != -16777216) {
			inBoundsBR = false;
			inBoundsBL = false;
		}
		
		if (c != -16777216 && a != -16777216) {
			inBoundsBL = false;
			inBoundsFL = false;
		}
		
		if (e != -16777216) {
			inBoundsFM = false;
		}
		
		if (f != -16777216) {
			inBoundsSML = false;
		}
		
		if (g != -16777216) {
			inBoundsSMR = false;
		}
		
		if (h != -16777216) {
			inBoundsBM = false;
		}
		
		if (inBoundsFL == false && inBoundsFR ==  false) {
			up = false;
		
		}
		
		if (inBoundsFR == false && inBoundsBR == false) {
			right = false;
		
		}

		if (inBoundsBR == false && inBoundsBL == false) {
			down = false;
	
		}

		if (inBoundsBL == false && inBoundsFL == false) {
			left = false;
		
		}
		
		if (inBoundsFM == false) {
			up = false;
		}
		
		if (inBoundsBL == false) {
			down = false;
		}
		
		if (inBoundsSML == false) {
			left = false;
		}
		
		if (inBoundsSMR == false) {
			right = false;
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
		inBoundsFL = true;
		inBoundsFR = true;
		inBoundsBL = true;
		inBoundsBR = true;
		inBoundsFM = true;
		inBoundsSMR = true;
		inBoundsSML = true;
		inBoundsBM = true;
		
	//Movement of Pacman
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
