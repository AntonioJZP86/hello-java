package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var edad = 11;
        if (edad >= 18) {
            System.out.println("Puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num1 = 22;
        var num2 = 33;

        if (num1 > num2) {
            System.out.println("El primer número es mayor");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        if (num1 > 0) {
            System.out.println("El número es positivo");
        } else if (num1 < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        if (num1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if (num1 >= 1 && num1 <= 100) {
            System.out.println("Esta en el rango entre 1 y 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var dia = 3;
        String diaSemana;
        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Fuera de rango [1-7]";
        }
        System.out.println(diaSemana);

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var nota = 99;
        if (nota >= 50 && nota < 100) {
            System.out.println("Aprovado");
        } else if (nota == 100) {
            System.out.println("Sobresaliente");
        } else if (nota < 50 && nota >= 0) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Fuera de rango [0-100]");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var edad2 = 11;
        var acompañado = false;
        if (edad > 15 || acompañado) {
            System.out.println("Puendes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }


        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var vocal = 'C';
        char lowwerCase = Character.toLowerCase(vocal);

        if (lowwerCase == 'a' || lowwerCase == 'e' || lowwerCase == 'i' || lowwerCase == 'o' || lowwerCase == 'u') {
            System.out.println("Vocal");
        } else {
            System.out.println("Consonate");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var a = 33;
        var b = 4;
        var c = 11;
        if (a > b && a > b) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
