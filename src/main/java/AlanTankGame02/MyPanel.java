package AlanTankGame02;

import TanksFunction.Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author zhulei
 * @DATE 2022/4/26 20:32
 * 坦克大战绘图区
 */


public class MyPanel extends JPanel implements KeyListener {

    Hero hero = null;

    //敌人的坦克，涉及到多线程所以使用vecto
    Vector<EnemyTank>  enemyTanks = new Vector<>();

    int enemyTankSize = 3;
    public MyPanel() {
        hero = new Hero(100, 100, 10, 60); //初始化一个坦克
        hero.setSpeed(10);

        for (int i = 0; i <= enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank(100 * (i + 1),0,10,60));
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认黑色
        Draw.DrawTanks(g, hero.getDirection(), 0, hero);

        for(EnemyTank em : enemyTanks){
            em.setDirection(2);
            Draw.DrawTanks(g,em.getDirection(),1,em);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改外坦克方向
            hero.setDirection(0);
            //修改坦克坐标
            hero.moveUp();
            //hero.setY(hero.getY() - 10);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirection(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirection(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirection(3);
            hero.moveLeft();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
