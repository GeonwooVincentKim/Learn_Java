# List

## ArrayList vs LinkedList vs Vector

### 속도 (값이 작을수록 더 빠름)

- LinkedList > ArrayList >= Vector (or)
-  LinkedList > Vector >= ArrayList 

- LinkedList는 속도가 워낙 빠르지만, ArrayList 와 Vector는 서로 속도가 비슷하다.
- 단지 ArrayList 와 Vector 이 두 가지만 놓고 비교를 할 때, ArrayList가 빠를 때도 있고, Vector가 빠를 때도 있다)

### 멀티 스레딩 여부 (ArrayList 와 Vector)

- ArrayList - 수 많은 Thread 들을 비동기적으로 동시에 처리하며, 하나 씩 처리한다 (비동기 처리 OK)
- Vector - 단 하나의 Thread 로만 동기적으로 처리하며, 오직 단 하나의 Thread 씩 처리가 가능하다 (비동기 NO, 동기화 OK)

- Vector는 초기 Java.util 에 나왔던 인터페이스, 이젠 퇴물 취급
- ArrayList는 Vector를 보완하고자 나온 인터페이스, 진짜 최고임 (단 싱글 스레딩으로 처리할 때에는 Vector가 좋을 수도 있음)

### 데이터 추가(삽입), 검색, 삭제

#### 초기 용량

- ArrayList - 초기 용량 10개
- Vector - 딱히 없음
- LinkedList - 딱히 없음

#### 객체 추가 및 삭제

- ArrayList -  추가하면 할수록 데이터들이 뒤로 한 칸씩 밀림 - 추가할 땐 속도가 느림 (중간에 추가할 경우)
(단, 순차적으로 추가할 땐 속도가 빠름)
- Vector - ArrayList 와 같음
- LinkedList - 현재 데이터의 위치와 인접한 데이터의 위치를 참조하므로, 추가할 땐 빠름 (중간에 추가할 경우)
(단, 순차적으로 추가할 때 속도가 느림)

#### 검색

- ArrayList - 배열 인덱스의 위치를 활용하여 찾아주므로, ArrayList 가 제일 빠름
- Vector - ArrayList 와 마찬가지임
- LinkedList - 인접한 데이터들의 위치를 차례차례 확인하므로, 검색할 땐 속도가 느림

### 결론

- ArrayList(Vector) 는 검색에 용이하나, 추가 삭제 시 시간이 다소 많이 걸림
- LinkedList 는 삽입, 삭제에 용이하나, 데이터 검색에는 시간이 다소 많이 걸림

## 최종 결론

- Multi-Thread 가 아니든 어쨌든 간에, ArrayList 와 Vector 둘 중 하나를 써야 한다면 Vector의 성능을 보완한 ArrayList 사용
- LinkedList 는 ArrayList 와 Vector 보다 월등히 빠름
- ArrayList 는 검색에는 정말 빠르지만 삽입 & 삭제 시 정말 느리고, LinkedList 는 삽입 & 삭제 시 정말 빠르지만, 검색할 땐 정말 느리다 

## 출처

- [List 에 대한 설명 출처](https://github.com/GeonwooVincentKim/Anonymous_Example_Java)
