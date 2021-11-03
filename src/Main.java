import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Fred","Flintstone",10001);
        Student st2 = new Student("Barney","Rubble",10002);
        Student st3 = new Student("Wilma","Flintstone",10003);
        Student st4 = new Student("Betty","Rubble",10004);
        Student st5 = new Student("Bam Bam","Rubble",10004);
        Student st6 = new Student("Pebbles","Flintstone",10004);

        ArrayList<String> stringAL = new ArrayList<>();
        stringAL.add(st1.toString());
        stringAL.add(st2.toString());
        stringAL.add(st3.toString());
        stringAL.add(st4.toString());

        System.out.println(stringAL);
        ArrayList<Student> studentsAL = new ArrayList<>();
        studentsAL.add(st1);
        studentsAL.add(st2);
        studentsAL.add(st3);
        studentsAL.add(st4);
        studentsAL.add(st5);
        System.out.println(stringAL);

        studentsAL.remove(st4);
        System.out.println("student 4 still exists -> " + st4);
        System.out.println(studentsAL);

        studentsAL.add(st4);
        studentsAL.add(st4);

        for(Student student : studentsAL)
            System.out.printf("%s hashcode: %s%n", student, student.hashCode());

        HashSet<Student> studentsHS = new HashSet<>();
        studentsHS.addAll(studentsAL);
        studentsHS.add(st6);

        System.out.println(studentsHS);

    }
}
