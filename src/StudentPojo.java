public class StudentPojo {
    private int rollno;
    private String name;
    private int age;
    private String email;

    public StudentPojo() {

    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public StudentPojo(int rollno, String name, int age, String email) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
