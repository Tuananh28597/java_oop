package bai3;

public class fan {
    private int speed;
    private boolean status = false;
    private int radius;
    private String color;

    public fan() {
    }

    public fan(int speed, boolean status, int radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double display() {
        if (this.status) {
            System.out.println("Quạt chạy với tốc độ :" + this.speed + " bán kính: " + this.radius + " màu quạt là " + this.color);
        } else {
            System.out.println("Quạt đang tắt !!");
        }

        return 0.0D;
    }
}
