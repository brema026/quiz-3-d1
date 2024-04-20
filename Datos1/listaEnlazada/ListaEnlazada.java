package Datos1.listaEnlazada;

public class ListaEnlazada {
    NodoLista head = null;

    public void insertar(int dato) {
        NodoLista node = new NodoLista(dato);
        node.next = head;
        head = node;
    }

    public boolean contiene(int dato) {
        NodoLista nodoActual = head;
        while (nodoActual != null) {
            if (nodoActual.dato == dato) {
                return true;
            }
            nodoActual = nodoActual.next;
        }
        return false;
    }

    public void imprimirLista() {
        NodoLista nodoActual = head;
        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " ");
            nodoActual = nodoActual.next;
        }
        System.out.println();
    }
}
