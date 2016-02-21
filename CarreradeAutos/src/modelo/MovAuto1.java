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
    int movAuto1;
    @Override
    public void run(){
        while(Juego.Auto1.getLocation().x<650){
            movAuto1=(int) (Math.random()*4+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto1.setLocation(Juego.Auto1.getLocation().x+movAuto1, Juego.Auto1.getLocation().y);
        }
        Juego.puesto++;
        String texto=Juego.Pizarra.getText()+"Puesto #"+Juego.puesto+" es: \n \t"+this.getName()+"\n\n";
        Juego.Pizarra.setText(texto);

    }
    
}
