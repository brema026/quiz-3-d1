package Datos1.arbolBinario;

public class NodoArbol {
    public NodoArbol padre;
    public NodoArbol izquierda;
    public NodoArbol derecha;
    public int llave;
    public Object valor;

    public NodoArbol(int key){
        llave = key;
        derecha = null;
        izquierda = null;
        valor = null;
        padre = null;
    }
}
