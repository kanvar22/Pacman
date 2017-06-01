import java.awt.Color;
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
	GameObject object;
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
	int mazeHeight = 488 - Ghost.heightP;
	int mazeWidth = 961   - Ghost.widthP;

	public GamePanel(){
		try {
			GhostImg = ImageIO.read(this.getClass().getResourceAsStream("Ghost.png"));
			pacmanImg = ImageIO.read(this.getClass().getResourceAsStream("Pacman.png"));
			MazeImg = ImageIO.read(this.getClass().getResourceAsStream("Maze.png"));
			WallImg = ImageIO.read(this.getClass().getResourceAsStream("Wall for guy.png"));
			CoinImg = ImageIO.read(this.getClass().getResourceAsStream("Coin.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		object = new Player();
		System.out.println("width"+ MazeImg.getWidth());
		ghost1 = new Ghost(500, 230);
		ghost2 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost3 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost4 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost5 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost6 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost7 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost8 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost9 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost10 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost11 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost12 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost13 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost14 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		ghost15 = new Ghost(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
		coin = new Coin(new Random().nextInt(mazeWidth), new Random().nextInt(mazeHeight));
	}

	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.drawImage(GamePanel.MazeImg, 0, 0, 961, 488, null);
		//g.drawImage(GamePanel.WallImg, 10, 510, 10, 10, null);
		//g.drawImage(GhostImg, 100, 80, 20, 20, null);
		//g.drawImage(pacmanImg, 10, 10, 2, 2, null);
		object.draw(g);
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
		coin.draw(g);
	}

	
}
