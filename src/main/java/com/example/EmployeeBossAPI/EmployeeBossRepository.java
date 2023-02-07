package com.example.EmployeeBossAPI;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeBossRepository {

    List<Employee> employeesList = new ArrayList<>();
    List<Boss> bossesList =  new ArrayList<>();

    // POSt - Add employee
    public String addEmployee(Employee employee){
        if(employeesList.contains(employee)){
            return "Employee Already in Database";
        }
        employeesList.add(employee);
        return "Employee added successfully";
    }

    //POST - Add bosses
    public String addBoss(Boss boss){
        if(bossesList.contains(boss)){
            return "Boss Already in Database";
        }
        bossesList.add(boss);
        return  "Boss added successfully";
    }


    // GET - get employee who are under a given age and have rating greater than X

    public List<Employee> getEmployee(int age, int rating){
        List<Employee> allRequiredEmployee = new ArrayList<>();
        for(Employee employee : employeesList){
            if(employee.getAge() < age && employee.getRating() > rating){
                allRequiredEmployee.add(employee);
            }
        }
        return allRequiredEmployee;
    }

    // PUT - update all the boss salary of the boss by x whose rating is greater than Y.

    public String updateBosses(int x,int y){
        for(Boss boss : bossesList){
            if(boss.getRating() > y){
                int currSalary = boss.getSalary();
                boss.setSalary(currSalary+x);
            }
        }
        return "Boss salary updated";
    }


    // GET - find out all count of the employee who's bossRating and employee rating grater than X.

    public int countEmployee(int x){
        int count =0;
        for(Employee employee : employeesList){
            for(Boss boss : bossesList){
                if(employee.getRating() > x && boss.getRating()>x){
                    count++;
                }
            }
        }
        return count;
    }

}
