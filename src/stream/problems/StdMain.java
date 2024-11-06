package stream.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class StdMain
{
    public static void main(String[] args) {

//      Arrays.asList(sai,ram,raj).stream().forEach((str)->System.out.println(str));


        // Print the first 2 student whose rollNo is greater than 25
getStudents().stream()
        .filter(studentObj -> studentObj.getRollNo()>25)
        .map(studentObj -> studentObj.getName())
        .limit(2)
        .forEach(studentName -> System.out.println("Name of the student is : "+studentName));



    }



    public static List<Student> getStudents()
    {
        ArrayList<Student> students = new ArrayList<>();
        Student sai = new Student(1,"Sai",29,"Bsc");
        Student ram = new Student(2,"Ram",25,"Btech");
        Student raj = new Student(3,"Raj",24,"Bsc");
        Student roxy = new Student(4,"Roxy",26,"Mtech");
        Student salaar = new Student(5,"Salaar",27,"MBA");

        students.add(sai);
        students.add(ram);
        students.add(raj);
        students.add(roxy);
        students.add(salaar);

        return students;
    }


}
