package thuchanh1;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2.0D;
    }

    public String display() {
        return "Revtangle { width=" + this.width + "\theight=" + this.height + " }";
    }
}
