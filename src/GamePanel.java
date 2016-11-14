import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;

	GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont = new Font("Tangerine", Font.PLAIN, 48);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
		repaint();
	}

	void startGame() {
		t.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("lol");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState = currentState + 1;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;

			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("lols");

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		System.out.println("test");
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont); 
		g.setColor(Color.BLACK);
		g.drawString("League Invaders", 50, 100);

		
	}

	public void drawGameState(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	}
}