package Retos;

import java.util.Scanner;
import java.util.Random;

public class RetoIII {
    public static void main(String[] args) {
         // Declaramos la variable que almacena la opción elegida por el usuario
         int opc;
         // Instanciamos el método random para generar los números aleatoriamente
         Random aleatorio = new Random();
         // Metodo random para generar un número aleatorio entre 0 y 1
         int resulAlea = aleatorio.nextInt(2);
 
         // Instanciamos la clase scanner para capturar datos
         Scanner leer = new Scanner(System.in);
 
         // Solicitamos una opción
         System.out.println("Jugaremos cara o sello \n Elija 1.Cara 2.Sello");
         opc = leer.nextInt();
 
         // Validamos si el usuario eligió cara o sello
         if (opc == 1) {
 
             // Comparamos la elección del usuario con la del programa
             if (opc == resulAlea + 1) {
                 System.out.println("El usuario eligio " + opc + ".Cara\n El programa eligió " + (resulAlea + 1) + ".Cara");
                 System.out.println("El usuario y el programa eligieron la misma opción \n ¡FELICIDADES GANASTE!");
             } else {
                 System.out.println("El usuario eligio " + opc + ".Cara \nEl programa eligió " + (resulAlea + 1) + ".Sello");
                 System.out.println("El usuario y el programa no coincidieron con la misma opción \n ¡LO SENTIMOS PERDISTE!");
             }
         } else if (opc == 2) {
             if (opc == resulAlea + 1) {
                 System.out.println("El usuario eligio " + opc + ".Sello\n El programa eligió " + (resulAlea + 1) + ".Sello");
                 System.out.println("El usuario y el programa eligieron la misma opción \n ¡FELICIDADES GANÓ!");
             } else {
                 System.out.println("El usuario eligio " + opc + ".Sello\n El programa eligió " + (resulAlea + 1)+ ".Cara");
                 System.out.println("El usuario y el programa no coincidieron con la misma opción \n ¡LO SENTIMOS PERDIÓ!");
             }
 
         } else {
             System.out.println("Ingreso una opción incorrecta");
         }
 
         // Limpiar Buffer
         leer.close();
 
    }
}
