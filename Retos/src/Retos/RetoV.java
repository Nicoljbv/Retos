package Retos;

import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
        //Declarar variables 
        String signo;

        //Instanciar la clase scanner para capturar la opción elegida por el usuario
        Scanner leer = new Scanner(System.in);

        //Solicitamos al usuario 
        System.out.println("Bienvenido\nSu fecha de nacimiento está entre, elija una opción\na.21 de marzo a 19 de abril\nb.20 de abril a 20 de mayo\nc.21 de mayo a 20 de junio\nd.21 de junio a 22 de julio\ne.23 de julio a 22 de agosto\nf.23 de agosto a 22 de septiembre\ng.23 de septiembre a 22 de octubre\nh.23 de octubre a 21 de noviembre\ni.22 de noviembre a 21 diciembre\nj.22 de diciembre a 20 de enero\nk.21 de enero a 19 de febrero\nl.20 de febrero a 20 de marzo ");
        signo=leer.next();

        //Evaluamos la opción elegida por el usuario referente a su fecha de nacimiento
        if(signo.equals("a")){
            System.out.println("Su signo zodiacal es Aries\nSe caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas.");
        }else if(signo.equals("b")){
            System.out.println("Su signo zodiacal es Tauro\nSe caracteriza por ser una persona con una gran fuerza de voluntad y constancia, tenacidad, decisión.");
        }else if(signo.equals("c")){
            System.out.println("Su signo zodiacal es Geminis\nSe caracterizan porqué les gusta hablar, y sus pensamientos y opiniones marcan fuertemente quiénes son, tienen curiosidad por el mundo que los rodea y se mueven con rapidez por la vida, intentando aprender lo máximo posible.");
        }else if(signo.equals("d")){
            System.out.println("Su signo zodiacal es Cancer\nSe caracerizan por ser leales, emotivos, constantes, protectores, tradicionalistas, sensuales e intuitivos");
        }else if(signo.equals("e")){
            System.out.println("Su signo zodiacal es Leo\nSe caracterizan por ser el signo más dominante del zodíaco. Creativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo.");
        }else if(signo.equals("f")){
            System.out.println("Su signo zodiacal es Virgo\nSe caracterizan por su espíritu crítico, precisión, reserva, paciencia y convencionalismo, le gusta aprender y es capaz de analizar las situaciones más complejas con mucha claridad.");
        }else if(signo.equals("g")){
            System.out.println("Su signo zodiacal es Libra\nSe caracterizan por su elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos.");
        }else if (signo.equals("h")){
            System.out.println("Su signo zodiacal es Escorpio\nSe caracterizan por tener mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza.");
        }else if(signo.equals("i")){
            System.out.println("Su signo zodiacal es Sagitario\nSe caracterizan por ser optimistas por naturaleza y ver el lado bueno de la mayoría de las situaciones, aceptan fácilmente las nuevas oportunidades y les gusta estar siempre aprendiendo y explorando. ");
        }else if(signo.equals("j")){
            System.out.println("Su signo zodiacal es Capricornio\nSe caracterizan por ser uno de los signos del zodíaco más constante, sólido y apacible. También por ser prudente y práctico en todos los asuntos que le conciernen.");
        }else if(signo.equals("k")){
            System.out.println("Su signo zodiacal es Acuario\nSe caracterizan por ser el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original, brillante y humanitario, al mismo tiempo que independiente e intelectual.");
        }else if(signo.equals("l")){
            System.out.println("Su signo zodiacal es Piscis\nSe caracterizan por ser uno de los más complejos y difíciles de definir, tienen una poderosa imaginación, hasta tal punto que se desconectan de la realidad");
        }else{
            System.out.println("Ingrese una opcioón válida");
        }

        //Limpiar buffer
        leer.close();
    }
    
}
