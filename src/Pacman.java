import javax.swing.JFrame;

public class Pacman {
JFrame frame;
final int width = 961;
final int height = 488;
GamePanel view;
Controller controller;
static Pacman pacman;
	
	public Pacman(){
		frame = new JFrame();
		view = new GamePanel();
		controller = new Controller(view);
		setup();
}
	public static void main(String [] args) {
		pacman = new Pacman();
	}
	
	public void setup (){
		frame.add(view);
		controller.startGame();
		frame.addKeyListener(controller);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
