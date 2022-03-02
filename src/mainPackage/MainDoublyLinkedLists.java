package mainPackage;

import DLlist.DoublyLinkedList;

import java.util.Scanner;


public class MainDoublyLinkedLists {

    public static void main(String[] args) {
        String stop = "";
        Scanner scanner = new Scanner(System.in);
        Scanner datos = new Scanner(System.in);
        DoublyLinkedList<String> dllist = new DoublyLinkedList<>();

        while(!stop.equals("10")){


            System.out.println("\n\n\uD83D\uDD01 LISTAS DOBLEMENTE ENLAZADAS \uD83D\uDD01 \n");
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


            switch(stop){

                case "1":
                    System.out.println("Escriba el elemento a agregar al inicio: ");
                    dllist.insertAtHead(datos.nextLine());
                    System.out.println("elemento insertado al inicio");
                    break;

                case "2":
                    System.out.println("Escriba el elemento a agregar al final");
                    dllist.insertAtTail(datos.nextLine());

                    break;

                case "3":

                    dllist.traverseForward();
                    break;

                case "4":
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
                        System.out.println("La lista no está vacía, tiene " + dllist.size()+ " elementos" + "\nLa lista contiene: ");
                        dllist.traverseForward();
                    }
                    break;

                case "7":
                    System.out.println("¿Qué elemento desea buscar?");
                    String buscar = String.valueOf(dllist.searchByValue(datos.nextLine()));
                    if(buscar == null){
                        System.out.println("No se encontró el elemento");
                    }
                    else{
                        System.out.println("Elemento encontrado");
                        System.out.println("en la lista se encuentran los elementos:");
                        dllist.traverseForward();
                    }
                    break;

                case "8":
                    System.out.println("Ingrese el número de índice del elemento a buscar");
                    DoublyLinkedList<String>.Node<String> buscarIndex = dllist.searchByIndex(datos.nextInt());
                    /*DoublyLinkedList<String>.Node<String > buscarIndex = dllist.searchByIndex(scanner.nextInt());*/
                    if(buscarIndex == null){
                        System.out.println("índice no encontrado");
                    }
                    else{
                        System.out.println("El elemento encontrado en dicho índice es: " +buscarIndex.toString());
                    }
                    break;

                case "9":
                    if(dllist.size() <= 2){
                        System.out.println("la lista no tiene suficientes elementos para eliminar");

                    }
                    else{
                        System.out.println("¿Qué elemento desea borrar? ingrese su número de índice");
                        int element = datos.nextInt();
                        if(element == 0){
                            dllist.deleteFromHead();
                            System.out.println("Elemento eliminado del inicio de la lista");
                            dllist.traverseForward();
                        }
                        else if(element == dllist.size()-1){
                            dllist.deleteFromTail();
                            System.out.println("Elemento eliminado del final de la lista");
                            dllist.traverseForward();
                        }
                        else{
                            dllist.deleteFromPosition(element);
                            System.out.println("elemento eliminado de la posición" + element);
                            dllist.traverseForward();
                        }

                    }

                    /*DoublyLinkedList<String>.Node<String > buscarIndexBorrar = dllist.searchByIndex(scanner.nextInt());
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

                    }*/
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
