package EncapsulationExersice.ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setHeight(height);
        this.setLength(length);
        this.setWidth(width);
    }

    public double calculateSurfaceArea(){
        //2lw + 2lh + 2wh
        return 2 * this.getLength() * this.getWidth() +
                2 * this.getLength() * this.getHeight() +
                2 * this.getWidth() * this.getHeight();
    }

    public double calculateLateralSurfaceArea(){
        //2lh + 2wh
        return 2 * this.getLength() * this.getHeight() +
                2 * this.getWidth() * this.getHeight();
    }

    public double calculateVolume(){
        return this.getHeight() *
                this.getLength() *
                this.getWidth();
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                "Lateral Surface Area - %.2f%n" +
                "Volume - %.2f%n", calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }

    private double getLength() {
        return length;
    }

    private double getWidth() {
        return width;
    }

    private double getHeight() {
        return height;
    }

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

        this.height = height;
    }
}
