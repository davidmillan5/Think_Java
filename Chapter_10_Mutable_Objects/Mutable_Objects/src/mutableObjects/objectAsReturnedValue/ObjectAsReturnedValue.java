package mutableObjects.objectAsReturnedValue;

import java.awt.*;

public class ObjectAsReturnedValue {
    public static void main(String[] args) {

        Rectangle box = new Rectangle(0, 0, 100, 200);

        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;

        System.out.println(box);
        System.out.println(findCenter(box));

        moveRect(box, 50, 100); // now at (50, 100, 100, 200)

        box.translate(50, 100);

        box1.grow(50, 50); // grow box1 (alias)

        System.out.println(box);
        System.out.println(box1);
        System.out.println(box2);
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }
}
