package HomeWork_06;

import java.util.ArrayList;

/*
Создать 100 потоков, каждый их которых выведет на экран свой номер и
дождется, пока его прервут
 */
public class Task3 {
    public static class ManyThreads extends Thread{
        public void run(){
            System.out.println("The ID is: " + getId());
            while (!isInterrupted()){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ManyThreads> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            ManyThreads thread = new ManyThreads();
            thread.start();
            list.add(thread);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (ManyThreads mt:list){
            mt.interrupt();
        }
    }
}
