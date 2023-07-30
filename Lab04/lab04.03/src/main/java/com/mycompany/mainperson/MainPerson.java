package com.mycompany.mainperson;
public class MainPerson 
{

    public static void main(String[] args)
    {
        Lecturer l=new Lecturer("Brane",123,"Java");
        System.out.println("Lecturer name: "+l.getName());
        System.out.println("Lecturer id: "+l.getID());
        System.out.println("Lecturer Programme "+l.getProgramme());
        
        System.out.println();
        
        Student s=new Student("Anne",35367,"Computer Science");
        System.out.println("Student name: "+s.getName());
        System.out.println("Student id: "+s.getID());
        System.out.println("Student Course: "+s.getCourse());
    }
}
