package OOP.Collections;

import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        //Add students in the Array list using the Student.java
        students.add(new Student("Apple", 15));
        students.add(new Student("James", 16));
        students.add(new Student("Amy", 17));
        students.add(new Student("Sonic", 18));

        //Create a loop for the student array using Student class per line 
        for (Student s: students) {

            System.out.println(s.getName());
        }


    }
}
