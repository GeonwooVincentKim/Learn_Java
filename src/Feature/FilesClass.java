package Feature;

import java.io.FileWriter;
import java.util.Scanner;

public abstract class FilesClass {
    private Scanner fileReader;
    private FileWriter fileWriter;
    private String fileName;
    private String result;

    public FilesClass() {
    }

    public FilesClass(Scanner fileReader, FileWriter fileWriter, String fileName, String result) {
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

    public abstract Scanner readFile(String fileName);

    public abstract void writeFile(String result, String fileName);
}
