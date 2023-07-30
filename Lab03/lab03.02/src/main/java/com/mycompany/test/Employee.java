package com.mycompany.test;
public class Employee
{
    private String name;
    private float salary;
    private float bonus;
    private float Bamount;
    
    public Employee(String name,float salary,float bonus)
    {
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;
        Bamount=salary+bonus;
        
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    public float getBonus()
    {
        return bonus;
    }
    public void setBonus(float bonus)
    {
        this.bonus=bonus;
    }
    
    public void displayBamount()
    {
        System.out.println("Bonus amount is: "+Bamount);
    }
}
