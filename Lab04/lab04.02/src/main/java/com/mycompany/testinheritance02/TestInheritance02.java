package com.mycompany.testinheritance02;
public class TestInheritance02 
{

    public static void main(String[] args)
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 
    }


    }

