package com.example.EmployeeBossAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeBossService {

    @Autowired
    EmployeeBossRepository employeeBossRepository;

    // POSt - Add employee
    public String addEmployee(Employee employee){
        return employeeBossRepository.addEmployee(employee);
    }

    //POST - Add bosses
    public String addBoss(Boss boss){
        return employeeBossRepository.addBoss(boss);
    }

    // GET - get employee who are under a given age and have rating greater than X

    public List<Employee> getEmployee(int age, int rating){
        return employeeBossRepository.getEmployee(age, rating);
    }

    // PUT - update all the boss salary of the boss by x whose rating is greater than Y.

    public String updateBosses(int x,int y){
        return employeeBossRepository.updateBosses(x,y);
    }

    // GET - find out all count of the employee who's bossRating and employee rating grater than X.

    public int countEmployee(int x){
        return employeeBossRepository.countEmployee(x);
    }


}
