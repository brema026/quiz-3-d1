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
    public NodoArbol buscar(int key) {
        return buscarRec(raiz, key);
    }

    private NodoArbol buscarRec(NodoArbol nodo, int key) {
        if (nodo == null || nodo.llave == key) {
            return nodo;
        }

        if (key < nodo.llave) {
            return buscarRec(nodo.izquierda, key);
        } else {
            return buscarRec(nodo.derecha, key);
        }
    }
}

