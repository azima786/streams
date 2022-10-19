import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stringObjectsDemo4 {

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Dog", "cat", "Elephant");
        List <String> birds = Arrays.asList("peacock", "parrot", "crow");

        Stream<String> stream1 = animals.stream();
        Stream<String> stream2 = birds.stream();
        List<String> streams= Stream.concat(stream2, stream1).collect(Collectors.toList());

        for(String item: streams){
            System.out.println(item);
        }
        System.out.println(streams);
    }

}
