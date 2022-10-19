import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

    public static void main(String[] args) {
      /*  ArrayList<Integer> numberlist = new ArrayList<Integer>();
        numberlist.add(10);
        numberlist.add(15);
        numberlist.add(20);
        numberlist.add(25);
        numberlist.add(30);*/

        List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenNumber = new ArrayList<Integer>();

        //Without using streams
       /* for(int n:numberList){
            if(n%2==0){
                evenNumber.add(n);
            }


        }
        System.out.println(evenNumber);

    }*/

        //with streams (predicate)
//evenNumber= numberList.stream().filter(n-> n%2==0).collect(Collectors.toList());
//        System.out.println(evenNumber);

        //Just to print not store- consumes value(consumer)
        numberList.stream().filter(n-> n%2==0).forEach(n-> System.out.println(n));
        numberList.stream().filter(n-> n%2==0).forEach(System.out::println);
    }


}
