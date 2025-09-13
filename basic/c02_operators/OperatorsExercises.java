package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 3;
        var b = 3;
        var sum = a + b;
        System.out.println(sum);
        var sub = a - b;
        System.out.println(sub);
        var mul = a * b;
        System.out.println(mul);
        var div = a / b;
        System.out.println(div);
        var mod = a % b;
        System.out.println(mod);

        // 2. Crea una variable para cada tipo de operación de asignación.
        var assign = b;
        System.out.println(assign);
        assign *= 2; // assign = assign * 2
        System.out.println(assign);
        assign += 1; // assign = assign + 1
        System.out.println(assign);
        assign -= 1; // assign = assign - 1
        System.out.println(assign);
        assign /= 2; // assign = assign / 2
        System.out.println(assign);
        assign %= 2; // assign = assign % 2
        System.out.println(assign);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        var num1 = 3;
        var num2 = 5;
        System.out.println(num1 <  num2);
        System.out.println(num1 != num2);
        System.out.println(num2 > num1);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        var num3 = 22;
        var num4 = 23;
        System.out.println(num3 > num4);
        System.out.println(num3 >= num4);
        System.out.println(num3 == num4);

        // 5. Utiliza el operador lógico and.
        System.out.println(true && true);

        // 6. Utiliza el operador lógico or.
        System.out.println(true || false);

        // 7. Combina ambos operadores lógicos.
        System.out.println(false && true || true);

        // 8. Añade alguna negación.
        System.out.println(false && !true || false);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(+num1);
        System.out.println(-num1);
        System.out.println(++num2);
        System.out.println(num2--);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        var prueba1 = 2;
        var prueba2 = 3;
        System.out.println(prueba1 == prueba2);
        System.out.println(prueba1 != prueba2);
        System.out.println(prueba1 < prueba2 || prueba2 != prueba1);
    }
}
