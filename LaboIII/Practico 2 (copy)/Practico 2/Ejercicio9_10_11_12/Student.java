package Ejercicio9_10_11_12;

import java.util.HashSet;
import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private String lastName;
    private int file;
    private HashSet<Subject> subjects = new HashSet<>();

    public Student(String name, String lastName, int file) {
        this.name = name;
        this.lastName = lastName;
        this.file = file;
    }
    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public HashSet<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashSet<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getQuantitySubjects(){
        return this.subjects.size();
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", file=" + file +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return file == student.file && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName) && Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, file, subjects);
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // Comparar por nombre
    }
}

