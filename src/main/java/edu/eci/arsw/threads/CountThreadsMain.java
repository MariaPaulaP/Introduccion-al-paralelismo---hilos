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
public class CountThreadsMain {

    public static void main(String a[]) {
        CountThread mt1 = new CountThread(0, 9999);
        CountThread mt2 = new CountThread(10000, 19999);
        CountThread mt3 = new CountThread(20000, 29999);

        //ejecucion por el metodo start()
        //mt1.start();
        //mt2.start();
        //mt3.start();

        //ejecucion por el metodo run()
        mt1.run();
        mt2.run();
        mt3.run();

    }

}
