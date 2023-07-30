package Ejercicio9_10_11_12;

import java.util.ArrayList;
import java.util.Random;

public class StudentsList {
    public static ArrayList<Student> getList(int studentsToCreate){

        // This Method Generates a random list of students

        //final int studentsToCreate = 10;
        final int subjectsToCreate = 4;

        ArrayList<Student> studentList = new ArrayList<>();
        String[] names = {"Ana", "Juan", "María", "Pedro", "Lucía", "Diego", "Carla", "Fernando", "Laura", "Andrés"};
        String[] lastnames = {"García", "Rodríguez", "Fernández", "López", "Martínez", "González", "Pérez", "Sánchez", "Romero", "Santos"};
        String[] subjects = {"Matemáticas", "Física", "Química", "Biología", "Historia", "Lengua"};
        SubjectState[] subjectsStates = SubjectState.values();
        for (int i = 0; i < studentsToCreate; i++) {
            Random rand = new Random();
            Student newStudent = new Student(
                    names[rand.nextInt(names.length)],
                    lastnames[rand.nextInt(lastnames.length)],
                    rand.nextInt(90000) + 10000);


            for (int j = 0; j < 4; j++) {
                Subject newSubject = new Subject(subjects[rand.nextInt(subjects.length)], 1, "Profe", subjectsStates[rand.nextInt(subjectsStates.length)], rand.nextInt(6) + 5);
                newStudent.addSubject(newSubject);
            }
            studentList.add(newStudent);
        }
        /*
        *  new Subject(subjects[rand.nextInt(subjects.length)],1, "Profe", subjectsStates[rand.nextInt(subjectsStates.length)],rand.nextInt(6) + 5)
        * */
        return studentList;
    }
}
