/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Vista.Juego;
import static java.lang.Thread.sleep;

/**
 *
 * @author Marvin
 */
public class MovAuto2 extends Thread{
    
    @Override
    public void run(){
        int movimiento1;
        while(Juego.Auto2.getLocation().x<650){
            movimiento1=(int) (Math.random()*5+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto2.setLocation(Juego.Auto2.getLocation().x+movimiento1, Juego.Auto2.getLocation().y);
        }
        Juego.puesto++;
        String texto=Juego.RGanadores.getText()+Juego.puesto+". "+this.getName()+"\n";
        Juego.RGanadores.setText(texto);

    }
    
}
