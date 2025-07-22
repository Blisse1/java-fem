package objects;

public class Rectangle {
    protected double length;
    protected double width;
    protected int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    // all-args constructor, method overloading
    public Rectangle(double length, double width){
        setWidth(width);
        setLength(length);
    }

    public void print(){
        System.out.println("Im a rectangle");
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
