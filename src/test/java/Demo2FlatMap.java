import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2FlatMap {

    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamb = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamc = Arrays.asList("Ken", "Johnny", "Kitty");

        List<List<String>> players = Arrays.asList(teamA,teamb,teamc);

        //Before Java 8 - Print all players name
//        for(List<String> Teams: players){
//            for(String name: Teams){
//                System.out.println(name);
//            }
//        }


        //Using flatMap - Streams
List<String> names=        players.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(names);
    }
}
