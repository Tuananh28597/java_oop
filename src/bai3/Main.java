package bai3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        fan fan1 = new fan(3, true, 10, "yellow");
        fan fan2 = new fan(2, false, 5, "blue");
        System.out.println("FAN 1");
        System.out.println(fan1.display());
        System.out.println("FAN 2");
        System.out.println(fan2.display());
    }
}
