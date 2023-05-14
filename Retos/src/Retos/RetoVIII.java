package Retos;

import java.util.*;

public class RetoVIII {
    public static void main(String[] args) {
         //Declaramos variables
         int elecUsu, contador=0;
         String respJuego;

         //Instanciamos el método random para generar los números aleatoriamente 
         Random opc = new Random();
         //Generar un número aleatorio entre 0, 1 o 2
         int elecPro = opc.nextInt(3);
 
         //Instanciamos la clase Scanner para capturar datos
         Scanner leer = new Scanner(System.in);
 
         System.out.println("Jugaremos piedra, papel o tijera");

         do{
         //Solicitamos una opción al usuario y capturamos 
         System.out.println("Elija una opción: \n1.Piedra \n2.Papel \n3.Tijera");
         elecUsu = leer.nextInt();
 
         //Evaluamos la opción elegida por el usuario y la maquina 
         if (elecUsu == 1) {
             if (elecPro == 0) {
                 System.out.println("El usuario saco: \nPiedra \nEl programa saco: \nPiedra \n¡EMPATE!");
 
             } else if (elecPro == 1) {
                 System.out.println("El usuario saco: \nPiedra \nEl programa saco: \nPapel \n¡PERDISTE");
             } else {
                 System.out.println("El usuario saco: \nPiedra \nEl programa saco: \nTijera \n¡GANASTE!");
             }
         } else if (elecUsu == 2) {
             if (elecPro == 0) {
                 System.out.println("El usuario saco: \nPapel \nEl programa saco: \nPiedra \n¡GANASTE!");
 
             } else if (elecPro == 1) {
                 System.out.println("El usuario saco: \nPapel \nEl programa saco: \nPapel \n¡EMPATE!");
             } else {
                 System.out.println("El usuario saco: \nPapel \nEl programa saco: \nTijera \n¡PERDISTE!");
             }
 
         } else if (elecUsu == 3) {
             if (elecPro == 0) {
                 System.out.println("El usuario saco: \nTijera \nEl programa saco: \nPiedra \n¡PERDISTE!");
 
             } else if (elecPro == 1) {
                 System.out.println("El usuario saco: \nTijera \nEl programa saco: \nPapel \n¡GANASTE!");
             } else {
                 System.out.println("El usuario saco: \nTijera \nEl programa saco: \nTijera \n¡EMPATE!");
             }
         } else {
             System.out.println("Ingreso una opción incorrecta");
         }

         //Preguntamos al usuario si desea volver a jugar y capturamos su respuesta
         System.out.println("Desea volver a jugar");
         respJuego=leer.next();

         //Incrementamos la cantidad de veces que juega 
         contador=contador+1;

        }while(respJuego.equalsIgnoreCase("si"));


        //Mostramos las veces que el usuario jugó
        System.out.println("Usted jugó piedra, papel o tijera con la maquina "+contador+ " vez/veces");
 
         // Limpiar Buffer
         leer.close();
    }
    
}
