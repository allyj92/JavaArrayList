import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
//        System.out.println(numbers.removeLast());
//        System.out.println(numbers);
//        System.out.println(numbers.get(0));
//        System.out.println(numbers.get(1));
//        System.out.println(numbers.get(2));
//        System.out.println(numbers.get(3));
////      System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(30));
//        for(int i = 0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
//
       ArrayList.ListIterator li = numbers.listIterator();
       while(li.hasNext()){
           System.out.println(li.next());
       }

       System.out.println(li.previous());
       System.out.println(li.previous());
       System.out.println(li.previous());
       System.out.println(li.previous());


        while(li.hasPrevious()){
            System.out.println(li.next());
        }

        while(li.hasNext()){
            int number = (int)li.next();
            if(number == 30){
                li.remove(35);
            }
            System.out.println(number);
        }

        System.out.println(numbers);



    }
}