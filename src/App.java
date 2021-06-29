import static java.lang.System.out;

import java.util.Scanner;

import static Menu.Q1.q1_main;

public class App {
    public static void main(String[] args) throws Exception {
        out.println("메뉴 선택을 요청합니다.\n1. 1번 메뉴로 진입\n2. 2번 메뉴로 진입\n3. 프로그램 종료");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput == 1) {
            out.println(userInput);
            q1_main(userInput);
        } else if (userInput == 2) {
            out.println(userInput);
        } else {
            out.println("프로그램 종료");
            System.exit(0);
        }

        sc.close();
    }
}
