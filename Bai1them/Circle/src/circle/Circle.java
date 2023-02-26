/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author thanh ha
 */

import java.lang.Math;

public class Circle {
    private double r;
    public Circle() 
    {
        this.r = 0;
    }

    public Circle(double r) 
    {
        this.r = r;
    }

    public void setR(double r) 
    {
        this.r = r;
    }

    public double getR() 
    {
        return this.r;
    }

    public double DienTich() 
    {
        return Math.PI * this.r * this.r;
    }

    public double ChuVi() 
    {
        return 2 * Math.PI * this.r;
    }
    
    public String toString() 
    {
        return "{" + " r='" + getR() + "'" + "}";
    }
    
   
}
