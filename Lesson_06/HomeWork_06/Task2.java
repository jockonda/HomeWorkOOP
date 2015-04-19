package HomeWork_06;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Создать поток, который будет каждые 10 секунд выводить текущее
время на экран. Сделать возможность прерывания потока с помощью
команды с консоли
 */
public class Task2 {

    public static class Time extends Thread {
        public void run() {
            // вывод текущего времени на экран каждые 10 с
            while (!isInterrupted()) {
                DateFormat df = DateFormat.getTimeInstance();
                System.out.println(df.format (new Date()));

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Time t = new Time ();
            t.start();
            Thread.sleep(1000);

            // прерывание потока через консоль, если нажать s
            Scanner sc = new Scanner(System.in);
            String stop = sc.nextLine();
            if (stop.equals("s")) {
                t.interrupt();
            }
            sc.close();

        } catch (Exception ignored) {

        }
    }
}
