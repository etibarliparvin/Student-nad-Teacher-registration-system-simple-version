package utility;

import bean.Config;
import bean.Student;

public class StudentUtil {

    public static Student registerStudent() {
        Integer id = Util.requireIntegerNumber("Enter student id:");
        String name = Util.requireText("Enter student name:");
        String surname = Util.requireText("Enter student surname:");
        Integer age = Util.requireIntegerNumber("Enter student age:");
        String schoolName = Util.requireText("Enter student school name:");
        Double scholarship = Util.requireFloatNumber("Enter student scholarship amount:");
        return new Student(id, name, surname, age, schoolName, scholarship);
    }

    public static void showAllStudents() {
        System.out.println();
        if (Config.students != null) {
            for (int i = 0; i < Config.students.length; i++) {
                if (Config.students[i] != null) {
                    System.out.println(Config.students[i]);
                }
            }
        }
        System.out.println();
    }

    public static void removeStudent() {
        String key = Util.requireText("Enter id, name, surname, age, sholarship or school name to delete a student:");
        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students[i] != null) {
                if (search(i, key)) {
                    Config.students[i] = null;
                }
            }
        }
    }

    public static Student updateStudent() {
        Integer flag = null;
        String key = Util.requireText("Which student do you want to update? \n Please select id name or surname:");
        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students[i] != null) {
                if (search(i, key)) {
                    Config.students[i] = null;
                    flag = i;
                }
            }
        }
        return Config.students[flag] = StudentUtil.registerStudent();
    }

    public static void findStudent() {
        int flag = 0;
        String key = Util.requireText("Please enter id, name, surname, age, sholarship or shool name to find a student:");
        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students[i] != null) {
                if (search(i, key)) {
                    System.out.println(Config.students[i]);
                    flag++;
                }
            }
        }
        if (flag == 0) {
            System.out.println("There is no person with this credential! Please insert correct data:");
        }
    }

    public static boolean search(int i, String key) {
        return (Config.students[i].getId().toString().contains(key) ||
                Config.students[i].getName().contains(key) ||
                Config.students[i].getSurname().contains(key) ||
                Config.students[i].getAge().toString().contains(key) ||
                Config.students[i].getScholarship().toString().contains(key) ||
                Config.students[i].getSchoolName().contains(key));
    }
}
