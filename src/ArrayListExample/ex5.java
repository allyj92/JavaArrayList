package ArrayListExample;
import java.util.Arrays;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String st = sc.nextLine();

        System.out.print("찾을 문자를 입력하세요 : ");
        String st1 = sc.nextLine();

        // 배열 만들기
        char[] result = new char[st.length()];

        // 배열에 한글자씩 넣기
        for(int i=0; i<st.length();i++){
            result[i] = st.charAt(i);
        }

        // 검색할 문자가 문자열에 몇개 들어있는지
        // 문자열을 반복하다가 문자와 같을 때 인덱스를 반환
        int count = 0;
        for(int i=0;i<st.length();i++)
            if (st1.charAt(0) == result[i]) {
                System.out.print(i+" ");
                count ++;
            }
        System.out.println();
        System.out.print("인덱스가 존재하는 총 갯수 : " + count);


    }
}
