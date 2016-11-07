import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{    
	Timer t; 
	GameObject o;
GamePanel(){
	t = new Timer(1000/60, this);
	o = new GameObject();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
}
void startGame(){
	t.start();
}
public void paintComponent(Graphics g){


}
@Override
public void keyTyped(KeyEvent e) {
System.out.println("lol");
	
}
@Override
public void keyPressed(KeyEvent e) {
	System.out.println("loled");
}
@Override
public void keyReleased(KeyEvent e) {
	System.out.println("lols");
}
}