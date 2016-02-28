package task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Julia on 26.02.2016.
 */
public class Notebook {
    private Note[] arrayNotes;
    private final static int size = 100;

    public Notebook() {
        this.arrayNotes = new Note[size];
    }

    public static Note addNote() {
        System.out.println("Введите запись: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return new Note(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteNote(int index) {
        this.arrayNotes[index - 1] = null;
    }

    public Note editNote(int index) {
        return this.arrayNotes[index] = addNote();
    }

    public void viewNotes(Notebook notebook, int count) {
        System.out.println("Записи в блокноте: ");
        for (int i = 0; i < count; i++)
            System.out.print(i + ". " + Note.getValueOfNote(notebook.arrayNotes[i]));
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "      \n1. Добавить запись.\n" +
                        "2. Удалить запись.\n" +
                        "3. Редактировать запись.\n" +
                        "4. Посмотреть все записи.\n" +
                        "5. Выход.");
        return sc.nextInt();
    }

    public static class Note {

        public String note;

        public Note(String note) {
            this.note = note;
        }

        public static String getValueOfNote(Note note) {
            return note == null ? "" : note.toString();
        }

        @Override
        public String toString() {
            return note + "\n";
        }

    }

    public static void main(String[] args) throws Exception {
        Notebook notebook = new Notebook();
        int countNotes = notebook.arrayNotes.length;
        int m;
        try {
            do {
                System.out.println("Кол-во доступных записей для добавления в блокнот: " + countNotes);
                m = menu();
                switch (m) {
                    case 1:
                        if (countNotes == 0)
                            throw new Exception("Notebook is full!");
                        notebook.arrayNotes[size - countNotes] = addNote();
                        countNotes--;
                        break;
                    case 2:
                        notebook.viewNotes(notebook, size - countNotes);
                        System.out.println("Желаете удалить последнюю запись в блокноте?\n" +
                                "Если да - введите 1, иначе - 0");
                        Scanner scanner1 = new Scanner(System.in);
                        int index1 = scanner1.nextInt();
                        if (Math.abs(index1) == 1) {
                            notebook.deleteNote(size - countNotes);
                            countNotes++;
                        } else if (index1 == 0)
                            continue;
                        else
                            throw new IndexOutOfBoundsException("Выбрано неверное значение.");
                        break;
                    case 3:
                        notebook.viewNotes(notebook, size - countNotes);
                        System.out.println("Введите индекс записи для редактирования.");
                        Scanner scanner2 = new Scanner(System.in);
                        int index2 = scanner2.nextInt();
                        if (Math.abs(index2) <= size - countNotes)
                            notebook.editNote(index2);
                        else
                            throw new IndexOutOfBoundsException("Введен неверный индекс записи.");
                        break;
                    case 4:
                        notebook.viewNotes(notebook, size - countNotes);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Some problem!");
                }
            } while (m != 5);
        } catch (InputMismatchException e) {
            System.out.println("Неправильно выбран пункт меню!");
        }
    }
}
