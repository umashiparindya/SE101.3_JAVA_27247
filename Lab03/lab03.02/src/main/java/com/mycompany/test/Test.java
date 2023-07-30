package com.mycompany.test;
public class Test 
{
    public static void main(String[] args) 
    {
        Employee e=new Employee("Bogdan",50000.00f,10000.00f);
        System.out.println("Name is: "+e.getName());
        System.out.println("Salary is: "+e.getSalary());
        System.out.println("Bonus is: "+e.getBonus());
        e.displayBamount();
    }
}
