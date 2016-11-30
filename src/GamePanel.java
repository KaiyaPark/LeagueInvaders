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
	Font babyFont;
	Pikachu p = new Pikachu(250,700,50,50);
	GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont = new Font("Tangerine", Font.PLAIN, 48);
		babyFont = new Font("Tangerine", Font.PLAIN, 24);
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
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		p.update();
	}

	public void updateEndState() {
	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont); 
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE INVADERS", 35, 200);
		g.setFont(babyFont);
		g.drawString("Press ENTER to start", 125, 300);
		g.drawString("Press SPACE for instructions", 75, 400);
		
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		p.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("GAME OVER", 100, 200);
		g.setFont(babyFont);
		g.drawString("You killed 0 Ice Creams", 100 , 300);
		g.drawString("Press BACKSPACE to Restart", 80, 400);
	}
}