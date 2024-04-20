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
    }
}