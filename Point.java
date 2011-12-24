import java.lang.Math;

public class Point {
    double x;
    double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX (double x) {
        this.x = x;
    }

    public void setY (double y) {
        this.y = y;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public static double distance (Point p1, Point p2) {
        double xdiff = p1.getX() - p2.getX();
        double ydiff = p1.getY() - p2.getY();
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public boolean equals (Object obj) {
        if (obj == this) {
            return true;
        }
    if(obj == null || obj.getClass() != this.getClass()){
        return false;
    }
    Point p = (Point) obj;
    return (x == p.getX() && y == p.getY());

    }

    public String toString() {
        String result = "(" + x + "," + y + ")";
         return result;
    }
}
