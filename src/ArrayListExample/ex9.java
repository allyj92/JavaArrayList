package ArrayListExample;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"양념", "후라이드", "순살"};

        System.out.print("치킨 이름을 입력하세요. : ");
        String food = sc.nextLine();
        int yesNo = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i].equals(food)) {
                yesNo += 1;
                break;
            }
        }
        if(yesNo == 0) {
            System.out.println(food + "은(는) 없는 메뉴입니다.");
        }else {
            System.out.println(food + "치킨 배달 가능");
        }
        sc.close();


    }}

