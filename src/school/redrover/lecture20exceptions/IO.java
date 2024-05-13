package school.redrover.lecture20exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class IO {
    private static String readFile(String name) throws IOException {
        return Files.readString(Path.of(name));
    }

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter file name ");
//        String filename = scanner.nextLine();
//        try {
//            String content = readFile(filename);
//            System.out.println("+++++++++++++");
//            System.out.println(content);
//        } catch (NoSuchFileException e) {
//            System.out.println("no such file" + filename);
//            System.out.println("try again");
//        }

        try {
            System.out.println("trying");
            System.out.println(tryMe(15));
            System.out.println("Succcesss");
        } catch (RuntimeException e) {
            System.out.println("error");
        } finally {
            System.out.println("finally");
        }
    }

    private static String tryMe(int i) {
        if (i > 10) {
            throw new RuntimeException();
        } else {
            return "ok";
        }
    }

    static boolean writeInfile(String filename, List<String> lines) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(filename));
            for (String line : lines) {
                out.println(line);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
