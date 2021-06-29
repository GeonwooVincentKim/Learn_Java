package Feature;

import java.util.Scanner;

// Interface 와 Abstract Class (상속 클래스) 와의 차이점
// 1. Interface 는 자바에서 허락을 해주지 않는 다중 상속을 허용한다.
// 2. Abstract Class 는 다중 상속을 허락해주지 않으며, 단 하나의 자식 클래스만 상속 받을 수 있도록 허용한다.
public interface Files {
    public Scanner readFile(String fileName);

    public void writeFile(String result, String fileName);
}

// 만약 abstract 클래스를 이용했을 때, 구현하는 방법 -> FileClass.java
