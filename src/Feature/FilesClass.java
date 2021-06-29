package Feature;

import java.io.FileWriter;
import java.util.Scanner;

public abstract class FilesClass {
    // 같은 패키지 내에 속해 있는 자식 클래스들이 접근하여 사용할 수 있는 접근 메서드, protected
    protected Scanner fileReader;
    protected FileWriter fileWriter;
    protected String fileName;
    protected String result;

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
