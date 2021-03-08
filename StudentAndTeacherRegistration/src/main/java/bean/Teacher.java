package bean;

public class Teacher extends Human {

    private Double salary;

    public Teacher(Integer id, String name, String surname, Integer age, String schoolName, Double salary) {
        super(id, name, surname, age, schoolName);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nTeacher id: " + getId() + "\nTeacher name: " + getName() + "\nTeacher surname: " + getSurname() +
                "\nTeacher age: " + getAge() + "\nTeacher salary: " + getSalary() + "\nTeacher shool name: " + getSchoolName() + "\n";
    }
}
