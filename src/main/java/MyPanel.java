import Bean.Tank;
import TanksFunction.Draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhulei
 * @DATE 2022/4/26 20:32
 * 坦克大战绘图区
 */


public class MyPanel extends JPanel {

    Hero hero = null;
    public MyPanel(){
            hero = new Hero(100,100,10,60); //初始化一个坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//默认黑色
        Draw.DrawTanks(g,0,1,hero);

    }
}
