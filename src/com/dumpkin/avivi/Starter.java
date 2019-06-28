package com.dumpkin.avivi;

import java.util.*;

public class Starter {

    public static void begin() {
        int count;
        Integer num;

        ComsoleInput input = new ComsoleInput();
        ArrayList<Student> studentList = new ArrayList<Student>();

        //test list
        studentList.add(new Student("denis", "yufa", "KSM", 3, "SP"));
        studentList.add(new Student("oleg", "boj", "KSM", 2, "SP"));
        studentList.add(new Student("sergey", "vit", "RT", 4, "RP"));

        Scanner key = new Scanner(System.in);

        System.out.println("(1)показати студентыв (2)додати студента (3)видалити студента");
        while (key.hasNext()) {
            System.out.println("(1)показати студентыв (2)додати студента (3)видалити студента");
            switch (key.nextByte()) {

                case 1:
                    System.out.println("\n\nсписок студентів");
                    viewList(studentList);
                    break;
                case 2:
                    addStudentTo(studentList);
                    break;
                case 3:
                    removeStudentFrom(studentList);
                    break;
                default:
                    return;
            }

        }

        /**
         * виводимо весь список
         * */


    }

    public static void addStudentTo(ArrayList<Student> students) {
        /**
         * вводимо данні студенів
         * */


        ComsoleInput input = new ComsoleInput();

        Student student = new Student(input.inputString("Ім'я"), input.inputString("Прізвище"),
                input.inputString("група"), input.inputByte("введіть номер групи:"),
                input.inputString("Факультет"));
        students.add(student);

        System.out.println("_______________________________\n");

    }

    public static void removeStudentFrom(ArrayList<Student> students) {
        /**
         * Пошук студента по імені та вдалення його
         * */
        ComsoleInput input = new ComsoleInput();
        String SearchByName = input.inputString("Ведіть ім'я для пошуку: ");
        ListIterator<Student> studentListIterator = students.listIterator();

        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            Student forDel = it.next();
            String Word = forDel.getFirstName();
            if (SearchByName.equals(Word)) {
                System.out.println("студент " + Word + " видалений");
                it.remove();
            }
        }
//        System.out.println("\n\nсписок після видалення");
//        viewList(studentList);
    }

    public static void viewList(ArrayList<Student> inerlist) {
        int num = 1;
        Iterator<Student> iter = inerlist.iterator();

        while (iter.hasNext()) {
            System.out.println("студент:" + num + ' ' + iter.next());
            num++;
        }
    }
}
