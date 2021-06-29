# Exception Handler

## 일반 예외

- ClassNotFoundException, InterruptedException, RuntimeException
- 자바 Compiler 가 실행하기 전, 스스로 찾아낼 수 있는 에러

## 실행 예외

- NullPointerException, ClassCastException, NumberFormatException, ArrayIndexOutOfBoundException, FileNotFoundException, IOException
- 자바 코드에는 문제가 없지만, 개발자의 실수, 또는 사용자의 실수로 발생하는 에러

```java
// Exception 이 모든 예외들 중 가장 등급이 높은 예외처리 클래스이다. 
// 가장 등급이 높은 Exception 클래스를 다음과 같이 맨 마지막 Catch 문으로 보낸다.

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
```
