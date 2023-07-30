package com.mycompany.assignment07;
public class Assignment07 
{

    public static void main(String[] args) 
    {
        Item i1=new Item(25,"Colombo");
        System.out.println("Location is: "+i1.getLocation()+" Description: "+i1.getDescription());
        
        Monster m1=new Monster(35,"Rathnapura");
        System.out.println("Location is: "+m1.getLocation()+ " Description: "+m1.getDescription());
    }
}
