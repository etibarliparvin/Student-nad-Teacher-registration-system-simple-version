package utility;

import bean.Config;
import bean.Student;
import bean.Teacher;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenuStudent() {
        int menu = selectMenuStudent();
        if (menu == 1) {
            System.out.print("How many students will you register?");
            int number = new Scanner(System.in).nextInt();
            Config.students = new Student[number];
            for (int i = 0; i < number; i++) {
                System.out.println("Please enter credential for student No " + (i + 1));
                Config.students[i] = StudentUtil.registerStudent();
            }
            StudentUtil.showAllStudents();
        } else if (menu == 2) {
            StudentUtil.showAllStudents();
            StudentUtil.removeStudent();
            StudentUtil.showAllStudents();
        } else if (menu == 3) {
            StudentUtil.showAllStudents();
            StudentUtil.updateStudent();
            StudentUtil.showAllStudents();
        } else if (menu == 4) {
            StudentUtil.findStudent();
        } else if (menu == 5) {
            StudentUtil.showAllStudents();
        } else if (menu == 6) {
            exitMenu();
        } else {
            System.out.println("You have chosen wrong menu action. Please select correct menu button!");
        }
    }

    public static void showMenuTeacher() {
        int menu = selectMenuTeacher();
        if (menu == 1) {
            System.out.print("How many teachers will you register?");
            int number = new Scanner(System.in).nextInt();
            Config.teachers = new Teacher[number];
            for (int i = 0; i < number; i++) {
                System.out.println("Please enter credential for teacher No " + (i + 1));
                Config.teachers[i] = TeacherUtil.registerTeacher();
            }
            TeacherUtil.showAllTeachers();
        } else if (menu == 2) {
            TeacherUtil.showAllTeachers();
            TeacherUtil.removeTeacher();
            TeacherUtil.showAllTeachers();
        } else if (menu == 3) {
            TeacherUtil.showAllTeachers();
            TeacherUtil.updateTeacher();
            TeacherUtil.showAllTeachers();
        } else if (menu == 4) {
            TeacherUtil.findTeacher();
        } else if (menu == 5) {
            StudentUtil.showAllStudents();
        } else if (menu == 6) {
            exitMenu();
        } else {
            System.out.println("You have chosen wrong menu action. Please select correct menu button!");
        }
    }

    public static int selectMenuStudent() {
        return Util.requireIntegerNumber("You have entered to the Student section\n" +
                "1. Register a student\n" +
                "2. Remove a student\n" +
                "3. Update a student\n" +
                "4. Find a student\n" +
                "5. Show all students\n" +
                "6. Exit from System\n" +
                "Please select menu button:");
    }

    public static int selectMenuTeacher() {
        return Util.requireIntegerNumber("You have entered to the Teacher section\n" +
                "1. Register a teacher\n" +
                "2. Remove a teacher\n" +
                "3. Update a teacher\n" +
                "4. Find a teacher\n" +
                "5. Show all teacher\n" +
                "6. Exit from System\n" +
                "Please select menu button:");
    }

    public static void exitMenu() {
        System.out.println("You have just existed from Application. See You next time!");
        return;
    }
}
