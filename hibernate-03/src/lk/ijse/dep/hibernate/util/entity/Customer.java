package lk.ijse.dep.hibernate.util.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @Column(name = "customerId")
    private String id;

    private String name;

    private String address;

    @Temporal(TemporalType.DATE)
    @Column(name = "contact_date")
    private Date contactedDate;

    public Customer() {
    }

    public Customer(String id, String name, String address, Date contactedDate) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setContactedDate(contactedDate);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getContactedDate() {
        return contactedDate;
    }

    public void setContactedDate(Date contactedDate) {
        this.contactedDate = contactedDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactedDate=" + contactedDate +
                '}';
    }
}
