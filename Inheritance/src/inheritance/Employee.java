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
public class Employee extends Person {
    private int EID;
    public Employee (String n, int a, int e) {
        super(n,a);
        EID = e;
    }
    
    public int getID() {return EID;}
    public int getSalary() {return 1000;}
    
    public void display() {
        super.display();
        System.out.println("Employee ID = " + EID);
    }
    
}
