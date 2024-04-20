package Datos1.arbolBinario;


public class ArbolBinario {
    NodoArbol raiz = null;
    public void insertar (int key, Object valor){
        NodoArbol nodo = new NodoArbol(key);
        nodo.valor = valor;

        if(raiz == null){
            raiz = nodo;
        }
        else{
            NodoArbol temp = raiz;
            while (temp != null){
                nodo.padre = temp;
                if ( nodo.llave >= temp.llave) {
                    temp = temp.derecha;
                }
                else{
                    temp = temp.izquierda;
                }
            }
            if (nodo.llave < nodo.padre.llave){
                nodo.padre.izquierda = nodo;
            }
            else {
                nodo.padre.derecha = nodo;
            }
        }
    }
}
