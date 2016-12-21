import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{
Alien(int x, int y, int width, int height) {
	super();
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
}
void update(){
	super.update();
	y = y+10;
}
void draw(Graphics g) {
	g.drawImage(GamePanel.alienImg, x, y, width, height, null);
}
}
