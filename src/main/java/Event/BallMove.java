package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

/**
 * @author zhulei
 * @DATE 2022/4/27 20:35
 */
public class BallMove extends JFrame{

    MyPanel mp = null;
    public static void main(String[] args) {

        BallMove ballMove = new BallMove();

    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);
    }
}

//面板画出小球

class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // System.out.println("键盘输入：" + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       //根据用户按下的不同键，来处理小球的移动
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }else if (e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
