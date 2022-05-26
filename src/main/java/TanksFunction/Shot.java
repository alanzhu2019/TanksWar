package TanksFunction;

/**
 * @author zhulei
 * @DATE 2022/5/27 3:17
 */
public class Shot implements Runnable {

    int x;//子弹X坐标
    int y;//子弹Y坐标
    int direct = 0; //子弹方向
    int speed = 5;  //子弹速度

    boolean isLive = true;//是否存活


    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }

            System.out.println("子弹 x=" + x + "y=" + y);

            if (!(x > 0 && x <= 1000 && y > 0 && y <= 750)){
                isLive = false;
                break;
            }

        }

    }
}
