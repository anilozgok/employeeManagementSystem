package org.AnilCan.employeeManagement.DAO;

import org.AnilCan.employeeManagement.Entities.employees;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateEmployeesDAO implements IEmployeesDAO{

    private EntityManager entityManager;

    @Autowired
    public HibernateEmployeesDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<employees> getAllData() {
        Session session=entityManager.unwrap(Session.class);
        List<employees> emp=session.createQuery("from employees",employees.class).getResultList();
        return emp;
    }

    @Transactional
    @Override
    public void add(employees emp) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(emp);
    }

    @Transactional
    @Override
    public void update(employees emp) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(emp);
    }

    @Transactional
    @Override
    public void delete(employees emp) {
        Session session=entityManager.unwrap(Session.class);
        employees empDel=session.get(employees.class,emp.getId());
        session.delete(empDel);
    }

    @Override
    public employees getByID(int id) {
        Session session=entityManager.unwrap(Session.class);
        employees emp=session.get(employees.class,id);
        return emp;
    }
}
