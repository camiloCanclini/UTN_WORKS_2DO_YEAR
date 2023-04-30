package school;

import java.util.Objects;

public class Subject {
    private String name;
    private int grade;
    private String teacher;
    private SubjectState state;
    private int note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public SubjectState getState() {
        return state;
    }

    public void setState(SubjectState state) {
        this.state = state;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return grade == subject.grade && note == subject.note && Objects.equals(name, subject.name) && Objects.equals(teacher, subject.teacher) && state == subject.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, teacher, state, note);
    }
}
