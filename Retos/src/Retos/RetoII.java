package Retos;

import java.util.Scanner;

public class RetoII {

    public static void main(String[] args) {

        //Declarar variables
        int pesoB, edadB, dosisVacuna = 0;
        String nMama, nBebe, nEnfe;

        //Instanciar la clase scanner para capturar los datos 
        Scanner ingresar = new Scanner(System.in);

        //Capturar, nombre del bebé, peso, edad, nombre de mamá, enfermera 
        System.out.println("Ingrese el nombre del bebé");
        nBebe=ingresar.next();

        System.out.println("Ingrese el peso del bebé");
        pesoB=ingresar.nextInt();

        System.out.println("Ingrese la edad del bebé");
        edadB=ingresar.nextInt();

        System.out.println("Ingrese el nombre de la mamá bebé");
        nMama=ingresar.next();

        System.out.println("Ingrese el nombre de la enfermera que va vacunar al bebé");
        nEnfe=ingresar.next();

        //Calcular la dosis de vacuna que se aplicará al bebé
        dosisVacuna = (pesoB + 10)/(edadB * 10) * 8;

        //Mostrar resultado  
        System.out.println( nBebe + " tiene " + edadB + " meses de edad y pesa " + pesoB + " gramos. Su mamá " + nMama + " lo llevo a vacunar y la enfermera " + nEnfe + " le aplica "+ dosisVacuna + " Mg de dosis de vacuna");


    }
    
}
