import java.awt.Color;
import java.awt.Graphics;

public class Pikachu extends GameObject {
	int speed;
	static boolean upPressed = false;
	static boolean downPressed = false;
	static boolean leftPressed = false;
	static boolean rightPressed = false;

	public Pikachu(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		speed = 5;
	}

	void update() {
		if (upPressed == true) {
			y = y - speed;
		}
		if (downPressed == true) {
			y = y + speed;
		}
		if (leftPressed == true) {
			x = x - speed;
		}
		if (rightPressed == true) {
			x = x + speed;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
