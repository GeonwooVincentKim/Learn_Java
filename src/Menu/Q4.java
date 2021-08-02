package Menu;

import static java.lang.System.out;

import java.io.FileWriter;
import java.util.Scanner;

import Feature.FileManager.FileManager;

public class Q4 {
    public static Scanner readFile(FileManager fileManager, String fileName) {
        return fileManager.readFile(fileName);
    }

    public static void writeFile(FileManager fileManager, String result, String fileName) {
        fileManager.writeFile(result, fileName);
    }

    public static String getData(int getFileLines) {
        String result = "";
        return result;
    }

    public static void q4_main(int userInput) {
        Scanner sc = new Scanner(System.in);
        out.println("원하시는 방식을 선택하세요 : 1. File IO\n2. 직접 입력");

        // fileManager 객체를 생성하기 전, fileManager 객체에 인수로 들어갈 내용들을
        // 초기화시켜준다.
        Scanner fileReader = null;
        FileWriter fileWriter = null;

        // 읽을 파일의 이름을 input.txt, 출력할 파일의 이름을 output.txt로 지정해준다.
        String readFileName = "input.txt";
        String writeFileName = "output.txt";

        // fileManager 객체에 4번째 인수 값으로 들어오는 result 를 초기화하기 위해
        // String result 변수를 초기화를 해준다.
        String fileName = "";
        String result = "";

        FileManager fileManager = new FileManager(fileReader, fileWriter, fileName, result);
        // getData 라는 함수로부터 String 으로 치환 된 값들을 불러들인다.
        String getResult = "";
        int getFileLines = 0;

        int userDetailInput = sc.nextInt();
        if (userDetailInput == 1) {
            fileReader = readFile(fileManager, readFileName);
            getFileLines = Integer.parseInt(fileReader.nextLine());
            printResult(writeFileName, fileManager, getFileLines);
        } else if (userDetailInput == 2) {
            fileReader = new Scanner(System.in);
            getFileLines = fileReader.nextInt();
            printResult(fileName, fileManager, getFileLines);
        }

        sc.close();
    }

    public static void printResult(String writeFileName, FileManager fileManager, int getFileLines) {
        String getResult = getData(getFileLines);
        writeFile(fileManager, getResult, writeFileName);
    }
}
