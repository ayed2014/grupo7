package Pila;

/**
 * Created with IntelliJ IDEA.
 * User: Facundo Bertolosso
 * Date: 14/03/14
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
public interface Pila {
    public void apilar(Object a);
    public void desapilar();
    public Object verTope();
    public int getTope();
}
