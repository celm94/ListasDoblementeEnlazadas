package mainPackage;

import DLlist.DoublyLinkedList;

import java.util.Scanner;


public class MainDoublyLinkedLists {

    public static void main(String[] args) {
        String stop = "";
        Scanner scanner = new Scanner(System.in);

        while(true!=stop.equals("10")){

            System.out.println("\uD83D\uDD01 LISTAS DOBLEMENTE ENLAZADAS \uD83D\uDD01 \n");
            System.out.println("1.Insertar al inicio  ");
            System.out.println("2.Insertar al Final");
            System.out.println("3.Recorrer hacia adelante");
            System.out.println("4.Recorrer hacia atras");
            System.out.println("5.Mostrar tamaño de la lista");
            System.out.println("6.Mostrar si la lista esta vacia");
            System.out.println("7.Buscar elemento por valor");
            System.out.println("8.Buscar elemento por indice");
            System.out.println("9.Borrar un Elemento");
            System.out.println("10. SALIR");
            System.out.println("ESCOGER UNA OPCIÓN");

            stop = scanner.nextLine();
            DoublyLinkedList<String> dllist = new DoublyLinkedList<>();

            switch(stop){

                case "1":
                    System.out.println("Escriba el elemento a agregar al inicio: ");
                    dllist.insertAtHead(scanner.nextLine());
                    break;

                case "2":
                    System.out.println("Escriba el elemento a agregar al final");
                    dllist.insertAtTail(scanner.nextLine());
                    dllist.toString();
                    break;

                case "3":
                    System.out.println("Recorriendo hacia adelante");
                    dllist.traverseForward();
                    dllist.toString();
                    break;

                case "4":
                    System.out.println("Recorriendo hacia atras");
                    dllist.traverseBackward();
                    break;

                case "5":
                    System.out.println("el tamaño de la lista es: "+ dllist.size());
                    break;

                case "6":
                    if(dllist.isEmpty()){
                        System.out.println("La lista está vacía");
                    }
                    else{
                        System.out.println("Tamaño de la lista: " + dllist.size() + "\nLa lista contiene los elementos: "+ dllist.toString());
                    }
                    break;

                case "7":
                    System.out.println("¿Qué elemento desea buscar?");
                    DoublyLinkedList<String>.Node<String > buscar = dllist.searchByValue(scanner.nextLine());
                    if(buscar == null){
                        System.out.println("No se encontró el elemento");
                    }
                    else{
                        System.out.println("Elemento "+ buscar.toString());
                    }
                    break;

                case "8":
                    System.out.println("Ingrese el número de índice del elemento a buscar");
                    DoublyLinkedList<String>.Node<String > buscarIndex = dllist.searchByIndex(scanner.nextInt());
                    if(buscarIndex == null){
                        System.out.println("índice no encontrado");
                    }
                    else{
                        System.out.println("En el número de índice "+buscarIndex+" se encuentra el elemento " +buscarIndex.toString());
                    }
                    break;

                case "9":
                    System.out.println("¿Qué elemento desea borrar? ingrese su número de índice");
                    int element = scanner.nextInt();
                    DoublyLinkedList<String>.Node<String > buscarIndexBorrar = dllist.searchByIndex(scanner.nextInt());
                    if(buscarIndexBorrar== null)
                    {
                        System.out.println("Número de índice no encontrado");
                    }
                    else{
                        if(element == 0){
                            dllist.deleteFromHead();
                        }
                        else if(element == dllist.size()-1){
                            dllist.deleteFromTail();
                        }
                        else{
                            dllist.deleteFromPosition(element);
                        }

                    }
                    break;

                case "10":
                    System.out.println("Hasta pronto...");
                    break;

                default:
                    System.out.println("Opción inválida, escoja otra opción");
                    break;

            }

        }



    }

}
