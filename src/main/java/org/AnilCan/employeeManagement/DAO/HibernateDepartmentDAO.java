package org.AnilCan.employeeManagement.DAO;

import org.AnilCan.employeeManagement.Entities.department;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateDepartmentDAO implements IDepartmentDAO{

    private EntityManager entityManager;

    @Autowired
    public HibernateDepartmentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Transactional//beginTransaction ve endTransaction kodlarını otomatik olarak enjekte eder.
    @Override
    public List<department> getAllData() {
        Session session=entityManager.unwrap(Session.class);
        List<department> dep=session.createQuery("from department",department.class).getResultList();
        return dep;
    }

    @Override
    public void add(department dep) {
        Session session=entityManager.unwrap(Session.class);
        session.save(dep);
    }

    @Override
    public void update(department dep) {

        Session session=entityManager.unwrap(Session.class);
        session.update(dep);
    }

    @Override
    public void delete(department dep) {
        Session session=entityManager.unwrap(Session.class);
        department depDel=session.get(department.class,dep.getId());
        session.delete(depDel);
    }

    @Override
    public department getByID(int id) {
        Session session=entityManager.unwrap(Session.class);
        department dep=session.get(department.class,id);
        return dep;
    }
}
