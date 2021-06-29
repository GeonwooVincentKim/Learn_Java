# AbstractClass_Interface_Difference

## Interface 와 Abstract Class (상속 클래스) 와의 차이점

1. Interface 는 자바에서 허락을 해주지 않는 다중 상속을 허용한다.

2. Abstract Class 는 다중 상속을 허락해주지 않으며, 단 하나의 자식 클래스만 상속 받을 수 있도록 허용한다.

3. Interface 로부터 상속받은 클래스는 implements 을 적고, 반드시 @Override 를 사용하여아 한다.

- Interface 는 Interface 내부의 메소드를 상속받은 클래스에서 반드시 그 기능을 구현하도록 강조하고 있다.

4. Abstract Class 로부터 상속받은 클래스는 extends 를 적고, @Override 를 사용하여 만들어야 한다.

- Abstract Class 는 Abstract 내부의 메소드로부터 상속받은 클래스에서 그 기능을 구현하도록 강조하고 있다.
- 단, 다중 상속이 되지 않는다

## 만약 abstract 클래스를 이용했을 때, 구현하는 방법 -> FileClass.java 참고해서 보시기 바랍니다.
