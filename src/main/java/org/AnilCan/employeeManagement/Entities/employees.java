package org.AnilCan.employeeManagement.Entities;


import org.AnilCan.employeeManagement.DAO.IEmployeesDAO;


import javax.persistence.*;
import java.util.List;

//annotation bazlı injection
@Entity
@Table(name="employees")//Hibernate ile verileri nesnelerle mapleme
public class employees implements IEmployeesDAO {

    //default empty constructor for hibernate
    public employees(){ }


    //Hibernate ile verileri nesnelerle mapleme
    @Id
    @Column(name="emp_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="emp_name")
    private String name;

    @Column(name = "emp_lastname")//camel casing kullanınca doğru çalışmıyor.
    private String lastName;

    @Column(name="mail")
    private String mail;

    @Column(name="phone")
    private String phone;

    @Column(name="salary")
    private int salary;

    @Column(name="manager_id")
    private int manager_id;

    @Column(name="dep_id")
    private int dep_id;



    //Consturctor injection
    public employees(int id, int salary, int manager_id, int dep_id, String name, String lastName, String mail, String phone) {
        this.id = id;
        this.salary = salary;
        this.manager_id = manager_id;
        this.dep_id = dep_id;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.phone = phone;
    }

//getters and setters
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }



    @Override
    public List<employees> getAllData() {
        return null;
    }

    @Override
    public void add(employees emp) {

    }

    @Override
    public void update(employees emp) {

    }

    @Override
    public void delete(employees emp) {

    }

    @Override
    public employees getByID(int id) {
        return null;
    }

}
