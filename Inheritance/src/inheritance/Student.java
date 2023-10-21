/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author student
 */
public class Student extends Person {
    private int SID;
    private double GPA;
    
    /**
     *
     * @param n
     * @param a
     * @param s
     * @param g
     */
    public Student(String n, int a, int s, double g) {
//        this.name = n;
//        this.age = a;
        
        super(n,a);
        SID = s;
        GPA = g;
    }
    
    public int getId(){return SID;}
    public double salry() {return 1000;}
    
 
    public void display() {
        super.display();
        System.out.println("Student ID = " + SID + "; GPA = " + GPA);
    }

}
