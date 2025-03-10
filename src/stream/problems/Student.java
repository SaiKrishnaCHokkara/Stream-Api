package stream.problems;

public class Student {


    private int id;

    private String name;

    private int rollNo;

    private String department;

    public Student(int id, String name, int rollNo, String department) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                '}';
    }
}
