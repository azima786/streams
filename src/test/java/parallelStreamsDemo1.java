import java.util.Arrays;
import java.util.List;

class Students{
    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    String name;
    int score;



}


public class parallelStreamsDemo1 {

    public static void main(String[] args) {

        List<Students> studentList = Arrays.asList(
                new Students("David", 82),
                new Students("Bob", 82),
                new Students("Scott", 50),
                new Students("John", 90),
                new Students("Caned", 65),
                new Students("Eric", 85),
                new Students("Smith", 88)
                );

    //Using stream- sequential
        studentList.stream().filter(s->s.getScore()>=80)
        .limit(3)
        .forEach(s-> System.out.println(s.getName() + s.getScore()));

    //using parallel stream
        studentList.parallelStream().filter(s->s.getScore()>=80)
            .limit(3)
            .forEach(s-> System.out.println(s.getName()+s.getScore()));

    //convert sequential into parallel
        studentList.stream().parallel().filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(s-> System.out.println(s.getName() + s.getScore()));


    }
}
