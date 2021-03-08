package utility;

import bean.Config;
import bean.Teacher;

public class TeacherUtil {

    public static Teacher registerTeacher() {
        Integer id = Util.requireIntegerNumber("Enter teacher id:");
        String name = Util.requireText("Enter teacher name:");
        String surname = Util.requireText("Enter teacher surname:");
        Integer age = Util.requireIntegerNumber("Enter teacher age:");
        String schoolName = Util.requireText("Enter teacher school name:");
        Double salary = Util.requireFloatNumber("Enter teacher salary amount:");
        return new Teacher(id, name, surname, age, schoolName, salary);
    }

    public static void showAllTeachers() {
        System.out.println();
        if (Config.teachers != null) {
            for (int i = 0; i < Config.teachers.length; i++) {
                if (Config.teachers[i] != null) {
                    System.out.println(Config.teachers[i]);
                }
            }
        }
        System.out.println();
    }

    public static void removeTeacher() {
        String key = Util.requireText("Enter id, name, surname, age, salary or school name to delete a teacher:");
        for (int i = 0; i < Config.teachers.length; i++) {
            if (Config.teachers[i] != null) {
                if (search(i, key)) {
                    Config.teachers[i] = null;
                }
            }
        }
    }

    public static Teacher updateTeacher() {
        Integer flag = null;
        String key = Util.requireText("Which teacher do you want to update? \n Please select id name or surname:");
        for (int i = 0; i < Config.teachers.length; i++) {
            if (Config.teachers[i] != null) {
                if (search(i, key)) {
                    Config.teachers[i] = null;
                    flag = i;
                }
            }
        }
        return Config.teachers[flag] = TeacherUtil.registerTeacher();
    }

    public static void findTeacher() {
        int flag = 0;
        String key = Util.requireText("Please enter id, name, surname, age, salary or shool name to find a teacher:");
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
        return (Config.teachers[i].getId().toString().contains(key) ||
                Config.teachers[i].getName().contains(key) ||
                Config.teachers[i].getSurname().contains(key) ||
                Config.teachers[i].getAge().toString().contains(key) ||
                Config.teachers[i].getSalary().toString().contains(key) ||
                Config.teachers[i].getSchoolName().contains(key));
    }
}
