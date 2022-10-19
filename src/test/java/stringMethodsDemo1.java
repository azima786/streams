import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class stringMethodsDemo1 {

    //sort
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
        List<Integer> sorted = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> sortedreverse = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedreverse);

        List<String> list2 = Arrays.asList("John", "Mary", "Kim", "David", "Smith");
        list2.stream().sorted().forEach(s-> System.out.println("Sorted List " + s));
        list2.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println("Reversed order list: " + s));
    }
}
