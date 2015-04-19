package HomeWork_05;

import java.io.*;

/*
Написать программу, которая считает текстовый файл, заменит в
нем все слова “Hello” на “1234” и запишет изменения в тот-же файл.
*/

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:\\1.txt")); //считывает содержимое файлы в буфер
        String line = "";
        String FileContent = "";
        String NL = System.getProperty("line.separator"); //разделитель строк
        while ((line = br.readLine()) != null) {
            FileContent = FileContent + line + NL;
        }
        br.close();
        FileContent = FileContent.replaceAll("(H|h)(E|e)(L|l)(L|l)(O|o)", "1234"); //заменяем Хеллоу на 1234
        System.out.println(FileContent); //выводим и смотрим записали ли то, что хотели
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\1.txt")); //записываем в наш файл
        bw.write(FileContent);                                               // то, что занесли в FileContent
        bw.close();
    }
}
