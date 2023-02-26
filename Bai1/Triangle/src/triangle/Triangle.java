/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle;

/**
 *
 * @author thanh ha
 */
public class Triangle {
    private width;
    private height;
    
    public Triangle()
    {
        this.width = 0.0f;
        this.height = 0.0f;
    }
    
    public Triangle(float width, float height)
    {
        this.width = width;
        this.height = height;
    }
    
    public float getWidth()
    {
        return getWidth;
    }
    
    public float getHeight()
    {
        return getHeight;
    }
    
    public void setWidth (float width)
    {
        this.width = width;
    }
    
    public void setHeight (float height)
    {
        this.height = height;
    }
    
    public String toString()
    {
        return "[" + "width='" + getWidth() + "'" + "," +"height='" + getHeight + "'" + "]";
    }
   
}
