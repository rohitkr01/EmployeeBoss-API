package com.example.EmployeeBossAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeBossController {

    @Autowired
    EmployeeBossService employeeBossService;

    // POSt - Add employee
    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeBossService.addEmployee(employee);
    }

    //POST - Add bosses
    @PostMapping("/add-boss")
    public String addBoss(@RequestBody Boss boss){
        return employeeBossService.addBoss(boss);
    }

    // GET - get employee who are under a given age and have rating greater than X
    @GetMapping("/get-employee")
    public List<Employee> getEmployee(@RequestParam int age, @RequestParam int rating){
        return employeeBossService.getEmployee(age, rating);
    }

    // PUT - update all the boss salary of the boss by x whose rating is greater than Y.
    @PutMapping("/update-Bosses/{salary}/{rating}")
    public String updateBosses(@PathVariable("salary") int x,@PathVariable("rating") int y){
        return employeeBossService.updateBosses(x,y);
    }

    // GET - find out all count of the employee who's bossRating and employee rating grater than X.
    @GetMapping("/count-employee-by-rating")
    public int countEmployee(@RequestParam("rating") int x){
        return employeeBossService.countEmployee(x);
    }

}
