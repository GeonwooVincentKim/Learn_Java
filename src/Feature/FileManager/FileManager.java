package Feature.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import Feature.Files;
import static java.lang.System.out;

public class FileManager implements Files {
    private Scanner fileReader;
    private FileWriter fileWriter;
    private String fileName;
    private String result;

    public FileManager() {
    }

    public FileManager(Scanner fileReader, FileWriter fileWriter, String fileName, String result) {
        this.setFileReader(fileReader);
        this.setFileWriter(fileWriter);
        this.setFileName(fileName);
        this.setResult(result);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public Scanner getFileReader() {
        return fileReader;
    }

    public void setFileReader(Scanner fileReader) {
        this.fileReader = fileReader;
    }

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
