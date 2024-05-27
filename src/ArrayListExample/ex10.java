package ArrayListExample;
import java.util.Scanner;
import java.util.Arrays;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       11자리 배열 생성
        char[] arr = new char[14];
        String num = sc.nextLine();

        for(int i = 0;i< arr.length;i++){
            arr[i] = num.charAt(i);
        }

        char[] copy = arr.clone();

        for(int i = 7; i < copy.length; i++){
            copy[i] = '*';
        }
        System.out.print(copy);
        sc.close();
    }
}
