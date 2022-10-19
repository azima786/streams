import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamObjectsDemo1 {

    //distinct, count, limit
    public static void main(String[] args) {

        List<String> vehicleList = Arrays.asList("bus", "car", "bike", "flight", "train", "bus", "car", "bike", "flight", "train");
       // List<String> distinct=vehicleList.stream().distinct().collect(Collectors.toList());
       // System.out.println(distinct);

        vehicleList.stream().distinct().forEach(s -> System.out.println(s));
        long count =vehicleList.stream().distinct().count();
        System.out.println(count);

        vehicleList.stream().distinct().limit(4).forEach(s-> System.out.println(s));

    }
}
