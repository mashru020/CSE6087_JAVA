/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriescalculation;

/**
 *
 * @author mashru
 */
public class CosCalculate {
    private double x;
    private int n;
    
    public void setX (double x) {
        this.x=x;
    }
    
    public void setN (int n) {
        this.n = n;
    }
    private double calcResult = 0;
    public double getCosResult(){
        for(int i = 0 ; i < this.n ; i++) {
            this.calcResult = this.calcResult + f1(this.n)* f2(this.n,this.x);
        }
        
        return calcResult;
    }
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
    
    public static double f1 (int n) {
        return calculateFactorial(2*n)/ (Math.pow((Math.pow(2, n)* calculateFactorial(n)), 2) * (2*n + 1));     
    }
    public static double f2 (int n , double x) {
        return 1/Math.pow(x, (2 * n) + 1);
    }
    
}
