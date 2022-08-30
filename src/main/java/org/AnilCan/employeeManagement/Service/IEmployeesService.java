package org.AnilCan.employeeManagement.Service;

import org.AnilCan.employeeManagement.Entities.employees;

import java.util.List;

public interface IEmployeesService {

    List<employees> getAllData();

    void add(employees emp);

    void update(employees emp);

    void delete(employees emp);

    employees getByID(int id);
    
}
