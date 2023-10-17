package WorkingWithAbstractionsLab.PointInRectangle;

public class PointUtil {
    /**
     * working only with int
     * working only with " " delimiter
     * @param input
     * @return
     */
    public static Point parsePoint(String input){
        int x = Integer.parseInt(input.split("\\s+")[0]);
        int y = Integer.parseInt(input.split("\\s+")[1]);

        return new Point(x, y);
    }
}
