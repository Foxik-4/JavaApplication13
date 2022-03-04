/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author 2020-e-liska
 */
public class E2XApprox {
    public static void main(String[] args) {
        int x = 1;
        
        float en = 1;
        float last = 1;
        
        for (int i = 1; i <= 10; i++) {
            last *= (float) x / i;
            en += last;
        }
        
        System.out.println(en);
    }
}
