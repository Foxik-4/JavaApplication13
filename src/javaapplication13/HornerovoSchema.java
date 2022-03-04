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
public class HornerovoSchema {
    public static void main(String[] args){
        float x = 3;
        int[] kofs = {1, 2, 1, 2, 1};
        int l = kofs.length;
        
        float b = 0;
        for (int i = 0; i < l - 1; i++) {
            b = kofs[i] + b*x;
        }
         b += kofs[l-1];
         
        System.out.println(b);
    }
}
