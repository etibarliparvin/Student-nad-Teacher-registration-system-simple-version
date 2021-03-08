package bean;

public class Human {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String schoolName;

    public Human(Integer id, String name, String surname, Integer age, String schoolName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
