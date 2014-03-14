package Pila;

import Pila.Pila;

/**
 * Created with IntelliJ IDEA.
 * User: Facundo Bertolosso
 * Date: 14/03/14
 * Time: 13:51
 * To change this template use File | Settings | File Templates.
 */
public class PilaE implements Pila {
    private int tope = 0;
    private Object[] arreglo;
    public PilaE(){
        arreglo = new Object[10];
    }

    public void apilar(Object a){
        if(tope < arreglo.length){
            arreglo[tope] = a;
            tope++;
        }
        else{
            crearArreglo();

        }


    }
    private void crearArreglo(){
        Object[] arreglo2 = new Object[arreglo.length + 10];
        for(int i=0;i<arreglo.length;i++){
            arreglo2[i] = arreglo[i];
        }
        arreglo = arreglo2;
    }
    public void desapilar(){
        tope--;
    }
    public Object verTope(){
        return arreglo[tope];

    }
    public int getTope(){
        return tope;
    }
}
