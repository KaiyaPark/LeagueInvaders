import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	GameObject(){
		
	}
void update(){
	for (int i = 0; i < 100; i++) {
		x=i;
		y=i;
	}
}
void draw(Graphics g){
	g.fillRect(x, y, 100, 100);
}
}
