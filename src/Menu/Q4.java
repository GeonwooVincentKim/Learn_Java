package Menu;

import static java.lang.System.out;

import java.io.FileWriter;
import java.util.Scanner;

import Feature.FileManager.FileManager;
import Feature.List.CustomList;

public class Q4 {
    // fileManager 로부터 받아온 객체를 Q1 에서 생성한 readFile 의 Method(함수) 의 인자(Parameter) 로써
    // 집어넣는다.

    // 객체 -> 메모리로부터 크기를 할당받지는 않았지만, 그 클래스의 정보를 가져온 것
    // 인스턴스 -> 클래스로부터 정보를 가져왔음과 동시에, 메모리로부터 크기를 할당받은 것

    public static Scanner readFile(FileManager fileManager, String fileName) {
        return fileManager.readFile(fileName);
    }

    public static void writeFile(FileManager fileManager, String result, String fileName) {
        fileManager.writeFile(result, fileName);
    }

    // 1. 임의의 값(random)들을 사용자가 가지고 오고 싶어하는 개수만큼 originalArray 에 저장한다.
    // 단, 범위는 10 ~ 50 으로 고정한다.
    public static int[] getOriginalArray(int readLine) {
        int[] originalArray = new int[readLine];

        for (int i = 0; i < readLine; i++) {
            originalArray[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;
        }

        return originalArray;
    }

    // 2. 임의의 값을 저장한 originalArray 안에 저장된 인덱스(데이터)의 목록들을 출력한다.
    public static String printOriginalArray(int[] originalArray) {
        String printArray = "";

        for (int i = 0; i < originalArray.length; i++) {
            printArray += originalArray[i] + " ";
        }

        return printArray;
    }

    // 3. OriginalArray 내 중복된 값들을 제거한 후, 중복되지 않은 값들과 제거된 값들을 CountArray 에 저장한다.
    public static int[] getCountArray(int[] originalArray) {
        int[] countArray = new int[originalArray.length];
        out.println();
        // out.println(countArray);

        for (int i = 0; i < originalArray.length; i++) {
            // 만약 값이 중복되지 않았거나, 또는 중복되었지만, 특정 값이 중복된 수들 중, 가장 나중에 출현한 값을 확인하였을 때,
            // countArray 에 저장한다.
            if (!CustomList.checkDuplicateValue(countArray, originalArray[i])) {
                countArray[i] = Integer.valueOf(originalArray[i]);
                out.print(countArray[i] + " ");
            }

            // if (originalArray.equals(countArray)) {

            // }
        }

        return countArray;
    }

    // 3-3. 사용자가 입력한 수만큼 임의의 수들을 저장한 배열과 그 배열을 출력하는 배열이 서로 같은지 확인한다. (서로 같은 객체를 사용하고
    // 있는지에 대한 여부를 확인한다.)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof int[]) {
            return true;
        } else {
            return false;
        }
    }

    // 4. 랜덤된 수의 중복 값을 포함하고 있는 originalArray 와 랜덤된 수의 중복 된 값들을 뺀 countArray 와 비교한다.
    // 만약 중복되는 값이 존재할 경우, 중복되는 수의 출현 횟수가 표시되는 count 의 값을 1씩 증가를 시킨 후,
    // 출현 빈도 수에 따라 숫자들을 오름차순 정렬한다.
    // 반대로 중복되는 숫자(값)가(이) 존재하지 않을 경우, 가장 큰 수부터 차례대로 오름차순으로 정렬한다.
    public static int[] getSortArray(int[] originalArray, int[] countArray) {
        int[] sortArray = new int[countArray.length];

        int currentCount = 0;
        int nextCount = 0;

        int currentValue = 0;
        int nextValue = 0;

        for (int i = 0; i < countArray.length; i++) {
            for (int j = i + 1; j < countArray.length; j++) {
                currentValue = countArray[i];
                nextValue = countArray[j];

                // 중복 값이 제거되지 않은 originalArray 와 중복 값이 제거된 countArray 를 가지고 온 후,
                // 서로 비교하면서 중복되는 수들을 찾아낼 때마다 1씩 증가시켜 가장 많은 빈도 수를 가지고 있는 수부터
                // 가장 적은 빈도 수를 가지고 있는 수까지 차례대로 나열해주는 함수이다.
                currentCount = CustomList.countDuplicateValue(originalArray, countArray[i]);
                nextCount = CustomList.countDuplicateValue(originalArray, countArray[j]);

                if (currentCount < nextCount) {
                    CustomList.swapArrayValue(originalArray, i, j);
                    CustomList.swapArrayValue(countArray, i, j);

                    // 배열 안에 있는 정보들 뿐만이 아니라 배열의 메모리 주소까지 모두 복사한다.
                    sortArray[i] = countArray[i];
                } else if (currentCount == nextCount && currentValue < nextValue) {
                    CustomList.swapArrayValue(originalArray, i, j);
                    CustomList.swapArrayValue(countArray, i, j);

                    // 배열 안에 있는 정보들 뿐만이 아니라 배열의 메모리 주소까지 모두 복사한다.
                    sortArray[i] = countArray[i];
                }
            }
        }

        return sortArray;
    }

    // 5. 전체 배열을 출력한다.
    public static String printArray(int[] originalArray, int[] countArray, int[] sortArray) {
        String printResult = "";

        for (int i = 0; i < 5; i++) {
            out.println("#" + (i + 1) + " " + sortArray[i] + " " + "("
                    + CustomList.countDuplicateValue(originalArray, countArray[i]) + ")");
        }

        return printResult;
    }

    public static String getData(int readLine) {
        String result = "";

        int[] originalArray = getOriginalArray(readLine);
        // String printArray = printOriginalArray(originalArray);

        int[] countArray = getCountArray(originalArray);
        int[] sortArray = getSortArray(originalArray, countArray);
        out.println(sortArray);

        result = printArray(originalArray, countArray, sortArray);

        // result = printArray + "\n";
        out.println(result);

        return result;
    }

    public static void q4_main(int userInput) {
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
