package ArrayListExample;

import java.util.Random;
public class ex11 {
    public static void main(String[] args) {
       // 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
        Random random = new Random();
        int[] arr = new int[10];
        for(int i = 0; i<arr.length;i++){
           int num =  (int)(Math.random()*10);
           arr[i] = num;
        }
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
