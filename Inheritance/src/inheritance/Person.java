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
public abstract class Person {
    protected String name;
    protected int age;
    
    public Person(){
        this.name="";
        this.age=0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public int getId(){return -1;}
    public void display() {
        System.out.println("Name = " + name + "; Age = " + age);
    }
}
