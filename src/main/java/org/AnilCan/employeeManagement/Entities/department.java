package org.AnilCan.employeeManagement.Entities;

import org.AnilCan.employeeManagement.DAO.IDepartmentDAO;


import javax.persistence.*;
import java.util.List;

//annotation bazlı injection
@Entity
@Table(name="department")
public class department implements IDepartmentDAO {

    //default empty constructor for hibernate
    public department(){

    }

    @Id
    @Column(name="dep_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="dep_name")
    private String name;

    //Consturctor injection
    public department(int id, String name) {
        this.id = id;
        this.name = name;
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

    /**
     * Returns a List of department that holds data from department table.
     * @return A List of deparment
     */
    @Override
    public List<department> getAllData() {
        return null;
    }

    //unit of work design patterninin uygulanması
    @Override
    public void add(department dep) {

    }

    @Override
    public void update(department dep) {

    }

    @Override
    public void delete(department dep) {

    }

    @Override
    public department getByID(int id) {
        return null;
    }
}
