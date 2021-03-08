package bean;

import bean.Human;

public class Student extends Human {

    private Double scholarship;

    public Student(Integer id, String name, String surname, Integer age, String schoolName, Double scholarship) {
        super(id, name, surname, age, schoolName);
        this.scholarship = scholarship;
    }

    public Double getScholarship() {
        return scholarship;
    }

    public void setScholarship(Double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "\nStudent id: " + getId() + "\nStudent name: " + getName() + "\nStudent surname: " + getSurname() +
                "\nStudent age: " + getAge() + "\nStudent scholarship: " + getScholarship() + "\nStudent shool name: " + getSchoolName() + "\n";
    }
}
