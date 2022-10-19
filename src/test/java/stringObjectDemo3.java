import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stringObjectDemo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "one");
        Optional<String> ele = stringList.stream().findAny();
       // System.out.println("Any value from element: " + ele);
        System.out.println("Particular Element " + ele.get());

        //find first
        Optional<String> element = stringList.stream().findFirst();
        System.out.println(element.get());


    }
}
