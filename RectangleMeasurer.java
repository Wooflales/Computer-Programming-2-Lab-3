import java.awt.*;
import java.util.ArrayList;

public class RectangleMeasurer implements Measure {
    public double getMeasure(Object r) {
        ArrayList<Double> rectangles = new ArrayList<>();
        Rectangle rect = (Rectangle) r;
        double perimeter = rect.width + rect.width + rect.height + rect.height;
        if (perimeter > 10) {
            rectangles.add(perimeter);
            //System.out.println(rectangles);
            return perimeter;
        }
        else{
            return 0;
        }

}}
