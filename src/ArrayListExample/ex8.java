package ArrayListExample;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        // 3이상인 홀수 자연수를 입력 받아
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("3이상인 홀수 자연수를 입력하세요 : ");
            int num = sc.nextInt();

            if(num >= 3 && num % 2 == 1) {
                int[] arr = new int[num];
                //  배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
                //  1. 배열의 중간 : 정수를 2로 나눈 몪과 같거나 작으면
                int value = 1;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = value;
                    if (i < arr.length / 2) {
                        value++;
                    } else {
                        value--;
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                System.out.println("다시 입력하세요.");
            }
            sc.close();
        }

    }
}