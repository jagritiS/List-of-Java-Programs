package BasicIO;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Jagriti on 1/29/2019.
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {

       /* FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\Jagriti\\Desktop\java_files_io\\hello.txt");
            out = new FileOutputStream("C:\\Users\\Jagriti\\Desktop\java_files_io\\helloOut.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
*/
        System.out.println("===================================now time for the next file==================================================== ");
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("C:\\Users\\Jagriti\\Desktop\\java_files_io\\hello.txt");
            outputStream = new FileWriter("C:\\Users\\Jagriti\\Desktop\\java_files_io\\helloOut.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println("===========================the new way====================================== ");
        BufferedReader inputStream1 = null;
        PrintWriter outputStream1 = null;

        try {
            inputStream1 = new BufferedReader(new FileReader("C:\\Users\\Jagriti\\Desktop\\java_files_io\\hello.txt"));
            outputStream1 = new PrintWriter(new FileWriter("C:\\Users\\Jagriti\\Desktop\\java_files_io\\helloOut.txt"));

            String l;
            while ((l = inputStream1.readLine()) != null) {
                outputStream1.println(l);
            }
        } finally {
            if (inputStream1 != null) {
                inputStream1.close();
            }
            if (outputStream1 != null) {
                outputStream1.close();
            }
        }
        System.out.println("==============================from scanner========================================================");
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Jagriti\\Desktop\\java_files_io\\hello.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
        System.out.println("==================translating numbers====================");
        Scanner s1 = null;
        double sum = 0;

        try {
            s1 = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Jagriti\\Desktop\\java_files_io\\usnumbers.txt")));
            s1.useLocale(Locale.US);

            while (s1.hasNext()) {
                if (s1.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s1.next();
                }
            }
        } finally {
            s1.close();
        }

        System.out.println(sum);
    }
}
