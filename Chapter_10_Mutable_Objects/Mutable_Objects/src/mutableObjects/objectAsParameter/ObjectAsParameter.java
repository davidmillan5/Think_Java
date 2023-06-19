package mutableObjects.objectAsParameter;

import java.awt.*;

public class ObjectAsParameter {
    public static void main(String[] args) {


        Point blank;
        blank = new Point(3,4);

        printPoint(blank);

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        double dist = p1.distance(p2);

        System.out.println(dist);
        System.out.println(blank);

    }

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
}
