package com.mycompany.practical03one;
public class Practical03one 
{

    public static void main(String[] args) 
    {
        Employee e=new Employee("Brane",25,10000.00F);
        e.setName("Anne");
        System.out.println("Name is: "+e.getName());
        e.setAge(22);
        System.out.println("Age is: "+e.getAge());
        e.setSalary(20000.00f);
        System.out.println("Salary is: "+e.getSalary());
        
    }
}
