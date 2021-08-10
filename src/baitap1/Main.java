package baitap1;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation(5.0D, 4.0D, 0.0D);
        System.out.println(quadraticEquation.getA());
        if (quadraticEquation.getDiscriminant() >= 0.0D) {
            System.out.println("PT có hai nghiệm \n r1 là: " + quadraticEquation.getRoot1() + "\n r2 là: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0.0D) {
            System.out.println("Phương trình có nghiệm duy nhất là -1");
        } else {
            System.out.println("Pt Vô nghiệm");
        }

    }
}
