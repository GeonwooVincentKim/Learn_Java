# Explanation of Polymorphism

fileManager 로부터 받아온 객체를 Q1 에서 생성한 readFile 의 Method(함수) 의 인자(Parameter) 로써
집어넣는다.

객체 -> 메모리로부터 크기를 할당받지는 않았지만, 그 클래스의 정보를 가져온 것
인스턴스 -> 클래스로부터 정보를 가져왔음과 동시에, 메모리로부터 크기를 할당받은 것

## 다형성(클래스의 형변환)(Polymorphism) 을 구현한 코드이다.

### 형변환

#### 자동형변환

타입이 `작은 형(type)` 을 타입이 `큰 형(type)`의 크기만큼 `확장`시킨다.
쉽게 말해서 작은 그릇에 있는 내용물을 큰 그릇에 그대로
옮겨 담는다고 생각하면 된다.

int a = 10;
double b = a;
out.println(b); --> 10은 그대로 출력되며, a 라는 변수 type의 크기는 b의 변수 type의 크기만큼 확장되었다.

#### 강제형변환

타입이 `큰 형(type)` 을 타입이 `작은 형(type)` 의 크기만큼 `강제로 축소`시킨다.
축소시킴과 동시에 필요없는 데이터들을 모두 버려지게 되어 원래 가지고 있던 데이터(정보)가 훼손되어 원본 데이터와 같은 값을 기대할 수
없다.
쉽게 말해서 큰 그릇에 있는 내용물을 구기고 일부 떼어먹거나 아니면 버려 작은 그릇의 크기만큼 내용물을 줄여 옮겨 담는다.
double a = 10.5;
int b = (int)a;
out.printl(b); --> int 는 소수점을 포함할 수 없기 때문에 10이라는 데이터만 출력한다. a 라는 변수 type 의
크기가 b의 변수 type 크기만큼 대폭 축소되었다.

### 다형성

클래스, 인터페이스의 형변환이다.

#### 자동형변환

- `자식클래스의 형(type)` 을 `부모클래스의 형(type)의 크기`만큼 `확장`시킨다.
쉽게 말해서 커피 집에서 파는 플라스틱 커피 잔을 생각하면 된다.
small 사이즈의 커피 잔을 big 사이즈의 커피 잔에 내용물을 그대로 옮겨 담는다.
SmallSize smallSize = new SmallSize(120); // 120ml 의 양을 담을 수 있는 커피
BigSize bigSize = smallSize; // 240ml 의 양을 담을 수 있는 BigSize 커피에 SmallSize 잔 안에
담겨져있는 커피를 그대로 들이붓는다.
out.println(bigSize.size); --> 120 그대로 출력되며,
SmallSize 의 Instance 변수의 type 크기는 BigSize 의 Instance 변수의 type 크기만큼 확장되었다.

#### 강제형변환

- `부모클래스이 형(type)` 을 `자식클래스의 형(type)의 크기`에 맞게 크기를 `축소`시킨다.
축소시킴과 동시에 부모 클래스가 가지고 있던 원본 데이터들이 훼손되어 원본 데이터와 같은 값을 기대할 수 없다.
쉽게 말해서 커피 집에서 파는 플라스틱 커피 잔이 있다.
Big 사이즈의 커피 잔을 Small 사이즈의 커피잔에 내용물을 옮겨 담으려고 하는데,
Big 사이즈는 240ml 이고, Small 사이즈는 120ml 이므로, 닮기 위해선 Big 사이즈의 커피를 마시고 남은 나머지
120ml의 커피를
Small 사이즈 커피에 담거나, 아니면 Small 사이즈 커피 두 잔을 준비할 수밖에 없다.

원래대로하면 구현되어야 할 목록..
BigSize bigSize = new BigSize(240);
SmallSize smallSize = (SmallSize) bigSize;
out.println(smallSize.size); --> 축소 불가..

- 추가적으로 클래스 및 인터페이스의 `강제형변환`은 자식 클래스(자식 인터페이스)의 타입이 부모 클래스(부모 인터페이스)의 타입으로 `자동 형변환` 된 것들만을 `강제형변환`을 할 수 있도록 유도하고 있다.
이 점을 유의하자.

이 점을 적용한 코드
SmallSize smallSize = new SmallSize(120);
BigSize bigSize = smallSize; // SmallSize 크기만큼 담을 수 있던 내용물을 BigSize 만큼 담을 수 있는 용기로 자동 변환
out.println(bigSize.size); --> 120 출력
smallSize = (SmallSize) bigSize;
out.println(smallSize.size); --> 120 출력
