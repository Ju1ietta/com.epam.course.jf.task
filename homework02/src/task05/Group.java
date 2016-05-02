package task05;

import java.util.HashMap;

public class Group {
    private Disciplines discipline;
    private boolean isRealMark;
    private HashMap<Student, Number> studentSortedMap;

    public Group(Disciplines discipline, boolean isRealMark) {
        this.discipline = discipline;
        this.isRealMark = isRealMark;
        studentSortedMap = new HashMap<>();
    }

    public Disciplines getDiscipline() {
        return discipline;
    }

    public HashMap<Student, Number> getStudentSortedMap() {
        return studentSortedMap;
    }

    public <T extends Number> void addStudent(Student student, T mark) {
        if (!this.isRealMark && mark instanceof Double)
            studentSortedMap.put(student, mark);
        else if (this.isRealMark && mark instanceof Integer)
            studentSortedMap.put(student, mark);
        else
            throw new IllegalArgumentException("Incorrect argument mark! ");
    }
}
