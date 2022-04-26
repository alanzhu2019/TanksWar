package TanksFunction;
import Bean.Tank;
import java.awt.*;

/**
 * @author zhulei
 * @DATE 2022/4/26 21:13
 */
public class Draw {



    /**
     * @param g         画笔
     * @param direction 坦克方向 ，上下左右
     * @param type      坦克类型
     */

    public static void  DrawTanks( Graphics g, int direction, int type , Tank hero) {

            switch (type){
                case  0://友方
                    g.setColor(Color.CYAN);
                    break;
                case  1://敌人
                    g.setColor(Color.yellow);
                    break;
            }

            //根据坦克的方向，绘制坦克大小
        switch (direction){
            case 0:
                g.fill3DRect(hero.getX(), hero.getY(),hero.getWeight(), hero.getLength(),false);//坦克左边的轮毂
                g.fill3DRect(hero.getX() + hero.getWeight() * 3, hero.getY(),hero.getWeight(), hero.getLength(),false);//坦克右边的轮毂
                g.fill3DRect(hero.getX() + hero.getWeight(), hero.getY() + hero.getLength() / 4 , hero.getWeight() * 2,hero.getLength() / 2,false );//坦克中间矩形仓位
                g.fillOval(hero.getX() + hero.getWeight(),hero.getY() + hero.getLength() / 3,hero.getWeight() * 2,hero.getWeight() * 2);//圆盖仓
                g.drawLine(hero.getX()+ hero.getWeight() * 2,hero.getY()  ,hero.getX() + hero.getWeight() * 2,hero.getY() + hero.getLength() / 2);//炮筒线

                break;
            default:
                System.out.println("暂时未处理！");
        }

    }
}
