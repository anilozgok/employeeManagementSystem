package org.AnilCan.employeeManagement.api;

import org.AnilCan.employeeManagement.Entities.employees;
import org.AnilCan.employeeManagement.Service.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empAPI")
public class employeesController {

    private IEmployeesService employeesService;

    @Autowired
    public employeesController(IEmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/employees")
    public List<employees> get(){
        return employeesService.getAllData();
    }

    @PostMapping("/add")
    public void add(@RequestBody employees emp){
        this.employeesService.add(emp);
    }

    @PostMapping("/update")
    public void update(@RequestBody employees emp){
        this.employeesService.update(emp);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody employees emp){
        this.employeesService.delete(emp);
    }

    @GetMapping("/employees/{id}")
    public employees getByID(@PathVariable int id){
        return this.employeesService.getByID(id);
    }
}
