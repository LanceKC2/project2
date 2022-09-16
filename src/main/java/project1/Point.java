package project1;

public class Point {

    private double y;
    private double x;

    public Point(){

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point other) {
        double a = (other.x-x)*(other.x-x);
        double c =(other.y-y)*(other.y-y);

        return Math.sqrt((a)+(c));

    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {

        this.x =x;
        this.y =y;
    }
    
    public void shiftX(double n) {
        this.x += n;
    }


    public void shiftY(double n) {
        this.y += n;
    }

    public void rotate(double rotation) {
        this.x = x * Math.cos(rotation) - y * Math.sin(rotation);
        this.y = y * Math.sin(rotation) + x * Math.cos(rotation);

    }

    @Override
    public String toString() {
        return "Point{" +
                "y=" + x +
                ", x=" + y +
                '}';
    }
}
