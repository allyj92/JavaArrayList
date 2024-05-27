package ArrayList2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        // 정수 배열
        int[] number = {1,2,3,4,5};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        int[] oddNumbers = {1, 2, 5, 7, 9};

        System.out.println(Arrays.toString(number));
        // 실수 배열
        double[] floats = {1.5, 2.7, 3.9, 4.2, 5.0};
        System.out.println(Arrays.toString(floats));


        // 문자열 배열
        String[] fruits = {"사과","바나나","딸기","포도","수박"};
        String[] colors = {"빨강", "주황", "노랑", "초록", "파랑"};
        System.out.println(Arrays.toString(fruits));
        // boolean 배열
        boolean[] bools = {true, false, true, true, false};
        System.out.println(Arrays.toString(bools));


        // 문자 배열
        char[] vowels = {'a','e','i','o','u'};


        // 이차원 배열
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }

        // 배열의 배열
        String[][] words = {{"Hello","World"},{"Java","Programming"},{"OpenAI","GPT"}};
        for(String[] row : words){
            System.out.println(Arrays.toString(row));
        }

        // 객체 배열
        Person[] people = {new Person("Alice",25),new Person("Bob",30), new Person("Charlie",35)};
        for(Person person : people){
            System.out.println("Name : " + person.getName() + ", Age : " + person.getAge());
        }

        // 빈 배열
        int[] emptyArray = new int[5];
        System.out.println(Arrays.toString(emptyArray));

        // 초기값을 갖는 배열
        int[] initializedArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(initializedArray));

        // 주어진 길이와 초기값으로 배열 생성
        int[] arrayWithInitialValue = new int[10];
        Arrays.fill(arrayWithInitialValue,5);
//        for(int arrays : arrayWithInitialValue)
//        { System.out.println(arrays);}
        System.out.println(Arrays.toString(arrayWithInitialValue));

        // 랜덤 값으로 배열 생성
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for(int i = 0; i < randomNumbers.length;i++){
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(randomNumbers));



    }
}
