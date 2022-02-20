package org.AnilCan.employeeManagement.DAO;
import org.AnilCan.employeeManagement.Entities.department;

import java.util.List;

public interface IDepartmentDAO {

    List<department> getAllData();

    void add(department dep);

    void update(department dep);

    void delete(department dep);

    department getByID(int id);

}
