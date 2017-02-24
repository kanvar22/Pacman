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
GameObject object;

	public GamePanel(){
		try {
			GhostImg = ImageIO.read(this.getClass().getResourceAsStream("Ghost.png"));
			pacmanImg = ImageIO.read(this.getClass().getResourceAsStream("pacman.png"));
			MazeImg = ImageIO.read(this.getClass().getResourceAsStream("Maze.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	object = new Player();
}

public void paintComponent(Graphics g){
	object.draw(g);

}

	
}
