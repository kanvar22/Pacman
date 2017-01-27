import javax.swing.JFrame;

public class Pacman {
JFrame frame;
final int width = 961;
final int height = 488;
static Pacman pacman;
	
	Pacman(){
		frame = new JFrame();
		setup();
		pacman = new Pacman();
}
	public static void main(String[] args) {
		
	}
	
	public void setup (){
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
