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

    public boolean isLive = true;//是否存活


    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
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
