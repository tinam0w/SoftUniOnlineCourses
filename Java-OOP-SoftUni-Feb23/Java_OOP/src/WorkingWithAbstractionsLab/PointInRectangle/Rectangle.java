package WorkingWithAbstractionsLab.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point p){
        return p.getX() >= this.bottomLeft.getX() &&
                p.getX() <= this.topRight.getX() &&
                p.getY() >= this.bottomLeft.getY() &&
                p.getY() <= topRight.getY();
    }


}
