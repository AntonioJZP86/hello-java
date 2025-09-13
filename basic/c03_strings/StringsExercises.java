package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String holaMundo = "Hola " + "Mundo";
        System.out.println(holaMundo);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(holaMundo.length());

        // 3. Muestra el primer y último carácter de un string.
        char primera =  holaMundo.charAt(0);
        System.out.println(primera);
        char ultima = holaMundo.charAt(holaMundo.length() - 1);
        System.out.println(ultima);

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(holaMundo.toUpperCase());
        System.out.println(holaMundo.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(holaMundo.contains("Hola"));

        // 6. Formatea un string con un entero.
        System.out.println(String.format("Esto es un %s con el numero %d","prueba",3));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String conEspacios = "     hola      ";
        System.out.println(conEspacios.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(conEspacios.replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.
        String a = "hola";
        String b = "hola";
        System.out.println(a.equals(b));

        // 10. Comprueba si dos strings tienen la misma longitud.
        String c = "123456";
        String d = "654321";
        System.out.println(c.length() == d.length());

    }
}
