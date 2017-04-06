import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class Controller implements ActionListener, KeyListener {
	Timer timer;
	GameObject object;
	GamePanel view;

	public Controller() {
		timer = new Timer(1000 / 60, this);
		

	}

	public Controller(GamePanel view) {
		this();
		object = view.object;
		this.view = view;
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		object.update();
		view.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Player.up = true;
			Player.down = false;
			Player.left = false;
			Player.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Player.down = true;
			Player.left = false;
			Player.right = false;
			Player.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Player.left = true;
			Player.right = false;
			Player.up = false;
			Player.down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Player.right = true;
			Player.up = false;
			Player.down = false;
			Player.left = false;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
