package Datos1.listaEnlazada;

public class ListaEnlazada {
    NodoLista head = null;

    public void insertar(int dato) {
        NodoLista Node = new NodoLista(dato);
        Node.next = head;
        head = Node;

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