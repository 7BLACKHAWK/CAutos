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
public class Autos extends Thread{
    int movAuto1; 
    int movAuto2;
    int movAuto3;
    
    public void runAuto1(){
        while(Juego.Auto1.getLocation().x<650){
            movAuto1=(int) (Math.random()*4+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto1.setLocation(Juego.Auto1.getLocation().x+movAuto1, Juego.Auto1.getLocation().y);
        }
    }
    public void runAuto2(){
        while(Juego.Auto2.getLocation().x<650){
            movAuto2=(int) (Math.random()*4+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto2.setLocation(Juego.Auto2.getLocation().x+movAuto2, Juego.Auto2.getLocation().y);
        }
    }
    public void runAuto3(){
        while(Juego.Auto3.getLocation().x<650){
            movAuto3=(int) (Math.random()*4+1);
            try {
                sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto3.setLocation(Juego.Auto3.getLocation().x+movAuto3, Juego.Auto3.getLocation().y);
        }
    }
}
