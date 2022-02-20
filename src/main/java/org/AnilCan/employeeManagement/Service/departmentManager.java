package org.AnilCan.employeeManagement.Service;

import org.AnilCan.employeeManagement.DAO.IDepartmentDAO;
import org.AnilCan.employeeManagement.Entities.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class departmentManager implements IDepartmentService{


    private IDepartmentDAO departmentDAO;

    @Autowired
    public departmentManager(IDepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }

    @Transactional
    @Override
    public List<department> getAllData() {
        return this.departmentDAO.getAllData();
    }

    @Transactional
    @Override
    public void add(department dep) {
        this.departmentDAO.add(dep);
    }

    @Transactional
    @Override
    public void update(department dep) {
        this.departmentDAO.update(dep);
    }

    @Transactional
    @Override
    public void delete(department dep) {
        this.departmentDAO.delete(dep);
    }

    @Transactional
    @Override
    public department getByID(int id) {
        return this.departmentDAO.getByID(id);
    }
}
