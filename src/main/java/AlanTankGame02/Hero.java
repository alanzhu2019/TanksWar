package AlanTankGame02;

import Bean.Tank;
import Event.Shot;

/**
 * @author zhulei
 * @DATE 2022/4/26 20:31
 */

//自己的坦克
public class Hero extends Tank {

     Shot shot = null;
    public Hero(int x, int y, int weight, int length) {
        super(x, y, weight, length);
    }

    //射击
    public void shotEnemyTank(){
        //创建 Shot
    }
}
