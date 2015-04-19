package HomeWork_05;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

/*
Модифицировать проект FindFiles так, чтобы программа искала в
каталоге все файлы с расширениями из списка.
*/

public class Task1 {

    static class MyFileFilter implements FilenameFilter {
        private String ext;

        public MyFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }


    private static void findFiles(String srcPath, String[] ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);

        for (String anExt : ext) {
            File[] files = dir.listFiles(new MyFileFilter(anExt));

            for (File file : files) {
                list.add(srcPath + file.getName());

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        try {
            String[] types = {".txt", ".pdf", ".doc", ".docx"};
            findFiles("d:\\", types, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);
    }

}
