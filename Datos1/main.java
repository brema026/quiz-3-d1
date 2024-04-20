package Datos1;
import Datos1.listaEnlazada.ListaEnlazada;
import Datos1.arbolBinario.ArbolBinario;
public class main {
    public static void main(String[] args) {
        ListaEnlazada Lista = new ListaEnlazada();
        ArbolBinario Arbol = new ArbolBinario();
        Lista.insertar(5);
        Lista.insertar(4);
        Lista.insertar(3);
        Lista.insertar(2);
        Lista.imprimirLista();

        Arbol.insertar(5,null);
        Arbol.insertar(3,null);
        Arbol.insertar(2,null);
        Arbol.insertar(7,null);
        Arbol.insertar(6,null);
        Arbol.insertar(9,null);
    }
}