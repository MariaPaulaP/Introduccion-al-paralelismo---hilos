/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */


public class CountThread extends Thread {
    private int min=0;
    private int max=0;
    public CountThread(int a, int b){
        min=a;
        max=b;
        
    }
                public void run() {
        for (int i = min; i < max; i++) {
            System.out.println(i);
        }
            }

}
