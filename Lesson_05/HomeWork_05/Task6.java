package HomeWork_05;

import java.io.*;

/*
Написать программу, которая скопирует несколько файлов в один.
Подумать как для этого использовать java.io.SequenceInputStream
 */
public class Task6 {
    public static void main(String[] args) {

        String path1 = "d:\\1.txt", path2 = "d:\\2.txt";

        try{
            summ(path1, path2);
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }

    private static void summ(String path1, String path2) throws IOException {

        FileInputStream fis1 = new FileInputStream(new File(path1)); // поток чтения из файла 1
        FileInputStream fis2 = new FileInputStream(new File(path2)); // поток чтения из файла 2
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2); // включение входных потоков в последовательность
        FileOutputStream fos = new FileOutputStream(new File("d:\\3.txt")); // поток записи в файл

        while (true){ // бесконечный цикл
            int sym = sis.read(); // чтение из последовательности
            if (sym < 0) // если считанный элемент -1 то все потоки прочитаны
                break;
            fos.write(sym); // запись элемента в файл
        }
        // закрытие потоков. первый поток закрывается последовательностью автоматически по завершении.
        sis.close();
        fis2.close();
        fos.close();
    }
}
