import java.awt.Color;
import java.awt.Graphics;

public class Pikachu extends GameObject {
	public Pikachu(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		width=w;
		height=h;
	}
	void update(){
		
	}
	void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}