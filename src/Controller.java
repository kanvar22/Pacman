import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

public class Controller extends GamePanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject object;
	GamePanel view;
	int countDown = 0;
	

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
public void ghostUpdate (){
	
	view.ghost1.update();
	view.ghost2.update();
	view.ghost3.update();
	view.ghost4.update();
	view.ghost5.update();
	view.ghost6.update();
	view.ghost7.update();
	view.ghost8.update();
	view.ghost9.update();
	view.ghost10.update();
//	view.ghost11.update();
//	view.ghost12.update();
//	view.ghost13.update();
//	view.ghost14.update();
//	view.ghost15.update();
	
}
public void trackPacman(){
	view.ghost1.findPlayer(object.x, object.y);
	view.ghost2.findPlayer(object.x, object.y);
	view.ghost3.findPlayer(object.x, object.y);
	view.ghost4.findPlayer(object.x, object.y);
	view.ghost5.findPlayer(object.x, object.y);
	view.ghost6.findPlayer(object.x, object.y);
	view.ghost7.findPlayer(object.x, object.y);
	view.ghost8.findPlayer(object.x, object.y);
	view.ghost9.findPlayer(object.x, object.y);
	view.ghost10.findPlayer(object.x, object.y);
//	view.ghost11.findPlayer(object.x, object.y);
//	view.ghost12.findPlayer(object.x, object.y);
//	view.ghost13.findPlayer(object.x, object.y);
//	view.ghost14.findPlayer(object.x, object.y);
//	view.ghost15.findPlayer(object.x, object.y);
}
public void movingPacman(KeyEvent e){
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
		Player.up    = false;
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		object.update();
		view.coin.update();
		view.cherry.update();
		ghostUpdate();
		trackPacman();
		view.repaint();
		view.update();
		countDown++;
		if (countDown% 60 == 0) {
			view.countdownTimer();
		}
		if (countDown > 25*60) {
			System.exit(0);
			
		}
		if (view.coinCollision()) {
			countDown = 0;
			view.timerCountDown = 25;
			view.coin.x = new Random().nextInt(mazeWidth);
			view.coin.y = new Random().nextInt(mazeHeight);
			view.points = view.points + 10;
			
		}
		if(view.cherryCollision()){
			view.cherry.x = new Random().nextInt(mazeWidth);
			view.cherry.y = new Random().nextInt(mazeHeight);
			view.points = view.points + 10;
		}
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	movingPacman(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
