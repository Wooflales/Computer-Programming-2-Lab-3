import java.util.ArrayList;

public class BigRectangleList {

    public static void main(String[] args) {
        BigRectangleFilter filter = new BigRectangleFilter();
        ArrayList<Integer> rectangles = new ArrayList<>();
        rectangles.add(15);
        rectangles.add(10);
        rectangles.add(8);
        rectangles.add(7);
        rectangles.add(22);
        rectangles.add(34);
        rectangles.add(6);
        rectangles.add(8);
        rectangles.add(16);
        rectangles.add(28);
        for (int perimeter : rectangles) {
            if(filter.accept(perimeter)) {
                System.out.println(perimeter);
            }
        }


    }
}
