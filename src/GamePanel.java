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
	}

	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.drawImage(GamePanel.MazeImg, 0, 0, 961, 488, null);
		//g.drawImage(GamePanel.WallImg, 10, 510, 10, 10, null);
		//g.drawImage(GhostImg, 100, 80, 20, 20, null);
		//g.drawImage(pacmanImg, 10, 10, 2, 2, null);
		object.draw(g);
	}

	
}
