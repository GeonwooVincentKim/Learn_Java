package Feature.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import Feature.FilesClass;

import static java.lang.System.out;

public class FileManager2 extends FilesClass {
    @Override
    public Scanner readFile(String fileName) {
        fileReader = null;
        File file = new File(fileName);

        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
            out.println("----------------------------");
            e.printStackTrace();
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("----------------------------");
            e.printStackTrace();
        }

        return fileReader;
    }

    @Override
    public void writeFile(String result, String fileName) {
        fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.flush();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
            out.println("----------------------------");
            e.printStackTrace();
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("----------------------------");
            e.printStackTrace();
        }
    }

}
