/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicioaprendizaje17;

import java.util.Scanner;

public class EjercicioAprendizaje17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el tamaño del vector: ");
        int tamaño = entrada.nextInt(); // tamaño N para el vector
        
        int vector [] = new int[tamaño]; // creación del vector tamaño N
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingresa un valor en la posición "+i+" del vector: "); //pedir numeros al usuario para llenar el vector
            vector[i] = entrada.nextInt();
        }
        
        // Inicializar los contadores de dígitos
        int[] contadorDigitos = new int[6]; // Índice 0 se ignora, índices 1-5 para dígitos de 1 a 5

        // Contar los dígitos de cada número en el vector
        for (int num : vector) {
            int digitos = contarDigitos(num); //Acá se está llamando a la función
            if (digitos <= 5) {
                contadorDigitos[digitos]++;
            }
        }

        // Imprimir los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígito(s): " + contadorDigitos[i]);
        }
    }
    //Función para contar los dígitos de un número
    public static int contarDigitos(int numero) {
        int digitos = 0;
        if(numero == 0){ // si el numero ingresado es cero, sabemos que cero es un solo digito.
            return 1;
        }
        while (numero != 0) {
            numero /= 10; // como se divide por 10 me lo va separando de a un solo decimal, y se sigue dividiendo por 10 hasta que el numero llegue a cero, cuando llegue a cero el contador "digitos" para
            digitos++;
        }
        return digitos;
    }    
}
