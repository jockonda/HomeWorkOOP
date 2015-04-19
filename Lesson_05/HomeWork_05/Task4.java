package HomeWork_05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
Написать программу, которая создаст текстовый файл и запишет в
него список файлов (путь, имя, дата создания) из заданного
каталога
 */

public class Task4 {

 /*   public static void main (String [] args) {
        try {
            new File ("d:\\test.txt").createNewFile();

            // перевод имени, пути и даты модификации файлов в каталоге в поток байтов
            // и запись их в созданный файл
            File dir = new File ("d:\\");
            File [] list = dir.listFiles ();
            String [] lists = new String [list.length];
            byte [] c = new byte [1000];

            OutputStream ops = new FileOutputStream("d:\\test.txt");
            try {
                for (int i=0; i<list.length; i++) {
                    StringBuilder sb = new StringBuilder ();

                    if (list[i].isFile()) {
                        sb.append(list[i].getCanonicalPath()).append("     ")
                                .append(list[i].getName()).append("     ")
                                .append(new Date (list[i].lastModified()).toString()).append("\r\n");
                        lists [i] = sb.toString();
                        c = lists [i].getBytes();
                        ops.write(c);
                    }
                }
            } finally {
                ops.close();
            }

        } catch (Exception e) {

        }

    }*/



    public static void main(String[] args) throws Exception {

        File file = new File("D:\\", "list.txt");

        ArrayList<String> list = new ArrayList<>();

        findFiles("D:\\", list);

        writeToFile(file.getCanonicalPath(), list);
    }

    // Находим все файлы в указанном каталоге
    public static void findFiles(String dirSrc, ArrayList<String> list) throws Exception {

        File dir = new File(dirSrc);
        File[] files = dir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        for (File file : files) {
            // Проверяем, ячейка массива файлов не пустая и она является файлом
            if (file != null && file.isFile()) {
                // Добавляем в список путь, имена и дату изменения всех файлов из данного каталога
                list.add(dirSrc + file.getName() + "   " + sdf.format(new Date(file.lastModified())));
            }
        }
    }

    // Записываем в файл список файлов из указанного каталога
    public static void writeToFile(String pathFile, ArrayList<String> list) throws Exception{

        try (RandomAccessFile in = new RandomAccessFile(pathFile, "rw")) {
            for (String s : list) {
                in.writeBytes(s + "\n");
            }
        }
    }


}
