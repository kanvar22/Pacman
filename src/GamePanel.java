import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	
	public static BufferedImage GhostImg;
	public static BufferedImage pacmanImg;
	public static BufferedImage MazeImg;
	public static BufferedImage WallImg;
	public static BufferedImage CherryImg;
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

	public GamePanel(){
		try {
			GhostImg = ImageIO.read(this.getClass().getResourceAsStream("Ghost.png"));
			pacmanImg = ImageIO.read(this.getClass().getResourceAsStream("Pacman.png"));
			MazeImg = ImageIO.read(this.getClass().getResourceAsStream("Maze.png"));
			WallImg = ImageIO.read(this.getClass().getResourceAsStream("Wall for guy.png"));
			CherryImg = ImageIO.read(this.getClass().getResourceAsStream("Cherry.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		object = new Player();
		ghost1 = new Ghost(500, 230);
		ghost2 = new Ghost(551, 240);
		ghost3 = new Ghost(543, 235);
		ghost4 = new Ghost(561, 245);
		ghost5 = new Ghost(512, 255);
		ghost6 = new Ghost(524, 243);
		ghost7 = new Ghost(538, 231);
		ghost8 = new Ghost(551, 220);
		ghost9 = new Ghost(543, 220);
		ghost10 = new Ghost(521, 251);
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
	}

	
}
