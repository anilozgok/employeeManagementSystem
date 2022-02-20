package org.AnilCan.employeeManagement.api;

import org.AnilCan.employeeManagement.Entities.department;
import org.AnilCan.employeeManagement.Service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depAPI")
public class departmentController {

    private IDepartmentService departmentService;

    @Autowired
    public departmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/department")
    public List<department> get(){
        return this.departmentService.getAllData();
    }

    @PostMapping("/add")
    public void add(@RequestBody department dep){
        this.departmentService.add(dep);
    }

    @PostMapping("/update")
    public void update(@RequestBody department dep){
        this.departmentService.update(dep);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody department dep){
        this.departmentService.delete(dep);
    }

    @GetMapping("/department/{id}")
    public department getByID(@PathVariable int id){
        return this.departmentService.getByID(id);
    }

}
