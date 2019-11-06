package entity;

import javax.persistence.*;

@Entity
public class Spouse {

    @Id
    private String id;
    private String name;
    @Column(name = "contact_no")
    private String contactNo;
    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    public Spouse() {
    }

    public Spouse(String id, String name, String contactNo, Employee employee) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Spouse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", employeeId='" + employee + '\'' +
                '}';
    }
}
