package bai2;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stopWatch stopwatch = new stopWatch();
        System.out.println("Nhấn 1 để bắt đầu bấm giờ !");
        int start = sc.nextInt();
        if (start == 1) {
            stopwatch.start();
            System.out.println("bây giờ là : " + LocalTime.now());
        }

        System.out.println("Nhấn 0 để ngừng bấm giờ!");
        int stop = sc.nextInt();
        if (stop == 0) {
            stopwatch.stop();
            System.out.println("Bây giờ là: " + LocalTime.now());
            System.out.print(stopwatch.getElapsedTime() / 1000.0D + " giây");
        }

    }
}

