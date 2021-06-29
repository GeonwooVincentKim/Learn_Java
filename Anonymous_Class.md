# Anonymous_Class

## Anonymous Object

- 이름이 없는 객체이다.
- `Instance` 를 일일이 생성하지 않아도 됨으로써 쓸데 없이 차지하는 메모리 영역도 아낄 수 있다.
- `Class` 내부 또는 `Interface` 내부에서 바꾸고 싶은 특정 `출력문`이나 특정 값들을 불러오는 과정을 추가, 수정 할 때마다 새로운 `자식 클래스`를 만들지 않고도 `익명 객체(Anonymous Object)`를 만들어서 작업함으로써 개발 시간을 단축시킬 수 있다는 장점이 있다.

```java
import static java.lang.System.out;

class Test{
    void Test(){
        out.println("Hello Class");
    }
}

public static void main(String[] args){
    Test test = new Test(){
        void Test(){
            out.println("Hi Class");
        }
    };
    out.println(test);
}
```

## Why Anonymous Class

- 원래 형태의 클래스이다. 통 클래스를 선언하고 그 클래스를 불러와 사용하기 위해 `Instance` 를 만들고, 그 `Instance`의 이름은 반드시 지어줘야 했다.

```java
import static java.lang.System.out;

class Test{
    void test(){
        out.println("Hello Class");
    }
}

public static void main(String[] args){
    Test test = new Test();
    out.println(test);
}
```

- 일일이 `자식 클래스`를 만들어 작업하게 되면 개발하는 시간이 더욱 더 많이 걸릴 뿐만 아니라 필요하지 않은 `메모리` 양을 사용하게 된다.
- 또한 `부모 - 자식` 관계에 놓여져 있는 클래스라면 하나의 특징을 조금 바꾸기 위해 새로운 `Instance` 를 생성하여 사용하는 것은 정말로 `메모리` 과도 사용, 개발 시간 증대를 야기하기도 한다.

```java
import static java.lang.System.out;

class TestParant{
    void test(){
        out.println("Hello Parent Class");
    }
}

class TestChild extends TestParent{
    @Override
    void test(){
        out.println("Hello Child1 Class");
    }
}

class TestChild1 extends TestParent{
    @Override
    void test(){
        out.println("Hello Child2 Class");
    }
}

public static void main(String[] args){
    TestParent testParent = new TestParent();
    out.println(testParent);

    TestChild testChild = new TestChild();
    out.println(testChild);

    TestChild1 testChild1 = new TestChild1();
    out.println(testChild1);
}
```

- `Anonymous Class(Anonymous Object)` 를 사용했을 때 다음과 같이 코드도 간결해지고, 불필요하게 남용되어 사용되던 `자식 클래스 Instance`를 보다 덜 사용하여 코드의 가독성도 함께 높여주는 역할을 한다.

```java
import static java.lang.System.out;

class TestParant{
    void test(){
        out.println("Hello Parent Class");
    }
}

public static void main(String[] args){
    TestParent testParent = new TestParent();
    testParent.test();
    
    TestParent testParent1 = new TestParent(){
        @Override
        void test(){
            out.println("Hello Child1 Class");
        }
    };
    testParent1.test();

    TestParent testParent2 = new TestParent(){
        @Override
        void test(){
            out.println("Hello Child2 Class");
        }
    };
    testParent2.test();
}
```
