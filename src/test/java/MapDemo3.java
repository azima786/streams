import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,3,4,5,6);
        //read every number and multiply by 3

List<Integer>multipliedBy3=        numberList.stream().map(n->n*3).collect(Collectors.toList());
        System.out.println(multipliedBy3);
        numberList.stream().map(n->n*3).forEach(n-> System.out.println(n));
        numberList.stream().map(n->n*3).forEach(System.out::println);
    }
}
