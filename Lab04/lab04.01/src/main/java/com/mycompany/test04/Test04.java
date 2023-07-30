package com.mycompany.test04;
public class Test04 {

    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        e1.setEmpid(12345);
        System.out.println("Employee id: "+e1.getEmpid());
        e1.setEmpN("Mr.Bogdan");
        System.out.println("Employee name is: "+e1.getEmpN());
        e1.setEmpDes("CEO");
        System.out.println("Employee name is: "+e1.getEmpDes());
        
        System.out.println();
        
        Employee e2=new Employee();
        e2.setEmpid(6789);
        System.out.println("Employee id: "+e2.getEmpid());
        e2.setEmpN("Ms.Bird");
        System.out.println("Employee name is: "+e2.getEmpN());
        e2.setEmpDes("Manager");
        System.out.println("Employee name is: "+e2.getEmpDes());
       
    }
}
