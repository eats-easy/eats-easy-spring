package eatseasyspring.eatseasyspring.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @SequenceGenerator(name = "employees_employee_id_gen", sequenceName = "employees_employee_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employees_employee_id_gen")
    @Column(name = "employee_id")
    private int employeeId;

    //@ManyToOne
    @JoinColumn(name = "rest_id")
    private int restId;

    //@ManyToOne
    @JoinColumn(name = "user_id")
    private int userId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}