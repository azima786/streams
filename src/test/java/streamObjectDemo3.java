import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamObjectDemo3 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        //returned as 1 string from back.
Optional<String> reduced = stringList.stream().reduce((value, combinedvalue) -> {return combinedvalue + value;});
        System.out.println(reduced.get());
    }
}
