/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructuresss;

import java.util.Scanner;

/**
 *
 * @author 2020-e-liska
 */
public class LinkedListtt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in;
        
        NodeLL root = new NodeLL();
        NodeLL activeN = root;
        
        while(true) {
            in = sc.nextInt();
            if(in == 0)break;
            activeN.value = in;
            activeN.linkdNode = new NodeLL();
            activeN = activeN.linkdNode;
        }
        
        activeN = root;
        do{
            System.out.print(activeN);
            activeN = activeN.linkdNode;
        }while(activeN.linkdNode != null);
        
        System.out.print("0 ");
    }
}
