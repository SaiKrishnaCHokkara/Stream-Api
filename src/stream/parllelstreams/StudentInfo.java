package stream.parllelstreams;

public class StudentInfo {
    private int id;

    private String name;

    private long phNo;

    private String department;

    public StudentInfo(int id, String name, long phNo, String department) {
        this.id = id;
        this.name = name;
        this.phNo = phNo;
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

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phNo=" + phNo +
                ", department='" + department + '\'' +
                '}';
    }
}
