package Datos1;
import Datos1.listaEnlazada.ListaEnlazada;
import Datos1.arbolBinario.ArbolBinario;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        ArbolBinario bst = new ArbolBinario();
        ListaEnlazada linkedList = new ListaEnlazada();
        long startTime, endTime;
        int runs = 5;

        System.out.println("Run\tTiempo BST (ns)\tTiempo ListaEnlazada (ns)");

        for (int i = 1; i <= runs; i++) {
            int[] elements = new int[1000];
            for (int j = 0; j < elements.length; j++) {
                elements[j] = random.nextInt(10000);
            }

            for (int element : elements) {
                bst.insertar(element, null);
                linkedList.insertar(element);
            }

            int randomElement = elements[random.nextInt(elements.length)];
            startTime = System.nanoTime();
            bst.buscar(randomElement);
            endTime = System.nanoTime();
            long bstTime = endTime - startTime;

            startTime = System.nanoTime();
            linkedList.contiene(randomElement);
            endTime = System.nanoTime();
            long linkedListTime = endTime - startTime;

            System.out.println(i + "\t" + bstTime + "\t\t" + linkedListTime);
        }
    }
}
