package Retos;

import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {

        //Declarar variables 
        int canProdu, precio, totalC=0;

        //Instanciar la clase scanner para capturar los datos
        Scanner capturar = new Scanner(System.in);

        //Solicitamos al usuario la cantidad de productos que va comprar 
        System.out.print("Bienvenido\n¿Cuántos productos va comprar?");
        canProdu=capturar.nextInt();

        //Solicitamos el precio de los productos comprados
        for(int i=0; i<canProdu; i++){
        
            //Solicitamos el precio de cada producto
            System.out.print("Producto "+(i+1)+ ". $");
            precio=capturar.nextInt();
            totalC=totalC+precio;

        }

        //Mostramos el total a pagar de la compra
        System.out.println("El total de su compra es: $"+totalC);

        //Limpiar el Buffer
        capturar.close();
    }
    
}
