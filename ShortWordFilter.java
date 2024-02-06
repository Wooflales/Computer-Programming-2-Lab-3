public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        String input = (String) x;
        if (input.length() < 5)
            return true;
        else
            return false;

    }
}