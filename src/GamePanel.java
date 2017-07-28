import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	
	public static BufferedImage GhostImg;
	public static BufferedImage pacmanImg;
	public static BufferedImage MazeImg;
	public static BufferedImage WallImg;
	public static BufferedImage CoinImg;
	public static BufferedImage CherryImg;
	GameObject object;
	ObjectManager manager;
	Ghost ghost1;
	Ghost ghost2;
	Ghost ghost3;
	Ghost ghost4;
	Ghost ghost5;
	Ghost ghost6;
	Ghost ghost7;
	Ghost ghost8;
	Ghost ghost9;
	Ghost ghost10;
	Ghost ghost11;
	Ghost ghost12;
	Ghost ghost13;
	Ghost ghost14;
	Ghost ghost15;
	Coin coin;
	Cherry cherry;
	int mazeHeight = 488 - Ghost.heightG;
	int mazeWidth = 961   - Ghost.widthG;
	int spawnPoint = mazeWidth/2;
	int timerCountDown = 25;
	
public void ghosts(){
	ghost1 = new Ghost(500, 230);
	ghost2 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost3 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost4 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost5 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost6 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost7 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost8 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost9 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost10 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost11 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost12 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost13 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost14 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	ghost15 = new Ghost(new Random().nextInt(spawnPoint) + spawnPoint, new Random().nextInt(mazeHeight));
	
}
	public GamePanel(){
		try {
			GhostImg = ImageIO.read(this.getClass().getResourceAsStream("Ghost.png"));
			pacmanImg = ImageIO.read(this.getClass().getResourceAsStream("Pacman.png"));
			MazeImg = ImageIO.read(this.getClass().getResourceAsStream("Maze.png"));
			WallImg = ImageIO.read(this.getClass().getResourceAsStream("Wall for guy.png"));
			CoinImg = ImageIO.read(this.getClass().getResourceAsStream("Coin.png"));
			CherryImg = ImageIO.read(this.getClass().getResourceAsStream("Cherry.png"));
			//manager.addObject(); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		object = new Player();
		manager = new ObjectManager();
		//System.out.println("width"+ MazeImg.getWidth());
		ghosts();
		coin = new Coin(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		cherry = new Cherry(new Random().nextInt(mazeWidth),new Random().nextInt(mazeHeight));
		
	}
public void drawingGhost(Graphics g){
	ghost1.draw(g);
	ghost2.draw(g);
	ghost3.draw(g);
	ghost4.draw(g);
	ghost5.draw(g);
	ghost6.draw(g);
	ghost7.draw(g);
	ghost8.draw(g);
	ghost9.draw(g);
	ghost10.draw(g);
	ghost11.draw(g);
	ghost12.draw(g);
	ghost13.draw(g);
	ghost14.draw(g);
	ghost15.draw(g);
}
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.drawImage(GamePanel.MazeImg, 0, 0, 961, 488, null);
		//g.drawImage(GamePanel.WallImg, 10, 510, 10, 10, null);
		//g.drawImage(GhostImg, 100, 80, 20, 20, null);
		//g.drawImage(pacmanImg, 10, 10, 2, 2, null);
		object.draw(g);
		drawingGhost(g);
		coin.draw(g);
		displayTimer(g);
		cherry.draw(g);
	}
public void update(){
	coinCollision();
	cherryCollision();
	
	if (ghost1.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called1");
	}
	if (ghost2.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called2");
	}
	if (ghost3.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called3");
	}
	if (ghost4.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called4");
	}
	if (ghost5.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called5");
	}
	if (ghost6.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called6");
	}
	if (ghost7.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called7");
	}
	if (ghost8.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called8");
	}
	if (ghost9.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called9");
	}
	if (ghost10.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called10");
	}
	if (ghost11.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called11");
	}
	if (ghost12.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called12");
	}
	if (ghost13.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called13");
	}
	if (ghost14.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called14");
	}
	if (ghost15.collisionBox.intersects(object.collisionBox)) {
		object.isAlive = false;
		System.out.println("Called15");
	}
	
}
	boolean coinCollision(){
		if (object.collisionBox.intersects(coin.collisionBox)) {
			return true;
		}	
		else {
			return false;
		}
	}
	void  (){
		timerCountDown -= 1;
	}
	void displayTimer(Graphics g){
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("" + timerCountDown, 880, 30);
		
	}
}
