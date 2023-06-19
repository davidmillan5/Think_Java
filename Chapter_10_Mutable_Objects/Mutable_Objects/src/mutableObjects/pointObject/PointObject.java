package mutableObjects.pointObject;
import java.awt.Point;
public class PointObject {
    public static void main(String[] args) {
        Point blank;
        blank = new Point(3,4);

        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;

        System.out.println(sum);
    }
}
