package HomeWork_05;

import java.io.*;

/*
Написать программу для копирования всех файлов из одного
каталога в другой.
 */

public class Task3 {

  /*  public static void copy(File source, File dest) throws IOException {// без   BufferedInputStream & BufferedOutputStream
        FileInputStream is = new FileInputStream(source);
        try {
            FileOutputStream os = new FileOutputStream(dest);
            try {
                byte[] buffer = new byte[4096];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                os.close();
            }
        } finally {
            is.close();
        }
    }
*/
    public static void copyBuf(File source, File dest) throws IOException {// с использованием   BufferedInputStream & BufferedOutputStream
        FileInputStream is = new FileInputStream(source);
        try (BufferedInputStream bis = new BufferedInputStream(is)) {
            FileOutputStream os = new FileOutputStream(dest);
            try (BufferedOutputStream bos = new BufferedOutputStream(os)) {
                byte[] buff = new byte[64 * 1024];//буфер 64 кбайт
                while ((bis.read(buff)) >= 0) {
                    bos.write(buff, 0, buff.length);
                }
            }
        }
    }

    public static void copyDir(String soursedir, String destdir) throws IOException {
        File sdir=new File(soursedir);
        File ddir= new File(destdir);
        if (sdir.isDirectory()){
            if (!ddir.isDirectory()){
                ddir.mkdir();
            }
            File[]sfile=sdir.listFiles();
            File[]dfile= new File[sfile.length];
            for (int i=0; i< sfile.length; i++){
                String first=sfile[i].getPath();
                String second = first.replace(soursedir, destdir);
                dfile[i]=new File(second);
                // copy(sfile[i],dfile[i]); копирует побайтово
                copyBuf(sfile[i],dfile[i]); // копирует через буфер
            }
        }else{
            System.out.println("No such directory " +  soursedir);
        }
    }

    public static void main (String[] args) {

        try{
            copyDir("d:\\dir1","d:\\dir2");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
