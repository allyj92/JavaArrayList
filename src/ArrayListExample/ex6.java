package ArrayListExample;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        char[] week = {'월','화','수','목','금','토','일'};

        // 0부터 6까지 숫자를 입력받기

        Scanner sc = new Scanner(System.in);
        System.out.print("O부터 6까지의 수를 입력하세요 : ");
        int index = sc.nextInt();

        // 입력한 숫자와 같은 인덱스에 있는 요일을 출력
        if(index >= 0 && index<7) {
            System.out.print(week[index] + "요일");
        }else{
        // 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력

            System.out.print("잘못 입력하셨습니다.");
        }
        sc.close();
    }

}
