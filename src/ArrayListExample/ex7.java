package ArrayListExample;

import java.util.Scanner;
import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        // 사용자가 배열의 길이를 직접 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("지정할 배열의 길이 : ");

        int inputArrayLegth = sc.nextInt();

        // 그 값만큼 정수형 배열을 선언 및 할당
        int[] intArray = new int[inputArrayLegth];
        for(int i = 0; i<inputArrayLegth;i++){
            System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
             intArray[i] = sc.nextInt();
        }

        for(int i : intArray){
        System.out.print(i+" ") ;
        }
        int sum = Arrays.stream(intArray).sum();
        System.out.println();
        System.out.print("총 합 : " + sum);

    }
}
