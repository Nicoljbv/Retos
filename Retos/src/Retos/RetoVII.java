package Retos;

import java.util.*;

public class RetoVII {
    public static void main(String[] args) {
        
        // Declaramos la variables
        int opcUsu, dinero, dineroA=0, dineGanaPerdi =0, contador=0;
        String juego;

        // Instanciamos el método random para generar los números aleatoriamente
        Random aleatorio = new Random();
        // Metodo random para generar un número aleatorio entre 0 y 1
        int opcMa = aleatorio.nextInt(2);

        // Instanciamos la clase scanner para capturar datos
        Scanner leer = new Scanner(System.in);

        //Solicitamos al usuario el dinero que va apostar 
        System.out.println("Bienvenido jugaremos cara o sello \nIngrese cuanto dinero desea apostar");
        dinero=leer.nextInt();

        do{
        // Solicitamos una opción para jugar
        System.out.println("Elija \n1.Cara \n2.Sello");
        opcUsu = leer.nextInt();

        // Validamos si el usuario eligió cara o sello
        if (opcUsu == 1) {

            // Comparamos la elección del usuario con la de la maquina
            if (opcUsu == opcMa + 1) {
                //Sumamos el valor acumulado (se acumula el mismo valor que el aposto)
                dineroA=dineroA+dinero;
                dineGanaPerdi=dineroA+dinero;
                System.out.println("El usuario eligio " + opcUsu + ".Cara\nEl programa eligió " + (opcMa + 1) + ".Cara \n¡FELICIDADES GANASTE!");
            } else {
                //El usuario pierde lo que aposto(se resta en el acumulado y tambien en la ganacia total)
                dineroA=dineroA-dinero;
                dineGanaPerdi=dineGanaPerdi-dinero;
                System.out.println("El usuario eligio " + opcUsu + ".Cara \nEl programa eligió " + (opcMa + 1) + ".Sello \n¡LO SENTIMOS PERDISTE!");
            }
        } else if (opcUsu == 2) {
            if (opcUsu == opcMa + 1) { 
                 //Sumamos el valor acumulado por ganar 
                dineroA=dineroA+dinero;
                dineGanaPerdi=dineroA+dinero;
                System.out.println("El usuario eligio " + opcUsu + ".Sello\nEl programa eligió " + (opcMa + 1) + ".Sello \n¡FELICIDADES GANASTE!");
            } else {
                //El usuario pierde lo que aposto
                dineroA=dineroA-dinero;
                dineGanaPerdi=dineGanaPerdi-dinero;
                System.out.println("El usuario eligio " + opcUsu + ".Sello\nEl programa eligió " + (opcMa + 1) + ".Cara \n¡LO SENTIMOS PERDISTE!");
            }

        } else {
            System.out.println("Ingreso una opción incorrecta");
        }

        //Evaluamos si el usuario todavia tiene dinero para seguir apostando y jugando

        if(dineGanaPerdi<=0){

            System.out.println("Usted se ha quedado sin dinero para apostar");
            juego="no";
        
        }else{

            //Preguntamos al usuario si quiere volver a jugar 
            System.out.println("Desea volver a jugar");
            juego=leer.next();
            
            
        }

        //Incrementamos las veces que juega
        contador=contador+1;

    }while(juego.equals("si"));

    //Mostramos las veces que jugó, ganacias o perdidas que tuvo el usuario 
    System.out.println("Jugó "+contador+" vez/veces y acúmulo $"+dineGanaPerdi);

        // Limpiar Buffer
        leer.close();

    }
    
}
