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
    public static String ganadores;
    public static boolean termine1=true;
    public static boolean termine2=true;
    public static boolean termine3=true;
    
    
    public void cab1(){
        int movimiento1;
        while(Juego.Auto1.getLocation().x<1000){
            movimiento1=(int) (Math.random()*5+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto1.setLocation(Juego.Auto1.getLocation().x+movimiento1, Juego.Auto1.getLocation().y);
        }
    }
    public void cab2(){
        int movimiento1;
        while(Juego.Auto2.getLocation().x<1000){
            movimiento1=(int) (Math.random()*5+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto2.setLocation(Juego.Auto2.getLocation().x+movimiento1, Juego.Auto2.getLocation().y);
        }
    }
    public void cab3(){
        int movimiento1;
        while(Juego.Auto3.getLocation().x<1000){
            movimiento1=(int) (Math.random()*5+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            Juego.Auto3.setLocation(Juego.Auto3.getLocation().x+movimiento1, Juego.Auto3.getLocation().y);
        }
        
    }
    
}
