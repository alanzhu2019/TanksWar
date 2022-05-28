package AlanTankGame02;

import TanksFunction.Draw;
import TanksFunction.Shot;

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

//为了监听 键盘事件 ，实现KeyListener
//为了让Panel 不停的重绘子弹，需要将MyPanel 实现一个RunAble
public class MyPanel extends JPanel implements KeyListener ,Runnable{

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

        //画hero射击的子弹
        if (hero.shots != null){
            for (Shot shot : hero.shots ){
                if (shot != null && shot.isLive == true){
                    // g.fill3DRect(hero.shot.getX(),hero.shot.getY(),2,2,false);
                    g.draw3DRect(shot.getX(),shot.getY(),2,2,false);
                }
            }
        }

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

        if (e.getKeyCode() == KeyEvent.VK_J){
            hero.shotEnemyTank();
        }

        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.repaint();
        }

    }
}
