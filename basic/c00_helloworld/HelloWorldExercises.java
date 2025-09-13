package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class HelloWorldExercises {

    public static void main(String[] args) throws IOException {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Antonio");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola \n Mundo");
        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // Esto es un comentario de una sola línea

        // 4. Crea un comentario en varias líneas.

        /*
        Esto es un comentario de varias líneas
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        System.out.println("Tengo 39 años");
        System.out.println("Mi color favorito es el verde");
        System.out.println("Madrid");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Se ha producido un problema.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hola " + name);

        PrintStream fileOut = new PrintStream(new File("output.txt"));
        System.setOut(fileOut);
        System.out.println("Esto va al archivo");

        System.currentTimeMillis();
        System.getProperties();

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("En un lugar de la Mancha");
        System.out.println("De cuyo nombre no puedo acordarme.");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("***********");
        System.out.println("*********");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

    }
}