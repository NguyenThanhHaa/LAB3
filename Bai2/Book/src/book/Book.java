/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

/**
 *
 * @author thanh ha
 */
public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() 
    {
        this.boCode = null;
        this.boTitle = null;
        this.boAuthor = null;
    }

    public Book(String boCode, String boTitle, String boAuthor) 
    {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book bo) 
    {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() 
    {
        return this.boCode;
    }

    public String getBoTitle() 
    {
        return this.boTitle;
    }

    public String getBoAuthor() 
    {
        return this.boAuthor;
    }

    public void setBoCode(String code) 
    {
        this.boCode = code;
    }

    public void setBoTitle(String title) 
    {
        this.boTitle = title;
    }

    public void setBoAuthor(String authorname) 
    {
        this.boAuthor = authorname;
    }
    
    public String toString() 
    {
        return "{" + " boCode='" + getBoCode() + "'" + ", boTitle='" + getBoTitle() + "'" + ", boAuthor='" + getBoAuthor() + "'" + "}";
    }
    
}
