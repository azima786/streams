import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class student{
    public student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    String name;
    int id;
    char grade;


}

public class flatMapDemo3 {
    public static void main(String[] args) {
        List<student> studentList1 = new ArrayList<student>();
        studentList1.add(new student("Smith", 101,'A'));
        studentList1.add(new student("John", 102,'B'));
        studentList1.add(new student("Kennedy", 103,'C'));


    List<student> studentList2 = new ArrayList<student>();
        studentList2.add(new student("Scott", 104,'A'));
        studentList2.add(new student("Mary", 106,'B'));
        studentList2.add(new student("Kitty", 108,'C'));

        List<List<student>>studentList = Arrays.asList(studentList2, studentList1);

        //Before Java 8
        for(List<student> s: studentList){
            for(student stu:s){
                System.out.println(stu.name);
            }
        }


     List<String> names=   studentList.stream()
             .flatMap(s->s.stream())
             .map(n->n.name)
             .collect(Collectors.toList());
        System.out.println(names);

}}
