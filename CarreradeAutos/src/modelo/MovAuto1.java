/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Vista.Juego;

/**
 *
 * @author Marvin
 */
public class MovAuto1 extends Thread{
    
    @Override
    public void run(){
        int movimiento1;
        while(Juego.Auto1.getLocation().x<1067){
            movimiento1=(int) (Math.random()*5+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto1.setLocation(Juego.fram.Auto1.getLocation().x+movimiento1, Juego.fram.Auto1.getLocation().y);
        }
        Juego.fram.puesto++;
        String texto=Juego.fram.RGanadores.getText()+Juego.fram.puesto+". "+this.getName()+"\n";
        Juego.fram.RGanadores.setText(texto);

    }
    
}
