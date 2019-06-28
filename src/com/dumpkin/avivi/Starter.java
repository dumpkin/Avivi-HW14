package com.dumpkin.avivi;

import java.util.*;

public class Starter {

    public static void begin() {
        int count;
        Integer num;

        ComsoleInput input = new ComsoleInput();

        ArrayList<Student> studentList = new ArrayList<Student>();

/**
 * вводимо данні студенів
 * */
        count = input.inputByte("Введіть кількість студентів:");
        num = 1;
        while (count != 0) {

            System.out.println("студент №" + num);
            Student student = new Student(input.inputString("Ім'я"), input.inputString("Прізвище"),
                    input.inputString("група"), input.inputByte("введіть номер групи:"), input.inputString("Факультет"));
            studentList.add(student);
            count--;
            num++;
            System.out.println("_______________________________\n");
        }

        /**
         * виводимо весь список
         * */
        viewList(studentList);
//        Iterator<Student> iter = studentList.iterator();
//        num = 1;
//        while (iter.hasNext()) {
//            System.out.println("студент:" + num + ' ' + iter.next());
//            num++;
//        }

/**
 * Пошук студента по імені та вдалення його
 * */
        String SearchByName = input.inputString("Ведіть ім'я для пошуку: ");
        ListIterator<Student> studentListIterator = studentList.listIterator();

        for (Iterator<Student> it = studentList.iterator(); it.hasNext(); ) {
            Student forDel = it.next();
            String Word = studentListIterator.next().getFirstName();
            System.out.println("name " + Word);
        }
    }


//        while (studentListIterator.hasNext()) {
//            if (studentListIterator.next().getFirstName().equals(SearchByName)) {
//                studentListIterator.remove();
//            }
//
//        }

//        System.out.println("\n\nпісля видалення");
//        viewList(studentList);
//        }





    public static void viewList(ArrayList<Student> inerlist) {
        int num = 1;
        Iterator<Student> iter = inerlist.iterator();

        while (iter.hasNext()) {
            System.out.println("студент:" + num + ' ' + iter.next());
            num++;
        }
    }
}
