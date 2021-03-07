package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        String str = "hello";
        int a = 10;
        double d = 5.0;
        ArrayGeneric<Object> arrayGeneric = new ArrayGeneric<Object>(str, a, d);

        arrayGeneric.swapArrayElements(2, 0);
    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
