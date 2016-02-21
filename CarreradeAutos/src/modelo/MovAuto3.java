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
public class MovAuto3 extends Thread{
    int movAuto3;
    @Override
    public void run(){
        while(Juego.Auto3.getLocation().x<650){
            movAuto3=(int) (Math.random()*4+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto3.setLocation(Juego.Auto3.getLocation().x+movAuto3, Juego.Auto3.getLocation().y);
        }
        Juego.puesto++;
        String texto=Juego.Pizarra.getText()+"Puesto #"+Juego.puesto+" es: \n \t"+this.getName()+"\n\n";
        Juego.Pizarra.setText(texto);

    }
    
}
