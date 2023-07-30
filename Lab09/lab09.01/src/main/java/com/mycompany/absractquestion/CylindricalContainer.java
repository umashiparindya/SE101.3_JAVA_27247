package com.mycompany.absractquestion;
public class CylindricalContainer extends Container
{
     private double height,radius;
    
    public CylindricalContainer(double h,double r)
    {
        height=h;
        radius=r;
    }
    public double volume()
    {
        return 3.1459f*radius*radius*height;
    }
}
