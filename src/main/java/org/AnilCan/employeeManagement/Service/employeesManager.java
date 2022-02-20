package org.AnilCan.employeeManagement.Service;

import org.AnilCan.employeeManagement.DAO.IEmployeesDAO;
import org.AnilCan.employeeManagement.Entities.employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class employeesManager implements  IEmployeesService{

    private IEmployeesDAO employeesDAO;

    @Autowired
    public employeesManager(IEmployeesDAO employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

    @Transactional
    @Override
    public List<employees> getAllData() {
        return this.employeesDAO.getAllData();
    }

    @Transactional
    @Override
    public void add(employees emp) {
        this.employeesDAO.add(emp);
    }

    @Transactional
    @Override
    public void update(employees emp) {
        this.employeesDAO.update(emp);
    }

    @Transactional
    @Override
    public void delete(employees emp) {
        this.employeesDAO.delete(emp);
    }

    @Transactional
    @Override
    public employees getByID(int id) {
        return this.employeesDAO.getByID(id);
    }
}
