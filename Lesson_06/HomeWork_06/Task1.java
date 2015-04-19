package HomeWork_06;

/*
Модифицировать класс Counter так, чтобы он циклически выводил числа из определенного диапазона
 */
public class Task1 {

    /*public static class Counter extends Thread {
        public void run() {
            int x = 1;
            while ( ! isInterrupted()) { // условие завершения потока №1
                System.out.println(getId() + ": " + x++);
                try {
                    Thread.sleep(1000); // закомментировать
// Thread.yield(); // или так
                } catch (InterruptedException e) {
                    return; // условие завершения потока №2
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            Counter c = new Counter();
            c.start(); // запускаем поток
            Thread.sleep(5000); // ждем 5 сек
            c.interrupt(); // прерываем поток
        } catch (Exception e) {
        }
    }*/

    public static class Counter extends Thread {
        int from, to, sleep;

        public Counter (int from, int to, int sleep) {
            this.from = from;
            this.to = to;
            this.sleep = sleep;
        }

        public void run() {

            try {
                for (int i = from; i <= to; i++) {
                    System.out.println(i);
                    Thread.sleep(sleep);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int from = 100, to = 120, sleep = 500;
        try {
            Counter c = new Counter(from, to, sleep);
            c.start(); // запускаем поток
            c.join(); // ждем завершения потока

            System.out.println("Thread finished");
        } catch (Exception ignored) {

        }
    }

}
