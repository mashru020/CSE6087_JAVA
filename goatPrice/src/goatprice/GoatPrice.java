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
public class GoatPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] weight = {3.15, 10.5, 3.9, 2.1, 20.3};
        int[] age = {1,2,1,1,4};
        double[] c = {2.5,1.5,3.9, 1.2, 4.5};
        double[] d = {2.9, 1.7, 2.5, 1.3, 2.9};
        double[] price = new double[5];
        
        
        MyGoat g = new MyGoat();
        for(int i = 0; i < 5; i ++ ){
            g.setAge(age[i]);
            g.setWeight(weight[i]);
            price[i]= g.price(c[i],d[i]);
        } 
        
        g.max();
        
   
        
        
    }
    
}
