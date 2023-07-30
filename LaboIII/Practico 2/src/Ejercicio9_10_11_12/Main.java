package Ejercicio9_10_11_12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void  main (String[] args){
        //Creating a random list of students with random data
        ArrayList<Student> students = StudentsList.getList(10);
        TreeSet<String> studiedsubjects = new TreeSet<>();
        System.out.println("\nStudents Created:\n");
        for (Student student: students) {
            System.out.println(student.toString());
            for (Subject subjectsOfStudent: student.getSubjects()){
                if (subjectsOfStudent.getState() == SubjectState.APROBADA)
                    studiedsubjects.add(subjectsOfStudent.getName());
            }
        }

        System.out.println("\nThe Approved Subjects are: \n");
        for (String subjects: studiedsubjects) {
            System.out.print(subjects + " - ");
        }

        System.out.println(" ");
        System.out.println("\nStudents With File (legajo)\n");
        for (Student student: students) {
            System.out.print(student.getName() + " " + student.getLastName() + " " +student.getFile() + " || ");
        }

        System.out.println(" ");
        System.out.println("\nSorting List of Students\n");
        students.sort(Comparator.comparing(Student::getName).thenComparingInt(Student::getFile));
        System.out.println("\nVolviendo a Recorrer\n");
        for (Student student: students) {
            System.out.print(student.getName() + " " + student.getLastName() + " " +student.getFile()+ " || ");
        }

        System.out.println(" ");
        System.out.println("\nSorting By Subjects Quantity\n");
        students.sort(Comparator.comparing(Student::getQuantitySubjects));
    }
}
