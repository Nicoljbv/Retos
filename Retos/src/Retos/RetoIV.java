package Retos;

import java.util.Scanner;
import java.util.Random;

public class RetoIV {
    public static void main(String[] args) {

        //Declaramos variables
        int elecUsu;

        //Instanciamos el método random para generar los números aleatoriamente 
        Random opc = new Random();
        //Generar un número aleatorio entre 0, 1 o 2
        int elecPro = opc.nextInt(3);

        //Instanciamos la clase Scanner para capturar datos
        Scanner leer = new Scanner(System.in);

        //Solicitamos una opción al usuario y capturamos 
        System.out.println("Jugaremos piedra, papel o tijera \n Elija \n 1.Piedra \n 2.Papel \n 3.Tijera");
        elecUsu = leer.nextInt();

        //Evaluamos la opción elegida por el usuario y la maquina 
        if (elecUsu == 1) {
            if (elecPro == 0) {
                System.out.println("El usuario saco: \n Piedra \n El programa saco: \n Piedra \n ¡EMPATE!");

            } else if (elecPro == 1) {
                System.out.println("El usuario saco: \n Piedra \n El programa saco: \n Papel \n ¡PERDISTE");
            } else {
                System.out.println("El usuario saco: \n Piedra \n El programa saco: \n Tijera \n ¡GANASTE!");
            }
        } else if (elecUsu == 2) {
            if (elecPro == 0) {
                System.out.println("El usuario saco: \n Papel \n El programa saco: \n Piedra \n ¡GANASTE!");

            } else if (elecPro == 1) {
                System.out.println("El usuario saco: \n Papel \n El programa saco: \n Papel \n ¡EMPATE!");
            } else {
                System.out.println("El usuario saco: \n Papel \n El programa saco: \n Tijera \n ¡PERDISTE!");
            }

        } else if (elecUsu == 3) {
            if (elecPro == 0) {
                System.out.println("El usuario saco: \n Tijera \n El programa saco: \n Piedra \n ¡PERDISTE!");

            } else if (elecPro == 1) {
                System.out.println("El usuario saco: \n Tijera \n El programa saco: \n Papel \n ¡GANASTE!");
            } else {
                System.out.println("El usuario saco: \n Tijera \n El programa saco: \n Tijera \n ¡EMPATE!");
            }
        } else {
            System.out.println("Ingreso una opción incorrecta");
        }

        // Limpiar Buffer
        leer.close();
    }
}
