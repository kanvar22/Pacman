
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;



public class Ghost extends GameObject{
	 static final int widthG = 10;
	 static final int heightG = 10;
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
	 boolean left = false;
	 boolean right = false;
/*	 boolean up = false;
	 boolean down = false;
	 boolean left = false;
	 boolean right = false;*/
	 public Ghost(int x, int y){
			this.x = x;
			this.y = y;
			collisionBox = new Rectangle(x, y, widthG, heightG);

		}
	 
	void draw(Graphics g){
		//System.out.println("redrawn");
		g.setColor(Color.BLACK);
		g.drawImage(GamePanel.GhostImg, x, y, widthG, heightG, null);

	}
void updateCollisionBox(){
	collisionBox.setBounds(x, y, widthG, heightG);
}
	void update(){
		//System.out.println(x + " " + y);
	//System.out.println(	GamePanel.MazeImg.getHeight());
		updateCollisionBox();
	//Color Detection
		int a = GamePanel.MazeImg.getRGB(x, y);
		int b = GamePanel.MazeImg.getRGB(x + widthG, y);
		int c = GamePanel.MazeImg.getRGB(x, y + heightG);
		int d = GamePanel.MazeImg.getRGB(x + widthG, y + heightG);
		int e = GamePanel.MazeImg.getRGB(x + 4, y);
		int f = GamePanel.MazeImg.getRGB(x , y + 4);
		int g = GamePanel.MazeImg.getRGB(x + 8, y + 4);
		int h = GamePanel.MazeImg.getRGB(x + 4, y + 8);
		//System.out.println(GamePanel.MazeImg.getRGB(x, y));
		
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
		//System.out.println("go left");

		
		if (y >= GamePanel.MazeImg.getHeight() - heightG-1) {
			y = 1;
		}
		if (y <= 0) {
			y = GamePanel.MazeImg.getHeight() - heightG-1;
		}
		if (x >= GamePanel.MazeImg.getWidth() - widthG - 1) {
			x = 1;
		}
		if (x <= 0) {
			x = GamePanel.MazeImg.getWidth() - widthG - 1;
		}
		inBoundsFL = true;
		inBoundsFR = true;
		inBoundsBL = true;
		inBoundsBR = true;
		inBoundsFM = true;
		inBoundsSMR = true;
		inBoundsSML = true;
		inBoundsBM = true;
		
}
	void findPlayer(int px, int py){
		if (new Random().nextBoolean()) {
		
		if (px > x) {
			x++;
		}
		if (x > px) {
			x--;
		}
		}
		else {
			
		
		if (py > y) {
			y ++;
		}
		 if (y > py) {
			y--;
		}
		}
	}

}
