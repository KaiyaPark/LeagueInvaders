import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame f = new JFrame();
	final static int width = 500;
	final static int height = 800;
	GamePanel g;

	public static void main(String[] args) {
		LeagueInvaders l = new LeagueInvaders();
	}

	LeagueInvaders() {
		g = new GamePanel();
		setup();
	}

	void setup() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(g);
		f.setVisible(true);
		g.startGame();
		f.addKeyListener(g);
		f.setSize(width, height);
	}
}
