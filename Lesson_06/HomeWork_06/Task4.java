package HomeWork_06;

import java.util.ArrayList;

/*
Создать поток, который создаст 50 потоков, каждый их которых
выведет на экран свой номер и дождется, пока его прервут.
Прерывание дочерних потоков должно выполнятся из потока их
порождающего
 */
public class Task4 {

    // один из 50-и потоков
    private static class SecondThread extends Thread {
        int n;

        public SecondThread(int n) {
            this.n = n;
        }

        public void run() {
            // выводим свой номер
            System.out.println(n);

            // ждем пока нас прибьют
            while (!isInterrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }

            System.out.println(n + " thread interrupted!");
        }
    }

    // поток, который породит 50 дочерних потоков
    private static class FirstThread extends Thread {

        // список порожденных потоков
        ArrayList<SecondThread> list = new ArrayList<>();

        public void run() {
            SecondThread st;

            // создаем 50 потоков и складываем ссылки на них с список
            for (int i = 0; i < 50; i++) {
                st = new SecondThread(i);
                list.add(st);

                st.start();
            }

            // ждем пока нас прибьют
            while (!isInterrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }

            // если мы тут, значит нас прибили
            // прерываем наши 50 дочерних потоков
            for (SecondThread s : list)
                s.interrupt();
        }
    }

    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        ft.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {

        }

        ft.interrupt();
    }

}
