package ArrayListExample;
import java.util.Arrays;
import java.util.Random;

public class ex13 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10+1);
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]) {
                    i--;	// 랜덤한수를 다시 만드는 코드
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }


    }
}
