package AlanTankGame02;

import Bean.Tank;
import TanksFunction.Shot;

import java.util.Vector;

/**
 * @author zhulei
 * @DATE 2022/4/26 20:31
 */

//自己的坦克
public class Hero extends Tank {

    public Hero(int x, int y, int weight, int length) {
        super(x, y, weight, length);
    }

    Shot shot = null;
    Vector<Shot> shots = new Vector<>();

    public void shotEnemyTank() {
        switch (getDirection()) {
            case 0:
                shot = new Shot(getX() + getWeight() * 2, getY(), getDirection());
                shots.add(shot);
                break;
            case 1:
                shot = new Shot(getX() + getLength(), getY() + getWeight() * 2, getDirection());
                shots.add(shot);
                break;
            case 2:
                shot = new Shot(getX() + getWeight() * 2, getY() + getLength(), getDirection());
                shots.add(shot);
                break;
            case 3:
                shot = new Shot(getX(), getY() + getWeight() * 2, getDirection());
                shots.add(shot);
                break;
        }
        //启动shot线程
        new Thread(shot).start();

    }
}
