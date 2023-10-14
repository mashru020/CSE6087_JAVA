/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goatprice;

/**
 *
 * @author student
 */
public class MyGoat {
    private double weight;
    private int age;
     double max = 0;
    
    public void setWeight (double weight){ this.weight = weight;}
    public void setAge (int age) {this.age = age;}
    
    public double price(double c, double d) {
        double p = Math.pow(weight, c) + (d * age);
        if (p > max) {
            max = p;
        }
        return p;
    }
    
    public void max() {
       System.out.println("Maximum Price :" + max );
    } 
}
