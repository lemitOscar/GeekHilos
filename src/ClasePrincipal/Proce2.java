/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

/**
 *
 * @author Jesslim
 */
//es como si fuera una interfaz
public class Proce2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0+1; i <= 5; i++) {
            System.out.println("proceso 2");
        }
    }
    
}
