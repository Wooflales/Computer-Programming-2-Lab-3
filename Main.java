import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        RectangleMeasurer rMeasure = new RectangleMeasurer();
        RectangleFilter filter = new RectangleFilter();
        ArrayList<Object> rects = new ArrayList<>();
        rects.add(new Rectangle(5, 3));
        rects.add(new Rectangle(1, 3));
        rects.add(new Rectangle(2, 3));
        rects.add(new Rectangle(5, 3));
        rects.add(new Rectangle(5, 7));
        rects.add(new Rectangle(2, 2));
        rects.add(new Rectangle(1, 1));
        rects.add(new Rectangle(10, 3));
        rects.add(new Rectangle(1, 8));
        rects.add(new Rectangle(15, 23));
        for (Object x : rects) {
            double perimeter = rMeasure.getMeasure(x);
            if (perimeter > 10) {
                System.out.println(rMeasure.getMeasure(x));
            }

        }
    }
}
