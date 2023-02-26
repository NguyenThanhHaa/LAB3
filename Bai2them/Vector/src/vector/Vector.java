/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

/**
 *
 * @author thanh ha
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() 
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector(double x, double y, double z) 
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() 
    {
        return this.x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public double getY() 
    {
        return this.y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    public double getZ() 
    {
        return this.z;
    }

    public void setZ(double z) 
    {
        this.z = z;
    }

    public Vector Cong(Vector i) 
    {
        double newx = this.x + i.x;
        double newy = this.y + i.y;
        double newz = this.z + i.z;
        return new Vector(newx, newy, newz);
    }

    public Vector Tru(Vector i) 
    {
        double newx = this.x - i.x;
        double newy = this.y - i.y;
        double newz = this.z - i.z;
        return new Vector(newx, newy, newz);
    }

    public Vector NhanHangSo(double i) 
    {
        double newx = this.x * i;
        double newy = this.y * i;
        double newz = this.z * i;
        return new Vector(newx, newy, newz);
    }


    public String toString() 
    {
        return "{" + " x='" + getX() + "'" + ", y='" + getY() + "'" + ", z='" + getZ() + "'" + "}";
    }
    
}
