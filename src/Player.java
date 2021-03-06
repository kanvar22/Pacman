import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Player extends GameObject{
// movement variables
public static boolean up = false;
 public static boolean down = false;
 public static boolean right = false;
 public static boolean left = false;
 //size
 final int widthP = 8;
 final int heightP = 8;
public int speed = 1;
//Regular boolean for color detection
boolean inBoundsFL = true;
boolean inBoundsFR = true;
boolean inBoundsBL = true;
boolean inBoundsBR = true;
//Side Boolean for color detection
boolean inBoundsSML = true;
boolean inBoundsSMR = true;
boolean inBoundsBM = true;
boolean inBoundsFM = true;



	public Player(){
//Where Pacman starts
		x = 21;
		y = 21;
		collisionBox = new Rectangle();
	}
	
	void draw(Graphics g){
		//Drawing Pacman
		//System.out.println("redrawn");
		g.setColor(Color.BLACK);
		if (isAlive == false) {
			System.exit(0);
	
		}else{
		g.drawImage(GamePanel.pacmanImg, x, y, widthP, heightP, null);
	}
	}
	void update(){
		collisionBox.setBounds(x, y, widthP, heightP);
		//Detecting if x and y show up
		//System.out.println(x + " " + y);
	//System.out.println(	GamePanel.MazeImg.getHeight());

	//Color Detection
		int a = GamePanel.MazeImg.getRGB(x, y);
		int b = GamePanel.MazeImg.getRGB(x + widthP, y);
		int c = GamePanel.MazeImg.getRGB(x, y + heightP);
		int d = GamePanel.MazeImg.getRGB(x + widthP, y + heightP);
		int e = GamePanel.MazeImg.getRGB(x + 4, y);
		int f = GamePanel.MazeImg.getRGB(x , y + 4);
		int g = GamePanel.MazeImg.getRGB(x + 8, y + 4);
		int h = GamePanel.MazeImg.getRGB(x + 4, y + 8);
		//System.out.println(GamePanel.MazeImg.getRGB(x, y));
		
		//If sides of pacman collides with wall
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
		
		// if middle collides with wall
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
		
		//set movement variables for sides
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
		
		//set movement variables for middle
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
		
		
		//Movement of Pacman
		if (up == true) {
			y = y - speed;
		}
		if (down == true) {
			
			y = y + speed;
		}
		if (left == true) {
			
			x = x - speed;
		}
		if (right == true) {
			
			x = x + speed;
		}
		//Variables for color detection
		inBoundsFL = true;
		inBoundsFR = true;
		inBoundsBL = true;
		inBoundsBR = true;
		inBoundsFM = true;
		inBoundsSMR = true;
		inBoundsSML = true;
		inBoundsBM = true;
		
	// Moving form one side to the other from holes
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
