package Pila;

import Pila.PilaE;

import java.util.Random;



/**
 * Created with IntelliJ IDEA.
 * User: Facundo Bertolosso
 * Date: 14/03/14
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public class Tester {
    public void main(String[] args){
        Pila miPila = new PilaE();
        Pila miPila2 = new PilaE();
        Pila miPla3 = new PilaE();
        Random rn = new Random();
        for(int i = 0; i < 5 ; i++){
            int a = rn.nextInt(50);
            miPila.apilar(a);
            int b = rn.nextInt(50);
            miPila2.apilar(b);
        }
        int tope1 = miPila.getTope();
        int tope2 = miPila2.getTope();
         for(int i = 0; i<5;i++){
        miPla3.apilar(miPila.verTope());
        miPila.desapilar();
        tope1 = miPila.getTope();
        miPla3.apilar(miPila2.verTope());
        miPila2.desapilar();
        tope2 = miPila2.getTope();
         }
        Pila miPila4 = new PilaE();
        int tope3 = miPla3.getTope();
        for(int a = 0; a== tope3; a++){
            miPila4.apilar(miPla3.verTope());
            miPla3.desapilar();
        }
        for(int b = 0;b==tope3;b++){
            System.out.println(miPila4.verTope());
            miPila4.desapilar();
        }

    }


}
