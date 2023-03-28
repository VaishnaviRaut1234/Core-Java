package com.wrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    Integer salary;
   // Date JoiningDate;
 
    public Employee() {
    }
 
    public Employee(String n, Integer f) {
           name = n;
           salary = f;
           
    }
 
    public String toString() {
           return "\n name=" + name + ",salary=" + salary;
    }
 
    public int compareTo(Employee o) {
           return  (this.salary.compareTo(o.salary));
    }
}
 
public class EmployeeTest {
 
    public static void main(String[] args) {
 
           Employee emp1 = new Employee("ank", 2000);
           Employee emp2 = new Employee("dav", 500);
           Employee emp3 = new Employee("ank", 1000);
           Employee emp4 = new Employee("sam", 9000);
           Employee emp5 = new Employee("ank", 1000);
 
           List<Employee> l = new ArrayList<Employee>();
           l.add(emp1);
           l.add(emp2);
           l.add(emp3);
           l.add(emp4);
           l.add(emp5);
 
           Collections.sort(l); // SORT
 
           System.out.println(l); // Display list
 
    }
 
}