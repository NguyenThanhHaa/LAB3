/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package square;

/**
 *
 * @author thanh ha
 */
public class Square {
    private double a;

    public Square() 
    {
        this.a = 0;
    }

    public Square(double a) 
    {
        this.a = a;
    }

    public double getCanh() 
    {
        return this.a;
    }

    public void setCanh(double a) 
    {
        this.a = a;
    }

    public double DienTich() 
    {
        return this.a * this.a;
    }

    public double ChuVi() 
    {
        return 4 * this.a;
    }
    
}
