package homework1;

public class ArrayGeneric<T> {
    private T[] array;

    public ArrayGeneric(T... array) {
        this.array = array;
    }

    public void swapArrayElements(int firstElem, int secondElem) {
        T temp = array[firstElem];
        array[firstElem] = array[secondElem];
        array[secondElem] = temp;

        //для тестирования работы метода
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
