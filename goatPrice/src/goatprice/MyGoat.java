/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goatprice;

/**
 *
 * @author mashrur
 */
public class MyGoat {
    private double weight;
    private int age;
    double max = 0;
    
    public MyGoat(){
        weight=0;
        age=0;
    }
    public MyGoat(double w, int a) {
        weight = w;
        age=a;
    }
    
    public double Price(double c, double d ){
        return Math.pow(weight, c) + (d * age);
    }
    
    
    public static int myfun (MyGoat []g, double []c, double []d){
        double x1, x = g[0].Price(c[0], d[0]);
        int idx =0;
        
        for( int i=1; i<g.length; i++){
            x1= g[i].Price(c[i], d[i]);
            if(x1> x) {
                x = x1;
                idx = i;
            }
        }
        return idx;
    }

}
