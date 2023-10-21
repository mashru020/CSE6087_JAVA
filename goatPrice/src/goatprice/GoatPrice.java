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
        
        MyGoat g[];
        
        g = new MyGoat[5];
        // TODO code application logic here
        double[] w = {3.15, 10.5, 3.9, 2.1, 20.3};
        int[] a = {1,2,1,1,4};
        double[] c = {2.5,1.5,3.9, 1.2, 4.5};
        double[] d = {2.9, 1.7, 2.5, 1.3, 2.9};
     
        for(int i =0; i<w.length; i++ ){
            g[i] = new MyGoat(w[i], a[i]);
        }
        
        int maxl = MyGoat.myfun(g,c,d);
        double mprice = g[maxl].Price(c[maxl], d[maxl]);
        System.out.println( maxl+"th got have the maximum price:" + mprice );
    }
    


}
