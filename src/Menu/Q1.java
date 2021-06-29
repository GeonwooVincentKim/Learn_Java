package Menu;

import static java.lang.System.out;

import java.io.FileWriter;
import java.util.Scanner;

import Feature.FileManager.FileManager;

public class Q1 {
    // fileManager 로부터 받아온 객체를 Q1 에서 생성한 readFile 의 Method(함수) 의 인자(Parameter) 로써
    // 집어넣는다.

    // 객체 -> 메모리로부터 크기를 할당받지는 않았지만, 그 클래스의 정보를 가져온 것
    // 인스턴스 -> 클래스로부터 정보를 가져왔음과 동시에, 메모리로부터 크기를 할당받은 것

    // 다형성(클래스의 형변환)(Polymorphism) 을 구현한 코드이다.
    // 1. 형변환
    // - 1. 자동형변환
    // 타입이 작은 형(type) 을 타입이 큰 형(type)의 크기만큼 확장시킨다.
    // 쉽게 말해서 작은 그릇에 있는 내용물을 큰 그릇에 그대로
    // 옮겨 담는다고 생각하면 된다.
    // int a = 10;
    // double b = a;
    // out.println(b); --> 10은 그대로 출력되며, a 라는 변수 type의 크기는 b의 변수 type의 크기만큼 확장되었다.

    // - 2. 강제형변환
    // 타입이 큰 형(type) 을 타입이 작은 형(type) 의 크기만큼 강제로 축소시킨다.
    // 축소시킴과 동시에 필요없는 데이터들을 모두 버려지게 되어 원래 가지고 있던 데이터(정보)가 훼손되어 원본 데이터와 같은 값을 기대할 수
    // 없다.
    // 쉽게 말해서 큰 그릇에 있는 내용물을 구기고 일부 떼어먹거나 아니면 버려 작은 그릇의 크기만큼 내용물을 줄여 옮겨 담는다.
    // double a = 10.5;
    // int b = (int)a;
    // out.printl(b); --> int 는 소수점을 포함할 수 없기 때문에 10이라는 데이터만 출력한다. a 라는 변수 type 의
    // 크기가 b의 변수 type 크기만큼 대폭 축소되었다.

    // 2. 다형성
    // 클래스, 인터페이스의 형변환이다.
    // - 1. 자동형변환
    // 자식클래스의 형(type) 을 부모클래스의 형(type)의 크기만큼 확장시킨다.
    //
    public static Scanner readFile(FileManager fileManager, String fileName) {
        return fileManager.readFile(fileName);
    }

    public static void writeFile(FileManager fileManager, String result, String fileName) {
        fileManager.writeFile(result, fileName);
    }

    public static String getData(int readLine) {
        String result = "";

        int[] originalArray = new int[readLine];

        for (int i = 0; i < readLine; i++) {
            originalArray[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;
        }

        for (int i = 0; i < originalArray.length; i++) {
            out.print(originalArray[i] + " ");
        }

        return result;
    }

    public static void q1_main(int userInput) {
        Scanner sc = new Scanner(System.in);
        out.println("선택\n1. 파일 가지고 오기\n2. 직접 입력하기\n3. 프로그램 종료");

        // FileManager 의 Instance 내부에 들어 갈 인수(Parameter)들 목록들을 초기화 해준다.
        Scanner fileReader = null;
        FileWriter fileWriter = null;

        // 읽을 파일의 이름과 생성할 파일의 이름을 각각 `q1_read_data.txt`, `q1_write_data.txt` 로 지정해준다.
        String readFileName = "q1_read_data.txt";
        String writeFileName = "q1_write_data.txt";

        String fileName = "";
        String result = "";

        // fileManager 의 Instance 를 만들어준다.
        FileManager fileManager = new FileManager(fileReader, fileWriter, fileName, result);
        String getResult = "";

        // 파일로 읽어온 각 파일에서 추출하고자 하는 데이터의 개수를 입력받기 전, 0으로 초기화시켜준다.
        int getFileLines = 0;

        int userQ1Select = sc.nextInt();
        if (userQ1Select == 1) {
            fileReader = readFile(fileManager, readFileName);
            getFileLines = Integer.parseInt(fileReader.nextLine());
            getResult = getData(getFileLines);
            writeFile(fileManager, getResult, writeFileName);
        } else if (userQ1Select == 2) {
            fileReader = new Scanner(System.in);
            getFileLines = fileReader.nextInt();
            getResult = getData(getFileLines);
            writeFile(fileManager, getResult, writeFileName);
        } else {
            out.println("프로그램 종료");
            System.exit(0);
        }

        // Scanner 의 메모리 낭비를 방지하기 위해 Scanner 의 Buffer 를 꼭 닫아준다.
        // Buffer 의 정의 -> 현재 가지고 있는 데이터를 일일이 하나씩 보내는 것이 아닌 특정 크기의 묶음 단위로 다른 파일에 전송하는 것을
        // 의미한다.
        // 그러나 Scanner 는 솔직히 말하자면 Buffer 하고 큰 연동은 없다.
        sc.close();
    }
}
