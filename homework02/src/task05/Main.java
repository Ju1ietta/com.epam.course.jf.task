package task05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void showStudent(List<Group> listGroup, Student student){
        System.out.println("Student " + student.getFirstName() + " "
                + student.getLastName() + " visits the following groups: " );
        for (Group elem:listGroup) {
            if(elem.getStudentSortedMap().containsKey(student))
                System.out.print(elem.getDiscipline());
            if(elem.getStudentSortedMap().get(student) != null){
                System.out.println(" - current mark: " + elem.getStudentSortedMap().get(student));
            }
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alexander","Pushkin");
        Student student2 = new Student("Sergey","Esenin");
        Student student3 = new Student("Alexander","Soljenitin");
        Student student4 = new Student("Mihail", "Lermontov");
        Student student5 = new Student("Anna", "Ahmatova");
        Student student6 = new Student("Anton", "Chehov");

        List<Group> listGroup = new ArrayList<Group>();
        Group group1 = new Group(Disciplines.PHYSICS, false);
        listGroup.add(group1);
        Group group2 = new Group(Disciplines.MATH, false);
        listGroup.add(group2);
        Group group3 = new Group(Disciplines.BIOLOGY, true);
        listGroup.add(group3);
        Group group4 = new Group(Disciplines.HISTORY, true);
        listGroup.add(group4);

        group1.addStudent(student1, 3.0);
        group1.addStudent(student6, 4.5);
        group2.addStudent(student3, 4.8);
        group2.addStudent(student1, 4.5);
        group3.addStudent(student4, 5);
        group4.addStudent(student5, 5);
        group4.addStudent(student2, 4);
        showStudent(listGroup,student1);
    }
}
