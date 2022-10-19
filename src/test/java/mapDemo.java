import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class mapDemo {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bike", "flight", "train");
        List<String> vehicleListInUpperCase = new ArrayList<>();

        //without streams convert to uppercase and create new collection
//    for(String v:vehicles){
//vehicleListInUpperCase.add(v.toUpperCase()) ;
//    }
//        System.out.println(vehicleListInUpperCase);
//    }

//vehicleListInUpperCase= vehicles.stream().map(v-> v.toUpperCase()).collect(Collectors.toList());
//        System.out.println(vehicleListInUpperCase);

        vehicles.stream().map(v-> v.length()).forEach(le-> System.out.println(le));


    }
}
