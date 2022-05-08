package AlanTankGame02;

import javax.swing.*;

/**
 * @author zhulei
 * @DATE 2022/4/26 20:35
 */
public class AlanTankGame02 extends JFrame {


    MyPanel myPanel = null;
    public static void main(String[] args) {

        AlanTankGame02 alanTankGame02 = new AlanTankGame02();

    }

    public AlanTankGame02(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000 ,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(myPanel);
    }
}
