package baitap1;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return "PT ax + b = c có giá trị \n a: " + this.a + "\n b: " + this.b + "\n c: " + this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4.0D * this.a * this.c;
    }

    public double getRoot1() {
        return -this.b + Math.sqrt(this.b * this.b - 4.0D * this.a * this.c) / 2.0D * this.a;
    }

    public double getRoot2() {
        return -this.b - Math.sqrt(this.b * this.b - 4.0D * this.a * this.c) / 2.0D * this.a;
    }

    public String display() {
        return "phuong trinh co hai nghiem r1=" + this.getRoot1() + "r2= " + this.getRoot2();
    }
}
