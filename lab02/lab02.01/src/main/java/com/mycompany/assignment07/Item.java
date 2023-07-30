package com.mycompany.assignment07;
public class Item
{
    private int loc;
    private String descrip;
    
    public Item(int loc,String descrip)
    {
        this.loc=loc;
        this.descrip=descrip;
    }
    public void setLocation(int loc)
    {
        this.loc=loc;
    }
    public int getLocation()
    {
        return loc;
    }
    public void setDescription(String descrip)
    {
        this.descrip=descrip;
    }
    public String getDescription()
    {
        return descrip;
    }
    
    
}
