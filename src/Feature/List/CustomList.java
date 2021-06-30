package Feature.List;

public class CustomList {
    private int[] array;
    private int arrayValue;

    public CustomList() {

    }

    public CustomList(int[] array, int arrayValue) {
        this.setArray(array);
        this.setArrayValue(arrayValue);
    }

    public int getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(int arrayValue) {
        this.arrayValue = arrayValue;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    // 3-1. 사용자가 입력한 수만큼 임의의 수들을 저장한 배열에 중복된 값이 있는지 확인하고, 만약 중복된 값이 있다면 즉시 중복된 값을
    // 제거한다.
    public static boolean checkDuplicateValue(int[] getArray, int getArrayValue) {
        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == getArrayValue) {
                // 만약 현재 인덱스에 속한 값이 같은 배열 내에 있는 다른 수와 겹친다면, true 를 Return 하여 존재한다는 여부를 알린다.
                return true;
            }
        }

        return false;
    }

    // 3-2. 사용자가 입력한 수만큼 임의의 수들을 저장한 배열에 중복된 값이 있는지 확인하고, 만약 중복된 값이 있다면 그 특정 중복 값에
    // 대해서 몇 번 출현했는지 알려준다.
    public static int countDuplicateValue(int[] getArray, int getArrayValue) {
        int count = 0;

        for (int i = 0; i < getArray.length; i++) {
            if (getArray[i] == getArrayValue) {
                count++;
            }
        }

        return count;
    }

}
