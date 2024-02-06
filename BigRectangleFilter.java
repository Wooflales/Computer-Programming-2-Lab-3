public class BigRectangleFilter implements Filter{
    public boolean accept(Object x){
        int perimeter = (int) x;
       if(perimeter > 10) {
           return true;
       }
       else {
           return false;
       }
    }
}
