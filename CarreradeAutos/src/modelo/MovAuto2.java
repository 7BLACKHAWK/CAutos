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
    int movAuto2;    
    @Override
    public void run(){
        while(Juego.Auto2.getLocation().x<650){
            movAuto2=(int) (Math.random()*4+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto2.setLocation(Juego.Auto2.getLocation().x+movAuto2, Juego.Auto2.getLocation().y);
        }
        Juego.puesto++;
        String texto=Juego.Pizarra.getText()+"Puesto #"+Juego.puesto+" es: \n \t"+this.getName()+"\n\n";
        Juego.Pizarra.setText(texto);

    }
    
}
