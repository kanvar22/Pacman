import javax.swing.JFrame;

public class Pacman {
JFrame frame;
final int width = 961;
final int height = 488;
GamePanel game;
static Pacman pacman;
	
	public Pacman(){
		frame = new JFrame();
		game = new GamePanel();
		setup();
}
	public static void main(String [] args) {
		pacman = new Pacman();
	}
	
	public void setup (){
		frame.add(game);
		game.startGame();
		frame.addKeyListener(game);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
