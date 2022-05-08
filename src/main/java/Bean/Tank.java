package Bean;

public class Tank {

    private int x;//坦克横坐标
    private int y;//坦克纵坐标
    private int direction;//坦克方向 0 向上、1 向右 、 2 向下、 3 向左

    private int weight; //坦克轮毂宽
    private int length; //坦克轮毂的长

    private int speed; //速度

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Tank(int x, int y, int weight, int length) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.length = length;
    }



    public void moveUp(){
        y -= speed;
    }
    public void moveDown(){
        y += speed;
    }
    public void moveRight(){
        x += speed;
    }
    public void moveLeft(){
        x -= speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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


}
