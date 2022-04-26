import javax.swing.*;

/**
 * @author zhulei
 * @DATE 2022/4/26 20:35
 */
public class AlanTankGame extends JFrame {


    MyPanel myPanel = null;
    public static void main(String[] args) {

        AlanTankGame alanTankGame = new AlanTankGame();

    }

    public AlanTankGame(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000 ,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
