import java.util.HashSet;
import java.util.Set;

public class stringObjectsDemo2 {

    //anyMatch, allMatch, noneMatch
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<String>();
        fruits.add("1 Apple");
        fruits.add("2 Mangoes");
        fruits.add("2 Apples");
        fruits.add("2 Guava");
        fruits.add("More Grapes");

        boolean result = fruits.stream().anyMatch(value-> {return value.startsWith("2");});
        System.out.println("At least one value match : " + result);

        boolean allValue = fruits.stream().allMatch(value-> {return value.startsWith("2");});
        System.out.println("All values starts with : " + allValue);

        boolean noneMatch = fruits.stream().noneMatch(value -> {return value.startsWith("2");});
        System.out.println("None of values match : "+ noneMatch);
    }
}
