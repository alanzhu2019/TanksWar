package Event;

/**
 * @author zhulei
 * @DATE 2022/5/22 14:35
 */
public class Shot implements Runnable {

    int x;
    int y;//子弹y坐标
    int direc = 0;//方向
    int speed = 2;//速度

    boolean isLive = true;//子弹是否存活

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (direc) {
                case 0: //上
                    y -= speed;
                case 1: //左
                    x += speed;
                case 2: //下
                    y += speed;
                case 3: //右
                    x -= speed;
                    break;
            }

            System.out.println("子弹x =" + x + "y = " + y);
            //当子弹移动到边界或者打中坦克就应该销毁（把启动的子弹线程销毁）
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive = false;
                break;
            }
        }

    }
}
