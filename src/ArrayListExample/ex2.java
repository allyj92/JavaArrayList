package ArrayListExample;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
    int arr[] = new int[10];

    int num = arr.length;

    for(int i = 0; i < arr.length;i++) {
        arr[i] = num;
        num--;
    }

    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");

    }
    }


}
