import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pacman {
JFrame frame;
final static int width = 961;
final static int height = 510;
GamePanel view;
Controller controller;
static Pacman pacman;
	public Pacman(){
		ImageIcon image = null;
		try {
			image = new ImageIcon(ImageIO.read(new File("ArrowKeys.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame = new JFrame();
		view = new GamePanel();
		controller = new Controller(view);
		setup();
		JOptionPane.showMessageDialog(
                null,
                "Use the Arrow Keys to move.",
                "Hello", JOptionPane.INFORMATION_MESSAGE,
                image);}

	public static void main(String [] args) {
		pacman = new Pacman();
	}
	
	public void setup (){
		frame.add(view);
		frame.addKeyListener(controller);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		controller.startGame();
	}
}
